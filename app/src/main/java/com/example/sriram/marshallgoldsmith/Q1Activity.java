package com.example.sriram.marshallgoldsmith;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Q1Activity extends AppCompatActivity {
    Switch S;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        tv = (TextView) findViewById(R.id.Q1R);
        S = (Switch) findViewById(R.id.Q1SW);
        S.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // do something, the isChecked will be
                // true if the switch is in the On position

                if(isChecked){
                    tv.setText("YES");
                }
                else{
                    tv.setText("NO");
                }
            }
        });
    }
}