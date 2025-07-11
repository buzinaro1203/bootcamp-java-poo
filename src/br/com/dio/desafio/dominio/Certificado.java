package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * Classe imutável que representa um certificado de conclusão de conteúdo.
 */
public class Certificado {
  private final Dev dev;
  private final Conteudo conteudo;
  private final LocalDate data;
  private final UUID codigo;
  private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public Certificado(Dev dev, Conteudo conteudo) {
    this.dev = dev;
    this.conteudo = conteudo;
    this.data = LocalDate.now();

    this.codigo = UUID.randomUUID();
  }

  public Dev getDev() {
    return dev;
  }

  public Conteudo getConteudo() {
    return conteudo;
  }

  public LocalDate getData() {
    return data;
  }

  public UUID getCodigo() {
    return codigo;
  }

  public String gerarCertificado() {
    return String.format(
        """
            -----------------------------------------
            Certificado de Conclusão
            -----------------------------------------
            Nome: %s
            Conteúdo: %s
            Data de emissão: %s
            Código: %s
            -----------------------------------------
            """,
        dev.getNome(),
        conteudo.getTitulo(),
        data.format(FORMATTER),
        codigo
    );
  }

  @Override
  public String toString() {
    return "Certificado{" +
        "dev=" + dev +
        ", conteudo=" + conteudo +
        ", data=" + data +
        ", codigo=" + codigo +
        '}';
  }
}
