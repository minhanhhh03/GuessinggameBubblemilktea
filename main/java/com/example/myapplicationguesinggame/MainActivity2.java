package com.example.myapplicationguesinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private Button button1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 = (Button) findViewById(R.id.buttonNextGame2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }
    public void openActivity3 (){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }

    int result;
    static int getRandomNumber(int max, int min)
    {
        return (int)((Math.random()
                * (max - min)) + min);
    }


    public void makeToast(String str)
    {
        Toast.makeText(MainActivity2.this, str, Toast.LENGTH_SHORT).show();
    }
    public void clickFunctionCreateNew(View view) {
        int min = 1;
        int max = 10;
        result = getRandomNumber(min, max);

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

    public void clickFunction6(View view) {
        int userGuessing;
        userGuessing = 6;
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
    public void clickFunction7(View view) {
        int userGuessing;
        userGuessing = 7;
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
    public void clickFunction8(View view) {
        int userGuessing;
        userGuessing = 8;
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
    public void clickFunction9(View view) {
        int userGuessing;
        userGuessing = 9;
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
    public void clickFunction10(View view) {
        int userGuessing;
        userGuessing = 5+5;
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