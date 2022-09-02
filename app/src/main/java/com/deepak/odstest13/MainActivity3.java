package com.deepak.odstest13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.deepak.odstest13.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding activityMain3Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main3);
        activityMain3Binding= DataBindingUtil.setContentView(this,R.layout.activity_main3);
        Person person=new Person("deepak@gmail.com","Hyderbad");
        activityMain3Binding.setPerson(person);
    }
}