package br.com.dio.desafio.dominio;

public abstract class Esporte {

    protected static final double aptidao = 40d;

    private String categoria;
    private int quantidadeDeJogadores;
    private int tempo;

    public abstract double calcularAptidao();

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeDeJogadores() {
        return quantidadeDeJogadores;
    }

    public void setQuantidadeDeJogadores(int quantidadeDeJogadores) {
        this.quantidadeDeJogadores = quantidadeDeJogadores;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Esporte{" +
                "categoria='" + categoria + '\'' +
                ", quantidadeDeJogadores=" + quantidadeDeJogadores +
                ", tempo=" + tempo +
                '}';
    }
}
