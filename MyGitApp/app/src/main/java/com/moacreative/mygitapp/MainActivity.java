package com.moacreative.mygitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();
    }

    private void setUpView() {
        navigate();
    }

    private void navigate() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
