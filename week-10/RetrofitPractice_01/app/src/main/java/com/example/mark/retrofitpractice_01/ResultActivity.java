package com.example.mark.retrofitpractice_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mark.retrofitpractice_01.model.ApiClient;
import com.example.mark.retrofitpractice_01.model.Contact;
import com.example.mark.retrofitpractice_01.service.ApiInterface;
import com.example.mark.retrofitpractice_01.service.RecyclerAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResultActivity extends AppCompatActivity {


  private RecyclerView recyclerView;
  private RecyclerView.LayoutManager layoutManager;
  private RecyclerAdapter adapter;
  private List<Contact> contacts;
  private ApiInterface apiInterface;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_result);

    recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);

    apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

    Intent intent = getIntent();
    String subject = intent.getStringExtra("subject");

    Call<List<Contact>> call = apiInterface.getContacts(subject);
    call.enqueue(new Callback<List<Contact>>() {
      @Override
      public void onResponse(Call<List<Contact>> call, Response<List<Contact>> response) {
        contacts = response.body();
        adapter = new RecyclerAdapter(contacts);
        recyclerView.setAdapter(adapter);
      }

      @Override
      public void onFailure(Call<List<Contact>> call, Throwable t) {

      }
    });
  }

}
