import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

ProcessBuilder process = new ProcessBuilder();
 Integer port;
 if (process.environment().get("PORT") != null) {
     port = Integer.parseInt(process.environment().get("PORT"));
 } else {
     port = 4567;
 }

setPort(port);

  }
}
