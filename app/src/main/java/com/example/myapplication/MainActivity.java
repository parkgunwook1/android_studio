package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

   public void onCreate(Bundle savedInstanceState) {

       super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

           final Button button = (Button) findViewById(R.id.button);

           button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다." , Toast.LENGTH_SHORT).show();
               }
           });
       }
}