package com.conq.omkar.nestedlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.i(MainActivity.class.getCanonicalName(),"Msg");
        }
        catch (Exception e) {
        }

    }
}
