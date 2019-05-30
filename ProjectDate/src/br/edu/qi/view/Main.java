package br.edu.qi.view;

import br.edu.qi.model.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Pinheiro
 * @since 19/05/2019- 11:25
 * @version 1.0 Beta
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * int variable to keep the ConfirmDialog option
         */
        int answer = 0;

        /**
         * Loop to keep jop in screen
         */
        while (answer == 0) {            
            Date date = new Date(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia do seu aniversário: ","DIA",JOptionPane.QUESTION_MESSAGE)),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o mês do seu aniversário: ","MÊS",JOptionPane.QUESTION_MESSAGE)));
            if (date.validateDate().equals("Data inválida!")) {
                answer = JOptionPane.showConfirmDialog(null ,date.validateDate()+"\nDeseja usar outra data ?");
            }else {
                 answer = JOptionPane.showConfirmDialog(null, date.toString()+"\nDeseja usar outra data ?");
            }
        }
        
        /**
         * Message for end of aplication
         */
        JOptionPane.showMessageDialog(null, "Obrigado por usar esse programa! ", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Obrigado por usar esse programa ");
        
    }//close main
}//close class
