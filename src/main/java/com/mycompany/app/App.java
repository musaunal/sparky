package com.mycompany.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class App{
    public static boolean search(ArrayList<Integer> array1 ,ArrayList<Integer> array2 ,ArrayList<Integer> array3 ,ArrayList<Integer> array4) {
      System.out.println("inside search");
      if (array1 == null || array2 == null ||array3 == null ||array4 == null) return false;

      for (int elt : array1) {
        if (elt == 0) return true;
      }

      for (int elt : array2) {
        if (elt == 0) return true;
      }

      for (int elt : array3) {
        if (elt == 0) return true;
      }

      for (int elt : array4) {
        if (elt == 0) return true;
      }
      return false;
    }

    public static void main(String[] args) {
        port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello, World");

        post("/compute", (req, res) -> {
          //System.out.println(req.queryParams("input1"));
          //System.out.println(req.queryParams("input2"));

          String input1 = req.queryParams("input1");
          java.util.Scanner sc1 = new java.util.Scanner(input1);
          sc1.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList1 = new java.util.ArrayList<>();
          while (sc1.hasNext()){
            int value = Integer.parseInt(sc1.next().replaceAll("\\s",""));
            inputList1.add(value);
          }

          String input2 = req.queryParams("input2");
          java.util.Scanner sc2 = new java.util.Scanner(input2);
          sc2.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList2 = new java.util.ArrayList<>();
          while (sc2.hasNext()){
            int value = Integer.parseInt(sc2.next().replaceAll("\\s",""));
            inputList2.add(value);
          }

          String input3 = req.queryParams("input3");
          java.util.Scanner sc3 = new java.util.Scanner(input3);
          sc3.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList3 = new java.util.ArrayList<>();
          while (sc3.hasNext()){
            int value = Integer.parseInt(sc3.next().replaceAll("\\s",""));
            inputList3.add(value);
          }

          String input4 = req.queryParams("input4");
          java.util.Scanner sc4 = new java.util.Scanner(input4);
          sc4.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList4 = new java.util.ArrayList<>();
          while (sc4.hasNext()){
            int value = Integer.parseInt(sc4.next().replaceAll("\\s",""));
            inputList4.add(value);
          }

          boolean result = App.search(inputList1 ,inputList2 , inputList3 ,inputList4);

         Map map = new HashMap();
          map.put("result", result);
          return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());


        get("/compute",
            (rq, rs) -> {
              Map map = new HashMap();
              map.put("result", "not computed yet!");
              return new ModelAndView(map, "compute.mustache");
            },
            new MustacheTemplateEngine());
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
