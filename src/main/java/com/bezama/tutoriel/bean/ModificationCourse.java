package com.bezama.tutoriel.bean;

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;
public class ModificationCourse {
	 private Integer id;
	    private String libelle;
	    @NotEmpty
	    @Pattern(regexp="\\d*", message="{Pattern.quantite}" )
	    private String quantite;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(final Integer pId) {
	        id = pId;
	    }

	    public String getLibelle() {
	        return libelle;
	    }

	    public void setLibelle(final String pLibelle) {
	        libelle = pLibelle;
	    }

	    public String getQuantite() {
	        return quantite;
	    }

	    public void setQuantite(final String pQuantite) {
	        quantite = pQuantite;
	    }
}
