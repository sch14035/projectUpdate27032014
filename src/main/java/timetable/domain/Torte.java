package timetable.domain;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import timetablee.Ensure;





@Entity
@Table(name = "torte")
public class Torte extends BasePersistable {

	private static final long serialVersionUID = 1127398350055088704L;
	
	@Size(max = 255)
	@Null
	@Column(name = "bezeichnung", nullable = false, length = 255)
	private String bezeichnung;
	
	@Size(max = 255)
	@NotNull
	@Column(name = "anzZutaten", nullable = false, length = 255)
	private int anzZutaten;
	@Size(max = 255)
	@NotNull
	@Column(name = "menge", nullable = false, length = 255)
	private int menge;
	@Size(max = 255)
	@NotNull
	@Column(name = "tortenGroesse", nullable = false, length = 255)
	private float tortenGroesse;
	@Size(max = 255)
	@NotNull
	@Column(name = "preis", nullable = false, length = 255)
	private float preis;

	protected Torte() {
        // required for JPA
    }
	
	
	public Torte(String bezeichnung, int anzZutaten, int menge, float tortenGroesse, float preis) {
        Ensure.notEmpty("bezeichnung", bezeichnung);
        this.bezeichnung = bezeichnung;
        this.anzZutaten = anzZutaten;
        this.menge = menge;
		this.tortenGroesse = tortenGroesse;
		this.preis = preis;
    }
	
	

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getAnzZutaten() {
		return anzZutaten;
	}

	public void setAnzZutaten(int anzZutaten) {
		this.anzZutaten = anzZutaten;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public float getTortenGroesse() {
		return tortenGroesse;
	}

	public void setTortenGroesse(float tortenGroesse) {
		this.tortenGroesse = tortenGroesse;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
