package com.example.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button joinButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        joinButton = findViewById(R.id.main_join_btn);
        loginButton = findViewById(R.id.main_login_btn);
        loginButton.setOnClickListener(v -> {
            Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginIntent);
        });

        joinButton.setOnClickListener(v -> {
            Intent joinIntent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(joinIntent);
        });
    }
}