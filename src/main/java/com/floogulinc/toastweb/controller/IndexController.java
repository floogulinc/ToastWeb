package com.floogulinc.toastweb.controller;

import java.util.HashMap;

import com.floogulinc.toastweb.WebHandler;

import spark.Request;
import spark.Response;

public class IndexController implements Controller {

    public IndexController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object handle(Request request, Response response) throws Exception {
       
        
        HashMap<String, Object> map = new HashMap<String, Object>();
  
//      HashMap<String, Object> map = hashMapOf(
//                Pair("match_number", 0),
//                Pair("match_type", "test")
//        )
        // TODO Auto-generated method stub
        return WebHandler.applyTemplate("index.html", map);
        
        //return null;
    }

    @Override
    public String address() {
        // TODO Auto-generated method stub
        return "/";
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub

    }

}
