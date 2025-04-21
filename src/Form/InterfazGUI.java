package Form;

import Clases.ColaDigimon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGUI {
    private JPanel pGeneral;
    private JTextArea txtVisualizarCola;
    private JButton btnEncolar;
    private JButton btnCalcular;
    private JTextField textFieldHabilidad;
    private JButton btnBuscar;
    private JButton btnIniciar;
    private JTextArea txtResultado;
    private JTextArea txtBuscar;
    ColaDigimon  c = new ColaDigimon();


    public InterfazGUI() {
        btnEncolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.actualizarTabla(txtVisualizarCola);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("InterfazGUI");
        frame.setContentPane(new InterfazGUI().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
