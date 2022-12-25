package eBird;

import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import java.io.File;
import static org.hamcrest.CoreMatchers.*;
import static eBird.eBirdAPI.*;

public class action {
    public static void givenRegion(String regionCode){
        SerenityRest.given()
                .header("x-ebirdapitoken", API_KEY)
                .pathParam("regionCode",regionCode);
    }
    public static void givenRegionAndSpecies(String regionCode, String species){
        SerenityRest.given()
                .header("x-ebirdapitoken", API_KEY)
                .pathParam("regionCode",regionCode)
                .pathParam("speciesCode",species);
    }
    public static void givenRegionNearby(String lat, String lng){
        SerenityRest.given()
                .header("x-ebirdapitoken", API_KEY)
                .pathParam("lat",lat)
                .pathParam("lng",lng);
    }
    public static void whenSend(String send){
        SerenityRest.when().get(send);
    }
    public static void statusCode(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }
    public static void responBodyContains(String actual, String expected){
        SerenityRest.then().body(actual, hasItem(expected));
    }
    public static void jsonSchemaValidate(File json){
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
