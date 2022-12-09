package trabalhobolao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botaoexportar extends JButton implements ActionListener {
	private Menu j;
	public Botaoexportar(Menu m) {
		this.j=m;
		setText("importar bolões");
		setBackground(Color.yellow);
		addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j.setVisible(false);
		Exportarbolao exportar= new Exportarbolao();
	}

}
