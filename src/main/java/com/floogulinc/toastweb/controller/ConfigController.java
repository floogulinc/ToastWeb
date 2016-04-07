package com.floogulinc.toastweb.controller;

import java.util.HashMap;

import com.floogulinc.toastweb.WebHandler;

import spark.Request;
import spark.Response;

public class ConfigController implements Controller {

    public ConfigController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object handle(Request request, Response response) throws Exception {
        
        HashMap<String, Object> map = new HashMap<String, Object>();
        return WebHandler.applyTemplate("config.html", map);
        // TODO Auto-generated method stub
        //return null;
    }

    @Override
    public String address() {
        // TODO Auto-generated method stub
        return "/config";
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub

    }

}
