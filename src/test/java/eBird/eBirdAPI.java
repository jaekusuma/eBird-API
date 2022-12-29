package eBird;

public class eBirdAPI {
    public static final String URL  = "https://api.ebird.org/v2";
    public static final String JSON_SCHEMA = "src/test/resources/jsonSchema";
    public static final String RECENT_OBS = URL + "/data/obs/{regionCode}/recent";
    public static final String API_KEY = "q4cigmta8k96";
    public static final String RECENT_OBS_NOTABLE = URL + "/data/obs/{regionCode}/recent/notable";
    public static final String RECENT_OBS_SPECIES = URL + "/data/obs/{regionCode}/recent/{speciesCode}";
    public static final String RECENT_OBS_NEARBY = URL + "/data/obs/geo/recent?lat={lat}&lng={lng}";
    public static final String RECENT_OBS_SPECIES_NEARBY = URL + "/data/obs/geo/recent/{speciesCode}?lat={lat}&lng={lng}";
    public static final String RECENT_OBS_NEAREST = URL + "/data/nearest/geo/recent/{speciesCode}?lat={lat}&lng={lng}";
    public static final String RECENT_NEARBY_NOTABLE = URL + "/data/obs/geo/recent/notable?lat={lat}&lng={lng}";
    public static final String RECENT_CHECKLIST = URL + "/product/lists/{regionCode}";
    public static final String HISTORY_OBS_DATE = URL + "/data/obs/{regionCode}/historic/{y}/{m}/{d}";
    public static final String PRODUCT_TOP = URL + "/product/top100/{regionCode}/{y}/{m}/{d}";
    public static final String PRODUCT_CHECKLIST = URL + "/product/lists/{regionCode}/{y}/{m}/{d}";
    public static final String PRODUCT_STAT = URL +"/product/stats/{regionCode}/{y}/{m}/{d}";
    public static final String PRODUCT_SPESLIST = URL + "/product/spplist/{regionCode}";
    public static final String PRODUCT_VIEW_CHECKLIST = URL + "/product/checklist/view/{subId}";
}
