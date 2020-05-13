package com.example.bakery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText l_email,l_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l_email = findViewById(R.id.l_email);
        l_pass = findViewById(R.id.l_pass);

    }


    public void login(View view) {
    }

    public void sign_up(View view) {

        Intent intent = new Intent(MainActivity.this,register.class);
        startActivity(intent);

    }

    public void guest_view(View view) {


        Intent intent = new Intent(MainActivity.this,guest_view.class);
        startActivity(intent);


    }
}
