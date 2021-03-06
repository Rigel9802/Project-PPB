package com.example.myportifolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ForgotPasswordActivity extends AppCompatActivity {

    EditText email;
    Button sendCode;
    FloatingActionButton back;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        email = findViewById(R.id.email);
        sendCode = findViewById(R.id.button);
        back = findViewById(R.id.come_back);

        email.setTranslationX(800);
        sendCode.setTranslationX(800);
        back.setTranslationY(-800);

        email.setAlpha(v);
        sendCode.setAlpha(v);
        back.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        sendCode.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        back.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();
    }

    public void back_page(View view){
        Intent a = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
        startActivity(a);
    }
}