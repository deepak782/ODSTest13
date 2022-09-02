package com.deepak.odstest13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtCount;
    MyDataModel myDataModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCount=findViewById(R.id.txt_count);

        myDataModel=new ViewModelProvider(this).get(MyDataModel.class);

        /*txtCount.setText(""+myDataModel.setCount());
       */
        LiveData<Integer> counter=myDataModel.setCount();
        counter.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                txtCount.setText("Your Clicked "+integer+" Items");
            }
        });
    }

    public void increment(View view) {

       // txtCount.setText(""+myDataModel.getCount());
        myDataModel.getCount();
    }
}