package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    boton = findViewById(R.id.button1);
    boton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, ChildActivity.class);
        i.putExtra("myParam", "I'm the value of this param");
        i.putExtra("myInt", 58);
        startActivity(i);
      }
    });
  }


}
