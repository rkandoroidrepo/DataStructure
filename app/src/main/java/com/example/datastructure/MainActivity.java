package com.example.datastructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectionSort();

    }


    public void selectionSort(){
        int [] array = {8,9,4,7,1,5,3,1,2};
        for(int i = 0; i<array.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<array.length; j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        for(int i = 0; i< array.length; i++){
            System.out.println("LOG-i-"+array[i]);
        }
    }
}
