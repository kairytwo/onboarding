package com.redhat.lab.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 申請內容
 */
@ApiModel(description = "申請內容")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-14T11:54:45.004751+08:00[Asia/Taipei]")
public class ModelCase   {
  @JsonProperty("productKind")
  private String productKind;

  @JsonProperty("createTime")
  private String createTime;

  @JsonProperty("caseId")
  private String caseId;

  public ModelCase productKind(String productKind) {
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

  public ModelCase createTime(String createTime) {
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

  public ModelCase caseId(String caseId) {
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
    ModelCase _case = (ModelCase) o;
    return Objects.equals(this.productKind, _case.productKind) &&
        Objects.equals(this.createTime, _case.createTime) &&
        Objects.equals(this.caseId, _case.caseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productKind, createTime, caseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCase {\n");
    
    sb.append("    productKind: ").append(toIndentedString(productKind)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

