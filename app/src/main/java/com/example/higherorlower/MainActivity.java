package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int rnum;

    public void randomnumber(){
        Random rand= new Random();
        rnum= rand.nextInt(100)+1;

    }

    public void check(View view){

        Log.i("Random number",Integer.toString(rnum));
        EditText editText = (EditText)findViewById(R.id.editText);
        Log.i("Number",editText.getText().toString());

        int num=Integer.parseInt(editText.getText().toString());

        String message;
        if(num>rnum) {
            message = "Go Lower";
        } else if (num < rnum) {
            message = "Go Higher";
        }
        else {
            message="You Got it !";
                    randomnumber();
        }

        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       randomnumber();
    }

}
