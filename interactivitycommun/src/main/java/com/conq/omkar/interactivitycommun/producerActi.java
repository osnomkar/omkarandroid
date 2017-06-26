package com.conq.omkar.interactivitycommun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

public class producerActi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producer);

        findViewById(R.id.btnBack).setOnClickListener(this::onBack);


        Intent intresp = getIntent();
        Bundle bundle = intresp.getExtras();
        if(bundle!=null){
            String one = bundle.getString("key1");
            String two = bundle.getString("key2");
            Log.i(producerActi.class.getCanonicalName(),one+" "+two);

            ((RadioButton)findViewById(R.id.radOne)).setText(one);
            ((RadioButton)findViewById(R.id.radTwo)).setText(two);



        }
    }


    private void onBack(View view) {

    }
}
