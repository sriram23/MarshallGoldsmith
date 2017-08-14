package com.example.sriram.marshallgoldsmith;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {
    EditText usrnam;
    TextView namtxt;
    Button namBtn;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usrnam = (EditText)findViewById(R.id.yourNameET);
        namtxt = (TextView)findViewById(R.id.yourName);
        namBtn = (Button)findViewById(R.id.btn_yourName);
        sharedpreferences = getSharedPreferences("username", 0);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (!prefs.getBoolean("firstTime", false)) {
            namBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String n = usrnam.getText().toString();
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString("Name", n);
                    editor.commit();
                    Toast.makeText(MainActivity.this, "Thanks", Toast.LENGTH_LONG).show();
                    Intent myIntent = new Intent(MainActivity.this,
                            WelcomeActivity.class);
                    startActivity(myIntent);
                }
            });
            // mark first time has runned.
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstTime", true);
            editor.commit();
        }
        else{
            Intent myIntent = new Intent(MainActivity.this, WelcomeActivity.class);
            startActivity(myIntent);
        }
    }
}
