package br.com.estrutura_sequencial.exercicio03;
public class CalcDiferenca {
   final private int a;
   final private int b;
   final private int c;
   final private int d;

    
    public CalcDiferenca(int a, int b, int c, int d) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = d;
}

	public int CalcDif(){
        int diferenca = this.a * this.b - this.c * this.d;
        return diferenca;
    }
    
    public void Resultado(){
        System.out.println("");
        System.out.println("DIFERENCA = " + CalcDif());
        System.out.println("");
    }
    
}
