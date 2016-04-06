package quites;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RAMON
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      ArrayList <Cliente> clientes = new ArrayList<Cliente>();
      Cliente cliente1 = new Cliente("Roberval", 00341, "Gol", "2014", "azul");
      Cliente cliente2 = new Cliente("Ferreira", 00211, "Uno", "2011", "prata");
      Cliente cliente3 = new Cliente("Silva", 00111, "Vectra", "2009", "preto");
      Cliente cliente4 = new Cliente("Renan Filip", 00011, "Camaro", "2015", "amarelo");
      Cliente cliente5 = new Cliente("Damasceno", 00001, "Marcopolo", "2002", "azul");
      Cliente cliente6 = new Cliente("Arraes", 00200, "Del Rey", "1975", "vermelho");
      Cliente cliente7 = new Cliente("Gonzalo", 00201, "Brasilia", "1977", "amarelo");
      Cliente cliente8 = new Cliente("Monica", 00403, "Gol", "2014", "prata");
      Cliente cliente9 = new Cliente("Eduardo", 00561, "c500", "2014", "vermelho");
      
      clientes.add(cliente1);
      clientes.add(cliente2);
      clientes.add(cliente3);
      clientes.add(cliente4);
      clientes.add(cliente5);
      clientes.add(cliente6);
      clientes.add(cliente7);
      clientes.add(cliente8);
      clientes.add(cliente9);
      
      for (int i = 0; i < clientes.size(); i++) {
        Atendimento atendimento = Atendimento.getInstance();     
        atendimento.setCliente(clientes.get(i)); 
        clientes.get(i).resposta = Integer.parseInt(JOptionPane.showInputDialog("Qual serviço deseja ?\n 1 - Revisão completa.\n 2 - Pintura e Troca pneu.\n 3- Motor e lavagem.\n 4- Lavagem e Pintura.\n"));           
        atendimento.menu(clientes.get(i).resposta);     
          System.out.println("Programa Rodando MAIN");
        atendimento.infoCarro();      
        JOptionPane.showMessageDialog(null, "Obrigado pela preferência!!!");
        }
      
     
    }
    
}
