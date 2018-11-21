package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView  ballDisplay = findViewById(R.id.image_eightBall);
        final Button Mybutton = findViewById(R.id.askButton);
        final int[] balls ={R.drawable.ball1 , R.drawable.ball2 , R.drawable.ball3 , R.drawable.ball4 , R.drawable.ball5};


        Mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random Numnergen = new Random();
                Numnergen.nextInt(6);
                int number = Numnergen.nextInt(5);
                ballDisplay.setImageResource(balls[number]);


            }
        });



    }
}
