import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DEPOSITO {
    private JTextField textField1;
    private JButton boton_menu;
    JPanel panel_deposito;

    public DEPOSITO() {
        boton_menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VOLVER_MENU regresar = new VOLVER_MENU();
                regresar.volver_menu();
            }
        });
    }
}
