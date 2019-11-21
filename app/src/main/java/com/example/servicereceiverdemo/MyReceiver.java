package com.example.servicereceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        if (action.equals(Intent.ACTION_POWER_CONNECTED))
        {
            Toast.makeText(context, "Power is connected", Toast.LENGTH_SHORT).show();
        }

        else if (action.equals(Intent.ACTION_POWER_DISCONNECTED))
        {
            Toast.makeText(context, "power is disconnectd", Toast.LENGTH_SHORT).show();
        }
    }
}
