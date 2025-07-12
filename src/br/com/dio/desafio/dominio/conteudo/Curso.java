package br.com.dio.desafio.dominio.conteudo;

public class Curso extends Conteudo {

    private int cargaHorario;

    public Curso(String titulo, String descricao, int cargaHorario) {
        super(titulo, descricao);
        this.cargaHorario = cargaHorario;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO+cargaHorario;
    }

    //    <<<<<< Getter and Setters >>>>>>

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }
}
