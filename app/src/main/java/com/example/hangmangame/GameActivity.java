package com.example.hangmangame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class GameActivity extends AppCompatActivity {

    public String test = "banana";
    private TextView wd0;
    private TextView wd1;
    private TextView wd2 ;
    private TextView wd3;
    private TextView wd4;
    private TextView wd5;

    private Button btA;
    private Button btB;
    private Button btC;
    private Button btD;
    private Button btE;
    private Button btF;
    private Button btG;
    private Button btH;
    private Button btI;
    private Button btJ;
    private Button btK;
    private Button btN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);



         wd0 = (TextView) findViewById(R.id.word0);
         wd1 = (TextView) findViewById(R.id.word1);
         wd2 = (TextView) findViewById(R.id.word2);
         wd3 = (TextView) findViewById(R.id.word3);
         wd4 = (TextView) findViewById(R.id.word4);
         wd5 = (TextView) findViewById(R.id.word5);

         btA = (Button) findViewById(R.id.buttonA);
         btB = (Button) findViewById(R.id.buttonB);
         btC = (Button) findViewById(R.id.buttonC);
         btD = (Button) findViewById(R.id.buttonD);
         btE = (Button) findViewById(R.id.buttonE);
         btF = (Button) findViewById(R.id.buttonF);
         btG = (Button) findViewById(R.id.buttonG);
         btH = (Button) findViewById(R.id.buttonH);
         btI = (Button) findViewById(R.id.buttonI);
         btJ = (Button) findViewById(R.id.buttonJ);
         btK = (Button) findViewById(R.id.buttonK);
         btN = (Button) findViewById(R.id.buttonN);



    }

    public ArrayList<Integer> getIndex(String x, String y){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = y.indexOf(x);
        while (index >= 0) {
            list.add(index);
            index = y.indexOf(x, index + 1);
        }

        return list;
    }
    public void printA(View view){
        ArrayList<Integer> index= getIndex("a",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("A");
                    break;
                case 1:
                    wd1.setText("A");
                    break;
                case 2:
                    wd2.setText("A");
                    break;
                case 3:
                    wd3.setText("A");
                    break;
                case 4:
                    wd4.setText("A");
                    break;
                case 5:
                    wd5.setText("A");
                    break;
            }
        }
        btA.setEnabled(false);
    }

    public void printB(View view){
        ArrayList<Integer> index= getIndex("b",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("B");
                    break;
                case 1:
                    wd1.setText("B");
                    break;
                case 2:
                    wd2.setText("B");
                    break;
                case 3:
                    wd3.setText("B");
                    break;
                case 4:
                    wd4.setText("B");
                    break;
                case 5:
                    wd5.setText("B");
                    break;
            }
        }
        btB.setEnabled(false);
    }

    public void printC(View view){
        ArrayList<Integer> index= getIndex("c",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("C");
                    break;
                case 1:
                    wd1.setText("C");
                    break;
                case 2:
                    wd2.setText("C");
                    break;
                case 3:
                    wd3.setText("C");
                    break;
                case 4:
                    wd4.setText("C");
                    break;
                case 5:
                    wd5.setText("C");
                    break;
            }
        }
        btC.setEnabled(false);
    }

    public void printD(View view){
        ArrayList<Integer> index= getIndex("d",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("D");
                    break;
                case 1:
                    wd1.setText("D");
                    break;
                case 2:
                    wd2.setText("D");
                    break;
                case 3:
                    wd3.setText("D");
                    break;
                case 4:
                    wd4.setText("D");
                    break;
                case 5:
                    wd5.setText("D");
                    break;
            }
        }
        btD.setEnabled(false);
    }

    public void printE(View view){
        ArrayList<Integer> index= getIndex("e",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("E");
                    break;
                case 1:
                    wd1.setText("E");
                    break;
                case 2:
                    wd2.setText("E");
                    break;
                case 3:
                    wd3.setText("E");
                    break;
                case 4:
                    wd4.setText("E");
                    break;
                case 5:
                    wd5.setText("E");
                    break;
            }
        }
        btE.setEnabled(false);
    }

    public void printF(View view){
        ArrayList<Integer> index= getIndex("f",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("F");
                    break;
                case 1:
                    wd1.setText("F");
                    break;
                case 2:
                    wd2.setText("F");
                    break;
                case 3:
                    wd3.setText("F");
                    break;
                case 4:
                    wd4.setText("F");
                    break;
                case 5:
                    wd5.setText("F");
                    break;
            }
        }
        btF.setEnabled(false);
    }

    public void printG(View view){
        ArrayList<Integer> index= getIndex("g",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("G");
                    break;
                case 1:
                    wd1.setText("G");
                    break;
                case 2:
                    wd2.setText("G");
                    break;
                case 3:
                    wd3.setText("G");
                    break;
                case 4:
                    wd4.setText("G");
                    break;
                case 5:
                    wd5.setText("G");
                    break;
            }
        }
        btG.setEnabled(false);
    }

    public void printH(View view){
        ArrayList<Integer> index= getIndex("h",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("H");
                    break;
                case 1:
                    wd1.setText("H");
                    break;
                case 2:
                    wd2.setText("H");
                    break;
                case 3:
                    wd3.setText("H");
                    break;
                case 4:
                    wd4.setText("H");
                    break;
                case 5:
                    wd5.setText("H");
                    break;
            }
        }
        btH.setEnabled(false);
    }

    public void printI(View view){
        ArrayList<Integer> index= getIndex("i",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("I");
                    break;
                case 1:
                    wd1.setText("I");
                    break;
                case 2:
                    wd2.setText("I");
                    break;
                case 3:
                    wd3.setText("I");
                    break;
                case 4:
                    wd4.setText("I");
                    break;
                case 5:
                    wd5.setText("I");
                    break;
            }
        }
        btI.setEnabled(false);
    }

    public void printJ(View view){
        ArrayList<Integer> index= getIndex("j",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("J");
                    break;
                case 1:
                    wd1.setText("J");
                    break;
                case 2:
                    wd2.setText("J");
                    break;
                case 3:
                    wd3.setText("J");
                    break;
                case 4:
                    wd4.setText("J");
                    break;
                case 5:
                    wd5.setText("J");
                    break;
            }
        }
        btJ.setEnabled(false);
    }

    public void printK(View view){
        ArrayList<Integer> index= getIndex("k",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("K");
                    break;
                case 1:
                    wd1.setText("K");
                    break;
                case 2:
                    wd2.setText("K");
                    break;
                case 3:
                    wd3.setText("K");
                    break;
                case 4:
                    wd4.setText("K");
                    break;
                case 5:
                    wd5.setText("K");
                    break;
            }
        }
        btK.setEnabled(false);
    }

    public void printN(View view){
        ArrayList<Integer> index= getIndex("n",test);
        for (int i =0; i < index.size();i++){
            int j = index.get(i);
            switch (j){
                case 0:
                    wd0.setText("N");
                    break;
                case 1:
                    wd1.setText("N");
                    break;
                case 2:
                    wd2.setText("N");
                    break;
                case 3:
                    wd3.setText("N");
                    break;
                case 4:
                    wd4.setText("N");
                    break;
                case 5:
                    wd5.setText("N");
                    break;
            }
        }
        btN.setEnabled(false);
    }


}
