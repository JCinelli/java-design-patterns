package fr.diginamic.tp_grasps.interfaces;

import fr.diginamic.tp_grasps.beans.Reservation;

public interface IReservationService {

	
	public Reservation createReservation(String identifiantClient, String dateReservationStr, String typeReservation, int nbPlaces);
}
