package com.example.mark.retrofitpractice_01.service;

import com.example.mark.retrofitpractice_01.model.Contact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

  @GET("posts/{id}/comments")
  Call<List<Contact>> getContacts(@Path("id") String id);
}
