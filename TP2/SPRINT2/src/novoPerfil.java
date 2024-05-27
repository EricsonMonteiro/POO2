package SPRINT2.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class novoPerfil extends JFrame {
    public static void main(String args[]) {

        JFrame JanelacriarPerfil = new JFrame ("Novo Perfil");
        JanelacriarPerfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel titulo= new JLabel("Novo perfil", JLabel.CENTER);
        titulo.setBackground(Color.GRAY);
        titulo.setPreferredSize(new Dimension(700,60));
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);

        JPanel containerButton= new JPanel();
        containerButton.setLayout(new GridLayout(1,2));

        JButton cadastrar= new JButton("Cadastrar");
        containerButton.add(cadastrar);

        JButton limpar= new JButton("Limpar");
        containerButton.add(limpar);




        JPanel form= new JPanel();
        form.setLayout(new GridBagLayout());

        GridBagConstraints constraintsLocation = new GridBagConstraints();

        constraintsLocation.gridx = 0;
        constraintsLocation.gridy = 0;
        constraintsLocation.anchor = GridBagConstraints.WEST;
        constraintsLocation.insets = new Insets(5, 10, 5, 0);

        JLabel nome= new JLabel("Nome: ");
        JTextField campoNome= new JTextField(40);


        JLabel email= new JLabel("Email: ");
        JTextField campoEmail= new JTextField(40);


        JLabel curso= new JLabel("Curso: ");
        JTextField campoCurso= new JTextField(40);
        form.add(email, constraintsLocation);


        constraintsLocation.gridx = 1;
        form.add(campoEmail, constraintsLocation);

        constraintsLocation.gridy++;
        constraintsLocation.gridx = 0;
        form.add(nome, constraintsLocation);

        constraintsLocation.gridx = 1;
        form.add(campoNome, constraintsLocation);

        constraintsLocation.gridy++;
        constraintsLocation.gridx = 0;
        form.add(curso, constraintsLocation);

        constraintsLocation.gridx = 1;
        form.add(campoCurso, constraintsLocation);

        JPanel imgPerfil= new JPanel();
        imgPerfil.setLayout(new GridBagLayout());
        GridBagConstraints nhaimagem = new GridBagConstraints();

        nhaimagem.gridx = 0;
        nhaimagem.gridy = 0;
        nhaimagem.gridwidth = GridBagConstraints.REMAINDER;
        nhaimagem.anchor = GridBagConstraints.CENTER;
        nhaimagem.insets = new Insets(10, 10, 10, 50);
        JButton selecionar= new JButton("Selecionar Foto");
        imgPerfil.add(selecionar, nhaimagem);
        JLabel icon=new JLabel(new ImageIcon(".png"));
        icon.setPreferredSize(new Dimension(200,200));
        icon.setOpaque(true);
        nhaimagem.gridy=1;
        imgPerfil.add(icon,nhaimagem);

        JanelacriarPerfil.setVisible(true);
        JanelacriarPerfil.setSize(800,650);
        JanelacriarPerfil.setLayout(new BorderLayout());
        JanelacriarPerfil.add(titulo, BorderLayout.NORTH);
        JanelacriarPerfil.add(form,BorderLayout.CENTER);
        JanelacriarPerfil.add(imgPerfil, BorderLayout.EAST);
        JanelacriarPerfil.add(containerButton, BorderLayout.SOUTH);


    }

}
