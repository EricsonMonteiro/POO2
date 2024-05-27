package SPRINT2.src;



import SPRINT2.src.novoPerfil;
import SPRINT_3.novoperfilProfessor;
import SPRINT_3.novoperfilEstudante;
import SPRINT_3.novoperfilFuncionario;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PedradaDigital {





        public static void main (String args[]){





            JFrame janela = new JFrame("pedrada-main-Pedrada");
            janela.setVisible(true);
            janela.setSize(800, 800);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            janela.setLayout(new java.awt.BorderLayout());

            JLabel titulo = new JLabel("Rede Social- PedradaDigital", JLabel.CENTER);
            titulo.setOpaque(true);
            titulo.setBackground(Color.GRAY);
            JPanel barrastatus = new JPanel();


            JTextArea jt = new JTextArea(5,5);
            jt.setLineWrap(true);
            jt.setWrapStyleWord(true);

            janela.add(jt, BorderLayout.CENTER);


            JLabel labelText =new JLabel("Pedradadigital > ");
            JTextField text=new JTextField(96);
            barrastatus.add(labelText);
            barrastatus.add(text);
            barrastatus.setBackground(Color.GRAY);





            janela.add(titulo, BorderLayout.NORTH);
            janela.add(barrastatus, BorderLayout.SOUTH);
            janela.setVisible(true);





            JPanel contentorBtn = new JPanel(new GridBagLayout() );
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(2, 10, 2, 10); // Margens para os botões

            JButton LoginBtn = new JButton("Login");
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;

            gbc.weightx = 0.0;

            contentorBtn.add(LoginBtn, gbc);

            JButton ExecutBtn = new JButton("Executar");
            gbc.gridx = 0;
            gbc.gridy = 2;

            contentorBtn.add(ExecutBtn, gbc);
            ExecutBtn.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    if(text.getText().equals("criar perfil")){
                        novoPerfil.main(new String[0]);
                    }
                    else if (text.getText().equals("criar perfil professor"))  {
                        novoperfilProfessor.main(new String[0]);

                    } else if (text.getText().equals("criar perfil estudante")) {
                        novoperfilEstudante.main(new String [0]);
                    }

                    else if (text.getText().equals("criar perfil funcionario")) {
                        novoperfilFuncionario.main(new String [0]);
                    }




                     else {
                        JOptionPane.showMessageDialog(janela,"Comando não existe: ",text.getText(), JOptionPane.ERROR_MESSAGE);
                    }
                }


            });

            JButton LogoutBtn = new JButton("Logout");
            gbc.gridx = 0;
            gbc.gridy = 3;

            contentorBtn.add(LogoutBtn, gbc);

            janela.add(contentorBtn, BorderLayout.EAST);



            janela.add(contentorBtn, BorderLayout.EAST);
            janela.setVisible(true);



}}
