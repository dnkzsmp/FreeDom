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

import com.example.myshop.user.Residing;
import com.example.myshop.user.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText loginPhoneInput, loginPasswordInput;
    private ProgressDialog loadingBar;

    private final String parentDbName = "Users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_login);
        loginButton = findViewById(R.id.login_btn);
        loginPhoneInput = findViewById(R.id.login_phone_input);
        loginPasswordInput = findViewById(R.id.login_password_input);
        loadingBar = new ProgressDialog(this);
        loginButton.setOnClickListener(v -> loginUser());
    }

    private void loginUser() {
        String phoneNumber = loginPhoneInput.getText().toString().trim();
        String password = loginPasswordInput.getText().toString().trim();

        if (TextUtils.isEmpty(phoneNumber))
            Toast.makeText(this, "Введите номер телефона", Toast.LENGTH_SHORT).show();
        else if (TextUtils.isEmpty(password))
            Toast.makeText(this, "Введите пароль", Toast.LENGTH_SHORT).show();
        else {
            loadingBar.setTitle("Вход в приложение");
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
                if (snapshot.child(parentDbName).child(phoneNumber).exists()) {
                    User userData = snapshot.child(parentDbName).child(phoneNumber).getValue(Residing.class);
                    System.out.println(userData.getPhone());
                    System.out.println(userData.getPassword());
                    if (userData.getPhone().equals(phoneNumber)) {
                        if (userData.getPassword().equals(password)) {
                            loadingBar.dismiss();
                            Toast.makeText(
                                    LoginActivity.this,
                                    "Успешный вход",
                                    Toast.LENGTH_SHORT
                            ).show();
                            Intent homeIntent = new Intent(LoginActivity.this, HomeActivity.class);
                            startActivity(homeIntent);
                        } else {
                            loadingBar.dismiss();
                            Toast.makeText(
                                    LoginActivity.this,
                                    "Неверный пароль",
                                    Toast.LENGTH_SHORT
                            ).show();
                        }
                    } else {
                        loadingBar.dismiss();
                        Toast.makeText(
                                LoginActivity.this,
                                "Неверный номер телефона",
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                } else {
                    loadingBar.dismiss();
                    Toast.makeText(
                            LoginActivity.this,
                            "Аккаунт с номером " + phoneNumber + " не существует",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}