package eBird;

public class eBirdAPI {
    public static final String URL  = "https://api.ebird.org/v2";
    public static final String JSON_SCHEMA = "src/test/resources/jsonSchema";
    public static final String RECENT_OBS = URL + "/data/obs/{regionCode}/recent";
    public static final String API_KEY = "X-eBirdApiToken: q4cigmta8k96";
}
