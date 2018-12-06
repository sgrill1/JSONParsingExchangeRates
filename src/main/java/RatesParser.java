import org.json.simple.JSONObject;

public class RatesParser{

    JSONObject rates;

    public RatesParser(String filePath){
        RatesFileReader ratesFileReader = new RatesFileReader(filePath);
        rates = ratesFileReader.getFullJSONFile();

    }

    // private Object getJSONvalue(String key){return rates.get(key);}
    
    private JSONObject getRatesJSONObject(){return (JSONObject) rates.get("rates");}

    //getters
    public double getRate(String rateKey){return(Double) getRatesJSONObject().get(rateKey);}
    
    public String getJSONSuccess(){return getJSONvalue("success").toString();}
}
