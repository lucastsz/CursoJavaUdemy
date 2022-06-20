package br.com.estrutura_repetitiva.exercice02;
public class PlanoCartesiano {
    private int x;
    private int y;

    public PlanoCartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean isNull(){
        return this.x == 0 || this.y == 0;
    }
    
    public String quadrante(){
        if (this.x >= 0 && this.y >= 0){
            return "1º Quadrante";
        } else if (this.x <= 0 && this.y >= 0){
            return "2º Quadrante";
        } else if (this.x <= 0 && this.y <= 0){
            return "3º Quadrante";
        } else {
            return "4º Quadrante";
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
