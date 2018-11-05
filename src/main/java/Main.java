public class Main{

    public static void main(String[] args) {
        RatesFileReader ratesFileReader = new RatesFileReader("resources/rates.json");
        RatesParser ratesParser = new RatesParser ("resources/rates.json");
        System.out.println(ratesFileReader.getFullJSONFile());
        System.out.println(ratesParser.getJSONSuccess());



    }

}
