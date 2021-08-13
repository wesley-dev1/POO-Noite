// Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
// Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova
// e 1 nota de trabalho.
//
//Sua classe deve ter os seguintes métodos:
//- media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
//- estaAprovado: verifica se o aluno tem média superior a 6
public class Main {
    public static void main(String[] args) {
        Aluno instanciaAluno = new Aluno();
        instanciaAluno.vp1 = 10;
        instanciaAluno.vp2 = 5;
        instanciaAluno.trabalho = 3;

        double media = instanciaAluno.Media();
        instanciaAluno.estaAprovado();
        System.out.println("A média do aluno é: " + media);
    }
}
