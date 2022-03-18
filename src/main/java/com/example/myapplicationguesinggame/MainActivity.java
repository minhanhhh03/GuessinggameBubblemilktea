package com.example.myapplicationguesinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    private Button button;

    int result;
    static int getRandomNumber(int max, int min)
    {
        return (int)((Math.random()
                * (max - min)) + min);
    }


    public void makeToast(String str)
    {
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
    public void clickFunction(View view) {
        int min = 1;
        int max = 5;
        result = getRandomNumber(min, max);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonNextGame);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }
    public void openActivity2 (){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void clickFunction1(View view) {
        int userGuessing;
        userGuessing = 1;
        if (userGuessing < result) {
            makeToast("Think of Higher Number, Try Again");
        }
        else if (userGuessing > result) {
            makeToast("Think of Lower Number, Try Again");
        }
        else {
            makeToast(
                    "Congratulations,"
                            +" You Got the Number");
        }
    }
    public void clickFunction2(View view) {
        int userGuessing;
        userGuessing = 2;
        if (userGuessing < result) {
            makeToast("Think of Higher Number, Try Again");
        }
        else if (userGuessing > result) {
            makeToast("Think of Lower Number, Try Again");
        }
        else {
            makeToast(
                    "Congratulations,"
                            +" You Got the Number");
        }
    }
    public void clickFunction3(View view) {
        int userGuessing;
        userGuessing = 3;
        if (userGuessing < result) {
            makeToast("Think of Higher Number, Try Again");
        }
        else if (userGuessing > result) {
            makeToast("Think of Lower Number, Try Again");
        }
        else {
            makeToast(
                    "Congratulations,"
                            +" You Got the Number");
        }
    }
    public void clickFunction4(View view) {
        int userGuessing;
        userGuessing = 4;
        if (userGuessing < result) {
            makeToast("Think of Higher Number, Try Again");
        }
        else if (userGuessing > result) {
            makeToast("Think of Lower Number, Try Again");
        }
        else {
            makeToast(
                    "Congratulations,"
                            +" You Got the Number");
        }
    }
    public void clickFunction5(View view) {
        int userGuessing;
        userGuessing = 5;
        if (userGuessing < result) {
            makeToast("Think of Higher Number, Try Again");
        }
        else if (userGuessing > result) {
            makeToast("Think of Lower Number, Try Again");
        }
        else {
            makeToast(
                    "Congratulations,"
                            +" You Got the Number");
        }
    }

}