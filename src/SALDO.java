import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SALDO {
    private JLabel texto;
    private JButton boton_menu;
    JPanel panel_saldo;
    //static JFrame frame_3 = new JFrame();

    public SALDO() {
        boton_menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*JFrame frame_2 = new JFrame("MENU OPCIONES");
                frame_2.setContentPane(new MENU_OPCIONES().panel_opciones);
                frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame_2.setSize(300,300);
                frame_2.pack();
                frame_2.setVisible(true);
                MENU_OPCIONES.frame_3.dispose();*/

                VOLVER_MENU regresar = new VOLVER_MENU();
                regresar.volver_menu();
            }
        });
    }
}

