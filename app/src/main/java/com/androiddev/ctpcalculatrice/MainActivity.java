package com.androiddev.ctpcalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView affichage = findViewById(R.id.operation);

        final Button btn0 = findViewById(R.id.button0);
        final Button btn1 = findViewById(R.id.button1);
        final Button btn2 = findViewById(R.id.button2);
        final Button btn3 = findViewById(R.id.button3);
        final Button btn4 = findViewById(R.id.button4);
        final Button btn5 = findViewById(R.id.button5);
        final Button btn6 = findViewById(R.id.button6);
        final Button btn7 = findViewById(R.id.button7);
        final Button btn8 = findViewById(R.id.button8);
        final Button btn9 = findViewById(R.id.button9);
        final Button btnPlus = findViewById(R.id.buttonPlus);
        final Button btnMoins = findViewById(R.id.buttonMoins);
        final Button btnMultiple = findViewById(R.id.buttonMultiple);
        final Button btnDivise = findViewById(R.id.buttonDivise);
        final Button btnEgal = findViewById(R.id.buttonEgal);
        final Button btnC = findViewById(R.id.buttonC);
        final Button btnVirgule = findViewById(R.id.buttonV);
        final Button btnDel = findViewById(R.id.buttonDel);

        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"0"); }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"1"); }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"2"); }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"3"); }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"4"); }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"5"); }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"6"); }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"7"); }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"8"); }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"9"); }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"+"); }
        });
        btnMoins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"-"); }
        });
        btnMultiple.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"x"); }
        });
        btnDivise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+"/"); }
        });
        btnEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(""); }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(""); }
        });
        btnVirgule.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText()+","); }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { affichage.setText(affichage.getText().toString().substring(0, affichage.getText().toString().length()-1)); }
        });

    }
}
