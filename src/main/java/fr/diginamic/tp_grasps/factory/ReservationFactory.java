package fr.diginamic.tp_grasps.factory;

import java.time.LocalDateTime;

import fr.diginamic.singleton.utils.OperationUtils;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationFactory {
	
	public static Reservation getInstance(Client client, LocalDateTime dateReservation, TypeReservation type, int nbPlaces) {
		Reservation reservation = new Reservation();
		reservation.setClient(client);
		reservation.setDate(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setTotal(OperationUtils.getTotal(type, nbPlaces, client));
		
		return reservation;
	}
	
}
