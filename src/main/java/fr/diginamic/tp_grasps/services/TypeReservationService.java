package fr.diginamic.tp_grasps.services;

import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

public class TypeReservationService {

	/** DAO permettant d'accéder à la table des types de réservation */
	private TypeReservationDao typeReservationDao;

	public TypeReservationService() {
		this.typeReservationDao = new TypeReservationDao();
	}
	
	public TypeReservation findByTypeReservation(String typeReservation) {
		return typeReservationDao.extraireTypeReservation(typeReservation);
	}
}
