package com.example.pierce.firstandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisGotPressedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_got_pressed);

        TextView text = (TextView) findViewById(R.id.activity_dis_got_pressed_text);
        String name = getIntent().getStringExtra("name");
        text.setText(name);
    }
}
