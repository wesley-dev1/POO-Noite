package Finan;

public class Lucro extends Cadastro{
    private static final double juros = 0.15;
    private double lucroSelic;
    private double lucroCdb;
    private double lucroLci;
    private double rendimentoAno;

    public static void getLucroSelic(double rendimentoAno) {
        this.rendimentoAno = rendimentoAno;
        this.lucroSelic =  getSelic() * rendimentoAno;
        double descontoJuros = this.lucroSelic - getSelic() * juros;
        this.lucroSelic = getSelic() + descontoJuros;
        System.out.println("O Lucro do seu investimento em SELIC é " + this.lucroSelic);
    }


    public static void getLucroCdb(double rendimentoAno) {
        this.rendimentoAno = rendimentoAno;
        this.lucroCdb =  getCdb() * rendimentoAno;
        double descontoJuros = this.lucroCdb - getCdb() * juros;
        this.lucroCdb = getCdb() + descontoJuros;
        System.out.println("O Lucro do seu investimento em CDB é : " + this.lucroCdb);
    }

    public static void getLucroLci(double rendimentoAno) {
        this.rendimentoAno = rendimentoAno;
        this.lucroLci =  getCdb() * rendimentoAno;
        System.out.println("O Lucro do seu investimento em LCI é : " + this.lucroLci);
    }




}
