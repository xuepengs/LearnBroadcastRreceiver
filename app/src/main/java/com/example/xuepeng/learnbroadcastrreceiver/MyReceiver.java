package com.example.xuepeng.learnbroadcastrreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    public static final  String ACTION="com.example.xuepeng.learnbroadcastrreceiver.intent.action.MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        System.out.println("MyReceiver接收到了消息");
        abortBroadcast();


    }
}
