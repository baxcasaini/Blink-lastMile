package com.aws.codestar.projecttemplates.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * Delivery
 */
@Validated
public class Receiver {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("address")
	private Address address = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("email")
	private String email = null;

	@JsonProperty("phoneNumber")
	private String phoneNumber = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Receiver delivery = (Receiver) o;
		return Objects.equals(this.id, delivery.id) && Objects.equals(this.address, delivery.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, address);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Receiver {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
