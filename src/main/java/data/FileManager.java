package data;

import modelo.Desastre;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

	public static boolean isFileEmpty(File file) {
		if (!file.exists()) return false;
		return file.length() == 0;
	}

	public static boolean createFile(File file) {
		try {
			return file.createNewFile();
		} catch (IOException e) {
			return false;
		}
	}

	public static ArrayList<Desastre> readFileToContacts(File file) {
		ArrayList<Desastre> desastres = new ArrayList<>();
		try {
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String row = myReader.nextLine();
				Desastre aux = FileManager.parseRowToContact(row);
				desastres.add(aux);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
			JOptionPane.showMessageDialog(null, "El archivo ingresado no existe");
			e.printStackTrace();
		}
		return desastres;

	}

	private static Desastre parseRowToContact(String row) {
		String[] fields = row.split(",");
		return new Desastre(
				Long.parseLong(fields[0]),
				fields[1],
				fields[2],
				fields[3],
				fields[4],
				fields[5],
				fields[6],
				fields[7]
		);
	}
}