package com.example.mark.openlibrary.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

  static final String CHUCK_NORRIS_URL = "https://api.chucknorris.io/";

  public static Retrofit getConnection(String connectionUrl){

    Gson gson = new GsonBuilder()
        .setLenient()
        .create();

    return new Retrofit.Builder()
        .baseUrl(connectionUrl)
        .addConverterFactory(GsonConverterFactory.create(gson))
        /*.client(new OkHttpClient().Builder().readTimeout(120, TimeUnit.SECONDS)
            .connectTimeout(120, TimeUnit.SECONDS).build())*/
        .build();
  }

  public static JokesApi getChuckNorrisJokesApi() {
    return getConnection(CHUCK_NORRIS_URL).create(JokesApi.class);
  }
}
