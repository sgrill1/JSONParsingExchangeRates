# JSONParsingExchangeRates

* Parsing information from a .json file into a JSON Object and then accessing the information

## How it works

### RatesFileReader.java

* The rates file reader class uses a File Reader Object to read the file from a given file path
* The JSONParser object creates a POJO called ratesObj 
* This is then casted to a JSON object
* There is then a getter to access the full JSON Object

### RatesParser

* The RatesParser has a constructor that then creates the full JSON Object called rates using this getter
* The RatesParser has a private method called getRatesJSONObject. This method returns an object and casts it to an JSON Object. This returns only the exchange rates information from the file as a JSONObject
* There is then a public method called getRates that allows you to access each individual rate by it's key and returns a double. In this case the key is the alpha-3 code for that country i.e. GBR for the United Kingdom or USA for the United States.

