package com.muravey.zhamilyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnName = findViewById(R.id.btn1);
        Button btnAge = findViewById(R.id.btn2);

        btnName.setOnClickListener(this);
        btnAge.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText( this, "Sorted Heroes Name", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText( this, "Sorted Heroes Age", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
