package com.flightapi.service;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


public class FlightApplication extends Application {

    private Set<Object> _singletons = new HashSet<Object>();

    public FlightApplication() {
        _singletons.add(new AirlineEngineService());
    }

    @Override
    public Set<Object> getSingletons() {
        return _singletons;
    }

}
