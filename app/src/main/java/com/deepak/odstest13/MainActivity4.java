package com.deepak.odstest13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.deepak.odstest13.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {

    ActivityMain4Binding activityMain4Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main4);
        activityMain4Binding= DataBindingUtil.setContentView(this,R.layout.activity_main4);
        MyName myName=new MyName("");
        activityMain4Binding.setName(myName);
    }
}