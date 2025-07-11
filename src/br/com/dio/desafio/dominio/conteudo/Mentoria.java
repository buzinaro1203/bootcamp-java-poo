package br.com.dio.desafio.dominio.conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO+20;
    }

//    <<<<<< Getter and Setters >>>>>>

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
