package com.dxc.rest.RestJdbcApi;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.*;

@Path("/emp")
public class EmployeeResource {

	EmployeeRepository repo = new EmployeeRepository();

 @GET
  
  @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
  
  @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
  
  public List<Employee> getAllEmployeeDetails(){ System.out.println("welcome");
  
  return repo.getEmployees(); }
 	
}