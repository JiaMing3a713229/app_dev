package com.example.myapplication5;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class badroomViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public badroomViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("23.5");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
