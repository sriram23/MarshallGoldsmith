package com.example.sriram.marshallgoldsmith;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WelcomeActivity extends AppCompatActivity {
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        SharedPreferences settings = getSharedPreferences("username", 0);

        String value = settings.getString("Name", "");
        Log.d("TAG", value);
        tx = (TextView) findViewById(R.id.Name_New);
        tx.setText("Hello..!"+value);
    }
}
