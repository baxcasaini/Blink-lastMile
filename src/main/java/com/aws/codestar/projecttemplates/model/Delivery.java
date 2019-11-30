package com.aws.codestar.projecttemplates.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * Delivery
 */
@Validated
public class Delivery   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("receiver")
  private Receiver receiver = null;

  @JsonProperty("packages")
  @Valid
  private List<Parcel> packages = null;

  public Delivery id(String id) {
    this.id = id;
    return this;
  }


  public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}

public Customer getCustomer() {
	return customer;
}


public void setCustomer(Customer customer) {
	this.customer = customer;
}


public Receiver getReceiver() {
	return receiver;
}


public void setReceiver(Receiver receiver) {
	this.receiver = receiver;
}


public List<Parcel> getPackages() {
	return packages;
}


public void setPackages(List<Parcel> packages) {
	this.packages = packages;
}


@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Delivery delivery = (Delivery) o;
    return Objects.equals(this.id, delivery.id) &&
        Objects.equals(this.customer, delivery.customer) &&
        Objects.equals(this.receiver, delivery.receiver) &&
        Objects.equals(this.packages, delivery.packages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, receiver, packages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Delivery {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    Customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    Receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
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
