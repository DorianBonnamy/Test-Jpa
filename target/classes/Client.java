package main.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")
public class Client {

	@Id
	private int id;
	@Column(name="NOM", length=50, nullable = false, unique = false)
	private String nom;
	@Column(name="PRENOM", length = 50, nullable = false, unique = false)
	private String prenom;
	
	//Constructeurs
	public Client(){
		
	}
	
	//getters and setters
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	
	public int getId(){
		return id;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
}
