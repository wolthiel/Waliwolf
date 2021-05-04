import java.util.Scanner;
import java.io.PrintWriter;

public class histogram {
    
     private static final String OUTPUT_LOCATION = "LOCATION";
     private static final int SCALING_FACTOR = 100;
    
    public static void main(String[] args) 
    {
        File selectedFile = TextParser.openFileSelector();

        File inputFile = new File (inputFileName);
        Scanner in = new Scanner (inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        try{
            Map<Character, Integer> dict = TextParser.parseFile(selectedFile);
            geberateHistogram(dict, true);
            } catch (IOException e) {
                e.printStack();
                }
    
        }
        
    }
    private static void generateHistogram(Map<Character, Integer> dict, boolean addSeperator) throws IOException{


    }
    
}
