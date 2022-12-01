package org.tnsindia.di2withcollections;

import java.util.List;
import java.util.Set;

public class Cars {
	private Set<String> carscompany;
	private List<String> carssmodels;
	public Set<String> getCarscompany() {
		
		return carscompany;
	}
	public void setCarscompany(Set<String> carscompany) {
		this.carscompany = carscompany;
	}
	public List<String> getCarssmodels() {
		return carssmodels;
	}
	public void setCarssmodels(List<String> carssmodels) {
		this.carssmodels = carssmodels;
	}
	
	public void display() {

		System.out.println("Cars Company Namaes are as follows" + ":");

		for (String company : carscompany) {
			System.out.println(company);
		}

		System.out.println("Cars model names are as follows" + ":");

		for (String models : carssmodels) {
			System.out.println(models);
		}
	}
}