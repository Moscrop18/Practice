package com.hibernate.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EF_EXPORT_MANIFEST")
public class ExportManifest implements Serializable{
  
 /**
   * Comment for <code>serialVersionUID</code>
   */
  private static final long serialVersionUID = 11233L;


@Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="ID", unique=true)
  private Integer id;
 
 
 @Column(name="MANIFEST_NUMBER")
 private String manifestNumber;
 
 @Column(name = "TRADER_AT_EXIT")
 private String traderAtExit;


 @Column(name="PRESENTATION_DATE")
 private Date presentationDate;
 
 @Column(name="STATUS")
 private BigInteger status;
 
 @Column(name="ACTUAL_OFFICE_OF_EXIT")
 private String actualOfficeOfExit;
 
 @Column(name="EXPECTED_TRANSPORT_TYPE")
 private Integer expTransportType;

 @Column(name="DATE_CREATION")
 private Date dateCreation;


  @Column(name="DATE_LAST_MODIFICATION")
  private Date dateLastModification;
  
  @Column(name="USER_CREATION")
  private String userCreation;

  @Column(name="USER_LAST_MODIFICATION")
  private String userLastModification;

  /**
   * @return Returns the id.
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id The id to set.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * @return Returns the manifestNumber.
   */
  public String getManifestNumber() {
    return manifestNumber;
  }

  /**
   * @param manifestNumber The manifestNumber to set.
   */
  public void setManifestNumber(String manifestNumber) {
    this.manifestNumber = manifestNumber;
  }

  /**
   * @return Returns the traderAtExit.
   */
  public String getTraderAtExit() {
    return traderAtExit;
  }

  /**
   * @param traderAtExit The traderAtExit to set.
   */
  public void setTraderAtExit(String traderAtExit) {
    this.traderAtExit = traderAtExit;
  }

  /**
   * @return Returns the presentationDate.
   */
  public Date getPresentationDate() {
    return presentationDate;
  }

  /**
   * @param presentationDate The presentationDate to set.
   */
  public void setPresentationDate(Date presentationDate) {
    this.presentationDate = presentationDate;
  }

  /**
   * @return Returns the status.
   */
  public BigInteger getStatus() {
    return status;
  }

  /**
   * @param status The status to set.
   */
  public void setStatus(BigInteger status) {
    this.status = status;
  }

  /**
   * @return Returns the actualOfficeOfExit.
   */
  public String getActualOfficeOfExit() {
    return actualOfficeOfExit;
  }

  /**
   * @param actualOfficeOfExit The actualOfficeOfExit to set.
   */
  public void setActualOfficeOfExit(String actualOfficeOfExit) {
    this.actualOfficeOfExit = actualOfficeOfExit;
  }

  /**
   * @return Returns the expTransportType.
   */
  public Integer getExpTransportType() {
    return expTransportType;
  }

  /**
   * @param expTransportType The expTransportType to set.
   */
  public void setExpTransportType(Integer expTransportType) {
    this.expTransportType = expTransportType;
  }

  /**
   * @return Returns the dateCreation.
   */
  public Date getDateCreation() {
    return dateCreation;
  }

  /**
   * @param dateCreation The dateCreation to set.
   */
  public void setDateCreation(Date dateCreation) {
    this.dateCreation = dateCreation;
  }

  /**
   * @return Returns the dateLastModification.
   */
  public Date getDateLastModification() {
    return dateLastModification;
  }

  /**
   * @param dateLastModification The dateLastModification to set.
   */
  public void setDateLastModification(Date dateLastModification) {
    this.dateLastModification = dateLastModification;
  }

  /**
   * @return Returns the userCreation.
   */
  public String getUserCreation() {
    return userCreation;
  }

  /**
   * @param userCreation The userCreation to set.
   */
  public void setUserCreation(String userCreation) {
    this.userCreation = userCreation;
  }

  /**
   * @return Returns the userLastModification.
   */
  public String getUserLastModification() {
    return userLastModification;
  }

  /**
   * @param userLastModification The userLastModification to set.
   */
  public void setUserLastModification(String userLastModification) {
    this.userLastModification = userLastModification;
  }

  
  
 
}
