import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MENU_PRINCIPAL {
    private JLabel texto_bienevenida;
    private JPasswordField ingresado_password;
    private JLabel texto_password;
    private JButton boton_validar;
    JPanel panel_menu;

    public MENU_PRINCIPAL() {
        boton_validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String clave_quemada="1234";
                String usuario=ingresado_password.getText();

                if (usuario.equals(clave_quemada)){
                    //System.out.println("hola");
                    JFrame frame_2 = new JFrame("MENU OPCIONES");
                    //frame_2.setContentPane(new MENU_OPCIONES().panel_opciones);
                    frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame_2.setSize(300,300);
                    frame_2.pack();
                    frame_2.setVisible(true);
                    Main.frame.dispose();

                }
                else{
                    System.out.println("adios");
                    JOptionPane.showMessageDialog(null, "CLAVE INCORRECTA");
                }
            }
        });
    }
}
