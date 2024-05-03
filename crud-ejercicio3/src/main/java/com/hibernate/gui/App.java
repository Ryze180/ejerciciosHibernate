package com.hibernate.gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class App {

	private JFrame frame;
	private JTable table;
	private JTextField textFieldId;
	private JTextField textFieldSerie;
	private JTextField textFieldTemporadas;
	private JTextField textFieldCapitulos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 958, 661);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(146, 71, 608, 241);
		frame.getContentPane().add(table);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setBounds(217, 365, 46, 14);
		frame.getContentPane().add(lblid);
		
		JLabel lblSerie = new JLabel("Serie:");
		lblSerie.setBounds(217, 394, 46, 14);
		frame.getContentPane().add(lblSerie);
		
		JLabel lbltemporadas = new JLabel("Temporadas:");
		lbltemporadas.setBounds(217, 419, 82, 14);
		frame.getContentPane().add(lbltemporadas);
		
		JLabel lblcapitulos = new JLabel("Capitulos:");
		lblcapitulos.setBounds(217, 444, 67, 14);
		frame.getContentPane().add(lblcapitulos);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(350, 362, 86, 20);
		frame.getContentPane().add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldSerie = new JTextField();
		textFieldSerie.setBounds(350, 391, 86, 20);
		frame.getContentPane().add(textFieldSerie);
		textFieldSerie.setColumns(10);
		
		textFieldTemporadas = new JTextField();
		textFieldTemporadas.setBounds(350, 416, 86, 20);
		frame.getContentPane().add(textFieldTemporadas);
		textFieldTemporadas.setColumns(10);
		
		textFieldCapitulos = new JTextField();
		textFieldCapitulos.setBounds(350, 441, 86, 20);
		frame.getContentPane().add(textFieldCapitulos);
		textFieldCapitulos.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(146, 513, 89, 23);
		frame.getContentPane().add(btnGuardar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(367, 513, 89, 23);
		frame.getContentPane().add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(579, 513, 89, 23);
		frame.getContentPane().add(btnBorrar);
	}
}
