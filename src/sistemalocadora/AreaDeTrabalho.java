/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalocadora;

import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Laboratorio
 */
public class AreaDeTrabalho extends JDesktopPane{
    
    private JInternalFrame janelaCliente;
    
    public void abrirJanelaCliente() throws PropertyVetoException{
        
            try{
                if(janelaCliente==null){
                janelaCliente = new JanelaCliente();
                janelaCliente.setVisible(true);
                this.add(janelaCliente);
                janelaCliente.setMaximum(true);
                
              }
            }catch (PropertyVetoException e) {
                System.out.printf("Opsie");
            }
            }

    void fecharJanelaCliente() {
        if(janelaCliente != null){
            janelaCliente = null;
            revalidate();
            repaint();
        }
    }
}
