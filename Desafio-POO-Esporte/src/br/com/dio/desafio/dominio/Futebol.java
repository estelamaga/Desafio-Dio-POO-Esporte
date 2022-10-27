package br.com.dio.desafio.dominio;

public class Futebol extends Esporte{

    private String lance;

    @Override
    public double calcularAptidao() {
        return aptidao + 100f;
    }

    public String getLance() {
        return lance;
    }

    public void setLance(String lance) {
        this.lance = lance;
    }

    @Override
    public String toString() {
        return "Esporte{" +
                "categoria='" + getCategoria() + '\'' +
                ", quantidadeDeJogadores=" + getQuantidadeDeJogadores() +
                ", tempo=" + getTempo() +
                ", lance=" + lance +
                '}';
    }


}
