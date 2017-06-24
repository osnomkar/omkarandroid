package com.conq.omkar.uixml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnU = (Button) findViewById(R.id.btnU);
        btnU.setOnClickListener(new Upper());
        Button btnL = (Button) findViewById(R.id.btnL);
        btnL.setOnClickListener(new Lower());

    }

    private class Upper implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText edttxt = (EditText) findViewById(R.id.edttxt);
            String dt = edttxt.getText().toString();
            edttxt.setText(dt.toUpperCase());
        }
    }

   private class Lower implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText edttxt = (EditText) findViewById(R.id.edttxt);
            String dt = edttxt.getText().toString();
            edttxt.setText(dt.toLowerCase());
        }
       }

}
