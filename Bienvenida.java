import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{
    private JLabel label1, label2,label3,label4;
    private JTextField textfield1;
    private JButton boton1;
    public static String texto = "";

    public Bienvenida(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Bienvenida");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        getContentPane().setBackground(new Color(255,0,0));


        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);

        label2 = new JLabel("Sistema de control vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("andale mono", 3,18));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        label3 = new JLabel("Ingrese tu nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("andale mono",1,14));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        label4 = new JLabel("©2021 the coca cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("andale mono",1,12));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        textfield1 = new JTextField();
        textfield1.setBounds(45,240,255,25);
        textfield1.setBackground(new Color (244,244,244));
        textfield1.setFont(new Font("andale mono", 0 , 15));
        textfield1.setForeground(new Color(255,0,0));
        add(textfield1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setFont(new Font("andale mono",0,14));
        boton1.setForeground(new Color(0,0,255));
        boton1.addActionListener(this);
        add(boton1);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            texto = textfield1.getText().trim();
            if(texto.equals("")){
             JOptionPane.showMessageDialog(null, "debes ingresar tu nombre");
            } else{
            Licencia Licencia1 = new Licencia();
            Licencia1.setBounds(0,0,600,360);
            Licencia1.setVisible(true);
            Licencia1.setResizable(false);
            Licencia1.setLocationRelativeTo(null);
            this.setVisible(false);
            }

        }
    }
    public static void main(String args[]){
        Bienvenida Bienvenida1 = new Bienvenida();
        Bienvenida1.setBounds(0,0,350,450);
        Bienvenida1.setVisible(true);
        Bienvenida1.setResizable(false);
        Bienvenida1.setLocationRelativeTo(null);
    }
}