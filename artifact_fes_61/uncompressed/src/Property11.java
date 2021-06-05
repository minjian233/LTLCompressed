public class Property11 extends Property{

    public void check(String e){
        if (currentState == -1 && (e.equals("13") || e.equals("14"))) {
            currentState = 0;
        }
        long startTime = System.nanoTime();
        if(currentState == 0 ){
            if(e.equals("13")){
                currentState = 1;
            }
            else if(e.equals("14")){
                currentState = 999;
            }
        }

        long endtime = System.nanoTime();
        timeElapsed+=endtime-startTime;

    }

    @Override
    public boolean getVal() {
        return currentState==1||currentState==2;
    }






}