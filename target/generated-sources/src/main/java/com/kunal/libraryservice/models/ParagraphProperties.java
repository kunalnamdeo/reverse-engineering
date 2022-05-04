package com.kunal.libraryservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ParagraphProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class ParagraphProperties   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("freeText")
  private String freeText;

  @JsonProperty("name")
  @Valid
  private List<String> name = null;

  @JsonProperty("standardText")
  private String standardText;

  public ParagraphProperties code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ParagraphProperties freeText(String freeText) {
    this.freeText = freeText;
    return this;
  }

  /**
   * Get freeText
   * @return freeText
  */
  @ApiModelProperty(value = "")


  public String getFreeText() {
    return freeText;
  }

  public void setFreeText(String freeText) {
    this.freeText = freeText;
  }

  public ParagraphProperties name(List<String> name) {
    this.name = name;
    return this;
  }

  public ParagraphProperties addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public ParagraphProperties standardText(String standardText) {
    this.standardText = standardText;
    return this;
  }

  /**
   * Get standardText
   * @return standardText
  */
  @ApiModelProperty(value = "")


  public String getStandardText() {
    return standardText;
  }

  public void setStandardText(String standardText) {
    this.standardText = standardText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParagraphProperties paragraphProperties = (ParagraphProperties) o;
    return Objects.equals(this.code, paragraphProperties.code) &&
        Objects.equals(this.freeText, paragraphProperties.freeText) &&
        Objects.equals(this.name, paragraphProperties.name) &&
        Objects.equals(this.standardText, paragraphProperties.standardText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, freeText, name, standardText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphProperties {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    freeText: ").append(toIndentedString(freeText)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    standardText: ").append(toIndentedString(standardText)).append("\n");
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

