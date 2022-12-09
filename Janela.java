package trabalhobolao;

import javax.swing.JFrame;

public class Janela extends JFrame {
private Aluno aluno;

public Aluno getAuno() {
	return aluno;
	
}
public Janela() {
	JFrame j= new JFrame();
	j.setSize(800,600);
	j.setDefaultCloseOperation(EXIT_ON_CLOSE);
	j.setTitle("Amandas bet");
	Menu m= new Menu();
	j.add(m);
	j.setVisible(true);
}
	
}
