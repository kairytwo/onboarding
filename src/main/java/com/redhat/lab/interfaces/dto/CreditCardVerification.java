package com.redhat.lab.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * CreditCardVerification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-14T11:54:45.004751+08:00[Asia/Taipei]")
public class CreditCardVerification   {
  @JsonProperty("verificationTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private String verificationTime;

  @JsonProperty("status")
  private String status;

  public CreditCardVerification verificationTime(String verificationTime) {
    this.verificationTime = verificationTime;
    return this;
  }

  /**
   * Get verificationTime
   * @return verificationTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public String getVerificationTime() {
    return verificationTime;
  }

  public void setVerificationTime(String verificationTime) {
    this.verificationTime = verificationTime;
  }

  public CreditCardVerification status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardVerification creditCardVerification = (CreditCardVerification) o;
    return Objects.equals(this.verificationTime, creditCardVerification.verificationTime) &&
        Objects.equals(this.status, creditCardVerification.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardVerification {\n");
    
    sb.append("    verificationTime: ").append(toIndentedString(verificationTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

