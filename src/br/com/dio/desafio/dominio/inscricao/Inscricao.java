package br.com.dio.desafio.dominio.inscricao;

import br.com.dio.desafio.dominio.conteudo.Conteudo;
import br.com.dio.desafio.dominio.usuario.Dev;

import java.time.LocalDate;

public class Inscricao {
  private Dev dev;
  private Conteudo conteudo;
  private LocalDate dataInscricao;
  private boolean concluido;
  private boolean cancelado;

  public Inscricao(Dev dev, Conteudo conteudo) {
    this.dev = dev;
    this.conteudo = conteudo;
    this.dataInscricao = LocalDate.now();
    this.concluido = false;
    this.cancelado = false;
  }
  public void concluir(){
    if (!this.cancelado){
      this.concluido = true;
    }else {
      System.out.println("Impossivel concluir uma inscrição cancelada");
    }
  }
  public void cancelar(){
    if (this.concluido){
      System.out.println("Impossivel cancelar uma incrição concluida.");
    }else {
      System.out.println("Inscrição cancelada com sucesso!");
      this.cancelado = true;
    }
  }
//  Getter & Setter

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

  public LocalDate getDataInscricao() {
    return dataInscricao;
  }

  public void setDataInscricao(LocalDate dataInscricao) {
    this.dataInscricao = dataInscricao;
  }

  public boolean isConcluido() {
    return concluido;
  }

  public void setConcluido(boolean concluido) {
    this.concluido = concluido;
  }

  public boolean isCancelado() {
    return cancelado;
  }

  public void setCancelado(boolean cancelado) {
    this.cancelado = cancelado;
  }
}
