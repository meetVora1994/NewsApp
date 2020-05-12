package com.md.news.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.md.news.model.NewsResponse;
import com.md.news.networking.NewsRepository;


public class NewsViewModel extends ViewModel {

    private MutableLiveData<NewsResponse> mutableLiveData;
    private NewsRepository newsRepository;

    public void init(){
        if (mutableLiveData != null){
            return;
        }
        newsRepository = NewsRepository.getInstance();
        mutableLiveData = newsRepository.getNews("google-news", "44753a48a5ce4822ac9452be328aca8f");

    }

    public LiveData<NewsResponse> getNewsRepository() {
        return mutableLiveData;
    }

}