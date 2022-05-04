package com.kunal.libraryservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kunal.libraryservice.models.CommunicatedInspMutations;
import com.kunal.libraryservice.models.CommunicatedMutations;
import com.kunal.libraryservice.models.DocumentTypeProperties;
import com.kunal.libraryservice.models.ParagraphProperties;
import com.kunal.libraryservice.models.ValueCommunicatedDocuments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Value
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class Value   {
  @JsonProperty("communicatedDocuments")
  private ValueCommunicatedDocuments communicatedDocuments;

  @JsonProperty("communicatedInspMutations")
  @Valid
  private List<CommunicatedInspMutations> communicatedInspMutations = null;

  @JsonProperty("communicatedMutations")
  private CommunicatedMutations communicatedMutations;

  @JsonProperty("documentTypeProperties")
  private DocumentTypeProperties documentTypeProperties;

  @JsonProperty("language")
  private String language;

  @JsonProperty("paragraphConcerns")
  private ParagraphProperties paragraphConcerns;

  @JsonProperty("paragraphIntroduction")
  private ParagraphProperties paragraphIntroduction;

  @JsonProperty("paragraphsPayment")
  private ParagraphProperties paragraphsPayment;

  @JsonProperty("policyUUID")
  private String policyUUID;

  @JsonProperty("templateCode")
  private String templateCode;

  @JsonProperty("templateName")
  private String templateName;

  @JsonProperty("useOpenBalance")
  private String useOpenBalance;

  public Value communicatedDocuments(ValueCommunicatedDocuments communicatedDocuments) {
    this.communicatedDocuments = communicatedDocuments;
    return this;
  }

  /**
   * Get communicatedDocuments
   * @return communicatedDocuments
  */
  @ApiModelProperty(value = "")

  @Valid

  public ValueCommunicatedDocuments getCommunicatedDocuments() {
    return communicatedDocuments;
  }

  public void setCommunicatedDocuments(ValueCommunicatedDocuments communicatedDocuments) {
    this.communicatedDocuments = communicatedDocuments;
  }

  public Value communicatedInspMutations(List<CommunicatedInspMutations> communicatedInspMutations) {
    this.communicatedInspMutations = communicatedInspMutations;
    return this;
  }

  public Value addCommunicatedInspMutationsItem(CommunicatedInspMutations communicatedInspMutationsItem) {
    if (this.communicatedInspMutations == null) {
      this.communicatedInspMutations = new ArrayList<>();
    }
    this.communicatedInspMutations.add(communicatedInspMutationsItem);
    return this;
  }

  /**
   * Get communicatedInspMutations
   * @return communicatedInspMutations
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CommunicatedInspMutations> getCommunicatedInspMutations() {
    return communicatedInspMutations;
  }

  public void setCommunicatedInspMutations(List<CommunicatedInspMutations> communicatedInspMutations) {
    this.communicatedInspMutations = communicatedInspMutations;
  }

  public Value communicatedMutations(CommunicatedMutations communicatedMutations) {
    this.communicatedMutations = communicatedMutations;
    return this;
  }

  /**
   * Get communicatedMutations
   * @return communicatedMutations
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommunicatedMutations getCommunicatedMutations() {
    return communicatedMutations;
  }

  public void setCommunicatedMutations(CommunicatedMutations communicatedMutations) {
    this.communicatedMutations = communicatedMutations;
  }

  public Value documentTypeProperties(DocumentTypeProperties documentTypeProperties) {
    this.documentTypeProperties = documentTypeProperties;
    return this;
  }

  /**
   * Get documentTypeProperties
   * @return documentTypeProperties
  */
  @ApiModelProperty(value = "")

  @Valid

  public DocumentTypeProperties getDocumentTypeProperties() {
    return documentTypeProperties;
  }

  public void setDocumentTypeProperties(DocumentTypeProperties documentTypeProperties) {
    this.documentTypeProperties = documentTypeProperties;
  }

  public Value language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  */
  @ApiModelProperty(value = "")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Value paragraphConcerns(ParagraphProperties paragraphConcerns) {
    this.paragraphConcerns = paragraphConcerns;
    return this;
  }

  /**
   * Get paragraphConcerns
   * @return paragraphConcerns
  */
  @ApiModelProperty(value = "")

  @Valid

  public ParagraphProperties getParagraphConcerns() {
    return paragraphConcerns;
  }

  public void setParagraphConcerns(ParagraphProperties paragraphConcerns) {
    this.paragraphConcerns = paragraphConcerns;
  }

  public Value paragraphIntroduction(ParagraphProperties paragraphIntroduction) {
    this.paragraphIntroduction = paragraphIntroduction;
    return this;
  }

  /**
   * Get paragraphIntroduction
   * @return paragraphIntroduction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ParagraphProperties getParagraphIntroduction() {
    return paragraphIntroduction;
  }

  public void setParagraphIntroduction(ParagraphProperties paragraphIntroduction) {
    this.paragraphIntroduction = paragraphIntroduction;
  }

  public Value paragraphsPayment(ParagraphProperties paragraphsPayment) {
    this.paragraphsPayment = paragraphsPayment;
    return this;
  }

  /**
   * Get paragraphsPayment
   * @return paragraphsPayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public ParagraphProperties getParagraphsPayment() {
    return paragraphsPayment;
  }

  public void setParagraphsPayment(ParagraphProperties paragraphsPayment) {
    this.paragraphsPayment = paragraphsPayment;
  }

  public Value policyUUID(String policyUUID) {
    this.policyUUID = policyUUID;
    return this;
  }

  /**
   * Get policyUUID
   * @return policyUUID
  */
  @ApiModelProperty(value = "")


  public String getPolicyUUID() {
    return policyUUID;
  }

  public void setPolicyUUID(String policyUUID) {
    this.policyUUID = policyUUID;
  }

  public Value templateCode(String templateCode) {
    this.templateCode = templateCode;
    return this;
  }

  /**
   * Get templateCode
   * @return templateCode
  */
  @ApiModelProperty(value = "")


  public String getTemplateCode() {
    return templateCode;
  }

  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }

  public Value templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * Get templateName
   * @return templateName
  */
  @ApiModelProperty(value = "")


  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public Value useOpenBalance(String useOpenBalance) {
    this.useOpenBalance = useOpenBalance;
    return this;
  }

  /**
   * Get useOpenBalance
   * @return useOpenBalance
  */
  @ApiModelProperty(value = "")


  public String getUseOpenBalance() {
    return useOpenBalance;
  }

  public void setUseOpenBalance(String useOpenBalance) {
    this.useOpenBalance = useOpenBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Value value = (Value) o;
    return Objects.equals(this.communicatedDocuments, value.communicatedDocuments) &&
        Objects.equals(this.communicatedInspMutations, value.communicatedInspMutations) &&
        Objects.equals(this.communicatedMutations, value.communicatedMutations) &&
        Objects.equals(this.documentTypeProperties, value.documentTypeProperties) &&
        Objects.equals(this.language, value.language) &&
        Objects.equals(this.paragraphConcerns, value.paragraphConcerns) &&
        Objects.equals(this.paragraphIntroduction, value.paragraphIntroduction) &&
        Objects.equals(this.paragraphsPayment, value.paragraphsPayment) &&
        Objects.equals(this.policyUUID, value.policyUUID) &&
        Objects.equals(this.templateCode, value.templateCode) &&
        Objects.equals(this.templateName, value.templateName) &&
        Objects.equals(this.useOpenBalance, value.useOpenBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicatedDocuments, communicatedInspMutations, communicatedMutations, documentTypeProperties, language, paragraphConcerns, paragraphIntroduction, paragraphsPayment, policyUUID, templateCode, templateName, useOpenBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Value {\n");
    
    sb.append("    communicatedDocuments: ").append(toIndentedString(communicatedDocuments)).append("\n");
    sb.append("    communicatedInspMutations: ").append(toIndentedString(communicatedInspMutations)).append("\n");
    sb.append("    communicatedMutations: ").append(toIndentedString(communicatedMutations)).append("\n");
    sb.append("    documentTypeProperties: ").append(toIndentedString(documentTypeProperties)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    paragraphConcerns: ").append(toIndentedString(paragraphConcerns)).append("\n");
    sb.append("    paragraphIntroduction: ").append(toIndentedString(paragraphIntroduction)).append("\n");
    sb.append("    paragraphsPayment: ").append(toIndentedString(paragraphsPayment)).append("\n");
    sb.append("    policyUUID: ").append(toIndentedString(policyUUID)).append("\n");
    sb.append("    templateCode: ").append(toIndentedString(templateCode)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    useOpenBalance: ").append(toIndentedString(useOpenBalance)).append("\n");
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

