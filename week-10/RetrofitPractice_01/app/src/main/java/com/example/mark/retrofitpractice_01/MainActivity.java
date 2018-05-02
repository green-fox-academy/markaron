package com.example.mark.retrofitpractice_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

    public void sendMessage(View view) {
      Intent intent = new Intent(this, ResultActivity.class);
      EditText editText = (EditText) findViewById(R.id.editText);
      String subject = editText.getText().toString();

      intent.putExtra("subject", subject);
      startActivity(intent);
    }

    public void searchAuthor(View view) {
      Intent intent = new Intent(this, AuthorResultActivity.class);
      EditText editText = (EditText) findViewById(R.id.editText);
      String author = editText.getText().toString();

      intent.putExtra("author", author);
      startActivity(intent);
    }

  }

