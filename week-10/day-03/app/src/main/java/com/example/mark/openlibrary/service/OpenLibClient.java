package com.example.mark.openlibrary.service;

import com.example.mark.openlibrary.model.PracticeJson;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OpenLibClient {


  @GET("/posts/{id}")
  Call<List<PracticeJson>> searchedBooks(@Path("id") String id);
}
