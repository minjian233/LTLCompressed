public class Property12 extends Property {

    public void check(String e){

        if(currentState==-1&&(e.equals("44")||e.equals("45")||e.equals("46"))){
            currentState = 0;
        }
        long startTime = System.nanoTime();

        if(currentState == 0 ){
            if(e.equals("45")||e.equals("46")){
                currentState = 1;
            }
            else if(e.equals("44")){
                currentState = 0;
            }

        }

        long endtime = System.nanoTime();
        timeElapsed+=endtime-startTime;

    }

    @Override
    public boolean getVal() {
        return currentState==1;
    }



}