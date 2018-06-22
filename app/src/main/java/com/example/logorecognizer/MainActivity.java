package com.example.logorecognizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend=(Button)findViewById(R.id.btnSend);
        OnClickListener listener=new OnClickListener() {
            @Override
            public void onClick(View view) {
                //sending text to server
            }
        };
        btnSend.setOnClickListener(listener);
    }
}
