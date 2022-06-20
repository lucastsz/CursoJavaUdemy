package br.com.estrutura_sequencial.app;

import br.com.estrutura_sequencial.exercicio01.Calculadora;
import br.com.estrutura_sequencial.exercicio02.AreaCirc;
import br.com.estrutura_sequencial.exercicio03.CalcDiferenca;
import br.com.estrutura_sequencial.exercicio04.Funcionario;
import br.com.estrutura_sequencial.exercicio05.ListaPecas;
import br.com.estrutura_sequencial.exercicio05.Peca;
import br.com.estrutura_sequencial.exercicio06.CalcArea;

public class App {
    public static void main(String[] args) {
        // Exercicio 01
        System.out.println("---- EXERCÍCIO 01 ----");
        Calculadora calculadora1 = new Calculadora(10, 30);
        Calculadora calculadora2 = new Calculadora(-30, 10);
        Calculadora calculadora3 = new Calculadora(0, 0);
        
        calculadora1.Resultado();
        calculadora2.Resultado();
        calculadora3.Resultado();
        
        // Exercicio 02
        System.out.println("---- EXERCÍCIO 02 ----");
        AreaCirc areaCirculo1 = new AreaCirc(2.00);
        AreaCirc areaCirculo2 = new AreaCirc(100.64);
        AreaCirc areaCirculo3 = new AreaCirc(150.00);
        
        areaCirculo1.Resultado();
        areaCirculo2.Resultado();
        areaCirculo3.Resultado();
        System.out.println("");
        
        // Exercicio 03
        System.out.println("---- EXERCÍCIO 03 ----");
        CalcDiferenca calcDiferenca1 = new CalcDiferenca(5, 6, 7, 8);
        CalcDiferenca calcDiferenca2 = new CalcDiferenca(5, 6, -7, 8);
        
        calcDiferenca1.Resultado();
        calcDiferenca2.Resultado();
        
        
        // Exercicio 04
        System.out.println("---- EXERCÍCIO 04 ----");
        Funcionario func1 = new Funcionario(25, 100, 5.50);
        Funcionario func2 = new Funcionario(1, 200, 20.50);
        Funcionario func3 = new Funcionario(6, 145, 15.55);
        
        func1.Resultado();
        func2.Resultado();
        func3.Resultado();

        // Exercicio 05
        System.out.println("---- EXERCÍCIO 05 ----");
        Peca p1 = new Peca(12, 1, 5.30);
        Peca p2 = new Peca(16, 2, 5.10);
        ListaPecas listaPecas = new ListaPecas();
        
        listaPecas.AddPeca(p1);
        listaPecas.AddPeca(p2);
        
        listaPecas.ListarPecas();
        System.out.println("");
        
        
        listaPecas = new ListaPecas();
        
        Peca p3 = new Peca(13, 2, 15.30);
        Peca p4 = new Peca(161, 4, 5.20);
        
        listaPecas.AddPeca(p3);
        listaPecas.AddPeca(p4);
        
        listaPecas.ListarPecas();
        System.out.println("");
        
        listaPecas = new ListaPecas();
        
        Peca p5 = new Peca(1, 1, 15.10);
        Peca p6 = new Peca(2, 1, 15.10);
        
        listaPecas.AddPeca(p5);
        listaPecas.AddPeca(p6);
        
        listaPecas.ListarPecas();
        System.out.println("");
        
        
        // Exercicio 06
        System.out.println("---- EXERCÍCIO 06 ----");
        CalcArea a1 = new CalcArea(3.0F, 4.0F, 5.2F);
        CalcArea a2 = new CalcArea(12.7F, 10.4F, 15.2F);
        
        a1.Resultado();
        a2.Resultado();
    }
}
