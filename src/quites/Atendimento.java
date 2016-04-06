    
package quites;

import javax.swing.JOptionPane;
import quites.Borracharia;

/**
 *
 * @author RAMON
 */
public class Atendimento {
    private static Atendimento instancia = new Atendimento();
    private static Borracharia borracharia = new Borracharia();
    private static Lavagem lavagem = new Lavagem();
    private static Pintura pintura = new Pintura();
    private static RevisaoMotor revisaomotor = new RevisaoMotor();
    private static Cliente cliente = new Cliente();
    
private Atendimento(){
    Atendimento.borracharia = borracharia;
    Atendimento.lavagem = lavagem;
    Atendimento.pintura = pintura;
    Atendimento.revisaomotor = revisaomotor;
   }   


public static synchronized Atendimento getInstance(){
    if (instancia == null){
   instancia = new Atendimento();
    }
    return instancia;
}



public void revisaocompleta(){
    revisaomotor.revisar();
    borracharia.calibragem();
    lavagem.lavar();
    pintura.pintar();

}

public void pinturaetrocarpneu(){
    //pintura.pintar();
    borracharia.trocarpneu();
    pintura.pintar();
}

public void motorelavagem(){
   revisaomotor.revisar();
   lavagem.lavar();
}

public void lavagempintura(){
    lavagem.lavar();
    pintura.pintar();
}

public void infoCarro(){    
    cliente.infoCliente();
}

public void menu(int resposta){
    switch(resposta){
        case 1: revisaocompleta();
          break;
        case 2: pinturaetrocarpneu();
          System.out.println("Programa Rodando Menu Atendimento");
        case 3: motorelavagem();
          break;
        case 4: lavagempintura();
          break;
        default: System.out.println("Opção Errada, o programa será fechado");
         
    }
    System.out.println("Programa Rodando Menu Atendimento");
}

    public static void setCliente(Cliente cliente) {
        Atendimento.cliente = cliente;
    }



}
