public class Aluno {

    String nome;
    int matricula;
    double vp1;
    double vp2;
    float trabalho;
    double nota;

    double Media() {
        vp1 = vp1 * 2.5;
        vp2 = vp2 * 2.5;
        trabalho = trabalho * 2;
        nota = (vp1 + vp2 + trabalho) / 6;
        return nota;
    }

    void estaAprovado() {
        if (nota > 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }

    }
}