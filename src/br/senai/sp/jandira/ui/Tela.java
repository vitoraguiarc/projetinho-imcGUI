package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	
	public void criarTela() {
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(600, 800);
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);
		
		// Label
		JLabel lblCalculoImc = new JLabel();
		lblCalculoImc.setText("C�lculo de IMC");
		lblCalculoImc.setBounds(20, 10, 180, 30);
		lblCalculoImc.setForeground(Color.BLUE);
		Font labelImc = new Font("Arial", Font.BOLD, 20);
		lblCalculoImc.setFont(labelImc);
		
		// Label seu peso
		JLabel lblSeuPeso = new JLabel();
		lblSeuPeso.setText("Seu peso:");
		lblSeuPeso.setBounds(20, 60, 70, 30);
		
		// text field seu peso
		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(95, 60, 110, 30);
		
		// Label sua altura
		JLabel lblSuaAltura = new JLabel();
		lblSuaAltura.setText("Sua altura:");
		lblSuaAltura.setBounds(20, 100, 70, 30);
				
		// text field sua altura
		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(95, 100, 110, 30);
				
		// Criar um bot�o
		JButton btnCalcular = new JButton();
		btnCalcular.setText("CALCULAR");
		btnCalcular.setBounds(35, 145, 150, 30);
		btnCalcular.setBackground(Color.GRAY);
		btnCalcular.setForeground(Color.BLACK);
		
		// Label 1
		JLabel lblResultados = new JLabel();
		lblResultados.setText("Resultados:");
		lblResultados.setBounds(20, 200, 180, 30);
		lblResultados.setForeground(Color.BLACK);
		Font labelResultados = new Font("Arial", Font.BOLD, 16);
		lblResultados.setFont(labelResultados);
		
		// Label 2
		JLabel lblValorImc = new JLabel();
		lblValorImc.setText("Valor IMC: ");
		lblValorImc.setBounds(20, 240, 110, 30);
		
		// Label 2
		JLabel lblEstadoImc = new JLabel();
		lblEstadoImc.setText("Estado IMC: ");
		lblEstadoImc.setBounds(20, 280, 110, 30);
				
		// Colocando no Jframe
		telaImc.getContentPane().add(lblCalculoImc);
		telaImc.getContentPane().add(lblSeuPeso);
		telaImc.getContentPane().add(txtPeso);
		telaImc.getContentPane().add(lblSuaAltura);
		telaImc.getContentPane().add(txtAltura);
		telaImc.getContentPane().add(btnCalcular);
		telaImc.getContentPane().add(lblResultados);
		telaImc.getContentPane().add(lblValorImc);
		telaImc.getContentPane().add(lblEstadoImc);
	
		
		// Clique do mouse no bot�o
		btnCalcular.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("clique");
				
			}
		});
		
		// Tela visivel
		telaImc.setVisible(true);
		
		
	}

}
