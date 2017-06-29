package com.conq.omkar.compviewlayinflator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.conq.omkar.compviewlayinflator.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnAdd).setOnClickListener(this::onAdd);
    }

    private void onAdd(View view) {
        //final LayoutInflater inflat = getLayoutInflater();
        //final LayoutInflater inflat = getSystemService(LAYOUT_INFLATER_SERVICE);
        final LayoutInflater inflat = LayoutInflater.from(this);
        inflat.inflate(R.layout.comp_view,(LinearLayout)findViewById(R.id.CompL),true);
    }
}
