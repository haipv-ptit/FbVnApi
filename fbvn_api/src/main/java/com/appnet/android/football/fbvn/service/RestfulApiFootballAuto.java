package com.appnet.android.football.fbvn.service;


import com.appnet.android.football.fbvn.data.DetailNewsDataAuto;
import com.appnet.android.football.fbvn.data.NewsDataAuto;
import com.appnet.android.football.fbvn.data.NewsData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestfulApiFootballAuto {

    @GET("news?app=manutd&category=latest")
    Call<NewsDataAuto> loadNewsLatest();
    @GET("news?app=manutd&category=top")
    Call<NewsDataAuto> loadNewsTrend();
    @GET("news?app=manutd&category=video")
    Call<NewsDataAuto> loadNewsVideo();
    @GET("news/detail")
    Call<DetailNewsDataAuto> loadNewsDetail(@Query("url") String url);

}
