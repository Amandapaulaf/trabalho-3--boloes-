package trabalhobolao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class ImportarBolao {
	
	public ImportarBolao() {
	JFileChooser filech= new JFileChooser();
	filech.setFileSystemView(FileSystemView.getFileSystemView());
	FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
	filech.setFileFilter(filter);
	filech.showOpenDialog(null);
	if(filech.getSelectedFile()!=null) {
		importar(filech.getSelectedFile());
	}
}
	public void importar(File file) {
		
		try {
			BufferedReader arquivo = new BufferedReader(new FileReader(file));
			while (arquivo.ready()) {
				String linha = arquivo.readLine();
				separarlinha(linha);
}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
  public void separarlinha(String linha) {
	  String[] aux = linha.split(";");
	  Aluno auxiliar = new Aluno();
	  auxiliar.setNome(aux[0]);
	  auxiliar.addqt(aux[1]);
	  auxiliar.addqp(aux[2]);
	  auxiliar.addqt(aux[3]);
	  auxiliar.addqp(aux[4]);
	  auxiliar.addqt(aux[5]);
	  auxiliar.addqp(aux[6]);
	  auxiliar.addqt(aux[7]);
	  auxiliar.addqp(aux[8]);
	  auxiliar.addqt(aux[9]);
	  auxiliar.addqp(aux[10]);
	  auxiliar.addqt(aux[11]);
	  auxiliar.addqp(aux[12]);
	  auxiliar.addqt(aux[13]);
	  auxiliar.addqp(aux[14]);
	  auxiliar.addqt(aux[15]);
	  auxiliar.addqp(aux[16]);
	  auxiliar.addst(aux[17]);
	  auxiliar.addsp(aux[18]);
	  auxiliar.addst(aux[19]);
	  auxiliar.addsp(aux[20]);
	  auxiliar.addst(aux[21]);
	  auxiliar.addsp(aux[22]);
	  auxiliar.addst(aux[23]);
	  auxiliar.addsp(aux[24]);
	  auxiliar.addft(aux[25]);
	  auxiliar.addfp(aux[26]);
	  auxiliar.addft(aux[27]);
	  auxiliar.addfp(aux[28]);
	  auxiliar.setGanhador(aux[29]);
	  AlunoDAO inserirauxiliar= new AlunoDAO();
	  inserirauxiliar.inserir(auxiliar);
	  
  }
}
