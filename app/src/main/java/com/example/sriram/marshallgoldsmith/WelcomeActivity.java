package com.example.sriram.marshallgoldsmith;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class WelcomeActivity extends AppCompatActivity {
    TextView tx;
    Button Abt;
    Button Tk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        SharedPreferences settings = getSharedPreferences("username", 0);

        String value = settings.getString("Name", "");
        Log.d("TAG", value);
        tx = (TextView) findViewById(R.id.Name_New);
        tx.setText("Hello..!"+value);
        Abt = (Button) findViewById(R.id.abt);
        Tk = (Button) findViewById(R.id.TT);

        Abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(WelcomeActivity.this, AboutActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
