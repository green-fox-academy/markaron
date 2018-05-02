package com.example.mark.retrofitpractice_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mark.retrofitpractice_01.model.ApiClient;
import com.example.mark.retrofitpractice_01.model.Contact;
import com.example.mark.retrofitpractice_01.model.Work;
import com.example.mark.retrofitpractice_01.model.WorksBySubject;
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
  private WorksBySubject worksBySubjects;
  private ApiInterface apiInterface;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_result);

    recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);

    adapter = new RecyclerAdapter();
    recyclerView.setAdapter(adapter);

    apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

    Intent intent = getIntent();
    String subject = intent.getStringExtra("subject");

    Call<WorksBySubject> call = apiInterface.getContacts(subject);
    call.enqueue(new Callback<WorksBySubject>() {
      @Override
      public void onResponse(Call<WorksBySubject> call, Response<WorksBySubject> response) {
        worksBySubjects = response.body();
        adapter.updateData(worksBySubjects.getWorks());
        }

      @Override
      public void onFailure(Call<WorksBySubject> call, Throwable t) {

      }
    });
  }

}
