package dev.jean.screenmatch.domain.filme;

import jakarta.persistence.*;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;
    private String genero;

    public Filme() {
    }

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }

    public Filme(String nome, Integer duracao, Integer ano, String genero) {
        this.nome = nome;
        this.duracaoEmMinutos = duracao;
        this.anoLancamento = ano;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                "nome='" + nome + '\'' +
                ", duracao=" + duracaoEmMinutos +
                ", ano=" + anoLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }

    public static FilmeBuilder builder() {
        return new FilmeBuilder();
    }

    public static class FilmeBuilder {
    }
}
