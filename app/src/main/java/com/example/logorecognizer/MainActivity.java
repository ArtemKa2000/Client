package com.example.logorecognizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    Button btnSend;
    TextView textView;
    String ip;
    int port;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        btnSend=(Button)findViewById(R.id.btnSend);
        OnClickListener listener=new OnClickListener() {
            @Override
            public void onClick(View view) {
                //sending text to server
                String answer="";
                try {
                    Socket s = new Socket(ip, port);
                    BufferedReader input =
                            new BufferedReader(new InputStreamReader(s.getInputStream()));
                     answer = input.readLine();
                }catch (IOException e){
                    answer = "Fail. IOException is thrown.";
                }finally {
                    textView.setText(answer);
                }
            }
        };
        btnSend.setOnClickListener(listener);
    }
}
