package com.tmtron.as3test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.MyClass;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.d("%s.%s", "onCreate", MyClass.TEST_CONST);
        setContentView(R.layout.activity_main);
    }
}
