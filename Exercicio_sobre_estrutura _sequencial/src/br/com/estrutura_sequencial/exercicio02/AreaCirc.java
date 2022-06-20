package br.com.estrutura_sequencial.exercicio02;
public class AreaCirc {
    private final double raio;

    public AreaCirc(double raio) {
        this.raio = raio;
    }

    public double AreaCirculo() {
        return 3.14159F * Math.pow(this.raio,2);
    }
    
    public void Resultado(){
        System.out.println("A= " + String.format("%.4f", AreaCirculo()) );
    }
}
