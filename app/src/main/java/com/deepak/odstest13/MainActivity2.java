package com.deepak.odstest13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.deepak.odstest13.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding activityMain2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main2);
        activityMain2Binding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(activityMain2Binding.getRoot());

        activityMain2Binding.mobileTxt.setText("7894561230");
        activityMain2Binding. nameTxt.setText("Hello Android");
    }
}