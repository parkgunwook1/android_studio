package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
// import 문장은 외부에서 패키지나 클래스를 포함시키는 것
// 앞에 androidx가 붙은 패키지는 JetPack에 속하는 클래스로서 호환성을 위하여 최근에 사용이 권장되는 패키지이다.

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnadd,btnsub,btnmul,btndiv,btntemp;
    TextView textresult;
    String num1,num2;
    Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단계산기");

        edit1 = (EditText) findViewById(R.id.editText1);
        edit2 = (EditText) findViewById(R.id.editText2);
        btnadd = (Button) findViewById(R.id.button1);
        textresult = (TextView) findViewById(R.id.TextResult);

        btnsub = (Button)findViewById(R.id.button2);
        btnmul = (Button)findViewById(R.id.button3);
        btndiv = (Button)findViewById(R.id.button4);
        btntemp = (Button)findViewById(R.id.button5);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0 ||Integer.parseInt(num2)==0)
                {
                    Toast.makeText(getApplicationContext(), "계산할수없습니다.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btntemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Integer.parseInt(num1) % Integer.parseInt(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });


    }
}

    // 리스너 객체를 이용하여 처리 방법

   /* class Listener implements  View.OnClickListener {
        public void onClick(View v) {  // 리스너 인터페이스를 구현한 클래스 정의

        }
    }
    Listener lis = new Listener();    // 이벤트 리스너 객체 생성
    button.setOnclickListener(lis);*/ // 버튼에 이벤트 리스너 객체를 등록
