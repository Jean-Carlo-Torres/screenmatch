package dev.jean.screenmatch.domain.filme;

public class Filme {
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoDeLancamento;
    private String genero;

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoDeLancamento = dados.ano();
        this.genero = dados.genero();
    }

    public Filme(String nome, Integer duracao, Integer ano, String genero) {
        this.nome = nome;
        this.duracaoEmMinutos = duracao;
        this.anoDeLancamento = ano;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracaoEmMinutos +
                ", ano=" + anoDeLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }

    public static FilmeBuilder builder() {
        return new FilmeBuilder();
    }

    public static class FilmeBuilder {
    }
}
