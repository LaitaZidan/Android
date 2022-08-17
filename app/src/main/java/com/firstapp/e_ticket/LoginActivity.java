package com.firstapp.e_ticket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LoginActivity extends Activity {

    EditText text_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void masuk(View view) {
        text_username = (EditText) findViewById(R.id.textInput_user);

        String getUsername = text_username.getText().toString();

        Intent i = new Intent(LoginActivity.this, WelcomeActivity.class);
        i.putExtra("username", getUsername);
        startActivity(i);
    }
}
