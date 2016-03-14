package br.com.recyclerview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    private static final String TAG = "thalisson";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Request frete
        ArrayList<Frete> list = new InitFretes().getFretes();

        for(Frete frete : list) {
            Log.i(TAG, "item list: " + frete.toString());
        }
    }
}
