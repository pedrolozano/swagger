package com.example.v1client.model;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.example.v1client.model.CustomerDetail;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import javax.validation.constraints.*;

/**
 * CustomersData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-24T16:21:03.994-05:00")

public class CustomersData extends java.util.ArrayList<CustomerDetail>  {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
  
//List<CustomerDetail> customerData= new CustomersData();

private Collection<CustomerDetail> customers;

	public CustomerDetail findById(String id) {
		
	
		CustomerDetail james = customers.stream()
				  .filter(customer -> id.equals(customer.getCustomerId()))
				  .findAny()
				  .orElse(null);
		
		
	    return james;
	}
}

