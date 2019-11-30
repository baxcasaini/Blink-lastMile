package com.aws.codestar.projecttemplates.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * Parcel
 */
@Validated
public class Parcel   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("price")
  private String price = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    COMMON("COMMON"),
    
    FOOD("FOOD"),
    
    FRAGILE("FRAGILE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = TypeEnum.COMMON;

  @JsonProperty("weight")
  private Integer weight = null;

  @JsonProperty("dimension")
  private Dimension dimension = null;

  public Parcel description(String description) {
    this.description = description;
    return this;
  }

 
  public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getPrice() {
	return price;
}


public void setPrice(String price) {
	this.price = price;
}


public TypeEnum getType() {
	return type;
}


public void setType(TypeEnum type) {
	this.type = type;
}


public Integer getWeight() {
	return weight;
}


public void setWeight(Integer weight) {
	this.weight = weight;
}


public Dimension getDimension() {
	return dimension;
}


public void setDimension(Dimension dimension) {
	this.dimension = dimension;
}


@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parcel parcel = (Parcel) o;
    return Objects.equals(this.description, parcel.description) &&
        Objects.equals(this.price, parcel.price) &&
        Objects.equals(this.type, parcel.type) &&
        Objects.equals(this.weight, parcel.weight) &&
        Objects.equals(this.dimension, parcel.dimension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, price, type, weight, dimension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parcel {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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
