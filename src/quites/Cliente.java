package quites;

import javax.swing.JOptionPane;

/**
 *
 * @author RAMON
 */
public class Cliente {
protected String nome;
protected int cpf;
protected String carro;
protected String modelo;
protected String cor;
protected int resposta;

public Cliente(){}

public Cliente(String nome,int cpf, String carro, String modelo, String cor){
    this.nome = nome;
    this.cpf = cpf;
    this.carro = carro; // Nome do Carro
    this.modelo = modelo; // Ano do modelo 
    this.cor = cor;
    this.resposta = 0;
 }

public void infoCliente(){
    JOptionPane.showMessageDialog(null,"Dados do Cliente\nNome: "+ this.nome+ "\nCPF: "+ this.cpf+"\nModelo do carro: "+ this.carro +"\nAno do carro: "+ this.modelo + "\nCor: "+ this.carro);

}

}
