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

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/heros", (request, response) -> {
    Map<String, Object> model = new HashMap<String, Object>();

    String description = request.queryParams("description");
    Hero newHero = new Hero(description);
    request.session().attribute("hero", newHero);

    model.put("template", "templates/success.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

    }
}
