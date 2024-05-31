import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java","descrição curso java",8);
        Curso curso2 = new Curso("curso js","descrição curso js",4);
        Curso curso3 = new Curso("curso stream API", "descrição stream API", 3);
        
        Mentoria mentoria = new Mentoria("mentoria de java","descrição mentoria java",LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("A carga horária total do bootcamp é de: " +bootcamp.calculaTempoTotal());

        Dev devCamila = new Dev("Camila","Ciência da Computação",8,8);
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("\n");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("Joao","Sistemas de Informação",6,4);
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("\n");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("\nDevs e suas faculdades: ");
        System.out.println(devCamila);
        System.out.println(devJoao);
        devCamila.semestresFormar();
        devJoao.semestresFormar();

    }

}
