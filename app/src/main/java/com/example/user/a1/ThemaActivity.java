package com.example.user.a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThemaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema);
    }

    public void RegistClick(View v) { //카메라메뉴
        Intent intent=new Intent(this,RegistActivity.class);
        startActivity(intent);
    }

    public void CalendarClick(View v) { //캘린더메뉴
        Intent intent=new Intent(this,CalendarActivity.class);
        startActivity(intent);
    }

    public void SettingClick(View v) { //설정메뉴
        Intent intent=new Intent(this,SettingActivity.class);
        startActivity(intent);
    }

    public void OnPbClick(View v) {
        Intent intent=new Intent(this,RecomListActivity.class);
        String s="pb";
        intent.putExtra("Thema",s);
        startActivity(intent);
    }
    public void OnPregClick(View v) {
        Intent intent=new Intent(this,RecomListActivity.class);
        String s="preg";
        intent.putExtra("Thema",s);
        startActivity(intent);
    }
    public void OnOsClick(View v) {
        Intent intent=new Intent(this,RecomListActivity.class);
        String s="obesity";
        intent.putExtra("Thema",s);
        startActivity(intent);
    }
    public void OnCancerClick(View v) {
        Intent intent=new Intent(this,RecomListActivity.class);
        String s="cancer";
        intent.putExtra("Thema",s);
        startActivity(intent);
    }
    public void OnCholeClick(View v) {
        Intent intent=new Intent(this,RecomListActivity.class);
        String s="chole";
        intent.putExtra("Thema",s);
        startActivity(intent);
    }
    public void OnBsClick(View v) {
        Intent intent=new Intent(this,RecomListActivity.class);
        String s="bs";
        intent.putExtra("Thema",s);
        startActivity(intent);
    }

}
