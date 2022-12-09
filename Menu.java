package trabalhobolao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame {
	
public Menu(){
	setSize(600,600);
	setTitle("Amandas bet- menu inicial");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JPanel p= new JPanel();
	add(p);
	p.setBackground(Color.yellow);
	p.setLayout(new GridLayout(4,1));
	Botaocadastrar bcadastro= new Botaocadastrar(this);
	Botaomostrar bmostrar= new Botaomostrar(this);
	Botaoimportar bimportar= new Botaoimportar(this);
	Botaoexportar bexportar= new Botaoexportar(this);
	p.add(bcadastro);
	p.add(bmostrar);
	p.add(bimportar);
	p.add(bexportar);
	setVisible(true);
	
	}

}
