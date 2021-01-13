package com.example.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private Button singupBtn;
    private EditText emailTxt;
    private EditText passwordTxt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        singupBtn = (Button) findViewById(R.id.button2);
        emailTxt = (EditText) findViewById(R.id.emailID);
        passwordTxt = (EditText) findViewById(R.id.passwordID);

        singupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                String email = emailTxt.getText().toString();
                String password = passwordTxt.getText().toString();
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                setResult(RESULT_OK, intent);
                finish();
            }
        });




    }
}
