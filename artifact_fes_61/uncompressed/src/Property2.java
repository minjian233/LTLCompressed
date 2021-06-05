public class Property2 extends Property {


    public void check(String e){

        long startTime = System.nanoTime();
        if(currentState==-1&&(e.equals("34")||e.equals("35")||e.equals("36"))){
            currentState = 0;
        }
        if(currentState == 0 ){
            if(e.equals("35")){
                currentState = 0;
            }
            else if(e.equals("34")){
                currentState = 1;
            }
            else if(e.equals("36")){
                currentState = 999;
            }
        }
        else if(currentState == 1){
            if(e.equals("35")||e.equals("36")){
                currentState = 0;
            }
            else if(e.equals("34")){
                currentState = 1;
            }

        }

        long endtime = System.nanoTime();
        timeElapsed+=endtime-startTime;

    }

    @Override
    public boolean getVal() {
        return currentState==0 || currentState ==1;
    }



}
