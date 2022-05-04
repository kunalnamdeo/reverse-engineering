package com.kunal.libraryservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kunal.libraryservice.models.SimpleCommunicationDocOverview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommunicatedInspMutations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class CommunicatedInspMutations   {
  @JsonProperty("simpleCommunicationDocOverview")
  private SimpleCommunicationDocOverview simpleCommunicationDocOverview;

  @JsonProperty("subNumber")
  private String subNumber;

  public CommunicatedInspMutations simpleCommunicationDocOverview(SimpleCommunicationDocOverview simpleCommunicationDocOverview) {
    this.simpleCommunicationDocOverview = simpleCommunicationDocOverview;
    return this;
  }

  /**
   * Get simpleCommunicationDocOverview
   * @return simpleCommunicationDocOverview
  */
  @ApiModelProperty(value = "")

  @Valid

  public SimpleCommunicationDocOverview getSimpleCommunicationDocOverview() {
    return simpleCommunicationDocOverview;
  }

  public void setSimpleCommunicationDocOverview(SimpleCommunicationDocOverview simpleCommunicationDocOverview) {
    this.simpleCommunicationDocOverview = simpleCommunicationDocOverview;
  }

  public CommunicatedInspMutations subNumber(String subNumber) {
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
    CommunicatedInspMutations communicatedInspMutations = (CommunicatedInspMutations) o;
    return Objects.equals(this.simpleCommunicationDocOverview, communicatedInspMutations.simpleCommunicationDocOverview) &&
        Objects.equals(this.subNumber, communicatedInspMutations.subNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simpleCommunicationDocOverview, subNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicatedInspMutations {\n");
    
    sb.append("    simpleCommunicationDocOverview: ").append(toIndentedString(simpleCommunicationDocOverview)).append("\n");
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

