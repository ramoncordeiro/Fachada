
package quites;

import javax.swing.JOptionPane;


public class RevisaoMotor {
    Compras compras = Compras.getInstance();
    
    int volOleoMineral = 100;
    int volOleoSintetico = 100;
    int volOleoSemi = 100;
    
    
    
public RevisaoMotor(){
 
}   

//REVISAR ESSA FUNÇÃO PARA INSERIR TIPO E RETORNO
public void revisar(){
    JOptionPane.showMessageDialog(null,"O motor foi revisado com sucesso");
    
}
public void trocaOleo(){
    int oleo = Integer.parseInt(JOptionPane.showInputDialog("Qual Oleo deseja troca: 1-Mineral; 2-Sintetico; 3-SemiSintetico"));
    decrementaOleo(oleo);
    verificaEstoque(oleo);
    
}



public void verificaEstoque(int oleo){
    
    if(oleo==1){
        compras.comprasOleo();
        JOptionPane.showConfirmDialog(null, "Oleo Mineral está acabando. Foi solicitado ao setor de compras");
    }
    else if(oleo==2){
        compras.comprasOleo();
        JOptionPane.showConfirmDialog(null, "Oleo sintetico está acabando. Foi solicitado ao setor de compras");
    }
    else if(oleo==3){
        compras.comprasOleo();
        JOptionPane.showConfirmDialog(null, "Oleo semisintetico está acabando. Foi solicitado ao setor de compras");
    }
}
//Decrementa do total de oleo disponpivel a partir da troca. 
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
