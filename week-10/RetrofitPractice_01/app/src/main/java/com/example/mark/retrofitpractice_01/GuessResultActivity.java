package com.example.mark.retrofitpractice_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GuessResultActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.guess_result_activity);

    TextView winText = findViewById(R.id.winText);
    TextView diff = findViewById(R.id.resultDiff);

    Intent i = getIntent();
    Bundle bundle = i.getExtras();
    winText.setText((String)bundle.get("winText"));
    diff.setText((String)bundle.get("resultDiff"));
  }
}
