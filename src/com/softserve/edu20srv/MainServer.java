package com.softserve.edu20srv;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

class MainServer {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 100);
        server.createContext("/hello", exchange -> {
            System.out.println("Request from '" +
                    exchange.getRemoteAddress() + "': " +
                    exchange.getRequestMethod() + " " +
                    exchange.getRequestURI());
            String box = (String) exchange.getAttribute("box");
            if (box != null && box.length() > 0) {
                System.out.println("\n\tbox = " + box);
            }
            var response = "Hello, HTTP world!".getBytes();
            exchange.sendResponseHeaders(200, response.length);
            exchange.getResponseBody().write(response);
        });
        server.createContext("/stop", exchange -> {
            var response = "By!".getBytes();
            exchange.sendResponseHeaders(200, response.length);
            exchange.getResponseBody().write(response);
            System.out.println("Stopping the server. By!");
            server.stop(1);
        });
        server.start();
        System.out.println("start server");
    }
}

