package com.kunal.libraryservice.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;


/**
 * This is the book model
 */
@ApiModel(description = "This is the book model")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-30T14:50:42.523+05:30[Asia/Calcutta]")
public class Book   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("bookAuthor")
  private String bookAuthor = null;

  public Book name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of book
   * @return name
  **/
  @ApiModelProperty(value = "The name of book")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book bookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
    return this;
  }

  /**
   * The name of book
   * @return bookAuthor
  **/
  @ApiModelProperty(value = "The name of book")
  
    public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.name, book.name) &&
        Objects.equals(this.bookAuthor, book.bookAuthor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bookAuthor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bookAuthor: ").append(toIndentedString(bookAuthor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
