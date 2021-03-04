package io.auth_hub.ws.rest.user;

import javax.inject.Inject;
//import java.util.logging.Logger;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.auth_hub.control.user.UserController;
import io.auth_hub.model.user.UserBean;
import io.auth_hub.model.util.UtilBean;

@Path("/user")
public class UserResource extends UserController {
	//private final static Logger LOGGER = Logger.getLogger(UserResource.class.getName());
	@POST
	@Path("/signup")
	@Produces(MediaType.APPLICATION_JSON)
	public Object signup(@FormParam("email") String email,
						 @FormParam("password") String password,
						 @FormParam("re_password") String re_password) {
		
		Object response  = "FOID";
		
		try {
			response =  addUser(email, email, password);// (String) new UserBean(email, email, password) //new UserBean(email, email, password);//(UserBean)signup(email, email, password);// (String) new UserBean(email, email, password).toString();
		} catch (Exception e) {
			// TODO: handle exception
			//System.err.println(e.getMessage());
		}finally {
			
		}
		
		return Response.ok(response,  MediaType.APPLICATION_JSON).build();
	}
	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@Inject
	public Object findAll() {
		Object response  = "FOID";
		try {
			response = (UserBean) new UserBean(UtilBean.getHashFromString("1", "SHA-1"),"username", "email", "password");
		} catch (Exception e) {
			// TODO: handle exception
			response =(String) e.getMessage();
		}
		return Response.ok(response,  MediaType.APPLICATION_JSON).build();
	}
	
}
