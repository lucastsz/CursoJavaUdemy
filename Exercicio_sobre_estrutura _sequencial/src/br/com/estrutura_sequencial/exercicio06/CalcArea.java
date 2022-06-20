package br.com.estrutura_sequencial.exercicio06;
public class CalcArea {

private final double a;
private final double b;
private final double c;

    public CalcArea(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
public double AreaTriangulo(){
    return (this.a * this.c) / 2;
}

public double AreaCirculo(){
    return 3.14159 * Math.pow(this.c,2);
}

public double AreaTrapezio(){
    return ((this.a + this.b) * this.c) / 2;
}

public double AreaQuadrado(){
    return Math.pow(this.b,2);
}

public double AreaRetangulo(){
    return this.a * this.b;
}

public void Resultado(){
    System.out.println("TRIANGULO: " + String.format("%.3f", AreaTriangulo()));
    System.out.println("CIRCULO: " + String.format("%.3f", AreaCirculo() ));
    System.out.println("TRAPEZIO: " + String.format("%.3f", AreaTrapezio() ));
    System.out.println("QUADRADO: " + String.format("%.3f", AreaQuadrado() ));
    System.out.println("RETANGULO: " + String.format("%.3f", AreaRetangulo() ));
    System.out.println("");
}
}
