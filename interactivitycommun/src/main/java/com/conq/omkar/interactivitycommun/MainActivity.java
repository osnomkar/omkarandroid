package com.conq.omkar.interactivitycommun;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btnMobile = (Button)findViewById(R.id.btnMobile);
       btnMobile.setOnClickListener(this ::onMobile);
       findViewById(R.id.btnLaptop).setOnClickListener(this::onLaptop);

    }

    private void onLaptop(View view) {
        Intent intent = new Intent(this,producerActi.class);


        Bundle bundle = new Bundle();
        bundle.putString("key1","Laptop1");
        bundle.putString("key2","Laptop2");

        intent.putExtras(bundle);
        startActivityForResult(intent,77);
    }

    private void onMobile(View view) {
        Intent intent = new Intent(this,producerActi.class);


        Bundle bundle = new Bundle();
        bundle.putString("key1","Mobile1");
        bundle.putString("key2","Mobile2");

        intent.putExtras(bundle);
        startActivityForResult(intent,77);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 77){
            if(resultCode == RESULT_OK){
                Bundle bundle = data.getExtras();
                ((TextView)findViewById(R.id.btnR)).setText(bundle.getString("keyR"));
            }
        }
    }
}
