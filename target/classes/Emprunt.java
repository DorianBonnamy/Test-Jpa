/**
 * 
 */
package main.java;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Diginamic
 *
 */

@Entity
@Table(name="EMPRUNT")
public class Emprunt {

	
	@Id
	private int id;
	@Column(name="DATE_DEBUT", nullable = false, unique = false)
	private Date dateDebut;
	@Column(name="DATE_FIN", nullable = false, unique = false)
	private Date dateFin;
	@Column(name="ID_CLIENT", length = 10, nullable = false, unique = true)
	private int idClient;
	
	//Constructeur
	public Emprunt(){
		
	}
	
	//Getters and Setters
	public Date getDateDebut(){
		return dateDebut;
	}
	
	public Date getDateFin(){
		return dateFin;
	}
	
	public int getIdClient(){
		return idClient;
	}
}
