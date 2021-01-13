package com.example.instagram;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView forgotPassword;
    private Button loginBtn;
    private EditText emailTXT;
    private EditText passwordTXT;
    private TextView singupTxt;
    private TextView singinFacebookTxt;
    private ImageView eyeImage;
    private final int REQUEST_CODE = 2;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                String email = data.getStringExtra("email");
                String password = data.getStringExtra("password");
                emailTXT.setText(email);
                passwordTXT.setText(password);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button) findViewById(R.id.btn_login);
        forgotPassword = (TextView) findViewById(R.id.forgot_password);
        singinFacebookTxt = (TextView) findViewById(R.id.facebook_login);
        emailTXT = (EditText) findViewById(R.id.username);
        passwordTXT = (EditText) findViewById(R.id.password);

        singinFacebookTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        singupTxt = (TextView) findViewById(R.id.textView);
        singupTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ThirdActivity.class ));
            }
        });
        
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ForthActivity.class));
            }
        });



    }
}