package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHorarioa;

    public Curso() {}

    public Curso(String titulo, String descricao, int cargaHorarioa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHorarioa = cargaHorarioa;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getCargaHorarioa() { return cargaHorarioa; }
    public void setCargaHorarioa(int cargaHorarioa) { this.cargaHorarioa = cargaHorarioa; }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHorarioa=" + cargaHorarioa +
                '}';
    }
}