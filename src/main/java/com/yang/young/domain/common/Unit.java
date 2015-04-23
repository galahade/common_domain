package com.yang.young.domain.common;

public class Unit {
	public static interface UnitType {
	}
	public static enum DUniType implements UnitType {
		KM
	}
	private UnitType name;
	
	public UnitType getName() {
		return name;
	}
	public void setName(UnitType name) {
		this.name = name;
	}
	
	

}
