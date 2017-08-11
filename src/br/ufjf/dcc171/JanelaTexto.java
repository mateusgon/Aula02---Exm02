package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class JanelaTexto extends JFrame{
    
    private final JLabel etiqueta;
    private final JLabel etiqueta2;
    private final JTextField texto;
        
    public JanelaTexto() throws HeadlessException {
        super ("Janela Texto");
        etiqueta = new JLabel ("Nome: ");
        etiqueta2 = new JLabel ("");
        texto = new JTextField(10);
        setLayout(new FlowLayout());
        add(etiqueta);
        add(texto);
        add(etiqueta2);
        texto.addActionListener(new EscreveMensagem());
    }   

    private class EscreveMensagem implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            etiqueta2.setText("Olá " + texto.getText() + "!");
        }
    }
}
