import org.json.simple.JSONObject;

public class RatesParser{

    JSONObject rates;

    public RatesParser(String filePath){
        RatesFileReader ratesFileReader = new RatesFileReader(filePath);
        rates = ratesFileReader.getFullJSONFile();

    }

    private Object getJSONvalue(String key){return rates.get(key);}

    //getters
    public String getJSONSuccess(){return getJSONvalue("success").toString();}

    private JSONObject getRatesJSONObject(){return (JSONObject) rates.get("rates");}

    public double getRate(String rateKey){return(Double) getRatesJSONObject().get(rateKey);}
}
