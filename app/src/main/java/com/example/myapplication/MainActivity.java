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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// Activity로부터 상속받았으므로 액티비티가 된다.
// 액티비티는 안드로이드에서 애플리케이션을 구성하는 4가지의 컴포넌트 중의 하나이다.
// 액티비티는 화면을 통하여 사용자와 상호작용하는 횔동을 의미한다.

    private TextView textView;
    EditText eText;

    Button btn;
    @Override // 메소드가 부모 클래스의 메소드를 재정의 하였다는 것을 나타낸다.

    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() 메소드는 액티비티가 생성되는 순간에 딱 합번 호출
        // 모든 초기화와 사용자 인터페이스 설정이 여기에 들어간다.
        // 액티비티 중에서는 onCreate() 메소드가 가장 먼저 실행된다.

        super.onCreate(savedInstanceState); //부모 클래스인 AppCompatActivity 클래스의 onCreate()를 호출하는 문장.

        setContentView(R.layout.activity_main);
        //setContentView() 라는 함수는 액티비티의 화면을 설정하는 함수
        // R.layout.activity_main은 activity_main.xml 파일을 나타낸다.

        Button bplus = (Button) findViewById(R.id.button1);
        EditText eText1 = (EditText) findViewById(R.id.edit1);
        EditText eText2 = (EditText) findViewById(R.id.edit2);
        EditText eText3 = (EditText) findViewById(R.id.edit3);
        bplus.setOnClickListener(e -> {
            String s1 = eText1.getText().toString();
            String s2 = eText2.getText().toString();
            int result = Integer.parseInt(s1) + Integer.parseInt(s2);
            eText3.setText(""+result);
        });
    }
    // 버튼 이벤트를 처리하는 메소드 조건
    // 1. public 이어야 한다.
    // 2. void 반환형을 가진다.
    // 3. View를 메소드의 인수로 가진다. 클릭된 view 객체가 전달된다.
    public void sendMessage(View view) { //Toast는 사용자에게 간단하게 메시지를 빠르게 표시하는 기능을 제공한다.
        Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다." ,
                Toast.LENGTH_SHORT).show();
    }
}
    // 리스너 객체를 이용하여 처리 방법

   /* class Listener implements  View.OnClickListener {
        public void onClick(View v) {  // 리스너 인터페이스를 구현한 클래스 정의

        }
    }
    Listener lis = new Listener();    // 이벤트 리스너 객체 생성
    button.setOnclickListener(lis);*/ // 버튼에 이벤트 리스너 객체를 등록
