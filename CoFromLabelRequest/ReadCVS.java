
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCVS {

    public static void main(String[] args) {

        ReadCVS obj = new ReadCVS();
        obj.run();

    }

    public void run() {

        String csvFile = "\\testdata";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            String[] input = line.split(cvsSplitBy);

            System.out.println("Run the following cables: ");

            while ((line = br.readLine()) != null){

                // use comma as separator
                input = line.split(cvsSplitBy);
                if(input[0] != null){
                    System.out.println(input[0] + " from " + input[3] + " at " + input[2] + " to " + input[5] + " at " + input[4]);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
