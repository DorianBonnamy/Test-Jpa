package main.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestJpa {

	public static void main(String[] ars)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager entityManger = entityManagerFactory.createEntityManager();
		
		Livre livre = entityManger.find(Livre.class, 1);
		if(livre != null){
			System.out.println("id : " + livre.getId());
			System.out.println("titre : "+livre.getTitre());
			System.out.println("auteur : " + livre.getAuteur());
		}
		
		TypedQuery<Livre> query = 
				entityManger.createQuery("SELECT a FROM Livre a WHERE t=:reference",
				Livre.class);
		
		query.setParameter("reference"
				, "Vingt mille lieues sous les mers");
		
		System.out.println(query.getSingleResult().getAuteur());
		
	}
}
