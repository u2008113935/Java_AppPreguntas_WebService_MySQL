package com.example.thequizapp.retrofit;

import com.example.thequizapp.model.QuestionList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionsAPI {
    //Used to define the structure an behavior of network requests to a
    // RESTful API Acts as a bridge between android app an the web service

    @GET("myquizapi.php") // end point
    Call<QuestionList> getQuestions();

}
