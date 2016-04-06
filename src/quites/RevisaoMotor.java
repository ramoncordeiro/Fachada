
package quites;

import javax.swing.JOptionPane;


public class RevisaoMotor {
    Compras compras; 
    
    int volOleoMineral = 100;
    int volOleoSintetico = 100;
    int volOleoSemi = 100;
public RevisaoMotor(){
 
}   

//REVISAR ESSA FUNÇÃO PARA INSERIR TIPO E RETORNO
public void revisar(){
    JOptionPane.showMessageDialog(null,"O motor foi revisado com sucesso");
    verificaEstoque();
}
public void trocaOleo(){
    int oleo = Integer.parseInt(JOptionPane.showInputDialog("Qual Oleo deseja troca: 1-Mineral; 2-Sintetico; 3-SemiSintetico"));
    decrementaOleo(oleo);
    verificaEstoque();
    
}



public void verificaEstoque(){
    if(volOleoMineral<=30){
        compras.comprasOleo();
        JOptionPane.showConfirmDialog(null, "Oleo Mineral está acabando. Foi solicitado ao setor de compras");
    }
    else if(volOleoSintetico<=30){
        compras.comprasOleo();
        JOptionPane.showConfirmDialog(null, "Oleo sintetico está acabando. Foi solicitado ao setor de compras");
    }
    else if(volOleoSemi<=30){
        compras.comprasOleo();
        JOptionPane.showConfirmDialog(null, "Oleo semisintetico está acabando. Foi solicitado ao setor de compras");
    }
}

public void decrementaOleo(int oleo){
    if(oleo==1){ 
   volOleoMineral =-5;
       JOptionPane.showMessageDialog(null,"Oleo Mineral trocado com sucesso");
        }
   else if(oleo==2){
       volOleoSintetico =-5;
        JOptionPane.showMessageDialog(null,"Oleo sintetico trocado com sucesso");
   }
    
     else if(oleo==3){
       volOleoSintetico =-5;
        JOptionPane.showMessageDialog(null,"Oleo semisintetico trocado com sucesso");
   }
        
    }



}
