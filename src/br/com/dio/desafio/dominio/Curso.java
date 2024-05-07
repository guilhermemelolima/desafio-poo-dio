package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHorarioa;

    public Curso() {}

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorarioa;
    }

    public int getCargaHorarioa() { return cargaHorarioa; }
    public void setCargaHorarioa(int cargaHorarioa) { this.cargaHorarioa = cargaHorarioa; }

    @Override
    public String toString() {
        return "\nCurso {" +
                "\n\ttitulo = '" + getTitulo() + "'\n" +
                "\tdescricao = '" + getDescricao() + "'\n" +
                "\tcargaHorarioa = " + cargaHorarioa + "'\n" +
                '}';
    }
}