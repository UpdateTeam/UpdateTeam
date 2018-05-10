package com.example.dell.shixun_dome02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getbut(View view) {
        Toast.makeText(MainActivity.this,"你真帅",Toast.LENGTH_LONG).show();
        Log.d("123","asd");
        //1
    }
}
