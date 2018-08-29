package liuwabackend.rest;

import javax.servlet.annotation.WebServlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestController {
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey says : " + msg;

		return Response.status(200).entity(output).build();

	}
}
