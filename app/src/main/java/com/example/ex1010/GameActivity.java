package com.example.ex1010;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
    Random random = new Random();
    Button[] btn = new Button[25];
    int[] blueColor = {0xffe3f2fd, 0xffbbdefb, 0xff90caf9, 0xff64b5f6, 0xff42a5f5};
    String iString, jString;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);



        for(int i=0; i<btn.length; i++){
            int randColor = blueColor[random.nextInt(5)];
            int btnID = getResources().getIdentifier("button" + (i+1), "id", getPackageName());
            btn[i] = findViewById(btnID);
            btn[i].setBackgroundColor(randColor);
            btn[i].setText(Integer.toString(random.nextInt(25)+1));
            iString = btn[i].getText().toString();

            for(int j=0; j<i; j++){
                jString = btn[j].getText().toString();
                if(iString.equals(jString)){
                    i--;
                }
            }

        }








    }
}
