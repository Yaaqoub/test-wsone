package com.mwsapp.test_wsone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.airwatch.sdk.AirWatchSDKException;
import com.airwatch.sdk.SDKManager;

public class MainActivity extends AppCompatActivity {
    SDKManager sdkManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startSDK();
    }

    private void startSDK() {
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    final SDKManager initSDKManager = SDKManager.init(MainActivity.this);
                    sdkManager = initSDKManager;


                    toastHere("Workspace ONE: " + initSDKManager.getSDKProfileJSONString());
                }
                catch (Exception exception) {
                    sdkManager = null;
                    toastHere(
                            "Workspace ONE failed " + exception + ".");
                }
            }
        }).start();
    }

    private void toastHere(final String message) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
