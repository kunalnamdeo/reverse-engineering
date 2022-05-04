package com.kunal.libraryservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kunal.libraryservice.models.Addenda;
import com.kunal.libraryservice.models.MainCorrespondent;
import com.kunal.libraryservice.models.StandardAddenda;
import com.kunal.libraryservice.models.ValidDocumentRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValueCommunicatedDocuments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class ValueCommunicatedDocuments   {
  @JsonProperty("mainCorrespondent")
  private MainCorrespondent mainCorrespondent;

  @JsonProperty("validDocumentRecipientList")
  @Valid
  private List<ValidDocumentRecipient> validDocumentRecipientList = null;

  @JsonProperty("addenda")
  @Valid
  private List<Addenda> addenda = null;

  @JsonProperty("standardAddenda")
  @Valid
  private List<StandardAddenda> standardAddenda = null;

  public ValueCommunicatedDocuments mainCorrespondent(MainCorrespondent mainCorrespondent) {
    this.mainCorrespondent = mainCorrespondent;
    return this;
  }

  /**
   * Get mainCorrespondent
   * @return mainCorrespondent
  */
  @ApiModelProperty(value = "")

  @Valid

  public MainCorrespondent getMainCorrespondent() {
    return mainCorrespondent;
  }

  public void setMainCorrespondent(MainCorrespondent mainCorrespondent) {
    this.mainCorrespondent = mainCorrespondent;
  }

  public ValueCommunicatedDocuments validDocumentRecipientList(List<ValidDocumentRecipient> validDocumentRecipientList) {
    this.validDocumentRecipientList = validDocumentRecipientList;
    return this;
  }

  public ValueCommunicatedDocuments addValidDocumentRecipientListItem(ValidDocumentRecipient validDocumentRecipientListItem) {
    if (this.validDocumentRecipientList == null) {
      this.validDocumentRecipientList = new ArrayList<>();
    }
    this.validDocumentRecipientList.add(validDocumentRecipientListItem);
    return this;
  }

  /**
   * Get validDocumentRecipientList
   * @return validDocumentRecipientList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ValidDocumentRecipient> getValidDocumentRecipientList() {
    return validDocumentRecipientList;
  }

  public void setValidDocumentRecipientList(List<ValidDocumentRecipient> validDocumentRecipientList) {
    this.validDocumentRecipientList = validDocumentRecipientList;
  }

  public ValueCommunicatedDocuments addenda(List<Addenda> addenda) {
    this.addenda = addenda;
    return this;
  }

  public ValueCommunicatedDocuments addAddendaItem(Addenda addendaItem) {
    if (this.addenda == null) {
      this.addenda = new ArrayList<>();
    }
    this.addenda.add(addendaItem);
    return this;
  }

  /**
   * Get addenda
   * @return addenda
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Addenda> getAddenda() {
    return addenda;
  }

  public void setAddenda(List<Addenda> addenda) {
    this.addenda = addenda;
  }

  public ValueCommunicatedDocuments standardAddenda(List<StandardAddenda> standardAddenda) {
    this.standardAddenda = standardAddenda;
    return this;
  }

  public ValueCommunicatedDocuments addStandardAddendaItem(StandardAddenda standardAddendaItem) {
    if (this.standardAddenda == null) {
      this.standardAddenda = new ArrayList<>();
    }
    this.standardAddenda.add(standardAddendaItem);
    return this;
  }

  /**
   * Get standardAddenda
   * @return standardAddenda
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StandardAddenda> getStandardAddenda() {
    return standardAddenda;
  }

  public void setStandardAddenda(List<StandardAddenda> standardAddenda) {
    this.standardAddenda = standardAddenda;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueCommunicatedDocuments valueCommunicatedDocuments = (ValueCommunicatedDocuments) o;
    return Objects.equals(this.mainCorrespondent, valueCommunicatedDocuments.mainCorrespondent) &&
        Objects.equals(this.validDocumentRecipientList, valueCommunicatedDocuments.validDocumentRecipientList) &&
        Objects.equals(this.addenda, valueCommunicatedDocuments.addenda) &&
        Objects.equals(this.standardAddenda, valueCommunicatedDocuments.standardAddenda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainCorrespondent, validDocumentRecipientList, addenda, standardAddenda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueCommunicatedDocuments {\n");
    
    sb.append("    mainCorrespondent: ").append(toIndentedString(mainCorrespondent)).append("\n");
    sb.append("    validDocumentRecipientList: ").append(toIndentedString(validDocumentRecipientList)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    standardAddenda: ").append(toIndentedString(standardAddenda)).append("\n");
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

