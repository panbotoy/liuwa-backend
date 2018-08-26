package liuwabackend;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.googlecode.objectify.ObjectifyService;

@WebListener
public class ObjectifyWebListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent event) {
    ObjectifyService.init();
    // Here is also a great place to register your POJO entity classes.
    // ObjectifyService.register(YourEntity.class);
  }

  @Override
  public void contextDestroyed(ServletContextEvent event) {
  }
}