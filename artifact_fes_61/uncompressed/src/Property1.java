import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Property1 extends Property {


    public void check(String e){

        long startTime = System.nanoTime();

        if(currentState==-1&&(e.equals("1")||e.equals("2")||e.equals("0"))){
            currentState = 0;
        }
        if(currentState == 0 ){
            if(e.equals("1") || e.equals("2")){
                currentState = 0;
            }
            else if(e.equals("0")){
                currentState = 2;
            }
        }
        else if(currentState == 1){
            if(e.equals("1")){
                currentState = 1;
            }
            else if(e.equals("0")){
                currentState = 2;
            }
            else if(e.equals("2")){
                currentState = 999;
            }
        }
        else if(currentState ==2){
            if(e.equals("0")||e.equals("2")){
                currentState = 2;
            }
            else if(e.equals("1")){
                currentState = 1;
            }

        }

        long endtime = System.nanoTime();
        timeElapsed+=endtime-startTime;

    }

    @Override
    public boolean getVal() {
        return currentState==0 || currentState ==1 || currentState==2;
    }


}
