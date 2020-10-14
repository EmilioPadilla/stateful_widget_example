package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ChildActivity extends AppCompatActivity {
  Intent i;
  TextView myTextView;
  Context context;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_child);
    myTextView = findViewById(R.id.textView1);
    i = getIntent();
    String auxString;
    auxString = i.getStringExtra("myParam");
    myTextView.setText(auxString);

    context = getApplicationContext();

    Toast myToast = new Toast(context);
    myToast.makeText(context, "I'm a Toast", Toast.LENGTH_SHORT).show();
  }
}
