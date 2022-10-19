package Fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
//		List<Ville> villes = new ArrayList<Ville>();
		List<Ville> villes = new ArrayList<Ville>();
		
		Path path = Paths.get("C:/Users/maxen/Documents/recensement.csv");
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
			for (int i = 0; i < lignes.size(); i++) {
				String[] tokenString = lignes.get(i).split(";");
				String nom = tokenString[6];
				String codeDepartement = tokenString[2];
				String nomRegion = tokenString[1];
				String population = tokenString[9].replaceAll(" ","");
				if(population == "Populationtotale" || Integer.parseInt(population) >= 25000) {
				villes.add(new Ville(nom, codeDepartement, nomRegion, population));
				}
			}
		
		List<String> villesSup = new ArrayList<>();
		for (int i=0;i<villes.size(); i++) {
			villesSup.add(villes.get(i).getNom()+";"+villes.get(i).getCodeDepartement()+";"+villes.get(i).getNomRegion()+";"+villes.get(i).getPopulation());
		}
		
		Path pathCible = Paths.get("C:/Users/maxen/Documents/recensement2.csv");
		Files.write(pathCible, villesSup);
			
		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}
}