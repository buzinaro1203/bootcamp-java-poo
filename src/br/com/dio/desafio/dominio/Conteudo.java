package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public abstract class Conteudo {
  protected static final double XP_PADRAO = 10d;
  private String titulo, descricao;
  private Set<Dev> devsInscritos = new HashSet<>();

  public Conteudo(String titulo, String descricao) {
    this.titulo = titulo;
    this.descricao = descricao;

  }

  public abstract double calcularXp();


  //    <<<<<< Getter and Setters >>>>>>

  public Set<Dev> getDevsInscritos() {
    return devsInscritos;
  }

  public void setDevsInscritos(Set<Dev> devsInscritos) {
    this.devsInscritos = devsInscritos;
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
