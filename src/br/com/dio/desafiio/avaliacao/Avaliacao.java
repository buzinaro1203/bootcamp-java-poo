package br.com.dio.desafiio.avaliacao;

import br.com.dio.desafio.dominio.conteudo.Conteudo;
import br.com.dio.desafio.dominio.usuario.Dev;

import java.time.LocalDate;

public class Avaliacao {
  private Dev dev;
  private Conteudo conteudo;
  private double nota;
  private String comentario;
  LocalDate data;

  public Avaliacao(Dev dev, Conteudo conteudo, double nota, String comentario) {
    this.dev = dev;
    this.conteudo = conteudo;
    this.nota = nota;
    this.comentario = comentario;
    this.data = LocalDate.now();
  }

  public double validarNota() {
    if (nota < 0) {
      return 0d;
    } else if (nota > 5) {
      return 5d;
    }
    return nota;
  }

//  Getter and Setters


  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Dev getDev() {
    return dev;
  }

  public void setDev(Dev dev) {
    this.dev = dev;
  }

  public Conteudo getConteudo() {
    return conteudo;
  }

  public void setConteudo(Conteudo conteudo) {
    this.conteudo = conteudo;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  @Override
  public String toString() {
    return "Avaliacao{" +
        "dev=" + dev +
        ", conteudo=" + conteudo +
        ", nota=" + nota +
        ", comentario='" + comentario + '\'' +
        ", data=" + data +
        '}';
  }
}
