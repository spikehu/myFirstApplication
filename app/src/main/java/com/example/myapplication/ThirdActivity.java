package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by 胡家宾 on 2016/6/4.
 */
public class ThirdActivity extends AppCompatActivity {


    private Button button_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.third_layout);
        button_3 = (Button)findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

        }

        });

    }


    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                //Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Toast.makeText(this,"You clicked the add button",Toast.LENGTH_SHORT).show();
                //startActivity(intent);
                break;
            case R.id.remove_item:
                // Intent intent2 = new Intent(MainActivity.this,ThirdActivity.class);
                Toast.makeText(this,"You clicked the remove button",Toast.LENGTH_SHORT).show();
                // startActivity(intent2);
                break;
            default:
        }
        return true;
    }
}
