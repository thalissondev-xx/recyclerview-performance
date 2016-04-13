package br.com.recyclerview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    private static final String TAG = "thalisson";

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Request frete
        ArrayList<Frete> list = new InitFretes().getFretes();
        FreteAdapter fa = new FreteAdapter(this, list);

        rv = (RecyclerView) findViewById(R.id.list);
        rv.setAdapter(fa);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setLayoutManager(new LinearLayoutManager(rv.getContext()));

        // Headerview Test
        View viewHeader = LayoutInflater.from(this).inflate(R.layout.headerview, null, false);

        HeaderDecoration headerDecoration = new HeaderDecoration(viewHeader, false, 2, 2, 1);
        rv.addItemDecoration(headerDecoration);
    }
}
