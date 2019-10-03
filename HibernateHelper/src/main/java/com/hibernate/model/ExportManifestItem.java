package com.hibernate.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="EF_EXPORT_MANIFEST_ITEM")
public class ExportManifestItem implements Serializable {
	/**
	   * Comment for <code>serialVersionUID</code>
	   */
	  private static final long serialVersionUID = 11233L;


	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="ID", unique=true)
	  private Integer id;
	 
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="MANIFEST_ID")
	 private ExportManifest manifestId;
	 
	 @Column(name = "ITEM_NUMBER")
	 private Integer itemNumber;

	 @Column(name="TRANS_DOC_REFERENCE")
	 private String transDocRef;
	 
	 @Column(name="STATUS")
	 private BigInteger status;
	 
	 @Column(name="GROSS_MASS")
	 private Integer grossMass;

	 @Column(name="DATE_CREATION")
	 private Date dateCreation;

	 @Column(name="DATE_LAST_MODIFICATION")
	 private Date dateLastModification;
	  
	 @Column(name="USER_CREATION")
	 private String userCreation;

	 @Column(name="USER_LAST_MODIFICATION")
	 private String userLastModification;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ExportManifest getManifestId() {
		return manifestId;
	}

	public void setManifestId(ExportManifest manifestId) {
		this.manifestId = manifestId;
	}

	public Integer getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getTransDocRef() {
		return transDocRef;
	}

	public void setTransDocRef(String transDocRef) {
		this.transDocRef = transDocRef;
	}

	public BigInteger getStatus() {
		return status;
	}

	public void setStatus(BigInteger status) {
		this.status = status;
	}

	public Integer getGrossMass() {
		return grossMass;
	}

	public void setGrossMass(Integer grossMass) {
		this.grossMass = grossMass;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateLastModification() {
		return dateLastModification;
	}

	public void setDateLastModification(Date dateLastModification) {
		this.dateLastModification = dateLastModification;
	}

	public String getUserCreation() {
		return userCreation;
	}

	public void setUserCreation(String userCreation) {
		this.userCreation = userCreation;
	}

	public String getUserLastModification() {
		return userLastModification;
	}

	public void setUserLastModification(String userLastModification) {
		this.userLastModification = userLastModification;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	  
	  
}
