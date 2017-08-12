package com.example.sriram.marshallgoldsmith;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText usrnam;
    TextView namtxt;
    Button namBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usrnam = (EditText)findViewById(R.id.yourNameET);
        namtxt = (TextView)findViewById(R.id.yourName);
        namBtn = (Button)findViewById(R.id.btn_yourName);
    }
}
