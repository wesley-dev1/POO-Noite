package Finan;

public abstract class Cadastro {
    private static int numeroSequencial = 1;
    private final Integer numero;
    private double selic, cdb, lci;
    private double rendimentoAno;


    public double getSelic() {
        return selic;
    }

    public static void setSelic(double selic) {
        this.selic = selic;
        this.numero = numeroSequencial++;
    }

    public double getCdb() {
        return cdb;
    }

    public static void setCdb(double cdb) {
        this.cdb = cdb;
        this.numero = numeroSequencial++;
    }

    public double getLci() {
        return lci;
    }

    public static void setLci(double lci) {
        this.lci = lci;
        this.numero = numeroSequencial++;
    }


}
