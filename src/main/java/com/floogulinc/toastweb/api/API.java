package com.floogulinc.toastweb.api;

import spark.Route;

public interface API extends Route {

    public String address();

    public void init();

}