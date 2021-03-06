package com.hcl.patienttracking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * 
 * Topic:Spring_Hibernate
 * 
 * @author srimathi
 * 
 * This class has to get the prescription details as id,patient name,quantity,medicineid.
 *
 */
@Entity
@Table(name="prescription")
public class Prescription {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column
private int medicineId;
	@Column 
	@NotEmpty
private String patientName;
	@Column
private int quantity;
/**
 * This is for default constructor
 */
public Prescription() {
	super();
}
/**
 * This is for paramaterized constructor
 * @param patientId
 * @param medicineId
 * @param patientName
 * @param quantity
 */
public Prescription(int id, int medicineId, String patientName, int quantity) {
	super();
	this.id = id;
	this.medicineId = medicineId;
	this.patientName = patientName;
	this.quantity = quantity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMedicineId() {
	return medicineId;
}
public void setMedicineId(int medicineId) {
	this.medicineId = medicineId;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
