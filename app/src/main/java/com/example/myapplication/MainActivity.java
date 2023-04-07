package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.net.Uri;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int randomNumber;
    private EditText guessEditText;
    private Button submitButton;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guessEditText = findViewById(R.id.guessEditText);
        submitButton = findViewById(R.id.submitButton);

        randomNumber = random.nextInt(100) + 1;

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGuess();
            }
        });
    }

    private void checkGuess() {
        String guessText = guessEditText.getText().toString();

        if (guessText.isEmpty()) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
            return;
        }

        int guess = Integer.parseInt(guessText);

        if (guess < 1 || guess > 100) {
            Toast.makeText(this, "Please enter a number between 1 and 100", Toast.LENGTH_SHORT).show();
            return;
        }

        if (guess == randomNumber) {
            Toast.makeText(this, "You guessed it right!", Toast.LENGTH_SHORT).show();
        } else if (guess < randomNumber) {
            Toast.makeText(this, "Try higher", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Try lower", Toast.LENGTH_SHORT).show();
        }
    }
}




        /*super.onCreate(saverdInstanceState);
        setContentView(R.layout.activity_main);
        Button bPlus = (Button) findViewById(R.id.button1);
        EditText eText1 = (EditText) findViewById(R.id.edit1);
        EditText eText2 = (EditText) findViewById(R.id.edit2);
        EditText eText3 = (EditText) findViewById(R.id.edit3);
        bPlus.setOnClickListener(e -> {
            String s1 = eText1.getText().toString();
            String s2 = eText2.getText().toString();
            int result = Integer.parseInt(s1) + Integer.parseInt(s2);
            eText3.setText("" + result);
        });
    }
}*/









    /*@Override
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
}*/
    /*public void onClicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 010-1234-5678"));
        startActivity(intent);
    }
    onclick 코드
    public void onClicked(View target) {
        Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다.",
                Toast.LENGTH_SHORT).show();
    }*/
