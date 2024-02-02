import javax.swing.*;

public class VOLVER_MENU {

    public void volver_menu(){
        JFrame frame_2 = new JFrame("MENU OPCIONES");
        frame_2.setContentPane(new MENU_OPCIONES().panel_opciones);
        frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_2.setSize(300,300);
        frame_2.pack();
        frame_2.setVisible(true);
        MENU_OPCIONES.frame_3.dispose();
    }
}
