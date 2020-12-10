package fr.diginamic.tp_grasps.services;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.daos.ClientDao;

public class ClientService {

	/** DAO permettant d'accéder à la table des clients */
	private ClientDao clientDao;

	public ClientService() {
		this.clientDao = new ClientDao();
	}
	
	public Client findByIdentifiantClient(String identifiantClient) {
		return clientDao.extraireClient(identifiantClient);
	}
}
