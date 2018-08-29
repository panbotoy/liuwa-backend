package liuwabackend.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;

import liuwabackend.datamodels.Event;
import liuwabackend.datamodels.Member;
import liuwabackend.viewmodels.EventPost;

/**
 * TODO(boapn): think of whether we need to create a set of models for frontend input
 * I think we should because backend models take in fields like Keys which frontend does not understand.
 * 
 * @author bopan
 *
 */

@Path("/events")
public class EventsController {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(EventPost eventPost) {
		//TODO(bopan): create converters to convert eventPost to event in service layer
		Event event = new Event();
		event.setTitle(eventPost.getTitle())
		.setDescriptionText(eventPost.getDescriptionText())
		.setStartDate(eventPost.getStartDate())
		.setPoster(Key.create(Member.class, 100));
		Key<Event> result = ObjectifyService.ofy().save().entity(event).now();
		return Response.status(HttpStatus.SC_CREATED).entity(result.getId()).build();
	}
	
	@GET
	@Path("/{eventId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("eventId") long eventId) {
		Key<Member> parent = Key.create(Member.class, 100);
		Event event = ObjectifyService.ofy().load().key(Key.create(parent, Event.class, eventId)).now();
		EventPost eventPost = new EventPost();
		eventPost.setDescriptionText(event.getDescriptionText());
		eventPost.setTitle(event.getTitle());
		eventPost.setStartDate(event.getStartDate());
		return Response.status(HttpStatus.SC_OK).entity(eventPost).build();
	}
}
