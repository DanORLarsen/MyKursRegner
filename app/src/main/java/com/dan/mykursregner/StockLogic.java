package com.dan.mykursregner;


import android.example.mykursregner.R;
import android.widget.EditText;

public class StockLogic {


        public static String compute(int i, String aa, String kk, String k){
            double result = ((Integer.valueOf(aa)*Double.valueOf(kk))+Integer.valueOf(k))/Integer.valueOf(aa);
            return String.valueOf(result);
        }
    public static String compute1(int i, String aa, String kk, String k){
        double result = ((Integer.valueOf(aa)*Double.valueOf(kk)*1.01+Integer.valueOf(k))/Integer.valueOf(aa));
        return String.valueOf(result);
    }
    public static String compute5(int i, String aa, String kk, String k){
        double result = ((Integer.valueOf(aa)*Double.valueOf(kk))*1.05+Integer.valueOf(k))/Integer.valueOf(aa);
        return String.valueOf(result);
    }

}
