public class Property10 extends Property{

    public void check(String e){
        if (currentState == -1 && (e.equals("20") || e.equals("21") || e.equals("22") || e.equals("23"))) {
            currentState = 0;
        }
        long startTime = System.nanoTime();
        if(currentState == 0 ){
            if(e.equals("20")){
                currentState = 1;
            }
            else if(e.equals("21") || e.equals("22") || e.equals("23")){
                currentState = 999;
            }
        }
        else if(currentState == 1){
            if(e.equals("21")||e.equals("22")){
                currentState = 2;
            }
            else if(e.equals("20")||e.equals("23")){
                currentState = 999;
            }

        }
        else if(currentState == 2){
            if(e.equals("21")||e.equals("22")){
                currentState = 2;
            }
            else if(e.equals("20")||e.equals("23")){
                currentState = 999;
            }

        }

        long endtime = System.nanoTime();
        timeElapsed+=endtime-startTime;

    }

    @Override
    public boolean getVal() {
        return currentState==2;
    }






}