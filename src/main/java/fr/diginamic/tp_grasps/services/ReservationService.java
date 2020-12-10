package fr.diginamic.tp_grasps.services;

import java.time.LocalDateTime;

import fr.diginamic.singleton.utils.DateUtils;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.factory.ReservationFactory;

public class ReservationService {
	
	private ClientService clientService;
	
	private TypeReservationService typeReservationService;

	public ReservationService() {
		this.clientService = new ClientService();
		this.typeReservationService = new TypeReservationService();
	}
	
	public Reservation createReservation(String identifiantClient, String dateReservationStr, String typeReservation, int nbPlaces) {
		
		Client client = clientService.findByIdentifiantClient(identifiantClient);
		
		TypeReservation type = typeReservationService.findByTypeReservation(typeReservation);
		
		// Conversion de la date de réservation en LocalDateTime
		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);
		
		Reservation reservation = new ReservationFactory(client, dateReservation, type, nbPlaces).toReservation();
		
		client.addReservation(reservation);
		
		return reservation;
	}

}
