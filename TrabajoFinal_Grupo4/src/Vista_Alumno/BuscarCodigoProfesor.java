package Vista_Alumno;

import javax.swing.*;
import java.awt.*;

public class BuscarCodigoProfesor {
    private JTextField textField1;
    private JButton BUSCARButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JPanel panel2;
    private JFrame frame;


    public BuscarCodigoProfesor(){

        frame = new JFrame("Mostrar Datos");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500));
        frame.setResizable(false);

        frame.add(panel2);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }




}







