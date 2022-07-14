package com.redhat.lab.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Case&#39;s list
 */
@ApiModel(description = "Case's list")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-14T11:54:45.004751+08:00[Asia/Taipei]")
public class CaseList   {
  @JsonProperty("caseid")
  private String caseid;

  @JsonProperty("createtime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createtime;

  public CaseList caseid(String caseid) {
    this.caseid = caseid;
    return this;
  }

  /**
   * Get caseid
   * @return caseid
  */
  @ApiModelProperty(value = "")


  public String getCaseid() {
    return caseid;
  }

  public void setCaseid(String caseid) {
    this.caseid = caseid;
  }

  public CaseList createtime(OffsetDateTime createtime) {
    this.createtime = createtime;
    return this;
  }

  /**
   * Get createtime
   * @return createtime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatetime() {
    return createtime;
  }

  public void setCreatetime(OffsetDateTime createtime) {
    this.createtime = createtime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseList caseList = (CaseList) o;
    return Objects.equals(this.caseid, caseList.caseid) &&
        Objects.equals(this.createtime, caseList.createtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseid, createtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseList {\n");
    
    sb.append("    caseid: ").append(toIndentedString(caseid)).append("\n");
    sb.append("    createtime: ").append(toIndentedString(createtime)).append("\n");
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

