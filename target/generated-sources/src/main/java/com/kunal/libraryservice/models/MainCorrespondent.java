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
 * MainCorrespondent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public class MainCorrespondent   {
  @JsonProperty("copyBrokerChecked")
  private String copyBrokerChecked;

  @JsonProperty("copyBrokerDisabled")
  private String copyBrokerDisabled;

  @JsonProperty("recipient")
  private String recipient;

  @JsonProperty("sendingChannel")
  private String sendingChannel;

  public MainCorrespondent copyBrokerChecked(String copyBrokerChecked) {
    this.copyBrokerChecked = copyBrokerChecked;
    return this;
  }

  /**
   * Get copyBrokerChecked
   * @return copyBrokerChecked
  */
  @ApiModelProperty(value = "")


  public String getCopyBrokerChecked() {
    return copyBrokerChecked;
  }

  public void setCopyBrokerChecked(String copyBrokerChecked) {
    this.copyBrokerChecked = copyBrokerChecked;
  }

  public MainCorrespondent copyBrokerDisabled(String copyBrokerDisabled) {
    this.copyBrokerDisabled = copyBrokerDisabled;
    return this;
  }

  /**
   * Get copyBrokerDisabled
   * @return copyBrokerDisabled
  */
  @ApiModelProperty(value = "")


  public String getCopyBrokerDisabled() {
    return copyBrokerDisabled;
  }

  public void setCopyBrokerDisabled(String copyBrokerDisabled) {
    this.copyBrokerDisabled = copyBrokerDisabled;
  }

  public MainCorrespondent recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Get recipient
   * @return recipient
  */
  @ApiModelProperty(value = "")


  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public MainCorrespondent sendingChannel(String sendingChannel) {
    this.sendingChannel = sendingChannel;
    return this;
  }

  /**
   * Get sendingChannel
   * @return sendingChannel
  */
  @ApiModelProperty(value = "")


  public String getSendingChannel() {
    return sendingChannel;
  }

  public void setSendingChannel(String sendingChannel) {
    this.sendingChannel = sendingChannel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainCorrespondent mainCorrespondent = (MainCorrespondent) o;
    return Objects.equals(this.copyBrokerChecked, mainCorrespondent.copyBrokerChecked) &&
        Objects.equals(this.copyBrokerDisabled, mainCorrespondent.copyBrokerDisabled) &&
        Objects.equals(this.recipient, mainCorrespondent.recipient) &&
        Objects.equals(this.sendingChannel, mainCorrespondent.sendingChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyBrokerChecked, copyBrokerDisabled, recipient, sendingChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainCorrespondent {\n");
    
    sb.append("    copyBrokerChecked: ").append(toIndentedString(copyBrokerChecked)).append("\n");
    sb.append("    copyBrokerDisabled: ").append(toIndentedString(copyBrokerDisabled)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sendingChannel: ").append(toIndentedString(sendingChannel)).append("\n");
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

