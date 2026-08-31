package org.fatec.aula2;

public class Aluno {
    NomeAluno nomeAluno;
    RaAluno raAluno;
    Curso curso;

    Aluno(NomeAluno nomeAluno, RaAluno raAluno, Curso curso){
        this.nomeAluno = nomeAluno;
        this.raAluno = raAluno;
        this.curso = curso;
    }

    void mostrarDados(){
        System.out.println("nome: " + nomeAluno.nome());
        System.out.println("ra: " + raAluno.ra());
        System.out.println("curso: "+curso);
    }

    void mostrarOcupacao(){
        switch(curso){
            case ADS -> {
                System.out.println("COBOLEIRO");
                System.out.println("JAVEIRO");
            }
            case SI -> System.out.println("Design");
            case LOG -> System.out.println("CAMINHAO");
            case CD -> System.out.println("EXCEL AVANÇADO");
            case RH -> System.out.println("FUJA");
            default -> System.out.println("NGM LIGA" );
        }
    }
}