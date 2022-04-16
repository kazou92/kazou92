import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principito extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu menuOpciones, menuCalculo,menuAcerca,ColorFondo;
    private JMenuItem itemSalir, itemNuevo,micalculo,itemRojo,itemVerde,itemMorado, itemCreador;
    private JLabel labelimaj,labelB,labeldatos,labelnompleto,labelmaterno,labelpaterno,labelAnti,labeldepart,
                labelRcalculo,labelFooter;

   private JTextField textfieldnompleto,textfieldmaterno,textfieldpaterno;
   private JComboBox comboDepart, comboAnti;
   private JTextArea textarrea1;
   private JScrollPane scrollpane1;

   public Principito(){
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(null);
       setTitle("Pantalla principal");
       setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
       getContentPane().setBackground(new Color(255,0,0));
    
       ImageIcon imaji = new ImageIcon("images/logo-coca.png");
       labelimaj = new JLabel(imaji);
       labelimaj.setBounds(5,5,250,100);
       add(labelimaj);

       labelB = new JLabel("Bienvenido");
       labelB.setBounds(280,50,300,30);
       labelB.setFont(new Font("Andale Mono",1,32));
       labelB.setForeground(new Color(255,255,255));
       add(labelB);

       labeldatos = new JLabel("Datos del trabajador para el calculo de vacaciones");
       labeldatos.setBounds(25,140,900,45);
       labeldatos.setFont(new Font("Andale MOno",0,24));
       labeldatos.setForeground(new Color(255,255,255));
       add(labeldatos);

       labelnompleto = new JLabel("Nombre");
       labelnompleto.setBounds(25,188,180,25);
       labelnompleto.setFont(new Font("Andale Mono",1,12));
       labelnompleto.setForeground(new Color(255,255,255));
       add(labelnompleto);

       textfieldnompleto =new JTextField();
       textfieldnompleto.setBounds(25,213,180,25);
       textfieldnompleto.setFont(new Font("Andale MOno",1,12));
       textfieldnompleto.setForeground(new Color(0,0,255));
       textfieldnompleto.setBackground(new Color(224,224,224));
       add(textfieldnompleto);

       labelmaterno = new JLabel("Apellido Materno");
       labelmaterno.setBounds(25,300,180,25);
       labelmaterno.setFont(new Font("Andale Mono",1,12));
       labelmaterno.setForeground(new Color(255,255,255));
       add(labelmaterno);

       textfieldmaterno = new JTextField();
       textfieldmaterno.setBounds(25,325,180,25);
       textfieldmaterno.setFont(new Font("Andale Mono",1,12));
       textfieldmaterno.setForeground(new Color(0,0,255));
       textfieldmaterno.setBackground(new Color(224,224,224));
       add(textfieldmaterno);

       labelpaterno = new JLabel("Apellido paterno");
       labelpaterno.setBounds(25,250,180,25);
       labelpaterno.setFont(new Font("Andale Mono",1,12));
       labelpaterno.setForeground(new Color(255,255,255));
       add(labelpaterno);

       textfieldpaterno = new JTextField();
       textfieldpaterno.setBounds(25,275,180,25);
       textfieldpaterno.setFont(new Font("Andale Mono",1,12));
       textfieldpaterno.setForeground(new Color(0,0,255));
       textfieldpaterno.setBackground(new Color(224,224,244));
       add(textfieldpaterno);

       labeldepart = new JLabel("Selecciona el departamento");
       labeldepart.setBounds(240,188,180,25);
       labeldepart.setFont(new Font("Andale Mono",1,12));
       labeldepart.setForeground(new Color(255,255,255));
       add(labeldepart);

       comboDepart = new JComboBox();
       comboDepart.setBounds(240,213,180,25);
       comboDepart.setFont(new Font("Andale Mono",1,12));
       comboDepart.setForeground(new Color(0,0,255));
       comboDepart.setBackground(new Color(224,224,224));
       add(comboDepart);
       comboDepart.addItem("");
       comboDepart.addItem("Atencion al cliente");
       comboDepart.addItem("Departamento de logistica");
       comboDepart.addItem("Departamento de gerencia");

       labelAnti = new JLabel("Selecciona tu antiguedad");
       labelAnti.setBounds(240,248,180,25);
       labelAnti.setFont(new Font("Andale Mono",1,12));
       labelAnti.setForeground(new Color(255,255,255));
       add(labelAnti);

       comboAnti = new JComboBox();
       comboAnti.setBounds(240,273,180,25);
       comboAnti.setFont(new Font("Andale Mono",1,12));
       comboAnti.setForeground(new Color(0,0,255));
       comboAnti.setBackground(new Color(224,224,224));
       add(comboAnti);

       comboAnti.addItem("");
       comboAnti.addItem("1 año de servicio");
       comboAnti.addItem("2 a 6 años de servicio");
       comboAnti.addItem("mas de 7 años de servicio");

       labelRcalculo = new JLabel("Resultado del calculo");
       labelRcalculo.setBounds(240,307,180,25);
       labelRcalculo.setFont(new Font("Andale Mono",1,12));
       labelRcalculo.setForeground(new Color(255,255,255));
       add(labelRcalculo);

       textarrea1 = new JTextArea();
       textarrea1.setText("\n \n aqui aparece el calculo los dias de vacaciones");
       textarrea1.setEditable(false);
       textarrea1.setForeground(new Color(255,0,0));
       textarrea1.setBackground(new Color(224,224,224));
       scrollpane1 = new JScrollPane(textarrea1);
       scrollpane1.setBounds(230,332,360,90);
       add(scrollpane1);


       labelFooter = new JLabel("©2021 the coca cola Company | todos los derechos reservsdos");
       labelFooter.setBounds(135,445,500,30);
       labelFooter.setFont(new Font("Andale Mono",1,12));
       labelFooter.setForeground(new Color(255,255,255));
       add(labelFooter);

       menubar = new JMenuBar();
       setJMenuBar(menubar);
       menubar.setBackground(new Color(255,0,0));
       menuOpciones = new JMenu("Opciones");
       menuOpciones.setFont(new Font("Andale Mono",1,14));
       menuOpciones.setForeground(new Color(255,255,255));
       menubar.add(menuOpciones);

       menuCalculo = new JMenu("calcular");
       menuCalculo.setBackground(new Color(255,0,0));
       menuCalculo.setFont(new Font("Andale Mono",1,14));
       menuCalculo.setForeground(new Color(255,255,255));
       menubar.add(menuCalculo);

       menuAcerca = new JMenu("Acerca de");
       menuAcerca.setBackground(new Color(255,0,0));
       menuAcerca.setFont(new Font("Andale Mono",1,14));
       menuAcerca.setForeground(new Color(255,255,255));
       menubar.add(menuAcerca);

       ColorFondo = new JMenu("color de fondo");
       ColorFondo.setFont(new Font("Andale Mono",1,14));
       ColorFondo.setForeground(new Color(255,0,0));
       menuOpciones.add(ColorFondo);


       itemSalir = new JMenuItem("Salir");
       itemSalir .setBackground(new Color(255,0,0));
       itemSalir.setFont(new Font("Andale Mono",1,14));
       itemSalir.setForeground(new Color(255,255,255));
       menuOpciones.add(itemSalir);
       itemSalir.addActionListener(this);

       itemNuevo = new JMenuItem("Nuevo");
       itemNuevo .setBackground(new Color(255,0,0));
       itemNuevo.setFont(new Font("Andale Mono",1,14));
       itemNuevo.setForeground(new Color(255,255,255));
       menuOpciones.add(itemNuevo);
       itemNuevo.addActionListener(this);

       micalculo = new JMenuItem("calcular vacaciones");
       micalculo.setBackground(new Color(255,0,0));
       micalculo.setFont(new Font("Andale Mono",1,14));
       micalculo.setForeground(new Color(255,255,255));
       menuCalculo.add(micalculo);
       micalculo.addActionListener(this);

       itemRojo = new JMenuItem("Rojo");
       itemRojo.setFont(new Font("Andale Mono",1,14));
       itemRojo.setForeground(new Color(255,0,0));
       ColorFondo.add(itemRojo);
       itemRojo.addActionListener(this);

       itemVerde = new JMenuItem("Verde");
       itemVerde .setBackground(new Color(255,0,0));
       itemVerde.setFont(new Font("Andale Mono",1,14));
       itemVerde.setForeground(new Color(255,255,255));
       ColorFondo.add(itemVerde);
       itemVerde.addActionListener(this);

       itemMorado = new JMenuItem("Morado");
       itemMorado.setBackground(new Color(255,0,0));
       itemMorado.setFont(new Font("Andale Mono",1,14));
       itemMorado.setForeground(new Color(255,255,255));
       ColorFondo.add(itemMorado);
       itemMorado.addActionListener(this);
       

       itemCreador = new JMenuItem("el creador");
       itemCreador.setBackground(new Color(255,0,0));
       itemCreador.setFont(new Font("Andale Mono",1,14));
       itemCreador.setForeground(new Color(255,255,255));
       menuAcerca.add(itemCreador);
       itemCreador.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource() == micalculo ){
           String Nc = textfieldnompleto.getText();
           String Ap = textfieldpaterno.getText();
           String Am =textfieldmaterno.getText();
           String Dept = comboDepart.getSelectedItem().toString();
           String Ant = comboAnti.getSelectedItem().toString();
           if(Nc.equals("")||  Ap.equals("") || Am.equals("") || Dept.equals("") || Ant.equals("")){
               JOptionPane.showMessageDialog(null, "debes llenar todos los campos");
           } else{
               if(Dept.equals("Atencion al cliente")){
                   if(Ant.equals("1 año de servicio")){
                      textarrea1.setText( "el trabajor " + Nc +" "+ Ap + " " + Am +" quien labora en el " + Dept
                             + " lo cual tiene " + Ant + " de antiguedad tiene 6 dias de vacaciones");

                   } 
                   if(Ant.equals("2 a 6 años de servicio")){
                    textarrea1.setText( "el trabajor " + Nc +" "+ Ap + " " + Am +" quien labora en el " + Dept
                    + " lo cual tiene " + Ant + " de antiguedad tiene 14 dias de vacaciones");
                   } 
                   if(Ant.equals("mas de 7 años servicio")){
                    textarrea1.setText( "el trabajor " + Nc +" "+ Ap + " " + Am +" quien labora en el " + Dept
                    + " lo cual tiene " + Ant + " de antiguedad tiene 20 dias de vacaciones");
                   }
               }
               if(Dept.equals("Departamento de logistica")){
                   
                if(Ant.equals("1 año de servicio")){
                    textarrea1.setText( "el trabajor " + Nc +" "+ Ap + " " + Am +" quien labora en el " + Dept
                             + " lo cual tiene " + Ant + " de antiguedad tiene 7 dias de vacaciones");
                }
                if(Ant.equals("2 a 6 años de servicio")){
                    textarrea1.setText( "el trabajor " + Nc +" "+ Ap + " " + Am +" quien labora en el " + Dept
                             + " lo cual tiene " + Ant + " de antiguedad tiene 15 dias de vacaciones");
                }
                if(Ant.equals("mas de 7 años de servicio")){
                    textarrea1.setText( "el trabajor " + Nc +" "+ Ap + " " + Am +" quien labora en el " + Dept
                             + " lo cual tiene " + Ant + " de antiguedad tiene 22 dias de vacaciones");
                }
               }
               if(Dept.equals("Departamento de gerencia")){

                 if(Ant.equals("1 año de servicio")){
                    textarrea1.setText( "el trabajor " + Nc +" "+ Ap + " " + Am +" quien labora en el " + Dept
                    + " lo cual tiene " + Ant + " de antiguedad tiene 8 dias de vacaciones");
                 }
                 if(Ant.equals("2 a 6 años de servicio")){
                    textarrea1.setText( "el trabajor " + Nc +" "+ Ap + " " + Am +" quien labora en el " + Dept
                    + " lo cual tiene " + Ant + " de antiguedad tiene 22 dias de vacaciones");
                 }
                 if(Ant.equals("mas de 7 años de servicio")){
                    textarrea1.setText( "el trabajor " + Nc +" "+ Ap + " " + Am +" quien labora en el " + Dept
                    + " lo cual tiene " + Ant + " de antiguedad tiene 30 dias de vacaciones");
                 }
               }
           }
       }
       if(e.getSource() == itemSalir){
        Bienvenida Bienvenida1 = new Bienvenida();
        Bienvenida1.setBounds(0,0,350,450);
        Bienvenida1.setVisible(true);
        Bienvenida1.setResizable(false);
        Bienvenida1.setLocationRelativeTo(null);
        this.setVisible(false);

       }
       if(e.getSource() == itemNuevo){
            
           textfieldnompleto.setText("");
           textfieldpaterno.setText("");
           textfieldmaterno.setText("");
           comboDepart.setSelectedIndex(0);
           comboAnti.setSelectedIndex(0);
           textarrea1.setText("\n \n \nAqui aparece el resultado del calculo de los dias de vacaciones");
       }
        if(e.getSource() == itemCreador){
           JOptionPane.showMessageDialog(null, "Desarrollado por ADLER SEJOUSNAT");
       }
       if(e.getSource() == itemRojo){
           getContentPane().setBackground(new Color(255,0,0));
           
    }
       if(e.getSource() == itemVerde){
           getContentPane().setBackground(new Color(0,255,0));
           
    }
    if(e.getSource() == itemMorado){
        getContentPane().setBackground(new Color(51,0,51));
           
    }
    }
   public static void main(String args[]){
       Principito principito1 = new Principito();
       principito1.setBounds(0,0,600,535);
       principito1.setVisible(true);
       principito1.setResizable(false);
       principito1.setLocationRelativeTo(null);
   }
}

    

