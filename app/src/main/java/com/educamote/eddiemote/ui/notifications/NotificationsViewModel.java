package com.educamote.eddiemote.ui.notifications;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Shari's Playground. Click on Chat Tab in bottom to test Watson Assistant");
    }

    public LiveData<String> getText() {
        return mText;
    }
}