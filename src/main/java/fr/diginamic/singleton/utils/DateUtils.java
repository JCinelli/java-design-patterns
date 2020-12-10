package fr.diginamic.singleton.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** Classe utilitaire pour formatter des String en LocalDate et vice versa
 * @author RichardBONNAMY
 *
 */
public class DateUtils {
	
	/** Formateur par défaut: dd/mm/aaaa */
	private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/YYYY");

	/** Formate une date en chaine de caractères
	 * @param date date
	 * @return String
	 */
	public static String format(LocalDate date) {
		return DEFAULT_FORMATTER.format(date);
		
	}
	
	/** Transforme une date au format String en {@link LocalDateTime}
	 * @param dateStr date au format String
	 * @return LocalDateTime
	 */
	public static LocalDateTime toDate(String dateStr) {
		
		return LocalDateTime.parse(dateStr, DEFAULT_FORMATTER);
	}
}
