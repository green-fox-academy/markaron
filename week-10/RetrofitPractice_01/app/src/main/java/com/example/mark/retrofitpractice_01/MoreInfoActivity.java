package com.example.mark.retrofitpractice_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MoreInfoActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.more_info);
    TextView textViewOne = findViewById(R.id.textInfo01);
    TextView textViewTwo = findViewById(R.id.textInfo02);
    TextView textViewThree = findViewById(R.id.textInfo03);

    Intent intent = getIntent();
    Bundle extras = intent.getExtras();

    textViewOne.setText((String) "Subject: " + extras.get("infoOne"));
    textViewTwo.setText(((String)"Publish place: " + extras.get("infoTwo")));
    textViewThree.setText((String) "Language " + extras.get("infoThree"));
  }

  public void guessYear(View view) {
    Intent oldIntent = getIntent();
    Bundle extras = oldIntent.getExtras();

    String year = (String) extras.get("infoYear");
    EditText numberView = findViewById(R.id.numberInfo1);
    String playerGuess = numberView.getText().toString();

    Intent intent = new Intent(this, GuessResultActivity.class);
    Bundle bundle = new Bundle();

    if (year.equals(playerGuess)) {
      bundle.putString("winText", "You WIN!!!");
      bundle.putString("resultDiff", "Your guess was " + playerGuess + ", and the answer was: " +
          year);
      intent.putExtras(bundle);
      startActivity(intent);
    } else if (playerGuess.equals("")) {
      Toast.makeText(view.getContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
    } else {
      bundle.putString("winText", "You Lose!!!");
      bundle.putString("resultDiff", "Your guess was " + playerGuess + ", and the answer was: " +
          year);
      intent.putExtras(bundle);
      startActivity(intent);
    }
  }
}
