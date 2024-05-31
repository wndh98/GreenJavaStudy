package class10_polymoriphdriver.school;

public class Address {
	private String steate;
	private String city;
	private String street;

	public Address(String steate, String city, String street) {
		super();
		this.steate = steate;
		this.city = city;
		this.street = street;
	}

	public String getSteate() {
		return steate;
	}

	public void setSteate(String steate) {
		this.steate = steate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [steate=" + steate + ", city=" + city + ", street=" + street + "]";
	}

}




