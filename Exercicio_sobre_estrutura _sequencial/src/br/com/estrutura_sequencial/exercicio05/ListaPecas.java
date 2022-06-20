package br.com.estrutura_sequencial.exercicio05;

import java.util.ArrayList;

public class ListaPecas {
    private final ArrayList<Peca> listaPeca = new ArrayList<>();

    public ListaPecas() {
        
    }
    
    public void AddPeca(Peca peca){
        this.listaPeca.add(peca);
    }
    
    public void ListarPecas(){
    
        double valorTotal = 0;
        
        for (Peca peca : listaPeca) {
            
            System.out.println("Peca: " + peca.getCodPeca() + ", Qtd: " + peca.getNumeroDePecas() + ", Valor: " + peca.getValorPeca());
            valorTotal += (peca.getNumeroDePecas() * peca.getValorPeca());
        }
        
        System.out.println("Valor a pagar: R$" + String.format("%.2f", valorTotal));
    }
    
}
