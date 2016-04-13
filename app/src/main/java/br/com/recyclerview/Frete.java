package br.com.recyclerview;

/**
 * Created by thalissonestrela on 14/03/16.
 */
public class Frete {
    private String origem;
    private String destino;
    private String preco;
    private String km;
    private String img;
    private String token;

    public Frete(String ... args) {
        origem = args[0];
        destino = args[1];
        preco = args[2];
        km = args[3];
        token = args[4];
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Origem => " + origem + " Destino => " + destino;
    }
}
