import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterdFile {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            String location = "C://Users//gabriela.guayara//Downloads//cars.xlsx/";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<String[]>();
            while(input.hasNextLine()){
                String Line = input.nextLine();
                String[] splitedLine = Line.split(",");
                data.add(splitedLine);
            }
            for(String[] line : data){
                System.out.println("Car Name: " + line[0]);
                System.out.println("MPG: "+ line[1]);
                System.out.println("Cylinder: " + line[2]);
                System.out.println("Displacement: "+ line[3]);
                System.out.println("Horsepowe: "+line[4]);
                System.out.println("Weight: " + line[5]);
                System.out.println("Acceleration: " + line[6]);
                System.out.println("Model: " + line[7]);
                System.out.println("Origin: " +line[8]);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}
