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
 * StandardAddenda
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class StandardAddenda   {
  @JsonProperty("abbreviation")
  private String abbreviation;

  @JsonProperty("annexTypeName")
  private String annexTypeName;

  @JsonProperty("description")
  private String description;

  @JsonProperty("included")
  private String included;

  @JsonProperty("standardAnnexId")
  private String standardAnnexId;

  @JsonProperty("standardAnnexTypeId")
  private String standardAnnexTypeId;

  public StandardAddenda abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * Get abbreviation
   * @return abbreviation
  */
  @ApiModelProperty(value = "")


  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public StandardAddenda annexTypeName(String annexTypeName) {
    this.annexTypeName = annexTypeName;
    return this;
  }

  /**
   * Get annexTypeName
   * @return annexTypeName
  */
  @ApiModelProperty(value = "")


  public String getAnnexTypeName() {
    return annexTypeName;
  }

  public void setAnnexTypeName(String annexTypeName) {
    this.annexTypeName = annexTypeName;
  }

  public StandardAddenda description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StandardAddenda included(String included) {
    this.included = included;
    return this;
  }

  /**
   * Get included
   * @return included
  */
  @ApiModelProperty(value = "")


  public String getIncluded() {
    return included;
  }

  public void setIncluded(String included) {
    this.included = included;
  }

  public StandardAddenda standardAnnexId(String standardAnnexId) {
    this.standardAnnexId = standardAnnexId;
    return this;
  }

  /**
   * Get standardAnnexId
   * @return standardAnnexId
  */
  @ApiModelProperty(value = "")


  public String getStandardAnnexId() {
    return standardAnnexId;
  }

  public void setStandardAnnexId(String standardAnnexId) {
    this.standardAnnexId = standardAnnexId;
  }

  public StandardAddenda standardAnnexTypeId(String standardAnnexTypeId) {
    this.standardAnnexTypeId = standardAnnexTypeId;
    return this;
  }

  /**
   * Get standardAnnexTypeId
   * @return standardAnnexTypeId
  */
  @ApiModelProperty(value = "")


  public String getStandardAnnexTypeId() {
    return standardAnnexTypeId;
  }

  public void setStandardAnnexTypeId(String standardAnnexTypeId) {
    this.standardAnnexTypeId = standardAnnexTypeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardAddenda standardAddenda = (StandardAddenda) o;
    return Objects.equals(this.abbreviation, standardAddenda.abbreviation) &&
        Objects.equals(this.annexTypeName, standardAddenda.annexTypeName) &&
        Objects.equals(this.description, standardAddenda.description) &&
        Objects.equals(this.included, standardAddenda.included) &&
        Objects.equals(this.standardAnnexId, standardAddenda.standardAnnexId) &&
        Objects.equals(this.standardAnnexTypeId, standardAddenda.standardAnnexTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, annexTypeName, description, included, standardAnnexId, standardAnnexTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardAddenda {\n");
    
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    annexTypeName: ").append(toIndentedString(annexTypeName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    standardAnnexId: ").append(toIndentedString(standardAnnexId)).append("\n");
    sb.append("    standardAnnexTypeId: ").append(toIndentedString(standardAnnexTypeId)).append("\n");
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

