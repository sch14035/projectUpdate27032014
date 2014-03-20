package timetable.domain;

import java.util.ArrayList;
import java.util.Date;

import timetablee.Ensure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;





@Entity
@Table(name = "kunde")
public class Kunde extends BasePersistable {

	
	 private static final long serialVersionUID = -6667520361999134030L;
	 
 
	 @Size(max = 255)
	    @NotNull
	    @Column(name = "name", nullable = false, length = 255)
	    private String name;
	 
	 @Temporal(TemporalType.DATE)
	    @NotNull
	    @Column(name = "birth_date", nullable = false)
	    private Date birthDate;
	 
	 @Size(max = 255)
	    @NotNull
	    @Column(name = "adresse", nullable = false, length = 255)
	    private String adresse;
	 
	 @Size(max = 255)
	    @NotNull
	    @Column(name = "ort", nullable = false, length = 255)
	    private String ort;
	 
	 @Size(max = 255)
	    @NotNull
	    @Column(name = "plz", nullable = false, length = 255)
	    private String plz;
	 
	
	 
	 protected Kunde() {
	        // required for JPA
	    }
	 
	 public Kunde(String name, Date birthDate, String adresse, String ort, String plz) {
	        Ensure.notEmpty("name", name);
	        Ensure.notNull("birthDate", birthDate);
	        Ensure.notEmpty("adresse", adresse);
	        Ensure.notEmpty("ort", ort);
	        Ensure.notEmpty("plz", plz);
	        this.name = name;
	        this.birthDate = (Date)birthDate.clone();
	        this.adresse = adresse;
			this.ort = ort;
			this.plz = plz;
	    }
	 
	 
	 
	  

	public String getName() {
	        return name;
	    }

	    public Date getBirthDate() {
	        return (Date)birthDate.clone();
	    }

		public String getOrt() {
			return ort;
		}

		public void setOrt(String ort) {
			this.ort = ort;
		}

		public String getPlz() {
			return plz;
		}

		public void setPlz(String plz) {
			this.plz = plz;
		}

		public void setName(String name) {
			this.name = name;
		}

	    
	 
	 
}
