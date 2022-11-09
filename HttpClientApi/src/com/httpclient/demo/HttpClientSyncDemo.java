package com.httpclient.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientSyncDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status====>" + response.statusCode());
        System.out.println(response.body());

        request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .POST(HttpRequest.BodyPublishers.ofString("{\n" + "\"ID\": 0, \n" + " \"Title\": \"string\", \n" + "\"DueDate\": \"2020-06-24T08:32:49.249Z\", \n" + "\"Completed\": true\n" + "}"))
                .header("content-type", "application/json")
                .build();


        HttpResponse<String> response2= client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status====>" + response2.statusCode());
        System.out.println(response2.body());
        HttpHeaders headers = response2.headers();
        System.out.println(headers.map());

    }
}
