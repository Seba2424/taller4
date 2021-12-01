package Gui;

import data.FileManager;

import javax.swing.*;
import java.io.File;

public class FileChooserDialog {
    private File file;
    private JFileChooser fileChooser;

    public FileChooserDialog(int dialogType) {
        // Crea el JFileChooser y le asigna el tipo.
        // El tipo puede ser para abrir un archivo o para guardar a un archivo.
        this.fileChooser = new JFileChooser();
        this.fileChooser.setDialogTitle("Selecciona un archivo");
        this.fileChooser.setDialogType(dialogType);
    }

    public int showDialog() {
        int state = JFileChooser.CANCEL_OPTION;

        // Llama a un metodo de mostrar la ventana emergente distinto dependiendo del tipo de
        // objeto que se haya creado (guardar o abrir).
        if (this.fileChooser.getDialogType() == JFileChooser.SAVE_DIALOG) {
            state = this.fileChooser.showSaveDialog(null);
        } else {
            state = this.fileChooser.showOpenDialog(null);
        }

        // Comprueba que la ventana emergente se cerro correctamente, lo que implica que
        // el usuario selecciono un archivo.
        if (state == JFileChooser.APPROVE_OPTION) {
            if (manageSelectedFile()) {
                state = JFileChooser.ERROR_OPTION;
            }
        }

        return state;
    }

    private boolean manageSelectedFile() {
        this.file = this.fileChooser.getSelectedFile();
        boolean state = false;
        if (this.fileChooser.getDialogType() == JFileChooser.SAVE_DIALOG) {
            if (FileManager.isFileEmpty(this.file)) {
                state = FileManager.createFile(this.file);
            }
        }
        return state;
    }

    public File getFile() {
        return this.file;
    }


    public static File chooseFile(int dialogType) {
        FileChooserDialog fcd = new FileChooserDialog(dialogType);
        int state;
        do {
            state = fcd.showDialog();
            if (state == JFileChooser.CANCEL_OPTION) {
                System.exit(0);
            }
            if (state == JFileChooser.ERROR_OPTION){
                JOptionPane.showMessageDialog(null,
                        "No se ha seleccionado ningun archivo o hubo un error al momento de leer el archivo",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (state != JFileChooser.APPROVE_OPTION);
        return fcd.getFile();
    }
}
