
package quites;

import javax.swing.JOptionPane;


public class Compras {
private static Compras instancia = new Compras();
private static FornecedorPneus fornecePneus;
private static FornecedorOleo forneceOleo;
private static FornecedorTintas forneceTinta;
   

    public Compras() {
        Compras.fornecePneus = fornecePneus;
        Compras.forneceOleo = forneceOleo;
        Compras.forneceTinta = forneceTinta;
    }
    
   public static synchronized Compras getInstance(){
    if (instancia == null){
   instancia = new Compras();
    }
    return instancia;
}

    

public void comprasPneus(){
   int pedido = Integer.parseInt(JOptionPane.showInputDialog("Escolha os pneus: 1 - aro17; 2 - aro18;"));
    if(pedido==1){
    fornecePneus.fornecer("aro17");
    }
   else if(pedido==2){
    fornecePneus.fornecer("amarelo");
        }
   
}
public void comprasPneu18(){
    fornecePneus.fornecer("aro18");
}   

public void comprasTinta(){
    int pedido = Integer.parseInt(JOptionPane.showInputDialog("Escolha a tinta que deseja solicitar: 1 - azul; 2 - amarelo; 3- vermelho"));
    if(pedido==1){
    forneceTinta.fornecer("azul");
    }
   else if(pedido==2){
    forneceTinta.fornecer("amarelo");
        }
   else if(pedido==3){
    forneceTinta.fornecer("vermelho");
    }
}

public void comprasOleo(){
    int pedido = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Tipo de Oleo que deseja solicitar: 1 - sintetico; 2 - mineral; 3- semisintetico"));
    if(pedido==1){
    forneceOleo.fornecer("sintetico");
    }
   else if(pedido==2){
    forneceOleo.fornecer("mineral");
        }
   else if(pedido==3){
    forneceOleo.fornecer("semisintetico");
    }
}


}
