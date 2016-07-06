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

        setupSecondView();

        setupThirdView();

        test();
    }

    private void setUpView() {
        navigate();
    }

    private void navigate() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("a", "data");
        startActivity(intent);
    }

    private void setupSecondView() {
        //set up views
    }

    private void setupThirdView() {
        
    }

    private void test() {
        anotherTest();
    }

    private void anotherTest() {
        first();
    }

    private void first() {
        second();
    }

    private void second() {
<<<<<<< HEAD
        modifyThird();
    }

    private void modifyThird() {
=======
        third();
    }

    private void third() {
>>>>>>> f629b6582e3720907b364f48c7a8873225b8a921
        
    }
}
