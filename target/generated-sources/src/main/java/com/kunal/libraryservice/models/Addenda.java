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
 * Addenda
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class Addenda   {
  @JsonProperty("includeModificationEnabled")
  private String includeModificationEnabled;

  @JsonProperty("included")
  private String included;

  @JsonProperty("templateCategory")
  private String templateCategory;

  public Addenda includeModificationEnabled(String includeModificationEnabled) {
    this.includeModificationEnabled = includeModificationEnabled;
    return this;
  }

  /**
   * Get includeModificationEnabled
   * @return includeModificationEnabled
  */
  @ApiModelProperty(value = "")


  public String getIncludeModificationEnabled() {
    return includeModificationEnabled;
  }

  public void setIncludeModificationEnabled(String includeModificationEnabled) {
    this.includeModificationEnabled = includeModificationEnabled;
  }

  public Addenda included(String included) {
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

  public Addenda templateCategory(String templateCategory) {
    this.templateCategory = templateCategory;
    return this;
  }

  /**
   * Get templateCategory
   * @return templateCategory
  */
  @ApiModelProperty(value = "")


  public String getTemplateCategory() {
    return templateCategory;
  }

  public void setTemplateCategory(String templateCategory) {
    this.templateCategory = templateCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Addenda addenda = (Addenda) o;
    return Objects.equals(this.includeModificationEnabled, addenda.includeModificationEnabled) &&
        Objects.equals(this.included, addenda.included) &&
        Objects.equals(this.templateCategory, addenda.templateCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeModificationEnabled, included, templateCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Addenda {\n");
    
    sb.append("    includeModificationEnabled: ").append(toIndentedString(includeModificationEnabled)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    templateCategory: ").append(toIndentedString(templateCategory)).append("\n");
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

