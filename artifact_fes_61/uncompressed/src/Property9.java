public class Property9 extends Property {

    public void check(String e){
        if(currentState==-1&&(e.equals("4")||e.equals("5")||e.equals("6"))){
            currentState = 0;
        }
        long startTime = System.nanoTime();
        if(currentState == 0 ){
            if(e.equals("5") || e.equals("6")){
                currentState = 0;
            }
            else if(e.equals("4")){
                currentState = 1;
            }
        }
        else if(currentState == 1){
            if(e.equals("5")){
                currentState = 1;
            }
            else if(e.equals("4")){
                currentState = 2;
            }
            else if(e.equals("6")){
                currentState = 999;
            }
        }
        else if(currentState ==2){
            if(e.equals("4")||e.equals("6")){
                currentState = 2;
            }
            else if(e.equals("5")){
                currentState = 1;
            }

        }
        long endtime = System.nanoTime();
        timeElapsed+=endtime-startTime;

    }

    @Override
    public boolean getVal() {
        return currentState==0 || currentState ==1||currentState ==2;
    }


}

