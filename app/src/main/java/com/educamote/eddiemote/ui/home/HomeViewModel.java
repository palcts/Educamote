package com.educamote.eddiemote.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Shari's Home screen. Click on bottom Chat icon to test Watson Assistant");
    }

    public LiveData<String> getText() {
        return mText;
    }
}