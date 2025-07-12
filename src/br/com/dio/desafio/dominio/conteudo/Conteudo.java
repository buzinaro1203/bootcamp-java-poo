package br.com.dio.desafio.dominio.conteudo;

import br.com.dio.desafiio.avaliacao.Avaliacao;
import br.com.dio.desafio.dominio.usuario.Dev;

import java.util.HashSet;
import java.util.Set;

public abstract class Conteudo {
  protected static final double XP_PADRAO = 10d;
  private String titulo, descricao;
  private Set<Dev> devsInscritos = new HashSet<>();
  private Set<Avaliacao> avaliacoes = new HashSet<>();
  private double notaMedia;

  public Conteudo(String titulo, String descricao) {
    this.titulo = titulo;
    this.descricao = descricao;

  }

  public abstract double calcularXp();

  public void calcularMediaNotas() {
    double notaTotal = 0;
    for (Avaliacao avaliacoe : avaliacoes) {

      notaTotal += avaliacoe.getNota();
    }
    this.notaMedia = notaTotal / avaliacoes.size();
  }

  //    <<<<<< Getter and Setters >>>>>>
  public void adicionarAvaliacao(Avaliacao avaliacao) {
    this.avaliacoes.add(avaliacao);
    calcularMediaNotas();
  }


  public Set<Dev> getDevsInscritos() {
    return devsInscritos;
  }

  public Set<Avaliacao> getAvaliacoes() {
    return avaliacoes;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
