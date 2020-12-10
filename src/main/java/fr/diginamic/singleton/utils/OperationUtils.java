package fr.diginamic.singleton.utils;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class OperationUtils {

	public static double getTotal(TypeReservation type, int nbPlaces, Client client) {
		double total = type.getMontant() * nbPlaces;
		if (client.isPremium()) {
			return total*(1-type.getReductionPourcent()/100.0);
		}
		else {
			return total;
		}
	}
	
}
