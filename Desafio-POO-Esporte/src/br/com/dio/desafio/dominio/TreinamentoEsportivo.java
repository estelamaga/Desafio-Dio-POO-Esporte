package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class TreinamentoEsportivo {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Atleta> atletaInscritos = new HashSet<>();
    private Set<Esporte> esporte = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Atleta> getAtletaInscritos() {
        return atletaInscritos;
    }

    public void setAtletaInscritos(Set<Atleta> atletaInscritos) {
        this.atletaInscritos = atletaInscritos;
    }

    public Set<Esporte> getEsporte() {
        return esporte;
    }

    public void setEsporte(Set<Esporte> esporte) {
        this.esporte = esporte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreinamentoEsportivo that = (TreinamentoEsportivo) o;
        return Objects.equals(nome, that.nome) && Objects.equals(descricao, that.descricao) && Objects.equals(dataInicial, that.dataInicial) && Objects.equals(dataFinal, that.dataFinal) && Objects.equals(atletaInscritos, that.atletaInscritos) && Objects.equals(esporte, that.esporte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, atletaInscritos, esporte);
    }
}
