package eBird;

public class eBirdAPI {
    public static final String URL  = "https://api.ebird.org/v2";
    public static final String JSON_SCHEMA = "src/test/resources/jsonSchema";
    public static final String RECENT_OBS = URL + "/data/obs/{regionCode}/recent";
    public static final String API_KEY = "q4cigmta8k96";
    public static final String RECENT_OBS_NOTABLE = URL + "/data/obs/{regionCode}/recent/notable";
    public static final String RECENT_OBS_SPECIES = URL + "/data/obs/{regionCode}/recent/{speciesCode}";
    public static final String RECENT_OBS_NEARBY = URL + "/data/obs/geo/recent?lat={lat}&lng={lng}";
}
