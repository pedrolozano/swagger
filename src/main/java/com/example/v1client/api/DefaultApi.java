package com.example.v1client.api;

import com.example.v1client.model.CustomersData;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-24T16:21:03.994-05:00")

@Api(value = "default", description = "the default API")
public interface DefaultApi {

    @ApiOperation(value = "Lookup a list of customers according to the apply filter.", notes = "", response = CustomersData.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CustomersData.class),
        @ApiResponse(code = 404, message = "customer not found.", response = CustomersData.class),
        @ApiResponse(code = 500, message = "Unexpected error.", response = CustomersData.class) })
    @RequestMapping(value = "/",
        produces = { "text/plain; charset=utf-8" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<CustomersData> rootGet(@ApiParam(value = "Mime type request expected" ,required=true ) @RequestHeader(value="accept", required=true) String accept,
        @ApiParam(value = "Language expected" ,required=true ) @RequestHeader(value="accept-language", required=true) String acceptLanguage,
        @ApiParam(value = "Mime type request expected" ,required=true ) @RequestHeader(value="content-type", required=true) String contentType,
        @ApiParam(value = "IBM client ID" ,required=true ) @RequestHeader(value="x-ibm-client-id", required=true) String xIbmClientId,
        @ApiParam(value = "Token authorization" ,required=true ) @RequestHeader(value="authorization", required=true) String authorization,
        @ApiParam(value = "Santander global ID" ,required=true ) @RequestHeader(value="x-santander-global-id", required=true) String xSantanderGlobalId,
         @ApiParam(value = "Customer ID") @RequestParam(value = "customerId", required = false) String customerId,
         @ApiParam(value = "Document number") @RequestParam(value = "documentNumber", required = false) String documentNumber,
         @ApiParam(value = "Company name") @RequestParam(value = "companyName", required = false) String companyName,
         @ApiParam(value = "Company name") @RequestParam(value = "accountNumber", required = false) String accountNumber,
         @ApiParam(value = "Name") @RequestParam(value = "name", required = false) String name,
         @ApiParam(value = "Paternal Name") @RequestParam(value = "paternalName", required = false) String paternalName,
         @ApiParam(value = "Maternal Name") @RequestParam(value = "maternalName", required = false) String maternalName) {
        // do some magic!
        return new ResponseEntity<CustomersData>(HttpStatus.OK);
    }

}
