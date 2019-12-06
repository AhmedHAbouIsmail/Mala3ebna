package com.example.mala3ebna;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pitch);

        TextView v = (TextView) findViewById(R.id.textView2);
        switch(getIntent().getStringExtra("list_view_value")){
            case "Zoser":v.setText("New Cairo");break;
            case "Nile":v.setText("Manial");break;
            default: v.setText("Unknown");break;
        }

    }
}
