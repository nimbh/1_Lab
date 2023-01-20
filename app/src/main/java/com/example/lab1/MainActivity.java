package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText login = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextTextPassword);
        Button button = findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login_enter = login.getText().toString();
                String password_enter = password.getText().toString();
                if (login_enter.equals("admin@admin.ru") && password_enter.equals("123")){
                        answerInfo("Welcome, admin!");
                } else {
                    answerInfo("Login or password entered incorrectly");
                }
            }
        });
    }
    // всплывающее окно
    public void answerInfo(String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}