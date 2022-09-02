package com.deepak.odstest13;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyDataModel extends ViewModel {
    private int count=0;
    private MutableLiveData<Integer> mutableLiveData=new MutableLiveData<>();

    public MutableLiveData<Integer> setCount(){
        mutableLiveData.setValue(count);
        return mutableLiveData;
    }

    public void getCount()
    {
        count++;
        mutableLiveData.setValue(count);

    }

  /*  public  int setCount()
    {
        return count;
    }

    //click the button we can increment count
    public  int getCount()
    {
        count++;
        return count;
    }*/

}
