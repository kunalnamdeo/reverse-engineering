package com.kunal.libraryservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kunal.libraryservice.models.ParagraphProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommunicatedMutations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class CommunicatedMutations   {
  @JsonProperty("businessCase")
  private String businessCase;

  @JsonProperty("effectivityStartDate")
  private String effectivityStartDate;

  @JsonProperty("subNumber")
  private String subNumber;

  @JsonProperty("ignoreMutationInCommunication")
  private String ignoreMutationInCommunication;

  @JsonProperty("level")
  private String level;

  @JsonProperty("mutationHolderId")
  private String mutationHolderId;

  @JsonProperty("mutationParagraph")
  private ParagraphProperties mutationParagraph;

  @JsonProperty("mutationType")
  private String mutationType;

  public CommunicatedMutations businessCase(String businessCase) {
    this.businessCase = businessCase;
    return this;
  }

  /**
   * Get businessCase
   * @return businessCase
  */
  @ApiModelProperty(value = "")


  public String getBusinessCase() {
    return businessCase;
  }

  public void setBusinessCase(String businessCase) {
    this.businessCase = businessCase;
  }

  public CommunicatedMutations effectivityStartDate(String effectivityStartDate) {
    this.effectivityStartDate = effectivityStartDate;
    return this;
  }

  /**
   * Get effectivityStartDate
   * @return effectivityStartDate
  */
  @ApiModelProperty(value = "")


  public String getEffectivityStartDate() {
    return effectivityStartDate;
  }

  public void setEffectivityStartDate(String effectivityStartDate) {
    this.effectivityStartDate = effectivityStartDate;
  }

  public CommunicatedMutations subNumber(String subNumber) {
    this.subNumber = subNumber;
    return this;
  }

  /**
   * Get subNumber
   * @return subNumber
  */
  @ApiModelProperty(value = "")


  public String getSubNumber() {
    return subNumber;
  }

  public void setSubNumber(String subNumber) {
    this.subNumber = subNumber;
  }

  public CommunicatedMutations ignoreMutationInCommunication(String ignoreMutationInCommunication) {
    this.ignoreMutationInCommunication = ignoreMutationInCommunication;
    return this;
  }

  /**
   * Get ignoreMutationInCommunication
   * @return ignoreMutationInCommunication
  */
  @ApiModelProperty(value = "")


  public String getIgnoreMutationInCommunication() {
    return ignoreMutationInCommunication;
  }

  public void setIgnoreMutationInCommunication(String ignoreMutationInCommunication) {
    this.ignoreMutationInCommunication = ignoreMutationInCommunication;
  }

  public CommunicatedMutations level(String level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @ApiModelProperty(value = "")


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public CommunicatedMutations mutationHolderId(String mutationHolderId) {
    this.mutationHolderId = mutationHolderId;
    return this;
  }

  /**
   * Get mutationHolderId
   * @return mutationHolderId
  */
  @ApiModelProperty(value = "")


  public String getMutationHolderId() {
    return mutationHolderId;
  }

  public void setMutationHolderId(String mutationHolderId) {
    this.mutationHolderId = mutationHolderId;
  }

  public CommunicatedMutations mutationParagraph(ParagraphProperties mutationParagraph) {
    this.mutationParagraph = mutationParagraph;
    return this;
  }

  /**
   * Get mutationParagraph
   * @return mutationParagraph
  */
  @ApiModelProperty(value = "")

  @Valid

  public ParagraphProperties getMutationParagraph() {
    return mutationParagraph;
  }

  public void setMutationParagraph(ParagraphProperties mutationParagraph) {
    this.mutationParagraph = mutationParagraph;
  }

  public CommunicatedMutations mutationType(String mutationType) {
    this.mutationType = mutationType;
    return this;
  }

  /**
   * Get mutationType
   * @return mutationType
  */
  @ApiModelProperty(value = "")


  public String getMutationType() {
    return mutationType;
  }

  public void setMutationType(String mutationType) {
    this.mutationType = mutationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicatedMutations communicatedMutations = (CommunicatedMutations) o;
    return Objects.equals(this.businessCase, communicatedMutations.businessCase) &&
        Objects.equals(this.effectivityStartDate, communicatedMutations.effectivityStartDate) &&
        Objects.equals(this.subNumber, communicatedMutations.subNumber) &&
        Objects.equals(this.ignoreMutationInCommunication, communicatedMutations.ignoreMutationInCommunication) &&
        Objects.equals(this.level, communicatedMutations.level) &&
        Objects.equals(this.mutationHolderId, communicatedMutations.mutationHolderId) &&
        Objects.equals(this.mutationParagraph, communicatedMutations.mutationParagraph) &&
        Objects.equals(this.mutationType, communicatedMutations.mutationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessCase, effectivityStartDate, subNumber, ignoreMutationInCommunication, level, mutationHolderId, mutationParagraph, mutationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicatedMutations {\n");
    
    sb.append("    businessCase: ").append(toIndentedString(businessCase)).append("\n");
    sb.append("    effectivityStartDate: ").append(toIndentedString(effectivityStartDate)).append("\n");
    sb.append("    subNumber: ").append(toIndentedString(subNumber)).append("\n");
    sb.append("    ignoreMutationInCommunication: ").append(toIndentedString(ignoreMutationInCommunication)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    mutationHolderId: ").append(toIndentedString(mutationHolderId)).append("\n");
    sb.append("    mutationParagraph: ").append(toIndentedString(mutationParagraph)).append("\n");
    sb.append("    mutationType: ").append(toIndentedString(mutationType)).append("\n");
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

