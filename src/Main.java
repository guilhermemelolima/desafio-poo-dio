import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHorarioa(8);
//        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHorarioa(4);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("\n\nDEV1 | Guilherme");
        Dev dev1 = new Dev();
        dev1.setNome("Guilherme");
        dev1.inscreceverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Guilherme: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Guilherme: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Guilherme: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());


        System.out.println("\n\nDEV2 | Paulo");
        Dev dev2 = new Dev();
        dev2.setNome("Paulo");
        dev2.inscreceverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Paulo: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Paulo: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}