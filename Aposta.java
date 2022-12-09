package trabalhobolao;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aposta extends JFrame{
public Aposta() {
	JPanel p= new JPanel();
	p.setBackground(Color.yellow);
	p.add(new JLabel("nome"));
	p.add(new TextField(30));
	JButton enviar= new JButton("enviar");
	p.add(enviar);
}
}
