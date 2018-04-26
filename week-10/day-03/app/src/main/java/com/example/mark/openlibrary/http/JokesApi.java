package com.example.mark.openlibrary.http;

import com.example.mark.openlibrary.model.Joke;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JokesApi {

  @GET("jokes/random")
  Call<Joke> getRandomJoke();
}
