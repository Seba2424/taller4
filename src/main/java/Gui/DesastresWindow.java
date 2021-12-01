package Gui;

import data.FileManager;
import modelo.Desastre;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class DesastresWindow extends JFrame{
	private File file;
	private JPanel tablePanel;
	private JPanel buttonPanel;
	private JTable table;
	private DefaultTableModel modelo;
	private AgregarDesastreWindow agregarDesastreWindow;

	public DesastresWindow() {
		// Se obtiene el archivo con los datos de los contactos
		this.file = FileChooserDialog.chooseFile(JFileChooser.OPEN_DIALOG);

		// Se le asigna BoxLayout al JFrame
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		this.agregarDesastreWindow = new AgregarDesastreWindow(this);

		this.tablePanel = new JPanel(new FlowLayout());
		add(tablePanel);
		addTablePanelComponents();

		this.buttonPanel = new JPanel(new FlowLayout());
		add(buttonPanel);
		addButtonComponents();


		setDefaultProperties();

	}
	private void addButtonComponents() {
		JButton addContactButton = new JButton("Agregar Desastre");

		addContactButton.addActionListener(e -> addDesastre());
		this.buttonPanel.add(addContactButton);

		JButton terminateProgramButton = new JButton("Cerrar");
		terminateProgramButton.addActionListener(e -> terminateProgram());
		this.buttonPanel.add(terminateProgramButton);
	}

	private void terminateProgram() {
		System.exit(0);
	}


	private void addDesastre() {
		agregarDesastreWindow.setVisible(true);
		this.setVisible(false);
	}
	private void populateTable() {
		ArrayList<Desastre> desastres = FileManager.readFileToContacts(this.file);
		for(Desastre contact : desastres){
			this.modelo.addRow(contact.toTableRow());
		}
	}
	private void addTablePanelComponents() {
		this.modelo = new DefaultTableModel();
		modelo.addColumn("Id");
		modelo.addColumn("Nombre");
		modelo.addColumn("Cantidad");
		modelo.addColumn("Personas afectadas");
		modelo.addColumn("Impacto economico");
		modelo.addColumn("Año de mayor cantidad del desastre");
		modelo.addColumn("Año de mayor impacto en personas");
		modelo.addColumn("Año de mayor impacto economico");

		this.table = new JTable(modelo);

		JScrollPane jScrollPane = new JScrollPane(this.table);
		this.tablePanel.add(jScrollPane);

		this.populateTable();
	}
	public DefaultTableModel getModel(){
		return modelo;
	}
	private void setDefaultProperties() {
		setSize(800,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}