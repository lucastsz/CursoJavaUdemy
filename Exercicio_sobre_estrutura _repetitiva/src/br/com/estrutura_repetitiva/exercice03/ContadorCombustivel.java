package br.com.estrutura_repetitiva.exercice03;
public class ContadorCombustivel {
    private int alcool;
    private int gasolina;
    private int diesel;

    public ContadorCombustivel() {
    }

public void somaAlcool(){
    alcool++;
}
public void somaGasolina(){
    gasolina++;
}
public void somaDiesel(){
    diesel++;
}

public void CalculoAutomatico(int valor){
    if (valor == 1){
        somaAlcool();
    } else if (valor == 2){
        somaGasolina();
    } else if (valor == 3){
        somaDiesel();
    }
}

    public int getAlcool() {
        return alcool;
    }

    public int getGasolina() {
        return gasolina;
    }

    public int getDiesel() {
        return diesel;
    }
    
    public void Result(){
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + getAlcool());
        System.out.println("Gasolina: " + getGasolina());
        System.out.println("Diesel: " + getDiesel());
    }

}
