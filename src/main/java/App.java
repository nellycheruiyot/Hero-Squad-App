import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

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
      model.put("heroes", request.session().attribute("heroes"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/heroes", (request, response) -> {
    Map<String, Object> model = new HashMap<String, Object>();

    ArrayList<Hero> heroes = request.session().attribute("heroes");
    if (heroes == null) {
      heroes = new ArrayList<Hero>();
      request.session().attribute("heroes", heroes);
    }

    String description = request.queryParams("description");
    Hero newHero = new Hero(description);
    heroes.add(newHero);

    model.put("template", "templates/success.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  // get("/", (request, response) -> {
  //   Map<String, Object> model = new HashMap<String, Object>();
  //   model.put("hero", request.session().attribute("hero"));
  //   model.put("template", "templates/index.vtl");
  //   return new ModelAndView(model, layout);
  // }, new VelocityTemplateEngine());

  }
}
