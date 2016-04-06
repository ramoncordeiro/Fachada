
package quites;

import javax.swing.JOptionPane;


public class Compras {
private static Compras instancia = new Compras();
private static FornecedorPneus fornecePneus = new FornecedorPneus("Pneus Belém", 011010111);
private static FornecedorOleo forneceOleo = new FornecedorOleo("Oleos Automotivos LTDA", 000001);
private static FornecedorTintas forneceTinta = new FornecedorTintas("Tintas LTDA", 111000111);
   

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
        System.out.println("Compras comprarTinta() funcionando");   
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
    int pedido = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Tipo de Oleo que deseja solicitar: 1 - mineral; 2 - sintetico; 3- semisintetico"));
    if(pedido==1){
    forneceOleo.fornecer("oleo mineral");
    }
   else if(pedido==2){
    forneceOleo.fornecer("oleo sintetico");
        }
   else if(pedido==3){
    forneceOleo.fornecer("oleo semisintetico");
    }
}


}
