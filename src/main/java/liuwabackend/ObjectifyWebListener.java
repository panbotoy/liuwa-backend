package liuwabackend;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.google.cloud.datastore.DatastoreOptions;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

import liuwabackend.datamodels.Event;
import liuwabackend.datamodels.EventApplication;
import liuwabackend.datamodels.Member;

@WebListener
public class ObjectifyWebListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent event) {
//    ObjectifyService.init(new ObjectifyFactory(
//    	    DatastoreOptions.newBuilder()
//            .setHost("http://localhost:8484")
//            .setProjectId("liuwa-backend")
//            .build()
//            .getService()
//            ));
	ObjectifyService.init();
    // Here is also a great place to register your POJO entity classes.
    // ObjectifyService.register(YourEntity.class);
    ObjectifyService.register(Event.class);
    ObjectifyService.register(EventApplication.class);
    ObjectifyService.register(Member.class);
    
  }

  @Override
  public void contextDestroyed(ServletContextEvent event) {
  }
}