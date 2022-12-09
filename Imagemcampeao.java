package trabalhobolao;

import javax.swing.ImageIcon;

public class Imagemcampeao {
private String a;

public Imagemcampeao(String b){
	this.a=b;
	
}
public ImageIcon verificarGanhador() {
	String winner= a;
	
	
	if (winner.equals("BRA"))
		return new ImageIcon("src/trabalhobolao/selecoes/BRA.png");
	if (winner.equals("ALE"))
		return new ImageIcon("src/trabalhobolao/selecoes/ALE.png");
	if (winner.equals("ARG"))
		return new ImageIcon("src/trabalhobolao/selecoes/ARG.png");
	if (winner.equals("BEL"))
		return new ImageIcon("src/trabalhobolao/selecoes/BEL.png");
	if (winner.equals("CAM"))
		return new ImageIcon("src/trabalhobolao/selecoes/CAM.png");
	if (winner.equals("ESP"))
	return new ImageIcon("src/trabalhobolao/selecoes/ESP.png");
	if (winner.equals("FRA"))
		return new ImageIcon("src/trabalhobolao/selecoes/FRA.png");
	if (winner.equals("CRO"))
		return new ImageIcon("src/trabalhobolao/selecoes/CRO.png");
	return null;
}

}
