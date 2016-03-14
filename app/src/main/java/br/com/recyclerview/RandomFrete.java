package br.com.recyclerview;

import java.util.Random;

/**
 * Created by thalissonestrela on 14/03/16.
 */
public class RandomFrete {

    private String[] origem = {"Catalão/GO", "Ipameri/GO", "Caldas Novas/GO", "Curitiba/PR"};
    private String[] destino = {"Goiânia/GO", "Pires do Rio/GO", "São Paulo/SP", "Campinas/SP"};
    private String[] preco = {"R$5.000", "R$2.000", "R$10.000", "R$3.000"};
    private String[] km = {"R$5.000", "R$2.000", "R$10.000", "R$3.000"};
    private String[] img = {"img1", "img2", "img3", "img4"};
    private String[] token = {"1", "2", "3", "4"};

    public RandomFrete() {}

    public Frete getFrete() {
        Random rand = new Random();
        int x = 0 + rand.nextInt((3 - 0) + 1);
        return new Frete(origem[x], destino[x], preco[x], km[x], img[x], token[x]);
    }

}
