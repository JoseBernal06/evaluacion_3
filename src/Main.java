import javax.swing.*;

public class Main {
    static JFrame frame = new JFrame("INGRESO DE CALIFICACIONES");
    public static void main(String[] args) {
        frame.setContentPane(new MENU_PRINCIPAL().panel_menu);
        //frame.setContentPane(new MENU().panel_menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.pack();
        frame.setVisible(true);
    }
}