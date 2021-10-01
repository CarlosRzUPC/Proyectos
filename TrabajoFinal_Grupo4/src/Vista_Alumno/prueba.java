package Vista_Alumno;

import javax.swing.*;
import java.awt.*;

public class prueba extends JFrame{

    private JButton btnhola;
    private JPanel panel2;
    private JFrame frame;


    public prueba(){

        frame = new JFrame("Mostrar Datos 2");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350,300));
        frame.setResizable(false);

        frame.add(panel2);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}