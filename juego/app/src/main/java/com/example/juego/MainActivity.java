package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Integer c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);

        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn1 =  findViewById(R.id.btn1);
                Button btn2 =  findViewById(R.id.btn2);
                Button btn3 =  findViewById(R.id.btn3);
                Button btn4 =  findViewById(R.id.btn4);
                Button btn5 =  findViewById(R.id.btn5);
                Button btn6 =  findViewById(R.id.btn6);
                Button btn7 =  findViewById(R.id.btn7);
                Button btn8 =  findViewById(R.id.btn8);
                Button btn9 =  findViewById(R.id.btn9);
                TextView tu =  findViewById(R.id.text1);

                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                tu.setText("");
                btn1.setClickable(true);
                btn2.setClickable(true);
                btn3.setClickable(true);
                btn4.setClickable(true);
                btn5.setClickable(true);
                btn6.setClickable(true);
                btn7.setClickable(true);
                btn8.setClickable(true);
                btn9.setClickable(true);

            }
        });



    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        TextView tu =  findViewById(R.id.text1);
        if (c == 0) {
            tu.setText("Es turno del jugador 2");
            b.setText("X");
            c = 1;
        }
        else{
            tu.setText("Es turno del jugador 1");
            b.setText("O");
            c = 0;
        }
        b.setClickable(false);

        Button btn1 =  findViewById(R.id.btn1);
        Button btn2 =  findViewById(R.id.btn2);
        Button btn3 =  findViewById(R.id.btn3);
        Button btn4 =  findViewById(R.id.btn4);
        Button btn5 =  findViewById(R.id.btn5);
        Button btn6 =  findViewById(R.id.btn6);
        Button btn7 =  findViewById(R.id.btn7);
        Button btn8 =  findViewById(R.id.btn8);
        Button btn9 =  findViewById(R.id.btn9);


        if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")||
                btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")||
                btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")||
                btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")||
                btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X")||
                btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")||
                btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")||
                btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")){

            tu.setText("Gano el jugador 1");

        }

        else if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")||
                btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")||
                btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")||
                btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")||
                btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O")||
                btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")||
                btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")||
                btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")){

            tu.setText("Gano el jugador 2");

        }

    }

}