package com.example.bekwa.loginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void chilearning(View v){
        Intent chiamaka = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(chiamaka);
    }
}
