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
public class BasicInfo   {
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

  @JsonProperty("createTime")
  private String createTime;

  @JsonProperty("updateTime")
  private String updateTime;

  @JsonProperty("caseId")
  private String caseId;

  public BasicInfo email(String email) {
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

  public BasicInfo earthId(String earthId) {
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

  public BasicInfo name(String name) {
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

  public BasicInfo englishName(String englishName) {
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

  public BasicInfo cellPhone(String cellPhone) {
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

  public BasicInfo address(String address) {
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

  public BasicInfo birthDay(String birthDay) {
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

  public BasicInfo nation(String nation) {
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

  public BasicInfo creditCardVerification(CreditCardVerification creditCardVerification) {
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

  public BasicInfo createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public BasicInfo updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Get updateTime
   * @return updateTime
  */
  @ApiModelProperty(value = "")


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public BasicInfo caseId(String caseId) {
    this.caseId = caseId;
    return this;
  }

  /**
   * Get caseId
   * @return caseId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCaseId() {
    return caseId;
  }

  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicInfo basicInfo = (BasicInfo) o;
    return Objects.equals(this.email, basicInfo.email) &&
        Objects.equals(this.earthId, basicInfo.earthId) &&
        Objects.equals(this.name, basicInfo.name) &&
        Objects.equals(this.englishName, basicInfo.englishName) &&
        Objects.equals(this.cellPhone, basicInfo.cellPhone) &&
        Objects.equals(this.address, basicInfo.address) &&
        Objects.equals(this.birthDay, basicInfo.birthDay) &&
        Objects.equals(this.nation, basicInfo.nation) &&
        Objects.equals(this.creditCardVerification, basicInfo.creditCardVerification) &&
        Objects.equals(this.createTime, basicInfo.createTime) &&
        Objects.equals(this.updateTime, basicInfo.updateTime) &&
        Objects.equals(this.caseId, basicInfo.caseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, earthId, name, englishName, cellPhone, address, birthDay, nation, creditCardVerification, createTime, updateTime, caseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    earthId: ").append(toIndentedString(earthId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthDay: ").append(toIndentedString(birthDay)).append("\n");
    sb.append("    nation: ").append(toIndentedString(nation)).append("\n");
    sb.append("    creditCardVerification: ").append(toIndentedString(creditCardVerification)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
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

