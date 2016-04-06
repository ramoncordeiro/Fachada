package quites;

import javax.swing.JOptionPane;

/**
 *
 * @author RAMON
 */
public class Fornecedor {
    String nomeEmpresa;
    int CNPJ;
    
    
// INSERIR UMA FUNÇÃO QUE CHAMA O FORNECEDOR QUANDO A QUANTD DE PRODUTOS ATINGIR UM LIMITE MÍNIMO.
   
    public Fornecedor(String nomeEmpresa, int CNPJ) {
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJ = CNPJ;
        
    }
   
    
  public void fornecer(String pedido){
      JOptionPane.showConfirmDialog(null, "Produto Fornecido: "+pedido);
  }

    void fornecer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
  
  
  
}
