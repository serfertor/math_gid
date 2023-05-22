package com.example.math_gid.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.math_gid.data.MainRepository;

public class RVViewModel extends ViewModel {
    MutableLiveData<String> move;

    public void setMove (String key){
        String answer = MainRepository.read("Lists", key);
        this.move = new MutableLiveData<>();
        move.setValue(answer);
    }

    public LiveData<String> getMove(){
        return move;
    }
}
