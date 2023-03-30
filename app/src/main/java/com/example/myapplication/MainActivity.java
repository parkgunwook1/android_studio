package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                 "버튼이 눌려졌습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
    /*public void onClicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 010-1234-5678"));
        startActivity(intent);
    }
    onclick 코드
    public void onClicked(View target) {
        Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다.",
                Toast.LENGTH_SHORT).show();
    }*/
