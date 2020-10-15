package com.example.lesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Activity2 extends AppCompatActivity {
    LinearLayout screen;
    int[] array;
    int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (LinearLayout) findViewById(R.id.screen);
        array = new int[]{R.id.blue, R.id.white, R.id.red};
        colors = new int[]{Color.BLUE, Color.WHITE, Color.RED, Color.GREEN};

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        menu.add(0,0,400,"green");
        return true;
    }

    public  int getIndex(int[] array,int indexToFind)
    {
        for (int i = 0;i < array.length;i++)
        {
            if(array[i] == indexToFind)
            {
                return i;
            }
        }
        return -1;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int index = getIndex(array, item.getItemId());

        if(index != -1)
        {
            screen.setBackgroundColor(colors[index]);
        }
        else
        {
            screen.setBackgroundColor(colors[colors.length-1]);
        }

        return true;
    }

    public void per(View view) {
        finish();
    }
}