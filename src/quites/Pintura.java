
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
 Compras compras;
public Pintura(){
    
}   

//VERIFICAR ESSA FUNÇÃO PARA MODIFICAR O TIPO E O RETORNO
public void pintar(){
    JOptionPane.showMessageDialog(null,"O carro foi pintado com sucesso");
    decrementar();
    verificaEstoque();
}

public void verificaEstoque(){
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

public void decrementar(){
    volAmarelo =-10;
    volVermelho=-10;
    volazul=-10;
}


}
