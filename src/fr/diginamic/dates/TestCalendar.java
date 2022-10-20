package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		Date date = new Date(116,4,19,23,59,30);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));
		
		Date date2 = new Date();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateur2.format(date2));
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss");
		System.out.println(formateur3.format(date2));
		
		Locale RU = new Locale("ru","RU");
		
		SimpleDateFormat formateurRusse = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", RU);
		System.out.println(formateurRusse.format(date2));
		
		SimpleDateFormat formateurChinois = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", Locale.CHINA);
		System.out.println(formateurChinois.format(date2));
		
		SimpleDateFormat formateurAllemand = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", Locale.GERMAN);
		System.out.println(formateurAllemand.format(date2));

	}

}
