
package org.fatec.aula2;

public class Aula2 {

    // não esqueça de instalar o language support for java do red hat

    public static void main(String[] args) {
        Aluno a = new Aluno(
            new NomeAluno("Joáo"), 
            new RaAluno("03130185960410"), 
            Curso.ADS);

        a.mostrarDados();
        a.mostrarOcupacao();
    }
}
