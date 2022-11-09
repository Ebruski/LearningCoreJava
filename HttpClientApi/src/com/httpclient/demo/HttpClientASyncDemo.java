package com.httpclient.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientASyncDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .GET()
                .build();

        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        String body = response.thenApply(HttpResponse::body).get();
        System.out.println(body);

        request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .POST(HttpRequest.BodyPublishers.ofString("{\n" + "\"ID\": 0, \n" + " \"Title\": \"string\", \n" + "\"DueDate\": \"2020-06-24T08:32:49.249Z\", \n" + "\"Completed\": true\n" + "}"))
                .header("content-type", "application/json")
                .build();

        CompletableFuture<HttpResponse<String>> response2 = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        String body2 = response2.thenApply(HttpResponse::body).get();
        System.out.println(body2);

    }
}
