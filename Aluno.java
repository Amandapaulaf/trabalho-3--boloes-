package trabalhobolao;

import java.util.ArrayList;

public class Aluno {
private String nome;
private String ganhador;
private int id;
private ArrayList<String> quartastimes;
private ArrayList<String> semitimes;
private ArrayList<String> finaltimes;
private ArrayList<String> quartasplacar;
private ArrayList<String> semiplacar;
private ArrayList<String> finalplacar;

public Aluno(){
	semitimes= new ArrayList<String>();
	semiplacar= new ArrayList<String>();
	quartasplacar= new ArrayList<String>();
	quartastimes= new ArrayList<String>();
	finaltimes= new ArrayList<String>();
	finalplacar= new ArrayList<String>();
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public ArrayList<String> getQuartastimes() {
	return quartastimes;
}

public ArrayList<String> getSemitimes() {
	return semitimes;
}

public ArrayList<String> getFinaltimes() {
	return finaltimes;
}

public ArrayList<String> getQuartasplacar() {
	return quartasplacar;
}

public ArrayList<String> getSemiplacar() {
	return semiplacar;
}

public ArrayList<String> getFinalplacar() {
	return finalplacar;
}

public void addqt(String c) {
	quartastimes.add(c);
}
public void addqp(String c) {
	quartasplacar.add(c);
}
public void addst(String c) {
	semitimes.add(c);
}
public void addsp(String c) {
	semiplacar.add(c);
}
public void addft(String c) {
	finaltimes.add(c);
}
public void addfp(String c) {
	finalplacar.add(c);
}

public String getGanhador() {
	return ganhador;
}

public void setGanhador(String ganhador) {
	this.ganhador = ganhador;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

}
