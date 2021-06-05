public class Property5 extends Property {

    public void check(String e){

        if(currentState==-1&&(e.equals("32")||e.equals("33"))){
            currentState = 0;
        }
        long startTime = System.nanoTime();
        if(currentState == 0 ){
            if(e.equals("33")){
                currentState = 0;
            }
            else if(e.equals("32")){
                currentState = 1;
            }
        }
        else if(currentState == 1){
            if(e.equals("33")){
                currentState = 0;
            }
            else if(e.equals("32")){
                currentState = 1;
            }

        }

        long endtime = System.nanoTime();
        timeElapsed+=endtime-startTime;

    }

    @Override
    public boolean getVal() {
        return currentState==0;
    }



}
