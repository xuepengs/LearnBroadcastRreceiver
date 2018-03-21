package com.example.xuepeng.learnbroadcastrreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnSendMsg).setOnClickListener(this);
        findViewById(R.id.btnReg).setOnClickListener(this);
        findViewById(R.id.btnUnreg).setOnClickListener(this);
    }
    private MyReceiver receiver=null;

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSendMsg:
                Intent i=new Intent(MyReceiver.ACTION);
                i.putExtra("data","hello");
                sendBroadcast(i);
                break;
            case R.id.btnReg:
                if(receiver==null){
                    receiver=new MyReceiver();
                    registerReceiver(receiver,new IntentFilter(MyReceiver.ACTION));
                }
                break;
            case R.id.btnUnreg:
                if(receiver!=null){
                    unregisterReceiver(receiver);
                    receiver=null;
                }

                break;


        }
    }
}