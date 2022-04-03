package br.com.dio.bootacamp.main;

import br.com.dio.bootcamp.dominio.Bootcamp;
import br.com.dio.bootcamp.dominio.Curso;
import br.com.dio.bootcamp.dominio.Dev;
import br.com.dio.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

            Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
            curso1.setDescricao("descrição curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("curso js");
            curso2.setDescricao("descrição curso js");
            curso2.setCargaHoraria(4);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria de java");
            mentoria.setDescricao("descrição mentoria java");
            mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devAbmael = new Dev();
            devAbmael.setNome("Abmael");
            devAbmael.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Abmael:" + devAbmael.getConteudosInscritos());
            devAbmael.progredir();
            devAbmael.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Abmael:" + devAbmael.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Abmael:" + devAbmael.getConteudosConcluidos());
            System.out.println("XP:" + devAbmael.calcularTotalXp());

            System.out.println("-------");

            Dev devJose = new Dev();
            devJose.setNome("Jose");
            devJose.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Jose:" + devJose.getConteudosInscritos());
            devJose.progredir();
            devJose.progredir();
            devJose.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Jose:" + devJose.getConteudosInscritos());
            System.out.println("Conteúdos Concluidos Jose:" + devJose.getConteudosConcluidos());
            System.out.println("XP:" + devJose.calcularTotalXp());

        }

    }

