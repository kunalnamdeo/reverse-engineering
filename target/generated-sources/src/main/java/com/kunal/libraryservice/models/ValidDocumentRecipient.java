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
 * ValidDocumentRecipient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class ValidDocumentRecipient   {
  @JsonProperty("documentRecipient")
  private String documentRecipient;

  @JsonProperty("isSelectableForCoCorrespondent")
  private String isSelectableForCoCorrespondent;

  @JsonProperty("isSelectableForMainCorrespondent")
  private String isSelectableForMainCorrespondent;

  @JsonProperty("isVisibleForCoCorrespondent")
  private String isVisibleForCoCorrespondent;

  @JsonProperty("isVisibleForMainCorrespondent")
  private String isVisibleForMainCorrespondent;

  public ValidDocumentRecipient documentRecipient(String documentRecipient) {
    this.documentRecipient = documentRecipient;
    return this;
  }

  /**
   * Get documentRecipient
   * @return documentRecipient
  */
  @ApiModelProperty(value = "")


  public String getDocumentRecipient() {
    return documentRecipient;
  }

  public void setDocumentRecipient(String documentRecipient) {
    this.documentRecipient = documentRecipient;
  }

  public ValidDocumentRecipient isSelectableForCoCorrespondent(String isSelectableForCoCorrespondent) {
    this.isSelectableForCoCorrespondent = isSelectableForCoCorrespondent;
    return this;
  }

  /**
   * Get isSelectableForCoCorrespondent
   * @return isSelectableForCoCorrespondent
  */
  @ApiModelProperty(value = "")


  public String getIsSelectableForCoCorrespondent() {
    return isSelectableForCoCorrespondent;
  }

  public void setIsSelectableForCoCorrespondent(String isSelectableForCoCorrespondent) {
    this.isSelectableForCoCorrespondent = isSelectableForCoCorrespondent;
  }

  public ValidDocumentRecipient isSelectableForMainCorrespondent(String isSelectableForMainCorrespondent) {
    this.isSelectableForMainCorrespondent = isSelectableForMainCorrespondent;
    return this;
  }

  /**
   * Get isSelectableForMainCorrespondent
   * @return isSelectableForMainCorrespondent
  */
  @ApiModelProperty(value = "")


  public String getIsSelectableForMainCorrespondent() {
    return isSelectableForMainCorrespondent;
  }

  public void setIsSelectableForMainCorrespondent(String isSelectableForMainCorrespondent) {
    this.isSelectableForMainCorrespondent = isSelectableForMainCorrespondent;
  }

  public ValidDocumentRecipient isVisibleForCoCorrespondent(String isVisibleForCoCorrespondent) {
    this.isVisibleForCoCorrespondent = isVisibleForCoCorrespondent;
    return this;
  }

  /**
   * Get isVisibleForCoCorrespondent
   * @return isVisibleForCoCorrespondent
  */
  @ApiModelProperty(value = "")


  public String getIsVisibleForCoCorrespondent() {
    return isVisibleForCoCorrespondent;
  }

  public void setIsVisibleForCoCorrespondent(String isVisibleForCoCorrespondent) {
    this.isVisibleForCoCorrespondent = isVisibleForCoCorrespondent;
  }

  public ValidDocumentRecipient isVisibleForMainCorrespondent(String isVisibleForMainCorrespondent) {
    this.isVisibleForMainCorrespondent = isVisibleForMainCorrespondent;
    return this;
  }

  /**
   * Get isVisibleForMainCorrespondent
   * @return isVisibleForMainCorrespondent
  */
  @ApiModelProperty(value = "")


  public String getIsVisibleForMainCorrespondent() {
    return isVisibleForMainCorrespondent;
  }

  public void setIsVisibleForMainCorrespondent(String isVisibleForMainCorrespondent) {
    this.isVisibleForMainCorrespondent = isVisibleForMainCorrespondent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidDocumentRecipient validDocumentRecipient = (ValidDocumentRecipient) o;
    return Objects.equals(this.documentRecipient, validDocumentRecipient.documentRecipient) &&
        Objects.equals(this.isSelectableForCoCorrespondent, validDocumentRecipient.isSelectableForCoCorrespondent) &&
        Objects.equals(this.isSelectableForMainCorrespondent, validDocumentRecipient.isSelectableForMainCorrespondent) &&
        Objects.equals(this.isVisibleForCoCorrespondent, validDocumentRecipient.isVisibleForCoCorrespondent) &&
        Objects.equals(this.isVisibleForMainCorrespondent, validDocumentRecipient.isVisibleForMainCorrespondent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentRecipient, isSelectableForCoCorrespondent, isSelectableForMainCorrespondent, isVisibleForCoCorrespondent, isVisibleForMainCorrespondent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidDocumentRecipient {\n");
    
    sb.append("    documentRecipient: ").append(toIndentedString(documentRecipient)).append("\n");
    sb.append("    isSelectableForCoCorrespondent: ").append(toIndentedString(isSelectableForCoCorrespondent)).append("\n");
    sb.append("    isSelectableForMainCorrespondent: ").append(toIndentedString(isSelectableForMainCorrespondent)).append("\n");
    sb.append("    isVisibleForCoCorrespondent: ").append(toIndentedString(isVisibleForCoCorrespondent)).append("\n");
    sb.append("    isVisibleForMainCorrespondent: ").append(toIndentedString(isVisibleForMainCorrespondent)).append("\n");
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

