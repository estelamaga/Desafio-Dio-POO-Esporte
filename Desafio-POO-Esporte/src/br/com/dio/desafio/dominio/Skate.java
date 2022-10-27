package br.com.dio.desafio.dominio;

public class Skate extends Esporte{
    private String manobra;

    @Override
    public double calcularAptidao() {
        return aptidao + 160f;
    }

    public String getManobra() {
        return manobra;
    }

    public void setManobra(String manobra) {
        this.manobra = manobra;
    }

    @Override
    public String toString() {
        return "Esporte{" +
                "categoria='" + getCategoria() + '\'' +
                ", quantidadeDeJogadores=" + getQuantidadeDeJogadores() +
                ", tempo=" + getTempo() +
                ", manobra=" + manobra +
                '}';
    }

}
