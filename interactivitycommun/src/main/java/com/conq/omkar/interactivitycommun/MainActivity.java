package com.conq.omkar.interactivitycommun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        startActivity(intent);
    }

    private void onMobile(View view) {
        Intent intent = new Intent(this,producerActi.class);


        Bundle bundle = new Bundle();
        bundle.putString("key1","Mobile1");
        bundle.putString("key2","Mobile2");

        intent.putExtras(bundle);
        startActivity(intent);

    }

}
