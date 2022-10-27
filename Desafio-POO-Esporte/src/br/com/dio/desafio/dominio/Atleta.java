package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Atleta {
    private String nome;
    private Set<Esporte> esporteInscrito = new LinkedHashSet<>();
    private Set<Esporte> esporteConcluidos = new LinkedHashSet<>();

    public void inscreverTreinamentoEsportivo(TreinamentoEsportivo treinamentoEsportivo){
        this.esporteInscrito.addAll(treinamentoEsportivo.getEsporte());
        treinamentoEsportivo.getAtletaInscritos().add(this);
    }
    public void progredir(){
        Optional<Esporte> esporte = this.esporteInscrito.stream().findFirst();
        if(esporte.isPresent()){
            this.esporteConcluidos.add(esporte.get());
            this.esporteInscrito.remove(esporte.get());
        } else {
            System.err.println("Você não está matriculado em nenhum esporte");
        }
    }
    public double calcularTotalXP(){
       return this.esporteConcluidos.stream().mapToDouble(Esporte::calcularAptidao).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Esporte> getEsporteInscrito() {
        return esporteInscrito;
    }

    public void setEsporteInscrito(Set<Esporte> esporteInscrito) {
        this.esporteInscrito = esporteInscrito;
    }

    public Set<Esporte> getEsporteConcluidos() {
        return esporteConcluidos;
    }

    public void setEsporteConcluidos(Set<Esporte> esporteConcluidos) {
        this.esporteConcluidos = esporteConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return Objects.equals(nome, atleta.nome) && Objects.equals(esporteInscrito, atleta.esporteInscrito) && Objects.equals(esporteConcluidos, atleta.esporteConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, esporteInscrito, esporteConcluidos);
    }
}
