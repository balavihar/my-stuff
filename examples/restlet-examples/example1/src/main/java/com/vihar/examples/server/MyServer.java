package com.vihar.examples.server;

import com.vihar.examples.resources.SampleResource;
import org.restlet.Server;
import org.restlet.data.Protocol;

/**
 * Hello world!
 *
 */
public class MyServer
{
    // Simple example to create and start restlet server.
    public static void main( String[] args ) throws Exception {
        Server server = new Server(Protocol.HTTP, 6060, SampleResource.class);
        server.start();
    }

    // Need to check how to build ssl restlet server.
    public static void main1(String[] args) throws Exception {
        Server secureServer = new Server(Protocol.HTTPS, 6061, SampleResource.class);
        secureServer.start();
    }
}
