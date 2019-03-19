package crudCollections;

public class Address implements Comparable<Address> {
	public Address(String city, String country) {
		super();
		this.city = city;
		Country = country;
	}

	private String city;
	private String Country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
    @Override
    public String toString() {
     	return "Address [ City = "+ this.city+" , Country = "+this.Country+" ] ";
    }

	@Override
	public int compareTo(Address o) {
	 	return this.city.compareTo(o.city);
	}
}
