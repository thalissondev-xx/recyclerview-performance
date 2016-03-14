package br.com.recyclerview;

import java.util.ArrayList;

/**
 * Created by thalissonestrela on 14/03/16.
 */
public class InitFretes {

    private ArrayList<Frete> listFrete;

    public InitFretes() {
        listFrete = new ArrayList<Frete>();
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
        listFrete.add(new RandomFrete().getFrete());
    }

    public ArrayList<Frete> getFretes() {
        return listFrete;
    }
}