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

    public String test = "abcefg";
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
    private Button btL;
    private Button btM;
    private Button btN;
    private Button btO;
    private Button btP;
    private Button btQ;
    private Button btR;
    private Button btS;
    private Button btT;
    private Button btU;
    private Button btV;
    private Button btW;
    private Button btX;
    private Button btY;
    private Button btZ;

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
            btL = (Button) findViewById(R.id.buttonL);
            btM = (Button) findViewById(R.id.buttonM);
            btN = (Button) findViewById(R.id.buttonN);
            btO = (Button) findViewById(R.id.buttonO);
            btP = (Button) findViewById(R.id.buttonP);
            btQ = (Button) findViewById(R.id.buttonQ);
            btR = (Button) findViewById(R.id.buttonR);
            btS = (Button) findViewById(R.id.buttonS);
            btT = (Button) findViewById(R.id.buttonT);
            btU = (Button) findViewById(R.id.buttonU);
            btV = (Button) findViewById(R.id.buttonV);
            btW = (Button) findViewById(R.id.buttonW);
            btX = (Button) findViewById(R.id.buttonX);
            btY = (Button) findViewById(R.id.buttonY);
            btZ = (Button) findViewById(R.id.buttonZ);
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

        public void printL(View view){
            ArrayList<Integer> index= getIndex("l",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("L");
                        break;
                    case 1:
                        wd1.setText("L");
                        break;
                    case 2:
                        wd2.setText("L");
                        break;
                    case 3:
                        wd3.setText("L");
                        break;
                    case 4:
                        wd4.setText("L");
                        break;
                    case 5:
                        wd5.setText("L");
                        break;
                }
            }
            btL.setEnabled(false);
        }

        public void printM(View view){
            ArrayList<Integer> index= getIndex("m",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("M");
                        break;
                    case 1:
                        wd1.setText("M");
                        break;
                    case 2:
                        wd2.setText("M");
                        break;
                    case 3:
                        wd3.setText("M");
                        break;
                    case 4:
                        wd4.setText("M");
                        break;
                    case 5:
                        wd5.setText("M");
                        break;
                }
            }
            btM.setEnabled(false);
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

        public void printO(View view){
            ArrayList<Integer> index= getIndex("o",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("O");
                        break;
                    case 1:
                        wd1.setText("O");
                        break;
                    case 2:
                        wd2.setText("O");
                        break;
                    case 3:
                        wd3.setText("O");
                        break;
                    case 4:
                        wd4.setText("O");
                        break;
                    case 5:
                        wd5.setText("O");
                        break;
                }
            }
            btO.setEnabled(false);
        }

        public void printP(View view){
            ArrayList<Integer> index= getIndex("p",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("P");
                        break;
                    case 1:
                        wd1.setText("P");
                        break;
                    case 2:
                        wd2.setText("P");
                        break;
                    case 3:
                        wd3.setText("P");
                        break;
                    case 4:
                        wd4.setText("P");
                        break;
                    case 5:
                        wd5.setText("P");
                        break;
                }
            }
            btP.setEnabled(false);
        }

        public void printQ(View view){
            ArrayList<Integer> index= getIndex("q",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("Q");
                        break;
                    case 1:
                        wd1.setText("Q");
                        break;
                    case 2:
                        wd2.setText("Q");
                        break;
                    case 3:
                        wd3.setText("Q");
                        break;
                    case 4:
                        wd4.setText("Q");
                        break;
                    case 5:
                        wd5.setText("Q");
                        break;
                }
            }
            btQ.setEnabled(false);
        }

        public void printR(View view){
            ArrayList<Integer> index= getIndex("r",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("R");
                        break;
                    case 1:
                        wd1.setText("R");
                        break;
                    case 2:
                        wd2.setText("R");
                        break;
                    case 3:
                        wd3.setText("R");
                        break;
                    case 4:
                        wd4.setText("R");
                        break;
                    case 5:
                        wd5.setText("R");
                        break;
                }
            }
            btR.setEnabled(false);
        }

        public void printS(View view){
            ArrayList<Integer> index= getIndex("s",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("S");
                        break;
                    case 1:
                        wd1.setText("S");
                        break;
                    case 2:
                        wd2.setText("S");
                        break;
                    case 3:
                        wd3.setText("S");
                        break;
                    case 4:
                        wd4.setText("S");
                        break;
                    case 5:
                        wd5.setText("S");
                        break;
                }
            }
            btS.setEnabled(false);
        }

        public void printT(View view){
            ArrayList<Integer> index= getIndex("t",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("T");
                        break;
                    case 1:
                        wd1.setText("T");
                        break;
                    case 2:
                        wd2.setText("T");
                        break;
                    case 3:
                        wd3.setText("T");
                        break;
                    case 4:
                        wd4.setText("T");
                        break;
                    case 5:
                        wd5.setText("T");
                        break;
                }
            }
            btT.setEnabled(false);
        }

        public void printU(View view){
            ArrayList<Integer> index= getIndex("u",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("U");
                        break;
                    case 1:
                        wd1.setText("U");
                        break;
                    case 2:
                        wd2.setText("U");
                        break;
                    case 3:
                        wd3.setText("U");
                        break;
                    case 4:
                        wd4.setText("U");
                        break;
                    case 5:
                        wd5.setText("U");
                        break;
                }
            }
            btU.setEnabled(false);
        }

        public void printV(View view){
            ArrayList<Integer> index= getIndex("v",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("V");
                        break;
                    case 1:
                        wd1.setText("V");
                        break;
                    case 2:
                        wd2.setText("V");
                        break;
                    case 3:
                        wd3.setText("V");
                        break;
                    case 4:
                        wd4.setText("V");
                        break;
                    case 5:
                        wd5.setText("V");
                        break;
                }
            }
            btV.setEnabled(false);
        }

        public void printW(View view){
            ArrayList<Integer> index= getIndex("w",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("W");
                        break;
                    case 1:
                        wd1.setText("W");
                        break;
                    case 2:
                        wd2.setText("W");
                        break;
                    case 3:
                        wd3.setText("W");
                        break;
                    case 4:
                        wd4.setText("W");
                        break;
                    case 5:
                        wd5.setText("W");
                        break;
                }
            }
            btW.setEnabled(false);
        }

        public void printX(View view){
            ArrayList<Integer> index= getIndex("x",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("X");
                        break;
                    case 1:
                        wd1.setText("X");
                        break;
                    case 2:
                        wd2.setText("X");
                        break;
                    case 3:
                        wd3.setText("X");
                        break;
                    case 4:
                        wd4.setText("X");
                        break;
                    case 5:
                        wd5.setText("X");
                        break;
                }
            }
            btX.setEnabled(false);
        }

        public void printY(View view){
            ArrayList<Integer> index= getIndex("y",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("Y");
                        break;
                    case 1:
                        wd1.setText("Y");
                        break;
                    case 2:
                        wd2.setText("Y");
                        break;
                    case 3:
                        wd3.setText("Y");
                        break;
                    case 4:
                        wd4.setText("Y");
                        break;
                    case 5:
                        wd5.setText("Y");
                        break;
                }
            }
            btY.setEnabled(false);
        }

        public void printZ(View view){
            ArrayList<Integer> index= getIndex("z",test);
            for (int i =0; i < index.size();i++){
                int j = index.get(i);
                switch (j){
                    case 0:
                        wd0.setText("Z");
                        break;
                    case 1:
                        wd1.setText("Z");
                        break;
                    case 2:
                        wd2.setText("Z");
                        break;
                    case 3:
                        wd3.setText("Z");
                        break;
                    case 4:
                        wd4.setText("Z");
                        break;
                    case 5:
                        wd5.setText("Z");
                        break;
                }
            }
            btZ.setEnabled(false);
        }

    }




