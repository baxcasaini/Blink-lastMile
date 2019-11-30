package com.aws.codestar.projecttemplates.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * value in cm
 */

@Validated
public class Dimension   {
  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("depth")
  private Integer depth = null;

  public Dimension height(Integer height) {
    this.height = height;
    return this;
  }



  public Integer getHeight() {
	return height;
}



public void setHeight(Integer height) {
	this.height = height;
}



public Integer getWidth() {
	return width;
}



public void setWidth(Integer width) {
	this.width = width;
}



public Integer getDepth() {
	return depth;
}



public void setDepth(Integer depth) {
	this.depth = depth;
}



@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dimension dimension = (Dimension) o;
    return Objects.equals(this.height, dimension.height) &&
        Objects.equals(this.width, dimension.width) &&
        Objects.equals(this.depth, dimension.depth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, depth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimension {\n");

    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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
