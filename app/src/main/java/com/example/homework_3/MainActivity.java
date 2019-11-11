package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;
import java.util.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Object Collections;
    public void onClick(View v){
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView one = (TextView)findViewById(R.id.one);
        TextView two = (TextView)findViewById(R.id.two);
        TextView three = (TextView)findViewById(R.id.three);
        TextView four = (TextView)findViewById(R.id.four);
        TextView five = (TextView)findViewById(R.id.five);
        TextView six = (TextView)findViewById(R.id.six);
        TextView seven = (TextView)findViewById(R.id.seven);
        TextView eight = (TextView)findViewById(R.id.eight);
        TextView nine = (TextView)findViewById(R.id.nine);
        TextView ten = (TextView)findViewById(R.id.ten);
        TextView eleven = (TextView)findViewById(R.id.eleven);
        TextView twelve = (TextView)findViewById(R.id.twelve);
        TextView thirteen = (TextView)findViewById(R.id.thirteen);
        TextView fourteen = (TextView)findViewById(R.id.fourteen);
        TextView fifteen = (TextView)findViewById(R.id.fifteen);
        TextView sixteen = (TextView)findViewById(R.id.sixteen);

        int min = 0;
        int max = 15;
        int random1 = new Random().nextInt((max - min) + 1) + min;
        int random2 = new Random().nextInt((max - min) + 1) + min;
        if(random2 == random1) {
            random2 = new Random().nextInt((max - min) + 1) + min;
        }
        int random3 = new Random().nextInt((max - min) + 1) + min;
        if(random3 == random1 || random3 == random2) {
            random3 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random3 == random1 || random3 == random2) {
            random3 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random3 == random1 || random3 == random2) {
            random3 = new Random().nextInt((max - min) + 1) + min;
        }
        int random4 = new Random().nextInt((max - min) + 1) + min;
        if(random4 == random1 || random4 == random2 || random4 != random3) {
            random4 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random4 == random1 || random4 == random2 || random4 != random3) {
            random4 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random4 == random1 || random4 == random2 || random4 != random3) {
            random4 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random4 == random1 || random4 == random2 || random4 != random3) {
            random4 = new Random().nextInt((max - min) + 1) + min;
        }
        int random5 = new Random().nextInt((max - min) + 1) + min;
        if(random5 == random4 || random5 == random3 || random5 == random2 || random5 == random1) {
            random5 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random5 == random4 || random5 == random3 || random5 == random2 || random5 == random1) {
            random5 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random5 == random4 || random5 == random3 || random5 == random2 || random5 == random1) {
            random5 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random5 == random4 || random5 == random3 || random5 == random2 || random5 == random1) {
            random5 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random5 == random4 || random5 == random3 || random5 == random2 || random5 == random1) {
            random5 = new Random().nextInt((max - min) + 1) + min;
        }
        int random6 = new Random().nextInt((max - min) + 1) + min;
        if(random6 == random5 || random6 == random4 || random6 == random3 || random6 == random2 || random6 == random1) {
            random6 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random6 == random5 || random6 == random4 || random6 == random3 || random6 == random2 || random6 == random1) {
            random6 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random6 == random5 || random6 == random4 || random6 == random3 || random6 == random2 || random6 == random1) {
            random6 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random6 == random5 || random6 == random4 || random6 == random3 || random6 == random2 || random6 == random1) {
            random6 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random6 == random5 || random6 == random4 || random6 == random3 || random6 == random2 || random6 == random1) {
            random6 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random6 == random5 || random6 == random4 || random6 == random3 || random6 == random2 || random6 == random1) {
            random6 = new Random().nextInt((max - min) + 1) + min;
        }
        int random7 = new Random().nextInt((max - min) + 1) + min;
        if(random7 == random6 || random7 == random5 || random7 == random4 || random7 == random3 || random7 == random2 || random7 == random1) {
            random7 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random7 == random6 || random7 == random5 || random7 == random4 || random7 == random3 || random7 == random2 || random7 == random1) {
            random7 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random7 == random6 || random7 == random5 || random7 == random4 || random7 == random3 || random7 == random2 || random7 == random1) {
            random7 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random7 == random6 || random7 == random5 || random7 == random4 || random7 == random3 || random7 == random2 || random7 == random1) {
            random7 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random7 == random6 || random7 == random5 || random7 == random4 || random7 == random3 || random7 == random2 || random7 == random1) {
            random7 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random7 == random6 || random7 == random5 || random7 == random4 || random7 == random3 || random7 == random2 || random7 == random1) {
            random7 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random7 == random6 || random7 == random5 || random7 == random4 || random7 == random3 || random7 == random2 || random7 == random1) {
            random7 = new Random().nextInt((max - min) + 1) + min;
        }
        int random8 = new Random().nextInt((max - min) + 1) + min;
        if(random8 == random7 || random8 == random6 || random8 == random5 || random8 == random4 || random8 == random3 || random8 == random2 || random8 == random1) {
            random8 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random8 == random7 || random8 == random6 || random8 == random5 || random8 == random4 || random8 == random3 || random8 == random2 || random8 == random1) {
            random8 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random8 == random7 || random8 == random6 || random8 == random5 || random8 == random4 || random8 == random3 || random8 == random2 || random8 == random1) {
            random8 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random8 == random7 || random8 == random6 || random8 == random5 || random8 == random4 || random8 == random3 || random8 == random2 || random8 == random1) {
            random8 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random8 == random7 || random8 == random6 || random8 == random5 || random8 == random4 || random8 == random3 || random8 == random2 || random8 == random1) {
            random8 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random8 == random7 || random8 == random6 || random8 == random5 || random8 == random4 || random8 == random3 || random8 == random2 || random8 == random1) {
            random8 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random8 == random7 || random8 == random6 || random8 == random5 || random8 == random4 || random8 == random3 || random8 == random2 || random8 == random1) {
            random8 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random8 == random7 || random8 == random6 || random8 == random5 || random8 == random4 || random8 == random3 || random8 == random2 || random8 == random1) {
            random8 = new Random().nextInt((max - min) + 1) + min;
        }
        int random9 = new Random().nextInt((max - min) + 1) + min;
        if(random9 == random8 || random9 == random7 || random9 == random6 || random9 == random5 || random9 == random4 || random9 == random3 || random9 == random2 || random9 == random1) {
            random9 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random9 == random8 || random9 == random7 || random9 == random6 || random9 == random5 || random9 == random4 || random9 == random3 || random9 == random2 || random9 == random1) {
            random9 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random9 == random8 || random9 == random7 || random9 == random6 || random9 == random5 || random9 == random4 || random9 == random3 || random9 == random2 || random9 == random1) {
            random9 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random9 == random8 || random9 == random7 || random9 == random6 || random9 == random5 || random9 == random4 || random9 == random3 || random9 == random2 || random9 == random1) {
            random9 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random9 == random8 || random9 == random7 || random9 == random6 || random9 == random5 || random9 == random4 || random9 == random3 || random9 == random2 || random9 == random1) {
            random9 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random9 == random8 || random9 == random7 || random9 == random6 || random9 == random5 || random9 == random4 || random9 == random3 || random9 == random2 || random9 == random1) {
            random9 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random9 == random8 || random9 == random7 || random9 == random6 || random9 == random5 || random9 == random4 || random9 == random3 || random9 == random2 || random9 == random1) {
            random9 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random9 == random8 || random9 == random7 || random9 == random6 || random9 == random5 || random9 == random4 || random9 == random3 || random9 == random2 || random9 == random1) {
            random9 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random9 == random8 || random9 == random7 || random9 == random6 || random9 == random5 || random9 == random4 || random9 == random3 || random9 == random2 || random9 == random1) {
            random9 = new Random().nextInt((max - min) + 1) + min;
        }
        int random10 = new Random().nextInt((max - min) + 1) + min;
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random10 == random9 || random10 == random8 || random10 == random7 || random10 == random6 || random10 == random5 || random10 == random4 || random10 == random3 || random10 == random2 || random10 == random1) {
            random10 = new Random().nextInt((max - min) + 1) + min;
        }
        int random11 = new Random().nextInt((max - min) + 1) + min;
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random11 == random10 || random11 == random9 || random11 == random8 || random11 == random7 || random11 == random6 || random11 == random5 || random11 == random4 || random11 == random3 || random11 == random2 || random11 == random1) {
            random11 = new Random().nextInt((max - min) + 1) + min;
        }
        int random12 = new Random().nextInt((max - min) + 1) + min;
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random12 == random11 || random12 == random10 || random12 == random9 || random12 == random8 || random12 == random7 || random12 == random6 || random12 == random5 || random12 == random4 || random12 == random3 || random12 == random2 || random12 != random1) {
            random12 = new Random().nextInt((max - min) + 1) + min;
        }
        int random13 = new Random().nextInt((max - min) + 1) + min;
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random13 == random12 || random13 == random11 || random13 == random10 || random13 == random9 || random13 == random8 || random13 == random7 || random13 == random6 || random13 == random5 || random13 == random4 || random13 == random3 || random13 == random2 || random13 == random1) {
            random13 = new Random().nextInt((max - min) + 1) + min;
        }
        int random14 = new Random().nextInt((max - min) + 1) + min;
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random14 == random13 || random14 == random12 || random14 == random11 || random14 == random10 || random14 == random9 || random14 == random8 || random14 == random7 || random14 == random6 || random14 == random5 || random14 == random4 || random14 == random3 || random14 == random2 || random14 == random1) {
            random14 = new Random().nextInt((max - min) + 1) + min;
        }
        int random15 = new Random().nextInt((max - min) + 1) + min;
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random15 == random14 || random15 == random13 || random15 == random12 || random15 == random11 || random15 == random10 || random15 == random9 || random15 == random8 || random15 == random7 || random15 == random6 || random15 == random5 || random15 == random4 || random15 == random3 || random15 == random2 || random15 == random1) {
            random15 = new Random().nextInt((max - min) + 1) + min;
        }
        int random16 = new Random().nextInt((max - min) + 1) + min;
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }
        if(random16 == random15 || random16 == random14 || random16 == random13 || random16 == random12 || random16 == random11 || random16 == random10 || random16 == random9 || random16 == random8 || random16 == random7 || random16 == random6 || random16 == random5 || random16 == random4 || random16 == random3 || random16 == random2 || random16 != random1) {
            random16 = new Random().nextInt((max - min) + 1) + min;
        }


        one.setText(""+random1);
        two.setText(""+random2);
        three.setText(""+random3);
        four.setText(""+random4);
        five.setText(""+random5);
        six.setText(""+random6);
        seven.setText(""+random7);
        eight.setText(""+random8);
        nine.setText(""+random9);
        ten.setText(""+random10);
        eleven.setText(""+random11);
        twelve.setText(""+random12);
        thirteen.setText(""+random13);
        fourteen.setText(""+random14);
        fifteen.setText(""+random15);
        sixteen.setText(""+random16);

    }
}



