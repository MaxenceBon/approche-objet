package Fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreeFichier {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/Users/maxen/Documents/recensement.csv");
		
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		List<String> nouveauFichier = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			nouveauFichier.add(lignes.get(i));
		}
		
		System.out.println(nouveauFichier);
		
		Path pathCible = Paths.get("C:/Users/maxen/Documents/recensement2.csv");
		Files.write(pathCible, nouveauFichier);

	}

}
