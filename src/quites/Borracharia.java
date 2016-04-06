
package quites;

import javax.swing.JOptionPane;

public class Borracharia {
     int qtdaro17 = 100;
    int qtdaro18 = 100;
    FornecedorPneus fornecePneus = new FornecedorPneus("Bridgestone", 123456);
public Borracharia(){
   
}   

    public int getQtdaro17() {
        return qtdaro17;
    }

    public void setQtdaro17(int qtdaro17) {
        this.qtdaro17 = qtdaro17;
    }

    public int getQtdaro18() {
        return qtdaro18;
    }

    public void setQtdaro18(int qtdaro18) {
        this.qtdaro18 = qtdaro18;
    }
    
    

public void trocarpneu(){
   int pneu = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de pneu (1 - aro 17, 2- aro18)"));
    decrementaPneu(pneu);
    System.out.println("Funcionando funcao decrementapneu() em trocapneu()");
   verificaEstoquePneu();
    System.out.println("Funcionando em trocapneu() depois da funcao verificaEstoque()");
}
public void remendopneu(){
    JOptionPane.showMessageDialog(null," Remendo do pneu realizado com sucesso");
    }

public void calibragem(){
    JOptionPane.showMessageDialog(null, "Calibragem realizada com sucesso");
}

//talvez essa função fique na classe compra
public void verificaEstoquePneu(){
    if(getQtdaro17()<=30){
        fornecePneus.fornecer("aro17");
        JOptionPane.showConfirmDialog(null, "Quantidade baixa de pneus aro 17. Foi solicitado ao setor de compras");
    }
    else if(qtdaro18<30){
        fornecePneus.fornecer("aro18");
        JOptionPane.showConfirmDialog(null, "Quantidade baixa de pneus aro 18. Foi solicitado ao Fornecedor");
    }
}

public void decrementaPneu(int pneu){
    if(pneu==1){ 
   qtdaro17 =-4;
       JOptionPane.showMessageDialog(null,"Pneus Aro 17 do carro trocado com sucesso");
        }
   else if(pneu ==2){
       qtdaro18 =-4;
        JOptionPane.showMessageDialog(null,"Pneus Aro 18 do carro trocado com sucesso");
   }
        
    }

}
