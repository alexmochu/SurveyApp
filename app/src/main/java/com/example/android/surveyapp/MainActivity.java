package com.example.android.surveyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView login = (TextView) findViewById(R.id.login_btn);

        login.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LoginActivity}
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity2.class);

                // Start the new activity
                startActivity(loginIntent);
            }
        });

        TextView register = (TextView) findViewById(R.id.register_btn);

        register.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LoginActivity}
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);

                // Start the new activity
                startActivity(registerIntent);
            }
        });

    }
}
