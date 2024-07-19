package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class API {


    private CloseableHttpClient client;

    public API() {
        client = HttpClients.createDefault();
    }


    public void getJoke(String category) {
        try {
            URI uri = new URIBuilder("http://v2.jokeapi.dev/joke/"+category).build();


            HttpGet request = new HttpGet(uri);
            CloseableHttpResponse response = client.execute(request);
            String json = EntityUtils.toString(response.getEntity());
            ResponseJokeApi responce = new ObjectMapper().readValue(json, ResponseJokeApi.class);
            if (!responce.getError()) {
                if (responce.getType().equals("twopart")) {
                    System.out.println(responce.getSetup() + "\n" + responce.getDelivery());
                }
                else{
                    System.out.println(responce.getJoke());
                }
            }

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }


    }
    public  void addJoke() {
        //CloseableHttpClient client = HttpClients.createDefault();
        try {
            URI uri = new URIBuilder("https://v2.jokeapi.dev/").addParameter("formatVersion","3").build();

//            URI uri = new URIBuilder("https://v2.jokeapi.dev/{\n" +
//                    "    \"formatVersion\": 3,\n" +
//                    "    \"category\": \"Misc\",\n" +
//                    "    \"type\": \"single\",\n" +
//                    "    \"joke\": \"A horse walks into a bar...\",\n" +
//                    "    \"flags\": {\n" +
//                    "        \"nsfw\": true,\n" +
//                    "        \"religious\": false,\n" +
//                    "        \"political\": true,\n" +
//                    "        \"racist\": false,\n" +
//                    "        \"sexist\": false,\n" +
//                    "        \"explicit\": false\n" +
//                    "    },\n" +
//                    "    \"lang\": \"en\"\n" +
//                    "}").build();
//            //HttpGet request = new HttpGet(uri);
            HttpPost request = new HttpPost(uri);

            CloseableHttpResponse response=  client.execute(request);
            String json = EntityUtils.toString( response.getEntity());
            ResponseJokeApi responce = new ObjectMapper().readValue(json, ResponseJokeApi.class);

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    public void getMath(String number) {
        try {
            URI uri = new URIBuilder("http://numbersapi.com/"+number+"/math").build();
            HttpGet request = new HttpGet(uri);
            CloseableHttpResponse response = client.execute(request);
            String json = EntityUtils.toString(response.getEntity());
            //ResponseMathApi responce = new ObjectMapper().readValue(json, ResponseMathApi.class);
            System.out.println(json);

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }


    }
}