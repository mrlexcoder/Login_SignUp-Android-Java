package com.mrlexcoder.login_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {

    Button forget_button,click_login_button,signup_button_1;
    TextInputLayout username_text_1,Password_text_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username_text_1=findViewById(R.id.username_text_1);
        Password_text_1=findViewById(R.id.Password_text_1);
        forget_button=findViewById(R.id.forget_button);
        click_login_button=findViewById(R.id.click_login_button);
        signup_button_1=findViewById(R.id.signup_button_1);

        click_login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Variables
                String username_ = username_text_1.getEditText().toString();
                String password_ = Password_text_1.getEditText().toString();

                if (!username_.isEmpty()){
                    username_text_1.setError(null);
                    username_text_1.setErrorEnabled(false);
                    if(!password_.isEmpty()){
                        Password_text_1.setError(null);
                        Password_text_1.setErrorEnabled(false);


                    }else{
                        Password_text_1.setError("Please Enter password");
                    }
                }else {
                    username_text_1.setError("Please Enter Username");
                }
                Intent intent = new Intent(getApplicationContext(),register.class);
                startActivity(intent);
            }
        });

        signup_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),register.class);
                startActivity(intent);
            }
        });
    }

}