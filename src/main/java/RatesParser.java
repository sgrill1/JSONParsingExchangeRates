import org.json.simple.JSONObject;

public class RatesParser{

    JSONObject rates;

    public RatesParser(String filePath){
        RatesFileReader ratesFileReader = new RatesFileReader(filePath);
        rates = ratesFileReader.getFullJSONFile();

    }
    //getters

    private Object getJSONvalue(String key){return rates.get(key);}

    public String getJSONSuccess(){return getJSONvalue("success").toString ();}
}
