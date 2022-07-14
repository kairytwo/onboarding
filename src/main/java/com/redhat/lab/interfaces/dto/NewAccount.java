package com.redhat.lab.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * NewAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-14T11:54:45.004751+08:00[Asia/Taipei]")
public class NewAccount   {
  @JsonProperty("userId")
  private String userId;

  @JsonProperty("password")
  private String password;

  @JsonProperty("earthId")
  private String earthId;

  public NewAccount userId(String userId) {
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

  public NewAccount password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 使用者密碼
   * @return password
  */
  @ApiModelProperty(required = true, value = "使用者密碼")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public NewAccount earthId(String earthId) {
    this.earthId = earthId;
    return this;
  }

  /**
   * 身分證/護照號碼
   * @return earthId
  */
  @ApiModelProperty(required = true, value = "身分證/護照號碼")
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
    NewAccount newAccount = (NewAccount) o;
    return Objects.equals(this.userId, newAccount.userId) &&
        Objects.equals(this.password, newAccount.password) &&
        Objects.equals(this.earthId, newAccount.earthId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, password, earthId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAccount {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

