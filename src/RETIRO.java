import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RETIRO {
    private JLabel texto;
    private JTextField textField1;
    private JButton boton_menu;
    JPanel panel_retiro;

    public RETIRO() {
        boton_menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VOLVER_MENU regresar = new VOLVER_MENU();
                regresar.volver_menu();
            }
        });
    }
}
