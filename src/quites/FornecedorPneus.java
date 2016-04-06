/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quites;

import javax.swing.JOptionPane;

/**
 *
 * @author RAMON
 */
public class FornecedorPneus extends Fornecedor{
    
    public FornecedorPneus(String nomeEmpresa, int CNPJ) {
        super(nomeEmpresa, CNPJ);
    }

    @Override
    public void fornecer(String pedido) {
       if("aro17".equals(pedido)){
           super.fornecer(pedido);
           // Incrementar produto
       } else if ("aro18".equals(pedido)){
           super.fornecer(pedido);}
       else{
           JOptionPane.showMessageDialog(null, "Desculpe, não fornecemos o produto desejado!");
       }
        
    }
 
    
}
