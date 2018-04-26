package com.example.mark.openlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mark.openlibrary.http.JokesApi;
import com.example.mark.openlibrary.http.RetrofitClient;
import com.example.mark.openlibrary.model.Joke;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SubjectActivity extends AppCompatActivity {
  TextView textView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_subject);

    textView = findViewById(R.id.textView2);

    JokesApi api = RetrofitClient.getChuckNorrisJokesApi();
    api.getRandomJoke().enqueue(new Callback<Joke>() {

      @Override
      public void onResponse(Call<Joke> call, Response<Joke> response) {
        Joke joke = response.body();
        System.out.println(joke.getValue());
        textView.setText(joke.getValue());
      }

      @Override
      public void onFailure(Call<Joke> call, Throwable t) {
        System.out.println("Valami nem ment jól!");
      }
    });

  }

  public void restart(View view){
    this.recreate();
  }
}
