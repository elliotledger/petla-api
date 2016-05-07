package com.tesla.petla.api.type;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Status {
	private boolean petModeIsEnabled;
	private String outsideTemp;
	private String insideTemp;
	private boolean acIsOn;
	private boolean sunroofIsOpen;
	
	public Status() {
		
	}
	
	public Status(boolean petModeIsEnabled, String outsideTemp, String insideTemp, boolean acIsOn, boolean sunroofIsOpen) {
		this.petModeIsEnabled = petModeIsEnabled;
		this.outsideTemp = outsideTemp;
		this.insideTemp = insideTemp;
		this.acIsOn = acIsOn;
		this.sunroofIsOpen = sunroofIsOpen;
	}
	
	public boolean isPetModeIsEnabled() {
		return petModeIsEnabled;
	}
	public void setPetModeIsEnabled(boolean petModeIsEnabled) {
		this.petModeIsEnabled = petModeIsEnabled;
	}
	public String getOutsideTemp() {
		return outsideTemp;
	}
	public void setOutsideTemp(String outsideTemp) {
		this.outsideTemp = outsideTemp;
	}
	public String getInsideTemp() {
		return insideTemp;
	}
	public void setInsideTemp(String insideTemp) {
		this.insideTemp = insideTemp;
	}
	public boolean isAcIsOn() {
		return acIsOn;
	}
	public void setAcIsOn(boolean acIsOn) {
		this.acIsOn = acIsOn;
	}
	public boolean isSunroofIsOpen() {
		return sunroofIsOpen;
	}
	public void setSunroofIsOpen(boolean sunroofIsOpen) {
		this.sunroofIsOpen = sunroofIsOpen;
	}

}
