package trabalhobolao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Cadastro {
	private Aluno a;

	public Cadastro() {
		a = new Aluno();
		Telanome();
	}

	public void Telanome() {
		Telainicial telanome= new Telainicial();
		JPanel p = new JPanel();
		telanome.add(p);
		p.add(new JLabel("inserir nome"));
		JTextField nome = new JTextField(20);
		p.add(nome);
		p.setBackground(Color.yellow);
		JButton enviar = new JButton("enviar");
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a.setNome(nome.getText());
				telanome.setVisible(false);
				Telaquartas();
			}
		});
		p.add(enviar);
		telanome.setVisible(true);
	}

	public void Telaquartas() {
		TelaQ telaquartas = new TelaQ();
		JPanel p = new JPanel();
		JPanel v = new JPanel();
		telaquartas.add(BorderLayout.CENTER, p);
		telaquartas.add(BorderLayout.SOUTH, v);
		p.setLayout(new GridLayout(4, 9));
		p.add(new JLabel("selecao 1"));
		JTextField s1 = new JTextField(3);
		p.add(s1);
		p.add(new JLabel("placar"));
		JTextField p1 = new JTextField(3);
		p.add(p1);
		p.add(new JLabel("       x"));
		p.add(new JLabel("selecao 2"));
		JTextField s2 = new JTextField(3);
		p.add(s2);
		p.add(new JLabel("placar"));
		JTextField p2 = new JTextField(3);
		p.add(p2);
		p.add(new JLabel("selecao 3"));
		JTextField s3 = new JTextField(3);
		p.add(s3);
		p.add(new JLabel("placar"));
		JTextField p3 = new JTextField(3);
		p.add(p3);
		p.add(new JLabel("       x"));
		p.add(new JLabel("selecao 4"));
		JTextField s4 = new JTextField(3);
		p.add(s4);
		p.add(new JLabel("placar"));
		JTextField p4 = new JTextField(3);
		p.add(p4);
		p.add(new JLabel("selecao 5"));
		JTextField s5 = new JTextField(3);
		p.add(s5);
		p.add(new JLabel("placar"));
		JTextField p5 = new JTextField(3);
		p.add(p5);
		p.add(new JLabel("       x"));
		p.add(new JLabel("selecao 6"));
		JTextField s6 = new JTextField(3);
		p.add(s6);
		p.add(new JLabel("placar"));
		JTextField p6 = new JTextField(3);
		p.add(p6);
		p.add(new JLabel("selecao 7"));
		JTextField s7 = new JTextField(3);
		p.add(s7);
		p.add(new JLabel("placar"));
		JTextField p7 = new JTextField(3);
		p.add(p7);
		p.add(new JLabel("       x"));
		p.add(new JLabel("selecao 8"));
		JTextField s8 = new JTextField(3);
		p.add(s8);
		p.add(new JLabel("placar"));
		JTextField p8 = new JTextField(3);
		p.add(p8);
		telaquartas.setVisible(true);
		p.setBackground(Color.yellow);
		v.setBackground(Color.yellow);
		JButton enviar = new JButton("enviar");
		v.add(enviar);
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				telaquartas.setVisible(false);
				
				a.addqt(s1.getText());
				a.addqt(s2.getText());
				a.addqt(s3.getText());
				a.addqt(s4.getText());
				a.addqt(s5.getText());
				a.addqt(s6.getText());
				a.addqt(s7.getText());
				a.addqt(s8.getText());
				a.addqp(p1.getText());
				a.addqp(p2.getText());
				a.addqp(p3.getText());
				a.addqp(p4.getText());
				a.addqp(p5.getText());
				a.addqp(p6.getText());
				a.addqp(p7.getText());
				a.addqp(p8.getText());
				Telasemi();
			}
		});

	}

	public void Telasemi() {
		TelaS telasemi = new TelaS();
		JPanel p = new JPanel();
		JPanel v = new JPanel();
		telasemi.add(BorderLayout.CENTER, p);
		telasemi.add(BorderLayout.SOUTH, v);
		p.setBackground(Color.yellow);
		v.setBackground(Color.yellow);
		p.setLayout(new GridLayout(2, 9));
		p.add(new JLabel("selecao 1"));
		JTextField s1 = new JTextField(3);
		p.add(s1);
		p.add(new JLabel("placar"));
		JTextField p1 = new JTextField(3);
		p.add(p1);
		p.add(new JLabel("       x"));
		p.add(new JLabel("selecao 2"));
		JTextField s2 = new JTextField(3);
		p.add(s2);
		p.add(new JLabel("placar"));
		JTextField p2 = new JTextField(3);
		p.add(p2);
		p.add(new JLabel("selecao 3"));
		JTextField s3 = new JTextField(3);
		p.add(s3);
		p.add(new JLabel("placar"));
		JTextField p3 = new JTextField(3);
		p.add(p3);
		p.add(new JLabel("       x"));
		p.add(new JLabel("selecao 4"));
		JTextField s4 = new JTextField(3);
		p.add(s4);
		p.add(new JLabel("placar"));
		JTextField p4 = new JTextField(3);
		p.add(p4);
		JButton enviar = new JButton("enviar");
		v.add(enviar);
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				telasemi.setVisible(false);
				
				a.addst(s1.getText());
				a.addst(s2.getText());
				a.addst(s3.getText());
				a.addst(s4.getText());
				a.addsp(p1.getText());
				a.addsp(p2.getText());
				a.addsp(p3.getText());
				a.addsp(p4.getText());
				Telafinal();
			}
		});
		telasemi.setVisible(true);
	}

	public void Telafinal() {
		TelaF telafinal = new TelaF();
		JPanel p = new JPanel();
		JPanel v = new JPanel();
		telafinal.add(BorderLayout.CENTER, p);
		telafinal.add(BorderLayout.SOUTH, v);
		p.setBackground(Color.yellow);
		v.setBackground(Color.yellow);
		p.setLayout(new GridLayout(1, 9));
		p.add(new JLabel("selecao 1"));
		JTextField s1 = new JTextField(3);
		p.add(s1);
		p.add(new JLabel("placar"));
		JTextField p1 = new JTextField(3);
		p.add(p1);
		p.add(new JLabel("       x"));
		p.add(new JLabel("selecao 2"));
		JTextField s2 = new JTextField(3);
		p.add(s2);
		p.add(new JLabel("placar"));
		JTextField p2 = new JTextField(3);
		p.add(p2);
		JButton enviar = new JButton("enviar");
		v.add(enviar);
		telafinal.setVisible(true);
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				telafinal.setVisible(false);
				a.addft(s1.getText());
				a.addft(s2.getText());
				a.addfp(p1.getText());
				a.addfp(p2.getText());
				int placar1 = Integer.parseInt(p1.getText());
				int placar2 = Integer.parseInt(p2.getText());
				
				if (placar1 > placar2) {
					a.setGanhador(s1.getText());
					
				} else if (placar2 > placar1) {
					a.setGanhador(s2.getText());
				
				}
				Telaganhador();
			}
		});

	}

	public void Telaganhador() {
		TelaG telaganhador = new TelaG();
		JPanel p = new JPanel();
		telaganhador.add(p);
		p.setBackground(Color.yellow);
		p.setLayout(new BorderLayout());
		JLabel label = new JLabel("Ganhador do bolao segundo o usuario");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		p.add(BorderLayout.NORTH, label);
		telaganhador.setVisible(true);
		Imagemcampeao imagem= new Imagemcampeao(a.getGanhador());
		ImageIcon img= imagem.verificarGanhador();
		JLabel label2 = new JLabel(img);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setIcon(img);
		p.add(BorderLayout.CENTER, label2);
	    AlunoDAO aluno= new AlunoDAO();
	    aluno.inserir(a);
	}

}
