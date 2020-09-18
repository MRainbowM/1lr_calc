package com.example.a1_lr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnStart, btnClear;
    private TextView tvSum;
    private EditText te00, te01, te02, te03, te04, te05;
    private EditText te10, te11, te12, te13, te14, te15;
    private EditText te20, te21, te22, te23, te24, te25;
    private EditText te30, te31, te32, te33, te34, te35;
    private EditText te40, te41, te42, te43, te44, te45;
    private EditText te50, te51, te52, te53, te54, te55;
    private Double fl00, fl01, fl02, fl03, fl04, fl05,
    fl10, fl11, fl12, fl13, fl14, fl15,
    fl20, fl21, fl22, fl23, fl24, fl25,
    fl30, fl31, fl32, fl33, fl34, fl35,
    fl40, fl41, fl42, fl43, fl44, fl45,
    fl50, fl51, fl52, fl53, fl54, fl55;
    private Double sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button)findViewById(R.id.btnStart);
        btnClear = (Button)findViewById(R.id.btnClear);
        tvSum = (TextView)findViewById(R.id.tvSum);

        te00 = (EditText)findViewById(R.id.te00);
        te01 = (EditText)findViewById(R.id.te01);
        te02 = (EditText)findViewById(R.id.te02);
        te03 = (EditText)findViewById(R.id.te03);
        te04 = (EditText)findViewById(R.id.te04);
        te05 = (EditText)findViewById(R.id.te05);

        te10 = (EditText)findViewById(R.id.te10);
        te11 = (EditText)findViewById(R.id.te11);
        te12 = (EditText)findViewById(R.id.te12);
        te13 = (EditText)findViewById(R.id.te13);
        te14 = (EditText)findViewById(R.id.te14);
        te15 = (EditText)findViewById(R.id.te15);

        te20 = (EditText)findViewById(R.id.te20);
        te21 = (EditText)findViewById(R.id.te21);
        te22 = (EditText)findViewById(R.id.te22);
        te23 = (EditText)findViewById(R.id.te23);
        te24 = (EditText)findViewById(R.id.te24);
        te25 = (EditText)findViewById(R.id.te25);

        te30 = (EditText)findViewById(R.id.te30);
        te31 = (EditText)findViewById(R.id.te31);
        te32 = (EditText)findViewById(R.id.te32);
        te33 = (EditText)findViewById(R.id.te33);
        te34 = (EditText)findViewById(R.id.te34);
        te35 = (EditText)findViewById(R.id.te35);

        te40 = (EditText)findViewById(R.id.te40);
        te41 = (EditText)findViewById(R.id.te41);
        te42 = (EditText)findViewById(R.id.te42);
        te43 = (EditText)findViewById(R.id.te43);
        te44 = (EditText)findViewById(R.id.te44);
        te45 = (EditText)findViewById(R.id.te45);

        te50 = (EditText)findViewById(R.id.te50);
        te51 = (EditText)findViewById(R.id.te51);
        te52 = (EditText)findViewById(R.id.te52);
        te53 = (EditText)findViewById(R.id.te53);
        te54 = (EditText)findViewById(R.id.te54);
        te55 = (EditText)findViewById(R.id.te55);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fl00 = checkValue(te00.getText().toString());
                fl11 = checkValue(te11.getText().toString());
                fl22 = checkValue(te22.getText().toString());
                fl33 = checkValue(te33.getText().toString());
                fl44 = checkValue(te44.getText().toString());
                fl55 = checkValue(te55.getText().toString());
                sum = fl00 + fl11 + fl22 + fl33 + fl44 + fl55;
                tvSum.setText("Сумма: " + sum.toString());
                if(sum > 10) {
                    editMat(1, 13.5);
                } else {
                    editMat(2, -1.5);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearMat();
            }
        });
    }

    private Double checkValue(String str) {
        Double x = Double.valueOf(0);
        try {
            x = Double.parseDouble(str);
            return x;
        } catch (NumberFormatException e) {
            return x;
        }
    }

    private void setValue() {
        fl00 = checkValue(te00.getText().toString());
        fl01 = checkValue(te01.getText().toString());
        fl02 = checkValue(te02.getText().toString());
        fl03 = checkValue(te03.getText().toString());
        fl04 = checkValue(te04.getText().toString());
        fl05 = checkValue(te05.getText().toString());

        fl10 = checkValue(te10.getText().toString());
        fl11 = checkValue(te11.getText().toString());
        fl12 = checkValue(te12.getText().toString());
        fl13 = checkValue(te13.getText().toString());
        fl14 = checkValue(te14.getText().toString());
        fl15 = checkValue(te15.getText().toString());

        fl20 = checkValue(te20.getText().toString());
        fl21 = checkValue(te21.getText().toString());
        fl22 = checkValue(te22.getText().toString());
        fl23 = checkValue(te23.getText().toString());
        fl24 = checkValue(te24.getText().toString());
        fl25 = checkValue(te25.getText().toString());

        fl30 = checkValue(te30.getText().toString());
        fl31 = checkValue(te31.getText().toString());
        fl32 = checkValue(te32.getText().toString());
        fl33 = checkValue(te33.getText().toString());
        fl34 = checkValue(te34.getText().toString());
        fl35 = checkValue(te35.getText().toString());

        fl40 = checkValue(te40.getText().toString());
        fl41 = checkValue(te41.getText().toString());
        fl42 = checkValue(te42.getText().toString());
        fl43 = checkValue(te43.getText().toString());
        fl44 = checkValue(te44.getText().toString());
        fl45 = checkValue(te45.getText().toString());

        fl50 = checkValue(te50.getText().toString());
        fl51 = checkValue(te51.getText().toString());
        fl52 = checkValue(te52.getText().toString());
        fl53 = checkValue(te53.getText().toString());
        fl54 = checkValue(te54.getText().toString());
        fl55 = checkValue(te55.getText().toString());
    }

    private void editMat(double st, double x) { // > 10
        setValue();
        fl00 = Math.pow(fl00, st) + x;
        te00.setText(fl00.toString());
        fl01 = Math.pow(fl01, st) + x;
        te01.setText(fl01.toString());
        fl02 = Math.pow(fl02, st) + x;
        te02.setText(fl02.toString());
        fl03 = Math.pow(fl03, st) + x;
        te03.setText(fl03.toString());
        fl04 = Math.pow(fl04, st) + x;
        te04.setText(fl04.toString());
        fl05 = Math.pow(fl05, st) + x;
        te05.setText(fl05.toString());

        fl10 = Math.pow(fl10, st) + x;
        te10.setText(fl10.toString());
        fl11 = Math.pow(fl11, st) + x;
        te11.setText(fl11.toString());
        fl12 = Math.pow(fl12, st) + x;
        te12.setText(fl12.toString());
        fl13 = Math.pow(fl13, st) + x;
        te13.setText(fl13.toString());
        fl14 = Math.pow(fl14, st) + x;
        te14.setText(fl14.toString());
        fl15 = Math.pow(fl15, st) + x;
        te15.setText(fl15.toString());

        fl20 = Math.pow(fl20, st) + x;
        te20.setText(fl20.toString());
        fl21 = Math.pow(fl21, st) + x;
        te21.setText(fl21.toString());
        fl22 = Math.pow(fl22, st) + x;
        te22.setText(fl22.toString());
        fl23 = Math.pow(fl23, st) + x;
        te23.setText(fl23.toString());
        fl24 = Math.pow(fl24, st) + x;
        te24.setText(fl24.toString());
        fl25 = Math.pow(fl25, st) + x;
        te25.setText(fl25.toString());

        fl30 = Math.pow(fl30, st) + x;
        te30.setText(fl30.toString());
        fl31 = Math.pow(fl31, st) + x;
        te31.setText(fl31.toString());
        fl32 = Math.pow(fl32, st) + x;
        te32.setText(fl32.toString());
        fl33 = Math.pow(fl33, st) + x;
        te33.setText(fl33.toString());
        fl34 = Math.pow(fl34, st) + x;
        te34.setText(fl34.toString());
        fl35 = Math.pow(fl35, st) + x;
        te35.setText(fl35.toString());

        fl40 = Math.pow(fl40, st) + x;
        te40.setText(fl40.toString());
        fl41 = Math.pow(fl41, st) + x;
        te41.setText(fl41.toString());
        fl42 = Math.pow(fl42, st) + x;
        te42.setText(fl42.toString());
        fl43 = Math.pow(fl43, st) + x;
        te43.setText(fl43.toString());
        fl44 = Math.pow(fl44, st) + x;
        te44.setText(fl44.toString());
        fl45 = Math.pow(fl45, st) + x;
        te45.setText(fl45.toString());

        fl50 = Math.pow(fl50, st) + x;
        te50.setText(fl50.toString());
        fl51 = Math.pow(fl51, st) + x;
        te51.setText(fl51.toString());
        fl52 = Math.pow(fl52, st) + x;
        te52.setText(fl52.toString());
        fl53 = Math.pow(fl53, st) + x;
        te53.setText(fl53.toString());
        fl54 = Math.pow(fl54, st) + x;
        te54.setText(fl54.toString());
        fl55 = Math.pow(fl55, st) + x;
        te55.setText(fl55.toString());
    }

    private void clearMat() {
        te00.setText("");
        te01.setText("");
        te02.setText("");
        te03.setText("");
        te04.setText("");
        te05.setText("");

        te10.setText("");
        te11.setText("");
        te12.setText("");
        te13.setText("");
        te14.setText("");
        te15.setText("");

        te20.setText("");
        te21.setText("");
        te22.setText("");
        te23.setText("");
        te24.setText("");
        te25.setText("");

        te30.setText("");
        te31.setText("");
        te32.setText("");
        te33.setText("");
        te34.setText("");
        te35.setText("");

        te40.setText("");
        te41.setText("");
        te42.setText("");
        te43.setText("");
        te44.setText("");
        te45.setText("");

        te50.setText("");
        te51.setText("");
        te52.setText("");
        te53.setText("");
        te54.setText("");
        te55.setText("");
    }

}
