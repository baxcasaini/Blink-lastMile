package com.aws.codestar.projecttemplates.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;


/**
 * Address
 */
@Validated
public class Address   {
  @JsonProperty("road")
  private String road = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("normalized")
  private Boolean normalized = false;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("zipcode")
  private String zipcode = null;

  public String getRoad() {
	return road;
}

public void setRoad(String road) {
	this.road = road;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public Boolean getNormalized() {
	return normalized;
}

public void setNormalized(Boolean normalized) {
	this.normalized = normalized;
}

public String getProvince() {
	return province;
}

public void setProvince(String province) {
	this.province = province;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.road, address.road) &&
        Objects.equals(this.number, address.number) &&
        Objects.equals(this.normalized, address.normalized) &&
        Objects.equals(this.province, address.province) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.zipcode, address.zipcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(road, number, normalized, province, city, country, zipcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");

    sb.append("    road: ").append(toIndentedString(road)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    normalized: ").append(toIndentedString(normalized)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
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
