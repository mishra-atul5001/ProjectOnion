package com.example.atulmishra.projectonion;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Atul Mishra on 21-04-17.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        Button btn = (Button)findViewById(R.id.button2);
    }

    public void onclick(View view) {
        Button btn = (Button)view;
        Intent goback = new Intent(this , MainActivity.class);
        startActivity(goback);

    }
}
