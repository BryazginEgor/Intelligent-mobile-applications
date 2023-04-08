package ru.mirea.bryazgin.mireaproject.ui.cat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CatViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public CatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is cat fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}