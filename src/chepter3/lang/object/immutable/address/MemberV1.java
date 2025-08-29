package chepter3.lang.object.immutable.address;

public class MemberV1 {

	private String name;
	private Address address;

	public MemberV1(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "MemberV1 [name=" + name + ", address=" + address + "]";
	}
}
