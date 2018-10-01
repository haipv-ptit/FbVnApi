package com.appnet.android.football.fbvn.service;


import com.appnet.android.football.fbvn.data.NewsDataAuto;
import com.appnet.android.football.fbvn.data.NewsData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface RestfulApiFootballAuto {

    @GET("news?app=manutd&category=latest")
    Call<NewsDataAuto> loadNewsLatest();

    @GET("newses/get/{news_id}")
    Call<NewsData> loadNewsDetail(@Path("news_id") int newsId);

    @GET("newses/get/{news_id}")
    Call<NewsData> loadNewsDetail(@Header("Cache-Control") String cacheControl, @Path("news_id") int newsId);

}
