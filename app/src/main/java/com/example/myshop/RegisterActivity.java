package com.example.myshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {

    private Button joinButton;
    private EditText joinPhoneInput, joinPasswordInput;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        joinButton = findViewById(R.id.register_btn);
        joinPhoneInput = findViewById(R.id.register_phone_input);
        joinPasswordInput = findViewById(R.id.register_password_input);
        loadingBar = new ProgressDialog(this);
        joinButton.setOnClickListener(V -> createAccount());
    }

    private void createAccount() {
        String phoneNumber = joinPhoneInput.getText().toString();
        String password = joinPasswordInput.getText().toString();

        if (TextUtils.isEmpty(phoneNumber))
            Toast.makeText(this, "Введите номер телефона", Toast.LENGTH_SHORT).show();
        else if (TextUtils.isEmpty(password))
            Toast.makeText(this, "Введите пароль", Toast.LENGTH_SHORT).show();
        else {
            loadingBar.setTitle("Создание аккаунта");
            loadingBar.setMessage("Пожалуйста, подождите..");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();
            validatePhone(phoneNumber, password);
        }
    }

    private void validatePhone(String phoneNumber, String password) {
        final DatabaseReference rootRef;
        rootRef = FirebaseDatabase.getInstance().getReference();
        rootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (!snapshot.child("Users").child(phoneNumber).exists()) {
                    HashMap<String, Object> userDataMap = new HashMap<>();
                    userDataMap.put("phone", phoneNumber);
                    userDataMap.put("password", password);
                    rootRef.child("Users").child(phoneNumber).updateChildren(userDataMap)
                            .addOnCompleteListener(task -> {
                                if (task.isSuccessful()) {
                                    loadingBar.dismiss();
                                    Toast.makeText(
                                            RegisterActivity.this,
                                            "Регистрация прошла успешно",
                                            Toast.LENGTH_SHORT).show();
                                    Intent joinIntent = new Intent(
                                            RegisterActivity.this,
                                            LoginActivity.class
                                    );
                                    startActivity(joinIntent);
                                } else {
                                    loadingBar.dismiss();
                                    Toast.makeText(
                                            RegisterActivity.this,
                                            "Ошибка",
                                            Toast.LENGTH_SHORT
                                    ).show();
                                }
                            });
                } else {
                    loadingBar.dismiss();
                    Toast.makeText(
                            RegisterActivity.this,
                            "Номер " + phoneNumber + " уже зарегистрирован",
                            Toast.LENGTH_LONG).show();
                    Intent joinIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(joinIntent);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}