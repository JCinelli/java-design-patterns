package fr.diginamic.tp_grasps.factory;

import java.time.LocalDateTime;

import fr.diginamic.singleton.utils.OperationUtils;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationFactory {

	private Client client;
	
	private LocalDateTime dateReservation;
	
	private TypeReservation type;
	
	private int nbPlaces;
	
	public ReservationFactory(Client client, LocalDateTime dateReservation, TypeReservation type, int nbPlaces) {
		this.client = client;
		this.dateReservation = dateReservation;
		this.type = type;
		this.nbPlaces = nbPlaces;
	}
	
	public Reservation toReservation() {
		Reservation reservation = new Reservation();
		reservation.setClient(client);
		reservation.setDate(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setTotal(OperationUtils.getTotal(type, nbPlaces, client));
		
		return reservation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(LocalDateTime dateReservation) {
		this.dateReservation = dateReservation;
	}

	public TypeReservation getType() {
		return type;
	}

	public void setType(TypeReservation type) {
		this.type = type;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	
}
