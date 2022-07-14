package com.redhat.lab.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

/**
 * AttachmentCaseMapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-14T11:54:45.004751+08:00[Asia/Taipei]")
public class AttachmentCaseMapping   {
  @JsonProperty("attachmentId")
  private String attachmentId;

  @JsonProperty("caseId")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate caseId;

  public AttachmentCaseMapping attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * Get attachmentId
   * @return attachmentId
  */
  @ApiModelProperty(value = "")


  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  public AttachmentCaseMapping caseId(LocalDate caseId) {
    this.caseId = caseId;
    return this;
  }

  /**
   * Get caseId
   * @return caseId
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCaseId() {
    return caseId;
  }

  public void setCaseId(LocalDate caseId) {
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
    AttachmentCaseMapping attachmentCaseMapping = (AttachmentCaseMapping) o;
    return Objects.equals(this.attachmentId, attachmentCaseMapping.attachmentId) &&
        Objects.equals(this.caseId, attachmentCaseMapping.caseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, caseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentCaseMapping {\n");
    
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
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

