import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;


public class Main {
  public static void main(String[] args) {

    // Criando conteúdos
    List<Conteudo> conteudos = List.of(
        new Curso("Sintaxe Básica Java", "Curso básico em Java", 2),
        new Curso("POO em Java", "Programação orientada a objetos na linguagem Java", 4),
        new Curso("Projeto de POO", "Projeto de programação orientada a objetos na linguagem Java", 4),
        new Mentoria("Mentoria de Java", "Uma mentoria de Java", LocalDate.now())
    );
    // Criando bootcamp e adicionando conteúdos
    Bootcamp bootcampJava = new Bootcamp();
    bootcampJava.setNome("Bootcamp Java Developer");
    bootcampJava.setDescricao("Bootcamp com foco em Java");
    bootcampJava.getConteudos().addAll(conteudos);

    // Criando Devs
    Dev devJorge = new Dev();
    devJorge.setNome("Jorge");
    devJorge.inscrever(bootcampJava);
    devJorge.progredir();
    devJorge.progredir();

    Dev devJoao = new Dev();
    devJoao.setNome("João");
    devJoao.inscrever(bootcampJava);
    devJoao.progredir();

    // Exibindo status dos Devs
    exibirStatusDev(devJorge);
    exibirStatusDev(devJoao);
  }

  private static void exibirStatusDev(Dev dev) {
    System.out.println("------ Status de " + dev.getNome() + " ------");
    System.out.println("Conteúdos inscritos: " + formatarConteudos(dev.getConteudosInscritos()));
    System.out.println("Conteúdos concluídos: " + formatarConteudos(dev.getConteudosConcluidos()));
    System.out.printf("XP acumulado: %.2f\n", dev.calcularXp());
    System.out.println();
  }

  private static String formatarConteudos(Set<Conteudo> conteudos) {
    if (conteudos.isEmpty()) {
      return "Nenhum";
    }
    return conteudos.stream()
        .map(Conteudo::getTitulo)
        .reduce((a, b) -> a + ", " + b)
        .orElse("");
  }
}
