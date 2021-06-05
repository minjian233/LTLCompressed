import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String args[]) throws IOException {
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


        String path = filename;
        BufferedReader bf = new BufferedReader(new FileReader(path));

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



        }




}
