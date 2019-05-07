package io.swagger;

import java.awt.PageAttributes.MediaType;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.v1client.api.NotFoundException;
import com.example.v1client.repository.CustomerRepository;
import com.example.v1client.model.CustomerDetail;
import com.example.v1client.model.CustomersData;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import com.example.v1client.model.MapperCustomer;
/**
 * Home redirection to swagger api documentation 
 */

@RestController

public class HomeController {
   
	/*@RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
	*/

	@RequestMapping("/")
	@ResponseBody
	public String getId(@RequestParam("customerId") String id) {
	MapperCustomer customerData = new MapperCustomer(id);
	
	return "customerData: " + customerData.MapperCustomer(id);
	}
			
	//customerData.insert("test");
		
	/*@RequestMapping(value="/")
	@ResponseBody
	public boolean method9(@RequestParam("customerId") String id) 
			throws NotFoundException{
	//	CustomerRepository customerDetail = null;

	
	CustomersData customerData;
	((CustomersData) customerData).findById(id);
	boolean find = result.equals(id);
	*/
	/*CustomersData james = result.stream()
			  .filter(customer -> "James".equals(customer.getName()))
			  .findAny()
			  .orElse(null);*/
	/*	
		return find;
	}

	private void findById(String id) {
		// TODO Auto-generated method stub
		
	}
	
	*/
/*	public ResponseEntity<CustomerRepository> getCustomerById(@PathVariable(value = "customer_id") String customerId)
			throws NotFoundException{
		CustomerRepository customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new NotFoundException("Customer not found for this id::"+ customerId));
		
		return ResponseEntity.ok().body(customer);
		}*/
	/*@RequestMapping(value = "/")
	public String index() {
		System.out.println("swagger-ui.html");
		return "redirect:swagger-ui.html";
	}
	*/
	
}
