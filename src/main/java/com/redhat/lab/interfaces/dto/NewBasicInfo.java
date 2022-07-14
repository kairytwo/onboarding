package com.redhat.lab.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 申請業務基本資訊
 */
@ApiModel(description = "申請業務基本資訊")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-14T11:54:45.004751+08:00[Asia/Taipei]")
public class NewBasicInfo   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("earthId")
  private String earthId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("englishName")
  private String englishName;

  @JsonProperty("cellPhone")
  private String cellPhone;

  @JsonProperty("address")
  private String address;

  @JsonProperty("birthDay")
  private String birthDay;

  @JsonProperty("nation")
  private String nation;

  @JsonProperty("creditCardVerification")
  private CreditCardVerification creditCardVerification;

  public NewBasicInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NewBasicInfo earthId(String earthId) {
    this.earthId = earthId;
    return this;
  }

  /**
   * Human'id on earth
   * @return earthId
  */
  @ApiModelProperty(required = true, value = "Human'id on earth")
  @NotNull


  public String getEarthId() {
    return earthId;
  }

  public void setEarthId(String earthId) {
    this.earthId = earthId;
  }

  public NewBasicInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
  */
  @ApiModelProperty(required = true, value = "Name")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewBasicInfo englishName(String englishName) {
    this.englishName = englishName;
    return this;
  }

  /**
   * Your English Name
   * @return englishName
  */
  @ApiModelProperty(value = "Your English Name")


  public String getEnglishName() {
    return englishName;
  }

  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }

  public NewBasicInfo cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

  /**
   * Get cellPhone
   * @return cellPhone
  */
  @ApiModelProperty(value = "")


  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public NewBasicInfo address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NewBasicInfo birthDay(String birthDay) {
    this.birthDay = birthDay;
    return this;
  }

  /**
   * Get birthDay
   * @return birthDay
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
  }

  public NewBasicInfo nation(String nation) {
    this.nation = nation;
    return this;
  }

  /**
   * Get nation
   * @return nation
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  public NewBasicInfo creditCardVerification(CreditCardVerification creditCardVerification) {
    this.creditCardVerification = creditCardVerification;
    return this;
  }

  /**
   * Get creditCardVerification
   * @return creditCardVerification
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CreditCardVerification getCreditCardVerification() {
    return creditCardVerification;
  }

  public void setCreditCardVerification(CreditCardVerification creditCardVerification) {
    this.creditCardVerification = creditCardVerification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBasicInfo newBasicInfo = (NewBasicInfo) o;
    return Objects.equals(this.email, newBasicInfo.email) &&
        Objects.equals(this.earthId, newBasicInfo.earthId) &&
        Objects.equals(this.name, newBasicInfo.name) &&
        Objects.equals(this.englishName, newBasicInfo.englishName) &&
        Objects.equals(this.cellPhone, newBasicInfo.cellPhone) &&
        Objects.equals(this.address, newBasicInfo.address) &&
        Objects.equals(this.birthDay, newBasicInfo.birthDay) &&
        Objects.equals(this.nation, newBasicInfo.nation) &&
        Objects.equals(this.creditCardVerification, newBasicInfo.creditCardVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, earthId, name, englishName, cellPhone, address, birthDay, nation, creditCardVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBasicInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    earthId: ").append(toIndentedString(earthId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthDay: ").append(toIndentedString(birthDay)).append("\n");
    sb.append("    nation: ").append(toIndentedString(nation)).append("\n");
    sb.append("    creditCardVerification: ").append(toIndentedString(creditCardVerification)).append("\n");
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

