package com.tricktech.fragmentexample;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button btnOne,btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.button);
        btnTwo = (Button) findViewById(R.id.button2);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btnOne){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container_fragment,new OneFragment());
            ft.addToBackStack(null);
            ft.commit();

        }else if (view == btnTwo){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container_fragment,new TwoFragment());
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}
