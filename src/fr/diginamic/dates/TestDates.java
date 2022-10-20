package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		Date date = new Date(116,4,19,23,59,30);
		System.out.println(date);
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String chaine1 = formateur.format(date);
		System.out.println(chaine1);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016,4,19,23,59,30);
		cal.set(Calendar.MONTH, 3);
		Date date1 = cal.getTime();
		System.out.println(date1);
		
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String chaine2 = formateur2.format(date1);
		System.out.println(chaine2);
		
		Date date3 = new Date();
		System.out.println(formateur2.format(date3));
		

		
		}
}