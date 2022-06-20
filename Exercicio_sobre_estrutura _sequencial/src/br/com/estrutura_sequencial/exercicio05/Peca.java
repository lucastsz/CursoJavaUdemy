package br.com.estrutura_sequencial.exercicio05;



public class Peca {
    final private int codPeca;
    final private int numeroDePecas;
    final private double valorPeca;
    

    public Peca(int codPeca, int numeroDePecas, double valorPeca) {
        this.codPeca = codPeca;
        this.numeroDePecas = numeroDePecas;
        this.valorPeca = valorPeca;
    }

    public int getCodPeca() {
        return codPeca;
    }

    public int getNumeroDePecas() {
        return numeroDePecas;
    }

    public double getValorPeca() {
        return valorPeca;
    }
    
    
}
