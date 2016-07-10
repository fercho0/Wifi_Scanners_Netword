package com.example.forevertucode.wifi_scanners_netword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    /** Called when the activity is first created. */
    private Button button_scan;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button_scan = (Button)findViewById(R.id.button1);
        this.button_scan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()){
            case (R.id.button1):
                Toast.makeText(this, "Escaneando redes wifi...", Toast.LENGTH_LONG).show();
                Intent wifiList = new Intent(this, WifiList.class);
                startActivity(wifiList);
                break;
        }
    }
}