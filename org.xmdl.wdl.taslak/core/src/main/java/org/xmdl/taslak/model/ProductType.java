package org.xmdl.taslak.model;

/**
 * ProductType enumeration type
 */
public enum ProductType /*PROTECTED REGION ID(ProductType.enm.imp) ENABLED START*//* implements Interface *//*PROTECTED REGION END*/{

	RAWMATERIAL(1),

	INTERMEDIATEPRODUCT(2),

	PRODUCT(3),

	SERVICE(4),

	;

	private int value;

	ProductType(int value) {
		this.value = value;
	}

	/**
	 * The identifier method
	 */
	public int toInt() {
		return value;
	}

	public int getValue() {
		return value;
	}

	/**
	 * the value Of Method
	 */
	public static ProductType fromInt(int value) {
		switch (value) {

			case 1 :
				return RAWMATERIAL;

			case 2 :
				return INTERMEDIATEPRODUCT;

			case 3 :
				return PRODUCT;

			case 4 :
				return SERVICE;

			default :
				return null;
		}
	}

	public String toString() {
		switch (this) {

			case RAWMATERIAL :
				return "RAWMATERIAL";

			case INTERMEDIATEPRODUCT :
				return "INTERMEDIATEPRODUCT";

			case PRODUCT :
				return "PRODUCT";

			case SERVICE :
				return "SERVICE";

			default :
				return null;
		}
	}

	/*PROTECTED REGION ID(ProductType.enm.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
