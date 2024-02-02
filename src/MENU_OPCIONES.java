import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MENU_OPCIONES {
    private JLabel texto_menu_opciones;
    JPanel panel_opciones;
    private JLabel texto;
    private JButton boton_ver_saldo;
    private JButton boton_retiro;
    private JButton boton_deposito;
    private JButton boton_salir;
    static JFrame frame_3 = new JFrame();

    public MENU_OPCIONES() {
        boton_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //MENU_OPCIONES.frame_3.dispose();
                MENU_PRINCIPAL.frame_2.dispose();
                Main.frame.dispose();
                JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS");
            }
        });

        boton_ver_saldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_3.setContentPane(new SALDO().panel_saldo);
                //frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame_3.setSize(300,300);
                frame_3.pack();
                frame_3.setVisible(true);
                MENU_PRINCIPAL.frame_2.dispose();
                //Main.frame.dispose();
            }
        });
        boton_retiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame frame_3 = new JFrame("RETIRO");
                frame_3.setContentPane(new RETIRO().panel_retiro);
                //frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame_3.setSize(300,300);
                frame_3.pack();
                frame_3.setVisible(true);
                MENU_PRINCIPAL.frame_2.dispose();
                //Main.frame.dispose();
            }
        });
        boton_deposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame frame_3 = new JFrame("DEPOSITO");
                frame_3.setContentPane(new DEPOSITO().panel_deposito);
                //frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame_3.setSize(300,300);
                frame_3.pack();
                frame_3.setVisible(true);
                MENU_PRINCIPAL.frame_2.dispose();
                //Main.frame.dispose();
            }
        });
    }
}
