package com.example.v1client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * CustomerDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-24T16:21:03.994-05:00")

public class CustomerDetail   {
  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("originChannel")
  private String originChannel = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("segment")
  private String segment = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("customerCategory")
  private String customerCategory = null;

  public CustomerDetail customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(example = "00021244", value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CustomerDetail originChannel(String originChannel) {
    this.originChannel = originChannel;
    return this;
  }

   /**
   * Get originChannel
   * @return originChannel
  **/
  @ApiModelProperty(example = "BANCA SERFIN", value = "")
  public String getOriginChannel() {
    return originChannel;
  }

  public void setOriginChannel(String originChannel) {
    this.originChannel = originChannel;
  }

  public CustomerDetail fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(example = "ACEVES GONZALEZ ADOLFO", value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CustomerDetail condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @ApiModelProperty(example = "CLIENTE", value = "")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public CustomerDetail segment(String segment) {
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @ApiModelProperty(example = "PREMIER", value = "")
  public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }

  public CustomerDetail address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "LOMA BONITA 1839", value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CustomerDetail customerCategory(String customerCategory) {
    this.customerCategory = customerCategory;
    return this;
  }

   /**
   * Get customerCategory
   * @return customerCategory
  **/
  @ApiModelProperty(example = "FISICA", value = "")
  public String getCustomerCategory() {
    return customerCategory;
  }

  public void setCustomerCategory(String customerCategory) {
    this.customerCategory = customerCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDetail customerDetail = (CustomerDetail) o;
    return Objects.equals(this.customerId, customerDetail.customerId) &&
        Objects.equals(this.originChannel, customerDetail.originChannel) &&
        Objects.equals(this.fullName, customerDetail.fullName) &&
        Objects.equals(this.condition, customerDetail.condition) &&
        Objects.equals(this.segment, customerDetail.segment) &&
        Objects.equals(this.address, customerDetail.address) &&
        Objects.equals(this.customerCategory, customerDetail.customerCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, originChannel, fullName, condition, segment, address, customerCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{CustomerDetail: [{\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    originChannel: ").append(toIndentedString(originChannel)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    customerCategory: ").append(toIndentedString(customerCategory)).append("\n");
    sb.append("}]}");
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

public void setId(String l) {
	// TODO Auto-generated method stub
	
 }


public Object getId() {
	// TODO Auto-generated method stub
	return null;
}

public String orElseThrow(Object object) {
	// TODO Auto-generated method stub
	return object.toString();
}

public void get(String string) {
	// TODO Auto-generated method stub
	
	
}

}

