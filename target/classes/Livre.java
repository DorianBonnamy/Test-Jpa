package main.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIVRE")
public class Livre {

	@Id
	private Integer id;
	@Column(name="TITRE", length=255, nullable = false, unique = true)
	private String titre;
	@Column(name="AUTEUR", length =50, nullable = false, unique = true)
	private String auteur;
	
	
	//Constructeurs
	public Livre(){
		
	}
	
	//getters and setters
	public void setTitre(String titre){
		this.titre = titre;
	}
	
	public void setAuteur(String auteur){
		this.auteur = auteur;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getTitre(){
		return this.titre;
	}
	
	public String getAuteur(){
		return this.auteur;
	}
}
