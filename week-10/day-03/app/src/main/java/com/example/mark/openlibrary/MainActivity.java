package com.example.mark.openlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void onClickSubject(View view) {
    Intent i = new Intent(this, SubjectActivity.class);
    startActivity(i);
  }

  public void onClickAuthor(View view) {
    Intent i = new Intent(this, AuthorActivity.class);
    startActivity(i);
  }
}

