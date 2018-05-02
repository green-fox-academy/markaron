package com.example.mark.retrofitpractice_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.mark.retrofitpractice_01.model.ApiClient;
import com.example.mark.retrofitpractice_01.model.Docs;
import com.example.mark.retrofitpractice_01.model.WorksByAuthor;
import com.example.mark.retrofitpractice_01.service.ApiInterface;
import com.example.mark.retrofitpractice_01.service.AuthorAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AuthorResultActivity extends AppCompatActivity {

  private RecyclerView recyclerView;
  private RecyclerView.LayoutManager layoutManager;
  private AuthorAdapter authorAdapter;
  private WorksByAuthor worksByAuthor;
  private List<Docs> docsList;
  private ApiInterface apiInterface;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_author_result);

    Retrofit.Builder builder = new Retrofit.Builder()
        .baseUrl("https://openlibrary.org/")
        .addConverterFactory(GsonConverterFactory.create());

    Retrofit retrofit = builder.build();

    recyclerView = findViewById(R.id.recyclerViewAuthor);
    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);

    apiInterface = retrofit.create(ApiInterface.class);

    Intent intent = getIntent();
    String author = intent.getStringExtra("author");


    Call<WorksByAuthor> call = apiInterface.getAuthor(author);
    call.enqueue(new Callback<WorksByAuthor>() {
      @Override
      public void onResponse(Call<WorksByAuthor> call, Response<WorksByAuthor> response) {
        WorksByAuthor worksByAuthor = response.body();
        authorAdapter = new AuthorAdapter(worksByAuthor);
        recyclerView.setAdapter(authorAdapter);
      }

      @Override
      public void onFailure(Call<WorksByAuthor> call, Throwable t) {

      }
    });
  }
}