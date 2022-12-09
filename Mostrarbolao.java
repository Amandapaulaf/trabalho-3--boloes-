package trabalhobolao;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Mostrarbolao  {
	

	public Mostrarbolao() {
		JFrame j= new JFrame();
		j.setTitle("RESULTADOS");
		j.setSize(new Dimension(700, 500));
		j.setLocationRelativeTo(null);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   Telatabela(j);
	}
	
	public void Telatabela(JFrame j){
		JPanel panel= new JPanel();
		j.add(panel);
		ArrayList<Object[]> dados = listaDados();
		String[] colunas = { "NOME", "QUARTAS DE FINAL", "SEMIFINAIS", "FINAL", "GANHADOR" };
		JTable tabela = new JTable(new Modelotab(dados,colunas));
		tabela.setRowHeight(80);
		tabela.getTableHeader().setReorderingAllowed(false);
		tabela.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		tabela.setPreferredScrollableViewportSize(new Dimension(500, 70));
		tabela.setFillsViewportHeight(true);
		JScrollPane scroll= new JScrollPane(tabela);
		scroll.setViewportView(tabela);
		panel.add(scroll);
		
	}
	private ArrayList<Object[]> listaDados() {
		ArrayList<Object[]> dados = new ArrayList<>();
		AlunoDAO part = new AlunoDAO();
		ArrayList<Aluno> aux= part.listar();
		for (Aluno a : aux) {
			dados.add(new Object[] { a.getNome(), quartasdados(a), semidados(a), finaldados(a), a.getGanhador()});
		}
		return dados;
	}
	public ArrayList<String> quartasdados(Aluno a){
		ArrayList<String> aux = new ArrayList<String>();
		aux.add(a.getQuartastimes().get(0));
		aux.add(a.getQuartasplacar().get(0));
		aux.add("x");
		aux.add(a.getQuartastimes().get(1));
		aux.add(a.getQuartasplacar().get(1));
		aux.add(a.getQuartastimes().get(2));
		aux.add(a.getQuartasplacar().get(2));
		aux.add("x");
		aux.add(a.getQuartastimes().get(3));
		aux.add(a.getQuartasplacar().get(3));
		aux.add(a.getQuartastimes().get(4));
		aux.add(a.getQuartasplacar().get(4));
		aux.add("x");
		aux.add(a.getQuartastimes().get(5));
		aux.add(a.getQuartasplacar().get(5));
		aux.add(a.getQuartastimes().get(6));
		aux.add(a.getQuartasplacar().get(6));
		aux.add("x");
		aux.add(a.getQuartastimes().get(7));
		aux.add(a.getQuartasplacar().get(7));
		
		return aux;
	}
	public ArrayList<String> semidados(Aluno a){
		ArrayList<String> aux = new ArrayList<String>();
		aux.add(a.getSemitimes().get(0));
		aux.add(a.getSemiplacar().get(0));
		aux.add("x");
		aux.add(a.getSemitimes().get(1));
		aux.add(a.getSemiplacar().get(1));
		aux.add(a.getSemitimes().get(2));
		aux.add(a.getSemiplacar().get(2));
		aux.add("x");
		aux.add(a.getSemitimes().get(3));
		aux.add(a.getSemiplacar().get(3));
		
		return aux;
	}
	public ArrayList<String> finaldados(Aluno a){
		ArrayList<String> aux = new ArrayList<String>();
		aux.add(a.getFinaltimes().get(0));
		aux.add(a.getFinalplacar().get(0));
		aux.add("x");
		aux.add(a.getFinaltimes().get(1));
		aux.add(a.getFinalplacar().get(1));
		
		return aux;
	}
}
