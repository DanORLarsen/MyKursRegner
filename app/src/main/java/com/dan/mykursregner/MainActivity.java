package com.dan.mykursregner;

import android.example.mykursregner.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mKKEditText;
    EditText mAAEditText;
    EditText mKEditText;

    TextView mShowEvenBreak;
    TextView mShow1pct;
    TextView mShow5pct;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAAEditText = findViewById(R.id.editTextAA);
        mKKEditText = findViewById(R.id.editTextKK);
        mKEditText = findViewById(R.id.editTextK);
        mShowEvenBreak = findViewById(R.id.EvenBreaktext);
        mShow1pct = findViewById(R.id.text1pct);
        mShow5pct = findViewById(R.id.text5pct);
        mKKEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                System.out.println("TEXT CHANGED");
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!TextUtils.isEmpty(mKKEditText.getText().toString())&&mKKEditText.getText().toString() != null){
                    if (!TextUtils.isEmpty(mKEditText.getText().toString())&&mKEditText.getText().toString() != null)
                        if (!TextUtils.isEmpty(mAAEditText.getText().toString())&&mAAEditText.getText().toString() != null){
                            mShowEvenBreak.setText(StockLogic.compute(1,mAAEditText.getText().toString(),mKKEditText.getText().toString(),mKEditText.getText().toString()));
                            mShow1pct.setText(StockLogic.compute1(1,mAAEditText.getText().toString(),mKKEditText.getText().toString(),mKEditText.getText().toString()));
                            mShow5pct.setText(StockLogic.compute5(1,mAAEditText.getText().toString(),mKKEditText.getText().toString(),mKEditText.getText().toString()));}
                }
            }
        }
        );
        mKEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!TextUtils.isEmpty(mKKEditText.getText().toString())&&mKKEditText.getText().toString() != null){
                    if (!TextUtils.isEmpty(mKEditText.getText().toString())&&mKEditText.getText().toString() != null)
                        if (!TextUtils.isEmpty(mAAEditText.getText().toString())&&mAAEditText.getText().toString() != null)
                        {mShowEvenBreak.setText(StockLogic.compute(1,mAAEditText.getText().toString(),mKKEditText.getText().toString(),mKEditText.getText().toString()));
                            mShow1pct.setText(StockLogic.compute1(1,mAAEditText.getText().toString(),mKKEditText.getText().toString(),mKEditText.getText().toString()));
                            mShow5pct.setText(StockLogic.compute5(1,mAAEditText.getText().toString(),mKKEditText.getText().toString(),mKEditText.getText().toString()));}
                }
            }
        });

        mAAEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(!TextUtils.isEmpty(mKKEditText.getText().toString())&&mKKEditText.getText().toString() != null){
                    if (!TextUtils.isEmpty(mKEditText.getText().toString())&&mKEditText.getText().toString() != null)
                        if (!TextUtils.isEmpty(mAAEditText.getText().toString())&&mAAEditText.getText().toString() != null)
                        {mShowEvenBreak.setText(StockLogic.compute(1,mAAEditText.getText().toString(),mKKEditText.getText().toString(),mKEditText.getText().toString()));
                            mShow1pct.setText(StockLogic.compute1(1,mAAEditText.getText().toString(),mKKEditText.getText().toString(),mKEditText.getText().toString()));
                            mShow5pct.setText(StockLogic.compute5(1,mAAEditText.getText().toString(),mKKEditText.getText().toString(),mKEditText.getText().toString()));}
                }
            }//if (!string.equals(""))
        });

    }
}
