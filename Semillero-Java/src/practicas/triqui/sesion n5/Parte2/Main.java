package Parte2;

import javax.swing.*;
import java.awt.*;
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame ventana=new JFrame();
        JLabel titulo = new JLabel("Blog de notas",JLabel.CENTER);

        ventana.setLayout(new GridLayout(2,1));
        ventana.add(titulo);

        JPanel contenedor1= new JPanel();
        contenedor1.setLayout(new BorderLayout());

        JTextArea texto = new JTextArea();
        texto.setPreferredSize(new Dimension(1200,900));
        contenedor1.add(texto, BorderLayout.WEST);

        JPanel contenedor2= new JPanel();
        contenedor2.setLayout(new BoxLayout(contenedor2, BoxLayout.Y_AXIS));

        JButton boton= new JButton("Guardar");
        JButton boton2= new JButton("Abrir");

        contenedor2.add(boton2);
        contenedor2.add(boton);
        
        contenedor1.add(contenedor2, BorderLayout.EAST);

        ventana.add(contenedor1);

        ventana.setPreferredSize(new Dimension(1500, 900));
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();//Encargado de todas las caracteristicas, como colores, tamaños
        ventana.setVisible(true);
       

    }
}
