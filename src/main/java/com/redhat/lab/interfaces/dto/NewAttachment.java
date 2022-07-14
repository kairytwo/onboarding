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
public class NewAttachment   {
  @JsonProperty("attaKind")
  private String attaKind;

  @JsonProperty("content")
  private String content;

  public NewAttachment attaKind(String attaKind) {
    this.attaKind = attaKind;
    return this;
  }

  /**
   * 附件類別:A:正面/B:反面
   * @return attaKind
  */
  @ApiModelProperty(value = "附件類別:A:正面/B:反面")


  public String getAttaKind() {
    return attaKind;
  }

  public void setAttaKind(String attaKind) {
    this.attaKind = attaKind;
  }

  public NewAttachment content(String content) {
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
    NewAttachment newAttachment = (NewAttachment) o;
    return Objects.equals(this.attaKind, newAttachment.attaKind) &&
        Objects.equals(this.content, newAttachment.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attaKind, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAttachment {\n");
    
    sb.append("    attaKind: ").append(toIndentedString(attaKind)).append("\n");
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

