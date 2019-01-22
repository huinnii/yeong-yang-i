package com.example.user.a1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void RegistClick(View v) {
        Intent intent=new Intent(this,RegistActivity.class);
        startActivity(intent);
    }

    public void CalendarClick(View v) {
        Intent intent=new Intent(this,CalendarActivity.class);
        startActivity(intent);
    }

}
