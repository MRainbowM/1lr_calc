package com.example.a1_lr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnStart, btnClear, btnGen;
    private CheckBox checkBox;
    private SeekBar seekBar1, seekBar2;
    private LinearLayout linearLayout_2;
    private Switch switch1;
    private TextView tvSum;
    private TextView tvInt;
    private EditText te00, te01, te02, te03, te04, te05;
    private EditText te10, te11, te12, te13, te14, te15;
    private EditText te20, te21, te22, te23, te24, te25;
    private EditText te30, te31, te32, te33, te34, te35;
    private EditText te40, te41, te42, te43, te44, te45;
    private EditText te50, te51, te52, te53, te54, te55;

    private EditText te00_2, te01_2, te02_2, te03_2, te04_2, te05_2;
    private EditText te10_2, te11_2, te12_2, te13_2, te14_2, te15_2;
    private EditText te20_2, te21_2, te22_2, te23_2, te24_2, te25_2;
    private EditText te30_2, te31_2, te32_2, te33_2, te34_2, te35_2;
    private EditText te40_2, te41_2, te42_2, te43_2, te44_2, te45_2;
    private EditText te50_2, te51_2, te52_2, te53_2, te54_2, te55_2;


    private Double fl00, fl01, fl02, fl03, fl04, fl05,
    fl10, fl11, fl12, fl13, fl14, fl15,
    fl20, fl21, fl22, fl23, fl24, fl25,
    fl30, fl31, fl32, fl33, fl34, fl35,
    fl40, fl41, fl42, fl43, fl44, fl45,
    fl50, fl51, fl52, fl53, fl54, fl55;
    private Double sum;

    EditText[][] originMat = new EditText[6][6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button)findViewById(R.id.btnStart);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnGen = (Button)findViewById(R.id.btnGen);

        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox.setChecked(true);

        seekBar1 = (SeekBar)findViewById(R.id.seekBar1);
        seekBar2 = (SeekBar)findViewById(R.id.seekBar2);

        switch1 = (Switch)findViewById(R.id.switch1);

        linearLayout_2 = (LinearLayout)findViewById(R.id.linearLayout_2);

        tvSum = (TextView)findViewById(R.id.tvSum);
        tvInt = (TextView)findViewById(R.id.tvInt);

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

        ///
        te00_2 = (EditText)findViewById(R.id.te00_2);
        te01_2 = (EditText)findViewById(R.id.te01_2);
        te02_2 = (EditText)findViewById(R.id.te02_2);
        te03_2 = (EditText)findViewById(R.id.te03_2);
        te04_2 = (EditText)findViewById(R.id.te04_2);
        te05_2 = (EditText)findViewById(R.id.te05_2);

        te10_2 = (EditText)findViewById(R.id.te10_2);
        te11_2 = (EditText)findViewById(R.id.te11_2);
        te12_2 = (EditText)findViewById(R.id.te12_2);
        te13_2 = (EditText)findViewById(R.id.te13_2);
        te14_2 = (EditText)findViewById(R.id.te14_2);
        te15_2 = (EditText)findViewById(R.id.te15_2);

        te20_2 = (EditText)findViewById(R.id.te20_2);
        te21_2 = (EditText)findViewById(R.id.te21_2);
        te22_2 = (EditText)findViewById(R.id.te22_2);
        te23_2 = (EditText)findViewById(R.id.te23_2);
        te24_2 = (EditText)findViewById(R.id.te24_2);
        te25_2 = (EditText)findViewById(R.id.te25_2);

        te30_2 = (EditText)findViewById(R.id.te30_2);
        te31_2 = (EditText)findViewById(R.id.te31_2);
        te32_2 = (EditText)findViewById(R.id.te32_2);
        te33_2 = (EditText)findViewById(R.id.te33_2);
        te34_2 = (EditText)findViewById(R.id.te34_2);
        te35_2 = (EditText)findViewById(R.id.te35_2);

        te40_2 = (EditText)findViewById(R.id.te40_2);
        te41_2 = (EditText)findViewById(R.id.te41_2);
        te42_2 = (EditText)findViewById(R.id.te42_2);
        te43_2 = (EditText)findViewById(R.id.te43_2);
        te44_2 = (EditText)findViewById(R.id.te44_2);
        te45_2 = (EditText)findViewById(R.id.te45_2);

        te50_2 = (EditText)findViewById(R.id.te50_2);
        te51_2 = (EditText)findViewById(R.id.te51_2);
        te52_2 = (EditText)findViewById(R.id.te52_2);
        te53_2 = (EditText)findViewById(R.id.te53_2);
        te54_2 = (EditText)findViewById(R.id.te54_2);
        te55_2 = (EditText)findViewById(R.id.te55_2);


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
                initArrayOriginMat();
                clearMat();
            }
        });

        btnGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initArrayOriginMat();
                genMat();
            }
        });

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch1.isChecked()) {
                    linearLayout_2.setVisibility(View.GONE);
                } else {
                    linearLayout_2.setVisibility(View.VISIBLE);
                }
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()) {
                    seekBar1.setEnabled(true);
                    seekBar2.setEnabled(true);
                } else {
                    seekBar1.setEnabled(false);
                    seekBar2.setEnabled(false);
                }
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
        te00_2.setText(fl00.toString());
        fl01 = Math.pow(fl01, st) + x;
        te01_2.setText(fl01.toString());
        fl02 = Math.pow(fl02, st) + x;
        te02_2.setText(fl02.toString());
        fl03 = Math.pow(fl03, st) + x;
        te03_2.setText(fl03.toString());
        fl04 = Math.pow(fl04, st) + x;
        te04_2.setText(fl04.toString());
        fl05 = Math.pow(fl05, st) + x;
        te05_2.setText(fl05.toString());

        fl10 = Math.pow(fl10, st) + x;
        te10_2.setText(fl10.toString());
        fl11 = Math.pow(fl11, st) + x;
        te11_2.setText(fl11.toString());
        fl12 = Math.pow(fl12, st) + x;
        te12_2.setText(fl12.toString());
        fl13 = Math.pow(fl13, st) + x;
        te13_2.setText(fl13.toString());
        fl14 = Math.pow(fl14, st) + x;
        te14_2.setText(fl14.toString());
        fl15 = Math.pow(fl15, st) + x;
        te15_2.setText(fl15.toString());

        fl20 = Math.pow(fl20, st) + x;
        te20_2.setText(fl20.toString());
        fl21 = Math.pow(fl21, st) + x;
        te21_2.setText(fl21.toString());
        fl22 = Math.pow(fl22, st) + x;
        te22_2.setText(fl22.toString());
        fl23 = Math.pow(fl23, st) + x;
        te23_2.setText(fl23.toString());
        fl24 = Math.pow(fl24, st) + x;
        te24_2.setText(fl24.toString());
        fl25 = Math.pow(fl25, st) + x;
        te25_2.setText(fl25.toString());

        fl30 = Math.pow(fl30, st) + x;
        te30_2.setText(fl30.toString());
        fl31 = Math.pow(fl31, st) + x;
        te31_2.setText(fl31.toString());
        fl32 = Math.pow(fl32, st) + x;
        te32_2.setText(fl32.toString());
        fl33 = Math.pow(fl33, st) + x;
        te33_2.setText(fl33.toString());
        fl34 = Math.pow(fl34, st) + x;
        te34_2.setText(fl34.toString());
        fl35 = Math.pow(fl35, st) + x;
        te35_2.setText(fl35.toString());

        fl40 = Math.pow(fl40, st) + x;
        te40_2.setText(fl40.toString());
        fl41 = Math.pow(fl41, st) + x;
        te41_2.setText(fl41.toString());
        fl42 = Math.pow(fl42, st) + x;
        te42_2.setText(fl42.toString());
        fl43 = Math.pow(fl43, st) + x;
        te43_2.setText(fl43.toString());
        fl44 = Math.pow(fl44, st) + x;
        te44_2.setText(fl44.toString());
        fl45 = Math.pow(fl45, st) + x;
        te45_2.setText(fl45.toString());

        fl50 = Math.pow(fl50, st) + x;
        te50_2.setText(fl50.toString());
        fl51 = Math.pow(fl51, st) + x;
        te51_2.setText(fl51.toString());
        fl52 = Math.pow(fl52, st) + x;
        te52_2.setText(fl52.toString());
        fl53 = Math.pow(fl53, st) + x;
        te53_2.setText(fl53.toString());
        fl54 = Math.pow(fl54, st) + x;
        te54_2.setText(fl54.toString());
        fl55 = Math.pow(fl55, st) + x;
        te55_2.setText(fl55.toString());
    }

    private void clearMat() {
        for (Integer i = 0; i < 6; i++) {
            for (Integer j = 0; j < 6; j++) {
                originMat[i][j].setText("");
            }
        }
    }

    private void initArrayOriginMat() {
        originMat[0][0] = te00;
        originMat[0][1] = te01;
        originMat[0][2] = te02;
        originMat[0][3] = te03;
        originMat[0][4] = te04;
        originMat[0][5] = te05;

        originMat[1][0] = te10;
        originMat[1][1] = te11;
        originMat[1][2] = te12;
        originMat[1][3] = te13;
        originMat[1][4] = te14;
        originMat[1][5] = te15;

        originMat[2][0] = te20;
        originMat[2][1] = te21;
        originMat[2][2] = te22;
        originMat[2][3] = te23;
        originMat[2][4] = te24;
        originMat[2][5] = te25;

        originMat[3][0] = te30;
        originMat[3][1] = te31;
        originMat[3][2] = te32;
        originMat[3][3] = te33;
        originMat[3][4] = te34;
        originMat[3][5] = te35;

        originMat[4][0] = te40;
        originMat[4][1] = te41;
        originMat[4][2] = te42;
        originMat[4][3] = te43;
        originMat[4][4] = te44;
        originMat[4][5] = te45;

        originMat[5][0] = te50;
        originMat[5][1] = te51;
        originMat[5][2] = te52;
        originMat[5][3] = te53;
        originMat[5][4] = te54;
        originMat[5][5] = te55;
    }

    private void genMat() {
        Integer a = seekBar1.getProgress();
        Integer b = seekBar2.getProgress();
        b -= a;
        tvInt.setText(a.toString() + " - " + b.toString());
        for (Integer i = 0; i < 6; i++) {
            for (Integer j = 0; j < 6; j++) {
//                Double k = 10 + Math.random() * 5;
                Integer k = a + (int) (Math.random() * b);
                originMat[i][j].setText(Integer.toString(k));
            }
        }
    }
}
