package com.firstapp.e_ticket;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class WelcomeActivity extends Activity {

    TextView user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);

        user = (TextView) findViewById(R.id.text_user);

        String user_judul = getIntent().getStringExtra("username");

        user.setText(user_judul);
    }
}
