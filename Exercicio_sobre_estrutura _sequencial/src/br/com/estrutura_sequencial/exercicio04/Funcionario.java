package br.com.estrutura_sequencial.exercicio04;
public class Funcionario {

final private int numero;
final private int horasTrabalhadas;
final private double valorPorHora;

    public Funcionario(int numero, int horasTrabalhadas, double valorPorHora) {
        this.numero = numero;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }


    public double Salario(){
        return this.horasTrabalhadas * this.valorPorHora;
    }

    public int getNumero() {
        return numero;
    }
    
    public void Resultado(){
        System.out.println("");
        System.out.println("NUMBER = " + this.getNumero() + "\n" + "SALARY = U$ " + Salario());
        System.out.println("");
    }
}
