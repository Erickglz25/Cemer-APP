package com.cemersc.app.energycem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView Solarbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Solarbtn = (ImageView) findViewById(R.id.imageView9);
        Solarbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView9:
                Intent i_solar = new Intent(MainActivity.this,SolarActivity.class);
                startActivity(i_solar);
                break;
        }

    }
}
