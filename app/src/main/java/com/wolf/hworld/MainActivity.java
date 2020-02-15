package com.wolf.hworld;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toastMessage,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)

            mShowCount.setText(Integer.toString(mCount));
    }


    public void countDown(View view){
        Button button = (Button) findViewById(R.id.button_countDown);
        mCount--;
        if(mShowCount != null)

            mShowCount.setText(Integer.toString(mCount));
    }

    public void Zero(View view){
        Button button = (Button) findViewById(R.id.button_Zero);
        mCount = 0;
        if(mShowCount != null)

            mShowCount.setText(Integer.toString(mCount));
    }


}

