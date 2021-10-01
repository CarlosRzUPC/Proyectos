package Vista_Alumno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscarCodigo extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton BUSCARButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea4;
    private JFrame frame;


    public BuscarCodigo(){

        frame = new JFrame("Mostrar Datos");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500));
        frame.setResizable(false);

        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt){

        prueba ver2=new prueba();

        ver2.setVisible(true);

    }


}
