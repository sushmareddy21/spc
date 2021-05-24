package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String buildingName;
	private String streetName;
	private String cityName;
	private String pincode;
	public Address() {
	}
	public Address(String buildingName, String streetName, String cityName, String pincode) {
		super();
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pincode = pincode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", buildingName=" + buildingName + ", streetName=" + streetName
				+ ", cityName=" + cityName + ", pincode=" + pincode + "]";
	}
	
}