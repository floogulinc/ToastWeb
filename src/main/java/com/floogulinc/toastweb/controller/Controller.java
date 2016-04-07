package com.floogulinc.toastweb.controller;

import spark.Route;

public interface Controller extends Route{
    
    String address();
    
    void init();

}
