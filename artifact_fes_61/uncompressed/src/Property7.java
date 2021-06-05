public class Property7 extends Property {

    public void check(String e){
        if(currentState==-1&&(e.equals("30")||e.equals("31"))){
            currentState = 0;
        }
        long startTime = System.nanoTime();
        if(currentState == 0 ){
            if(e.equals("30")){
                currentState = 0;
            }
            else if(e.equals("31")){
                currentState = 2;
            }

        }
        else if(currentState == 2){
            if(e.equals("31")){
                currentState = 2;
            }
            else if(e.equals("30")){
                currentState = 1;
            }

        }

        long endtime = System.nanoTime();
        timeElapsed+=endtime-startTime;

    }

    @Override
    public boolean getVal() {
        return  currentState ==1;
    }


}
