package fr.diginamic.composite.entities;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.composite.interfaces.IElement;

public class Departement implements IElement {

//	FIELDS
	List<IElement> elements;
	
//	CONSTRUCTOR
	public Departement() {
		this.elements = new ArrayList<>();
	}

//	METHODS
	@Override
	public double calculerSalaire() {
		double salaireGlobalDep = 0;
		
		for (IElement iElement : elements) {
			salaireGlobalDep = salaireGlobalDep + iElement.calculerSalaire();
		}
		
		return salaireGlobalDep;
	}
	
	public void addIElement(IElement elem) {
		this.elements.add(elem);
	}

//	GETTERS & SETTERS
	public List<IElement> getElements() {
		return elements;
	}

	public void setElements(List<IElement> elements) {
		this.elements = elements;
	}
}
