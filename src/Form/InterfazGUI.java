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
    private JTextArea txtResultado;
    private JTextArea txtBuscar;
    private JTextArea txtEvolucion;
    private JButton bntEvolucion;

    public InterfazGUI() {
        btnEncolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisualizarCola.setText("");
                ColaDigimon  c = new ColaDigimon();
                txtVisualizarCola.append(c.actualizarTabla().toString());
            }
        });
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtBuscar.setText("");
                ColaDigimon  c = new ColaDigimon();
                txtBuscar.append(c.colaPorHabilidad(textFieldHabilidad.getText()).toString());
            }
        });

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultado.setText("");
                ColaDigimon  c = new ColaDigimon();
                txtResultado.append(c.poderTotalR2().toString());
            }
        });
        bntEvolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtEvolucion.setText("");
                ColaDigimon c = new ColaDigimon();
                txtEvolucion.append(c.evolucionar().toString());
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
