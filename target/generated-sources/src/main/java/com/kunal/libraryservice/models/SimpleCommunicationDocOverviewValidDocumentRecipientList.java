package com.kunal.libraryservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kunal.libraryservice.models.ValidDocumentRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SimpleCommunicationDocOverviewValidDocumentRecipientList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class SimpleCommunicationDocOverviewValidDocumentRecipientList   {
  @JsonProperty("validDocumentRecipient")
  private ValidDocumentRecipient validDocumentRecipient;

  public SimpleCommunicationDocOverviewValidDocumentRecipientList validDocumentRecipient(ValidDocumentRecipient validDocumentRecipient) {
    this.validDocumentRecipient = validDocumentRecipient;
    return this;
  }

  /**
   * Get validDocumentRecipient
   * @return validDocumentRecipient
  */
  @ApiModelProperty(value = "")

  @Valid

  public ValidDocumentRecipient getValidDocumentRecipient() {
    return validDocumentRecipient;
  }

  public void setValidDocumentRecipient(ValidDocumentRecipient validDocumentRecipient) {
    this.validDocumentRecipient = validDocumentRecipient;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleCommunicationDocOverviewValidDocumentRecipientList simpleCommunicationDocOverviewValidDocumentRecipientList = (SimpleCommunicationDocOverviewValidDocumentRecipientList) o;
    return Objects.equals(this.validDocumentRecipient, simpleCommunicationDocOverviewValidDocumentRecipientList.validDocumentRecipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validDocumentRecipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleCommunicationDocOverviewValidDocumentRecipientList {\n");
    
    sb.append("    validDocumentRecipient: ").append(toIndentedString(validDocumentRecipient)).append("\n");
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

