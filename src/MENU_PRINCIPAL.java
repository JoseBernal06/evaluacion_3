import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MENU_PRINCIPAL {
    private JLabel texto_bienevenida;
    private JPasswordField passwordField1;
    private JLabel texto_password;
    private JButton boton_validar;
    JPanel panel_menu;

    public MENU_PRINCIPAL() {
        boton_validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String clave_quemada="1234";

            }
        });
    }
}
