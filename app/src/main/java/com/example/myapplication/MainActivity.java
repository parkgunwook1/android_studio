package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
// import 문장은 외부에서 패키지나 클래스를 포함시키는 것
// 앞에 androidx가 붙은 패키지는 JetPack에 속하는 클래스로서 호환성을 위하여 최근에 사용이 권장되는 패키지이다.

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker1;
    private TextView time;
    private Calendar calendar;
    private String format = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker1 = (TimePicker)  findViewById(R.id.timePicker1);
    }



}
    // 리스너 객체를 이용하여 처리 방법

   /* class Listener implements  View.OnClickListener {
        public void onClick(View v) {  // 리스너 인터페이스를 구현한 클래스 정의

        }
    }
    Listener lis = new Listener();    // 이벤트 리스너 객체 생성
    button.setOnclickListener(lis);*/ // 버튼에 이벤트 리스너 객체를 등록
