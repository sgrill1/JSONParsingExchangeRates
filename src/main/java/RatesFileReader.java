//JSON imports
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
//Exception Handling
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RatesFileReader {

    JSONObject fullJSONFile = new JSONObject();

    public RatesFileReader(String filePath){
        try {
            FileReader ratesJsonFile = new FileReader(filePath);
            JSONParser parser = new JSONParser();
            Object ratesObj = parser.parse(ratesJsonFile);
            fullJSONFile = (JSONObject) ratesObj;


        } catch (FileNotFoundException e ) {
            e.printStackTrace ();
        } catch (ParseException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
    public JSONObject getFullJSONFile(){
        return fullJSONFile;
    }
}
