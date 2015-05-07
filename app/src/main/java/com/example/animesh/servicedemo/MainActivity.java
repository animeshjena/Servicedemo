package com.example.animesh.servicedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class MainActivity extends Activity implements OnClickListener {
    Button buttonStart, buttonStop,buttonNext;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = (Button) findViewById(R.id.startButton);
        buttonStop = (Button) findViewById(R.id.stopButton);
        buttonNext = (Button) findViewById(R.id.next);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonNext.setOnClickListener(this);
    }
    public void onClick(View src) {
        switch (src.getId()) {
            case R.id.startButton:
                startService(new Intent(this, Myservice.class));
                break;
            case R.id.stopButton:
                stopService(new Intent(this, Myservice.class));
                break;
            case R.id.next:
                Intent intent=new Intent(this,MainActivity2.class);
                startActivity(intent);
                break;
        }
    }
}
