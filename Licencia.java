import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
    private JLabel label1,label2;
    private JButton boton1, boton2;
    private JCheckBox check1;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;
    String  nombreEmpleado = "";

    public Licencia(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida bienvenida1 =new Bienvenida();
        nombreEmpleado =bienvenida1.texto;

        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono" , 1 ,14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        ImageIcon imagin = new ImageIcon("images/logo-coca.png");

        label2 = new JLabel(imagin);
        label2.setBounds(315,135,300,300);
        add(label2);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("no acepto");
        boton2.setBounds(120,290,100,30);
        boton2.setEnabled(true);
        boton2.addActionListener(this);
        add(boton2);

        check1 = new JCheckBox("yo " + nombreEmpleado + " acepto");
        check1.setBounds(10,250,300,30);
        check1.setFont(new Font("andale mono" ,0,12));
        check1.setForeground(new Color(0,0,0));
        check1.addChangeListener(this);
        add(check1);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", 3, 16));
        textarea1.setText("\n          Terminos y condiciones");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,40,575,200);
        add(scrollpane1);
    }
    public void stateChanged(ChangeEvent e){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            Principito   principito1 = new Principito();
                 principito1.setBounds(0,0,600,535);
                       principito1.setVisible(true);
                     principito1.setResizable(true);
             principito1.setLocationRelativeTo(null);
             this.setVisible(false);
        } else if(e.getSource() == boton2){
            Bienvenida Bienvenida1 = new Bienvenida();
            Bienvenida1.setBounds(0,0,350,450);
            Bienvenida1.setVisible(true);
            Bienvenida1.setResizable(false);
            Bienvenida1.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
    public static void main(String args[]){
        Licencia Licencia1 = new Licencia();
        Licencia1.setBounds(0,0,600,360);
        Licencia1.setVisible(true);
        Licencia1.setResizable(false);
        Licencia1.setLocationRelativeTo(null);
    }
}
