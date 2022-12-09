package trabalhobolao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AlunoDAO {

	public void inserir(Aluno a) {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir =
					 conexao.prepareStatement("insert into apostas (nome, qs1, qp1, qs2, qp2, qs3, qp3, qs4, qp4, qs5, qp5, qs6, qp6, qs7, qp7, qs8, qp8, ss1, sp1, ss2, sp2, ss3, sp3, ss4, sp4, fs1, fp1, fs2, fp2, ganhador ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			inserir.setString(1, a.getNome());
			inserir.setString(2, a.getQuartastimes().get(0));
			inserir.setInt(3, Integer.parseInt(a.getQuartasplacar().get(0)));
			inserir.setString(4, a.getQuartastimes().get(1));
			inserir.setInt(5, Integer.parseInt(a.getQuartasplacar().get(1)));
			inserir.setString(6, a.getQuartastimes().get(2));
			inserir.setInt(7, Integer.parseInt(a.getQuartasplacar().get(2)));
			inserir.setString(8, a.getQuartastimes().get(3));
			inserir.setInt(9, Integer.parseInt(a.getQuartasplacar().get(3)));
			inserir.setString(10, a.getQuartastimes().get(4));
			inserir.setInt(11, Integer.parseInt(a.getQuartasplacar().get(4)));
			inserir.setString(12, a.getQuartastimes().get(5));
			inserir.setInt(13, Integer.parseInt(a.getQuartasplacar().get(5)));
			inserir.setString(14, a.getQuartastimes().get(6));
			inserir.setInt(15, Integer.parseInt(a.getQuartasplacar().get(6)));
			inserir.setString(16, a.getQuartastimes().get(7));
			inserir.setInt(17, Integer.parseInt(a.getQuartasplacar().get(7)));
			inserir.setString(18, a.getSemitimes().get(0));
			inserir.setInt(19, Integer.parseInt(a.getSemiplacar().get(0)));
			inserir.setString(20, a.getSemitimes().get(1));
			inserir.setInt(21, Integer.parseInt(a.getSemiplacar().get(1)));
			inserir.setString(22, a.getSemitimes().get(2));
			inserir.setInt(23, Integer.parseInt(a.getSemiplacar().get(2)));
			inserir.setString(24, a.getSemitimes().get(3));
			inserir.setInt(25, Integer.parseInt(a.getSemiplacar().get(3)));
			inserir.setString(26, a.getFinaltimes().get(0));
			inserir.setInt(27, Integer.parseInt(a.getFinalplacar().get(0)));
			inserir.setString(28, a.getSemitimes().get(1));
			inserir.setInt(29, Integer.parseInt(a.getSemiplacar().get(1)));
			inserir.setString(30, a.getGanhador());
			
			inserir.executeUpdate();
			
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Aluno> listar() {
		ArrayList<Aluno> aux = new ArrayList<Aluno>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = conexao.prepareStatement("select * from apostas").executeQuery();

			Aluno aluno;
			while (resultado.next()) {
				aluno = new Aluno();
				aluno.setId(resultado.getInt("id"));
				aluno.setNome(resultado.getString("nome"));
				aluno.addqt(resultado.getString("qs1"));
				aluno.addqt(resultado.getString("qs2"));
				aluno.addqt(resultado.getString("qs3"));
				aluno.addqt(resultado.getString("qs4"));
				aluno.addqt(resultado.getString("qs5"));
				aluno.addqt(resultado.getString("qs6"));
				aluno.addqt(resultado.getString("qs7"));
				aluno.addqt(resultado.getString("qs8"));
				aluno.addst(resultado.getString("ss1"));
				aluno.addst(resultado.getString("ss2"));
				aluno.addst(resultado.getString("ss3"));
				aluno.addst(resultado.getString("ss4"));
				aluno.addft(resultado.getString("fs1"));
				aluno.addft(resultado.getString("fs2"));
				aluno.setGanhador(resultado.getString("ganhador"));
				aluno.addqp(String.valueOf(resultado.getInt("qp1")));
				aluno.addqp(String.valueOf(resultado.getInt("qp2")));
				aluno.addqp(String.valueOf(resultado.getInt("qp3")));
				aluno.addqp(String.valueOf(resultado.getInt("qp4")));
				aluno.addqp(String.valueOf(resultado.getInt("qp5")));
				aluno.addqp(String.valueOf(resultado.getInt("qp6")));
				aluno.addqp(String.valueOf(resultado.getInt("qp7")));
				aluno.addqp(String.valueOf(resultado.getInt("qp8")));
				aluno.addsp(String.valueOf(resultado.getInt("sp1")));
				aluno.addsp(String.valueOf(resultado.getInt("sp2")));
				aluno.addsp(String.valueOf(resultado.getInt("sp3")));
				aluno.addsp(String.valueOf(resultado.getInt("sp4")));
				aluno.addfp(String.valueOf(resultado.getInt("fp1")));
				aluno.addfp(String.valueOf(resultado.getInt("fp1")));
				aux.add(aluno);
			}
			conexao.close();
		} catch (Exception e) {

		}
		return aux;
	}
	
}
