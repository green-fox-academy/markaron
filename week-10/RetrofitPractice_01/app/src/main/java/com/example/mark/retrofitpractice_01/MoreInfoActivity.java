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

    textViewOne.setText((String) extras.get("infoOne"));
    String num = String.valueOf(extras.get("infoTwo"));
    textViewTwo.setText(num);
    textViewThree.setText((String) extras.get("infoThree"));
  }

  public void guessYear(View view) {
    Intent oldIntent = getIntent();
    Bundle extras = oldIntent.getExtras();

    String year = String.valueOf(extras.get("infoTwo"));
    EditText numberView = findViewById(R.id.numberInfo1);
    String playerGuess = numberView.getText().toString();

    if (year.equals(playerGuess)) {
      Intent intent = new Intent(this, GuessResultActivity.class);
      intent.putExtra("winText", "You WIN!!!");
      startActivity(intent);
    } else if (playerGuess.equals("")) {
      Toast.makeText(view.getContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
    } else {
      Intent intent = new Intent(this, GuessResultActivity.class);
      Bundle bundle = new Bundle();
      bundle.putString("winText", "You Lose!!!");
      bundle.putString("resultDiff", "Your guess was " + playerGuess + ", and the answer was: " +
          year);
      intent.putExtras(bundle);
      startActivity(intent);
    }
  }
}
