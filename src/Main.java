import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso HTML");
        curso2.setDescricao("Descrição do Curso HTML");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do JAVA");
        mentoria.setDescricao("Descrição da Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA");
        bootcamp.setDescricao("Descrição do Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAgryo = new Dev();
        devAgryo.setNome("Agryo Araujo");
        devAgryo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Agryo:" + devAgryo.getConteudosInscritos());
        devAgryo.progrdir();
        devAgryo.progrdir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Agryo:" + devAgryo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Agryo:" + devAgryo.getConteudosConcluidos());
        System.out.println("XP:" + devAgryo.calcularTotalXp());

        System.out.println("---------------------");

        Dev devTomas = new Dev();
        devTomas.setNome("Tomas Tom");
        devTomas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tomas:" + devTomas.getConteudosInscritos());
        devTomas.progrdir();
        devTomas.progrdir();
        devTomas.progrdir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Tomas:" + devTomas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Tomas:" + devTomas.getConteudosConcluidos());
        System.out.println("XP:" + devTomas.calcularTotalXp());
    }
}