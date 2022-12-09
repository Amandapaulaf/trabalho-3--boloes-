package trabalhobolao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class Exportarbolao {

public Exportarbolao(){
	JFileChooser filech= new JFileChooser();
	filech.setFileSystemView(FileSystemView.getFileSystemView());
	FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
	filech.setFileFilter(filter);
	filech.showOpenDialog(null);
	if(filech.getSelectedFile()!=null) {
		escrever(escreverstring() ,filech.getSelectedFile());
	}
}
public void escrever(String mensagem, File file) {
		
		try {
			FileWriter arquivo = new FileWriter(file);
			arquivo.write(mensagem);
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
public String escreverstring() {
	AlunoDAO aluno= new AlunoDAO();
	ArrayList<Aluno> a= aluno.listar();
	String aux= new String();
	for(Aluno b: a) {
		aux= b.getNome()+";"+b.getQuartastimes().get(0)+";"+b.getQuartasplacar().get(0)+";"+b.getQuartastimes().get(1)+";"+b.getQuartasplacar().get(1)+";"+b.getQuartastimes().get(2)+";"
	    +b.getQuartasplacar().get(2)+";"+b.getQuartastimes().get(3)+";"+b.getQuartasplacar().get(3)+";"+b.getQuartastimes().get(4)+";"+b.getQuartasplacar().get(4)+";"+b.getQuartastimes().get(5)+";"+
		b.getQuartasplacar().get(5)+";"+b.getQuartastimes().get(6)+";"+b.getQuartasplacar().get(6)+";"+b.getQuartastimes().get(7)+";"+b.getQuartasplacar().get(7)+";"+
		b.getSemitimes().get(0)+";"+b.getSemiplacar().get(0)+";"+b.getSemitimes().get(1)+";"+b.getSemiplacar().get(1)+";"+b.getSemitimes().get(2)+";"+b.getSemiplacar().get(2)+";"+b.getSemitimes().get(3)+";"+b.getSemiplacar().get(3)
		+";"+b.getFinaltimes().get(0)+";"+b.getFinalplacar().get(0)+";"+b.getFinaltimes().get(1)+";"+b.getFinalplacar().get(1)+";"+b.getGanhador()+"/n";
	
	}
	return aux;
}

}
