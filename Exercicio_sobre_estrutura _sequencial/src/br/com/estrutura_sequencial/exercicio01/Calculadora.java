package br.com.estrutura_sequencial.exercicio01;
public class Calculadora {
int x;
int y;

    public Calculadora(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int Soma() {
        return this.x + this.y;
    }

    
    public int Subtracao() {
        return this.x - this.y;
    }
    
    public int Divisao() {
        return this.x / this.y;
    }
    
    public int Multiplicacao() {
        return this.x * this.y;
    }
    
    public void Resultado(){
        
        if (this.x == 0 && this.y == 0){
        
            System.out.println("Soma (" + this.x + " + " + this.y + "): " + Soma());
        System.out.println("Subtracao (" + this.x + " + " + this.y + "): " + Subtracao());
        System.out.println("Multiplicacao (" + this.x + " + " + this.y + "): " + Multiplicacao()+ "\n");
        
        } else {
            
        
        System.out.println("Soma (" + this.x + " + " + this.y + "): " + Soma());
        System.out.println("Subtracao (" + this.x + " + " + this.y + "): " + Subtracao());
        System.out.println("Divisao (" + this.x + " + " + this.y + "): " + Divisao());
        System.out.println("Multiplicacao (" + this.x + " + " + this.y + "): " + Multiplicacao() + "\n");
        }
        
    }
}
