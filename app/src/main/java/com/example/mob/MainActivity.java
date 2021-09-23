package com.example.mob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     *
     * @param a integer number
     * @param b integer number
     * @return Min between this two numbers
     */
    public static int Min(int a,int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    /**
     *
     * @param a integer number
     * @param b integer number
     * @return Max between this two numbers
     */

    public static int Max(int a,int b){
        if (a<b){
            return b;
        }
        else{
            return a;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}