import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws IOException {
        if(args[0].equals("-all")){
            String directory = args[1];
            File dir = new File(directory);
            String[] traces = dir.list();
            StringBuilder sb = new StringBuilder();
            sb.append("traceName,propertyId,timeEplased\n");
            for(int i = 0;i<traces.length;i++){
                for(int j = 0;j<13.;j++){
                    String[]arguments = new String[2];
                    arguments[0] = directory+"/"+traces[i];
                    arguments[1] = String.valueOf(j);
                    long timeElapsed = check(arguments);
                    sb.append(traces[i]);
                    sb.append(',');
                    sb.append(arguments[1]);
                    sb.append(',');
                    sb.append(String.valueOf(timeElapsed));
                    sb.append('\n');
                }
            }
            try (PrintWriter writer = new PrintWriter(new File(args[2]+"/uncompressedData.csv"))) {

                writer.write(sb.toString());

                System.out.println("output to uncompressedData.csv!");

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

        }
        else{
            check(args);
        }

    }

    public static long check(String args[]) throws IOException {

        String filename = args[0];
        String index = args[1];
        Property propertychecker=null;

         switch (index){

             case "0":propertychecker = new Property0();
             break;
             case "1":propertychecker = new Property1();
             break;
             case "2":propertychecker = new Property2();
             break;
             case "3":propertychecker = new Property3();
             break;
             case "4":propertychecker = new Property4();
             break;
             case "5":propertychecker = new Property5();
             break;
             case "6":propertychecker = new Property6();
             break;
             case "7":propertychecker = new Property7();
             break;
             case "8":propertychecker = new Property8();
             break;
             case "9":propertychecker = new Property9();
             break;
             case "10":propertychecker = new Property10();
             break;
             case "11":propertychecker = new Property11();
             break;
             case "12":propertychecker = new Property12();
             break;
         }


        
        BufferedReader bf = new BufferedReader(new FileReader(filename));

        String event = null;
        try {
            event = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(!(event==null)){
            propertychecker.check(event);
            event = bf.readLine();

        }

        bf.close();

        System.out.println(propertychecker.getVal()+" "+propertychecker.timeElapsed);

        return  propertychecker.timeElapsed;

        }




}
