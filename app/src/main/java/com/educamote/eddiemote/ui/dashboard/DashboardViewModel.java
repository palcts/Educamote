package com.educamote.eddiemote.ui.dashboard;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Shari's dashboard. Click on Chat Tab in bottom to test Watson Assistant");
    }

    public LiveData<String> getText() {
        return mText;
    }
}