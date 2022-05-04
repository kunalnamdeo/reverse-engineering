package com.kunal.libraryservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kunal.libraryservice.models.Addenda;
import com.kunal.libraryservice.models.MainCorrespondent;
import com.kunal.libraryservice.models.SimpleCommunicationDocOverviewValidDocumentRecipientList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SimpleCommunicationDocOverview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class SimpleCommunicationDocOverview   {
  @JsonProperty("mainCorrespondent")
  private MainCorrespondent mainCorrespondent;

  @JsonProperty("validDocumentRecipientList")
  private SimpleCommunicationDocOverviewValidDocumentRecipientList validDocumentRecipientList;

  @JsonProperty("addenda")
  private Addenda addenda;

  @JsonProperty("subNumber")
  private String subNumber;

  public SimpleCommunicationDocOverview mainCorrespondent(MainCorrespondent mainCorrespondent) {
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

  public SimpleCommunicationDocOverview validDocumentRecipientList(SimpleCommunicationDocOverviewValidDocumentRecipientList validDocumentRecipientList) {
    this.validDocumentRecipientList = validDocumentRecipientList;
    return this;
  }

  /**
   * Get validDocumentRecipientList
   * @return validDocumentRecipientList
  */
  @ApiModelProperty(value = "")

  @Valid

  public SimpleCommunicationDocOverviewValidDocumentRecipientList getValidDocumentRecipientList() {
    return validDocumentRecipientList;
  }

  public void setValidDocumentRecipientList(SimpleCommunicationDocOverviewValidDocumentRecipientList validDocumentRecipientList) {
    this.validDocumentRecipientList = validDocumentRecipientList;
  }

  public SimpleCommunicationDocOverview addenda(Addenda addenda) {
    this.addenda = addenda;
    return this;
  }

  /**
   * Get addenda
   * @return addenda
  */
  @ApiModelProperty(value = "")

  @Valid

  public Addenda getAddenda() {
    return addenda;
  }

  public void setAddenda(Addenda addenda) {
    this.addenda = addenda;
  }

  public SimpleCommunicationDocOverview subNumber(String subNumber) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleCommunicationDocOverview simpleCommunicationDocOverview = (SimpleCommunicationDocOverview) o;
    return Objects.equals(this.mainCorrespondent, simpleCommunicationDocOverview.mainCorrespondent) &&
        Objects.equals(this.validDocumentRecipientList, simpleCommunicationDocOverview.validDocumentRecipientList) &&
        Objects.equals(this.addenda, simpleCommunicationDocOverview.addenda) &&
        Objects.equals(this.subNumber, simpleCommunicationDocOverview.subNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainCorrespondent, validDocumentRecipientList, addenda, subNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleCommunicationDocOverview {\n");
    
    sb.append("    mainCorrespondent: ").append(toIndentedString(mainCorrespondent)).append("\n");
    sb.append("    validDocumentRecipientList: ").append(toIndentedString(validDocumentRecipientList)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    subNumber: ").append(toIndentedString(subNumber)).append("\n");
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

