package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.FormulaImc;

public class Tela {
	
	public void criarTela() {
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(600, 800);
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);
		
		
		// Label
		JLabel lblCalculoImc = new JLabel();
		lblCalculoImc.setText("Cálculo de IMC");
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
		
		
		// Criar um botão
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
		
		JLabel lblExibirImc = new JLabel();
		lblExibirImc.setBounds(150, 280, 300, 30);
		lblExibirImc.setForeground(Color.GREEN);
				
		JLabel lblCalculadoraImc = new JLabel();
		lblCalculadoraImc.setBounds(150, 240, 300, 30);
		lblCalculadoraImc.setForeground(Color.GREEN);
				
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
		telaImc.getContentPane().add(lblCalculadoraImc);
		telaImc.getContentPane().add(lblExibirImc);
		
		
		
	
		
		// Clique do mouse no botão
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FormulaImc formula = new FormulaImc();
				
				formula.setPeso(txtPeso.getText());
				formula.setAltura(txtAltura.getText());
				
				
				lblCalculadoraImc.setText(formula.calcularImcString());
				lblExibirImc.setText(formula.exibirStatus());
				
				
				
				
				
				
				
			}
		});
		
		
		// Tela visivel
		telaImc.setVisible(true);
		
		
		
	}

}
