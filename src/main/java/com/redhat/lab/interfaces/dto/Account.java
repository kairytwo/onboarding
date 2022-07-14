package com.redhat.lab.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * , 
 */
@ApiModel(description = ", ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-14T11:54:45.004751+08:00[Asia/Taipei]")
public class Account   {
  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("earthId")
  private String earthId;

  public Account accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * flow number
   * @return accountId
  */
  @ApiModelProperty(value = "flow number")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Account userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * 使用者帳號
   * @return userId
  */
  @ApiModelProperty(required = true, value = "使用者帳號")
  @NotNull


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Account earthId(String earthId) {
    this.earthId = earthId;
    return this;
  }

  /**
   * 身分證號/護照號碼
   * @return earthId
  */
  @ApiModelProperty(required = true, value = "身分證號/護照號碼")
  @NotNull


  public String getEarthId() {
    return earthId;
  }

  public void setEarthId(String earthId) {
    this.earthId = earthId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.userId, account.userId) &&
        Objects.equals(this.earthId, account.earthId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, userId, earthId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    earthId: ").append(toIndentedString(earthId)).append("\n");
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

