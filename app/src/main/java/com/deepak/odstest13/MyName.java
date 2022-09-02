package com.deepak.odstest13;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class MyName  extends BaseObservable {
    String name;

    public MyName(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
