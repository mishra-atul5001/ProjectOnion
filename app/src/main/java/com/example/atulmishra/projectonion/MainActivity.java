package com.example.atulmishra.projectonion;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.camera2.CameraDevice;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.view.SurfaceView;

import java.io.File;

public class MainActivity extends AppCompatActivity {



    //  private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);

    }

    public void onclick(View view) {

        Button btn = (Button)view;

        Intent start = new Intent(this , SecondActivity.class);
        startActivity(start);



    }



}




