package com.example.lesson5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout screen;
    int[] array;
    int[] colors;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (LinearLayout) findViewById(R.id.screen);
        array = new int[]{R.id.blue, R.id.white, R.id.red};
        colors = new int[]{Color.BLUE, Color.WHITE, Color.RED};

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
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
        screen.setBackgroundColor(colors[getIndex(array, item.getItemId())]);

        return true;
    }

    public void next(View view) {
        si = new Intent(this, Activity2.class);
        startActivity(si);
    }

}