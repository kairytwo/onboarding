package com.redhat.lab.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * attachment
 */
@ApiModel(description = "attachment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-14T11:54:45.004751+08:00[Asia/Taipei]")
public class Attachment   {
  @JsonProperty("attachmentId")
  private String attachmentId;

  @JsonProperty("attaKind")
  private String attaKind;

  @JsonProperty("updateTime")
  private String updateTime;

  @JsonProperty("content")
  private String content;

  public Attachment attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * 附件編號
   * @return attachmentId
  */
  @ApiModelProperty(required = true, value = "附件編號")
  @NotNull


  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  public Attachment attaKind(String attaKind) {
    this.attaKind = attaKind;
    return this;
  }

  /**
   * 附件類別:A:正面/B:反面
   * @return attaKind
  */
  @ApiModelProperty(required = true, value = "附件類別:A:正面/B:反面")
  @NotNull


  public String getAttaKind() {
    return attaKind;
  }

  public void setAttaKind(String attaKind) {
    this.attaKind = attaKind;
  }

  public Attachment updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * 修改時間
   * @return updateTime
  */
  @ApiModelProperty(required = true, value = "修改時間")
  @NotNull


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public Attachment content(String content) {
    this.content = content;
    return this;
  }

  /**
   * content
   * @return content
  */
  @ApiModelProperty(required = true, value = "content")
  @NotNull

  @Valid

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.attachmentId, attachment.attachmentId) &&
        Objects.equals(this.attaKind, attachment.attaKind) &&
        Objects.equals(this.updateTime, attachment.updateTime) &&
        Objects.equals(this.content, attachment.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, attaKind, updateTime, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    attaKind: ").append(toIndentedString(attaKind)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

