
package quites;

import javax.swing.JOptionPane;

/**
 *
 * @author RAMON
 */
public class Pintura {
 int volAmarelo = 100;
 int volazul = 100;
 int volVermelho = 100;
 Compras compras = Compras.getInstance();
public Pintura(){
    
}   

//VERIFICAR ESSA FUNÇÃO PARA MODIFICAR O TIPO E O RETORNO
public void pintar(){
    int cor =Integer.parseInt(JOptionPane.showInputDialog("Qual cor deseja pintar o carro: 1-Azul, 2- amarelo; 3 - vermelho"));
    if((cor<1)&&(cor>3)){
        JOptionPane.showMessageDialog(null, "Cor indisponível, Seu carro nao será pintado");
    }else{
    JOptionPane.showMessageDialog(null,"O carro foi pintado com sucesso");
    decrementar(cor);
    verificaEstoque(cor);}
}

public void verificaEstoque(int cor){
    if(volazul<=30){
        compras.comprasTinta();
        JOptionPane.showConfirmDialog(null, "A Tinta azul está acabando. Foi solicitado ao setor de compras");
    }
    else if(volAmarelo<=30){
        compras.comprasTinta();
        JOptionPane.showConfirmDialog(null, "A tinta de cor amarelo está acabando. Foi solicitado ao setor de compras");
    }
    
    else if(volVermelho<=30){
        compras.comprasTinta();
        JOptionPane.showConfirmDialog(null, "A tinta de cor vermelho está acabando. Foi solicitado ao setor de compras");
    }
}

public void decrementar(int cor){
    if(cor==1){
    volazul=-10;    
    }else if(cor==2){
      volAmarelo =-10; 
    }
    else if(cor==3){
    volVermelho=-10;
    }
}


}
