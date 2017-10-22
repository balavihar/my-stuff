package com.vihar.examples.resources;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Created by 609072804 on 28/09/2017.
 */
public class SampleResource extends ServerResource {

    @Get
    public String sayHello() {

        return "Hi, this is my first Restlet app.";
    }
}
