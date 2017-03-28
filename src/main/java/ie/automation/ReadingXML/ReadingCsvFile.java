package ie.automation.ReadingXML;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCsvFile {

    public static void main(String[] args) {

        String csvFile = "C:\\Users\\sonuk\\workspace\\ReadingXML\\src\\main\\java\\ie\\automation\\Resource\\text.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}