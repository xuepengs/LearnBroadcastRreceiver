package com.example.xuepeng.learnbroadcastrreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        System.out.println(" 接收到消息,消息的内容是： "+intent.getStringExtra("data"));

        
    }
}
