package Gui;
import modelo.Desastre;

import javax.swing.*;
import java.awt.*;

public class AgregarDesastreWindow extends JFrame {
	private TextInputPanel nombreInput;
	private TextInputPanel cantidadInput;
	private TextInputPanel topeCantidadPAInput;
	private TextInputPanel topeCantidadIEInput;
	private TextInputPanel añoTopeDCInput;
	private TextInputPanel añoTopeDPAInput;
	private TextInputPanel añoTopeDIEInput;
	private DesastresWindow previousFrame;

	public AgregarDesastreWindow(DesastresWindow previousFrame){
		this.previousFrame = previousFrame;
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		addInputPanels();

		addButtonPanel();

		setDefaultProperties();
	}
	private void addButtonPanel() {
		JPanel buttonsPanel = new JPanel(new FlowLayout());
		add(buttonsPanel);

		JButton addButton = new JButton("Agregar");
		addButton.addActionListener(e -> createDesastre());
		buttonsPanel.add(addButton);

		JButton cancelButton = new JButton("Cancelar");
		cancelButton.addActionListener(e -> returnToLastFrame());
		buttonsPanel.add(cancelButton);
	}
	private void addInputPanels() {
		nombreInput = new TextInputPanel("Nombre de Desastre: ");
		add(nombreInput);

		cantidadInput = new TextInputPanel("Cantidad: ");
		add(cantidadInput);

		topeCantidadPAInput = new TextInputPanel("Personas afectadas: ");
		add(topeCantidadPAInput);

		topeCantidadIEInput = new TextInputPanel("Impacto economico: ");
		add(topeCantidadIEInput);

		añoTopeDCInput = new TextInputPanel("Año de mayor cantidad del desastre: ");
		add(añoTopeDCInput);

		añoTopeDPAInput = new TextInputPanel("Año de mayor impacto en personas");
		add(añoTopeDPAInput);

		añoTopeDIEInput = new TextInputPanel("Año de mayor impacto economico: ");
		add(añoTopeDIEInput);

	}
	private void returnToLastFrame() {
		this.previousFrame.setVisible(true);
		this.setVisible(false);
	}
	private boolean areInputsFilled() {
		if (nombreInput.getValue().length() == 0 || cantidadInput.getValue().length() == 0 || topeCantidadPAInput.getValue().length() == 0 || topeCantidadIEInput.getValue().length() == 0 || añoTopeDCInput.getValue().length() == 0 || añoTopeDPAInput.getValue().length() == 0 || añoTopeDIEInput.getValue().length() == 0) {
			JOptionPane.showMessageDialog(null,
					"Por favor ingresa todos los datos solicitados",
					"Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	}
	private void createDesastre() {
		if (!areInputsFilled()) {
			return;
		}
		Desastre aux = new Desastre(
				nombreInput.getValue(),
				cantidadInput.getValue(),
				topeCantidadPAInput.getValue(),
				topeCantidadIEInput.getValue(),
				añoTopeDCInput.getValue(),
				añoTopeDPAInput.getValue(),
				añoTopeDIEInput.getValue()
		);
		this.previousFrame.getModel().addRow(aux.toTableRow());
		returnToLastFrame();
	}
	private void setDefaultProperties() {
		setSize(800, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}


}