package io04_object_in_out;

import java.io.Serializable;

public class GoodInfo implements Serializable{
	String code;
//	transient 또는 static  int price; << Serializable 포함아뇜
	int price;
	String name;

	public GoodInfo() {
	}

	public GoodInfo(String code, int price, String name) {
		this.code = code;
		this.price = price;
		this.name = name;
	}

}
