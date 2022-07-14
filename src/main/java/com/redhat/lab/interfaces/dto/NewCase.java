package com.redhat.lab.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * NewCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-14T11:54:45.004751+08:00[Asia/Taipei]")
public class NewCase   {
  @JsonProperty("productKind")
  private String productKind;

  public NewCase productKind(String productKind) {
    this.productKind = productKind;
    return this;
  }

  /**
   * Get productKind
   * @return productKind
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getProductKind() {
    return productKind;
  }

  public void setProductKind(String productKind) {
    this.productKind = productKind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCase newCase = (NewCase) o;
    return Objects.equals(this.productKind, newCase.productKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCase {\n");
    
    sb.append("    productKind: ").append(toIndentedString(productKind)).append("\n");
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

