package com.solarvillage.datamodel;

public class OverallOrder {
	private String ownerName;
	private String ownerAddress;
	private String electricalPermitID;
	private String structuralPermitID;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getElectricalPermitID() {
		return electricalPermitID;
	}
	public void setElectricalPermitID(String electricalPermitID) {
		this.electricalPermitID = electricalPermitID;
	}
	public String getStructuralPermitID() {
		return structuralPermitID;
	}
	public void setStructuralPermitID(String structuralPermitID) {
		this.structuralPermitID = structuralPermitID;
	}
	
}
