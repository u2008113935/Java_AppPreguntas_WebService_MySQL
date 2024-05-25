package com.example.thequizapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    //Always use localhost o IP server to connect emulator to the host's server
    String baseUrl = "http://10.0.2.2/quiz/";

    //Create and Return a configured Retrofit Instance
            public Retrofit getRetrofitInstance(){
                return new Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
}
