 package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
//       button.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
////               Toast.makeText(MainActivity.this,"Hii setOnClickListener Worked", Toast.LENGTH_SHORT).show();
////               String s = editText.getText().toString();
////               int Kg = Integer.parseInt(s);
////               double pound = 2.205 * Kg;
////               textView.setText("This corresponding value in pound is " + pound);
//           }
//       });


    }

     public void calculate(View view) {
         String s = editText.getText().toString();
         int Kg = Integer.parseInt(s);
         double pound = 2.205 * Kg;
         textView.setText("This corresponding value in pound is " + pound);
         Toast.makeText(MainActivity.this, "Thanks For Using This App", Toast.LENGTH_SHORT).show();
     }
 }