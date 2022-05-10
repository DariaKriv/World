package com.example.worldcinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInScreen extends AppCompatActivity {
EditText email, password;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_screen);

        email=findViewById(R.id.email);
        password = findViewById(R.id.password);
        login= findViewById(R.id.button2);
    }

    public void Login(View view) {
        if(email.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(),"Вход выполнен!",Toast.LENGTH_LONG).show();
            Intent intent= new Intent(SignInScreen.this,Menu.class);
            startActivity(intent);
        }
        else if (email.getText().toString().equals("") && password.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Пустые значения!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Вход не выполнен!", Toast.LENGTH_LONG).show();
        }
    }
}