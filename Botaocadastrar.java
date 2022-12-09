package trabalhobolao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botaocadastrar extends JButton implements ActionListener{
private Menu j;

public Botaocadastrar(Menu m) {
	this.j=m;
	setText("cadastrar novo bolao");
	addActionListener(this);
	setBackground(Color.yellow);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j.setVisible(false);
		Cadastro c= new Cadastro();
		
	}

}
