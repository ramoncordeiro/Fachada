
package quites;

import javax.swing.JOptionPane;

/**
 *
 * @author RAMON
 */
public class FornecedorTintas extends Fornecedor{

    public FornecedorTintas(String nomeEmpresa, int CNPJ) {
        super(nomeEmpresa, CNPJ);
    }

    @Override
    public void fornecer(String pedido) {
        if("azul".equals(pedido))
        super.fornecer(pedido); //To change body of generated methods, choose Tools | Templates.
       else if ("amarelo".equals(pedido)){
           super.fornecer(pedido);}
       else if ("vermelho".equals(pedido)){
           super.fornecer(pedido);}
       else {
            JOptionPane.showConfirmDialog(null,"Desculpe, só fornecemos cores primárias");
               }
        
        
        super.fornecer(pedido); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
