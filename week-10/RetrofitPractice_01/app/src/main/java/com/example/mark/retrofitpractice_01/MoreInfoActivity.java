package com.example.mark.retrofitpractice_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MoreInfoActivity extends AppCompatActivity{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.more_info);
    TextView textViewOne = findViewById(R.id.textInfo01);
    TextView textViewTwo = findViewById(R.id.textInfo02);
    TextView textViewThree = findViewById(R.id.textInfo03);

    Intent intent = getIntent();
    Bundle extras = intent.getExtras();
    textViewOne.setText((String)extras.get("infoOne"));
    //textViewTwo.setText((int)extras.get("infoTwo"));
    textViewThree.setText((String)extras.get("infoThree"));
  }

}
