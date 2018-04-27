package com.example.mark.retrofitpractice_01.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

  public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
  public static final String OPEN_LIB_BASE_URL = "https://openlibrary.org/";

  public static Retrofit retrofit = null;

  public static Retrofit getApiClient(){
    if (retrofit == null){
      retrofit = new Retrofit.Builder()
          .baseUrl(OPEN_LIB_BASE_URL)
          .addConverterFactory(GsonConverterFactory.create())
          .build();
    }
    return retrofit;
  }
}
