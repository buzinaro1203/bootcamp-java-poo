package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
  private String nome;
  private Set<Inscricao> inscricoes = new HashSet<>();

  public void progredir() {
    Optional<Inscricao> inscricaoOpt = inscricoes.stream().filter(i -> !i.isConcluido() && !i.isCancelado()).findFirst();

    if (inscricaoOpt.isPresent()){
      Inscricao inscricao = inscricaoOpt.get();
      inscricao.concluir();
      System.out.println(nome + " Concluiu o conteudo de " + inscricao.getConteudo().getTitulo());
    }else {
      System.out.println("Voce não possui incrição em nenhum curso.");
    }

  }

  public double calcularXp() {
    return inscricoes.stream().filter(Inscricao::isConcluido).mapToDouble(i -> i.getConteudo().calcularXp()).sum();
  }

  public void inscrever(Bootcamp bootcamp){

    for (Conteudo conteudo : bootcamp.getConteudos()) {
      this.inscrever(conteudo);
    }
    bootcamp.getDevsInscritos().add(this);


  }

  public void inscrever(Conteudo conteudo){
    boolean jaInscrito = inscricoes.stream().anyMatch(inscricao -> inscricao.getConteudo().equals(conteudo) && !inscricao.isCancelado());
    if (jaInscrito){
      System.out.println("Voce ja esta inscrito nesse conteudo!");
      return;
    }
    Inscricao novaInscricao = new Inscricao(this,conteudo);
    inscricoes.add(novaInscricao);
    conteudo.getDevsInscritos().add(this);
  }

//         <<<<<< Getters & Setters>>>>>>
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudosInscritos() {
    Set<Conteudo> conteudos = new HashSet<>();
    for (Inscricao i : inscricoes) {
      if (!i.isConcluido() && !i.isCancelado()) {
        conteudos.add(i.getConteudo());
      }
    }
    return conteudos;
  }

  // Para exibir conteúdos concluídos
  public Set<Conteudo> getConteudosConcluidos() {
    Set<Conteudo> conteudos = new HashSet<>();
    for (Inscricao i : inscricoes) {
      if (i.isConcluido()) {
        conteudos.add(i.getConteudo());
      }
    }
    return conteudos;
  }
}
