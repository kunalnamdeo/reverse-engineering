package com.kunal.libraryservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocumentTypeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class DocumentTypeProperties   {
  @JsonProperty("fileType")
  private String fileType;

  @JsonProperty("povc")
  private String povc;

  @JsonProperty("subType")
  private String subType;

  public DocumentTypeProperties fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * Get fileType
   * @return fileType
  */
  @ApiModelProperty(value = "")


  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public DocumentTypeProperties povc(String povc) {
    this.povc = povc;
    return this;
  }

  /**
   * Get povc
   * @return povc
  */
  @ApiModelProperty(value = "")


  public String getPovc() {
    return povc;
  }

  public void setPovc(String povc) {
    this.povc = povc;
  }

  public DocumentTypeProperties subType(String subType) {
    this.subType = subType;
    return this;
  }

  /**
   * Get subType
   * @return subType
  */
  @ApiModelProperty(value = "")


  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTypeProperties documentTypeProperties = (DocumentTypeProperties) o;
    return Objects.equals(this.fileType, documentTypeProperties.fileType) &&
        Objects.equals(this.povc, documentTypeProperties.povc) &&
        Objects.equals(this.subType, documentTypeProperties.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, povc, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTypeProperties {\n");
    
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    povc: ").append(toIndentedString(povc)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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

