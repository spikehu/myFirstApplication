package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by 胡家宾 on 2016/6/3.
 */
public class SecondActivity extends AppCompatActivity {

    private Button button_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);
       button_2 = (Button)findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent =new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }


}
