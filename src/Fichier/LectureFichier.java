package Fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		
		Path path = Paths.get("C:/Users/maxen/Documents/recensement.csv");
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
			for (String ligne : lignes) {
			}
	}
}