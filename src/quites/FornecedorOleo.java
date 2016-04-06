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
public class FornecedorOleo extends Fornecedor{
    
    public FornecedorOleo(String nomeEmpresa, int CNPJ) {
        super(nomeEmpresa, CNPJ);
    }

    @Override
    public void fornecer(String pedido) {
       if("oleo mineral".equals(pedido))
        super.fornecer(pedido); //To change body of generated methods, choose Tools | Templates.
       else if ("oleo sintetico".equals(pedido)){
           super.fornecer(pedido);}
       else if ("oleo semisintetico".equals(pedido)){
           super.fornecer(pedido);}
       else {
            JOptionPane.showConfirmDialog(null,"Não fornecemos outro tipo de oleo");
               }
           
       }

        
    
}
