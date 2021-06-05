public class Property8 extends Property {

    public void check(String e){
        if (currentState == -1 && (e.equals("24") || e.equals("25") || e.equals("26") || e.equals("27") || e.equals("28")||e.equals("29"))) {
            currentState = 0;
        }
        long startTime = System.nanoTime();
        if(currentState == 0 ){
            if(e.equals("24") || e.equals("25") || e.equals("26") || e.equals("27")){
                currentState = 3;
            }
            else if(e.equals("28")||e.equals("29")){
                currentState = 999;
            }

        }
        else if(currentState == 1){
            if(e.equals("28")){
                currentState = 2;
            }
            else if(e.equals("29")){
                currentState = 3;
            }
            else if (e.equals("24") || e.equals("25") || e.equals("26") || e.equals("27")){
                currentState = 999;
            }

        }
        else if(currentState ==2){
            if (e.equals("24") || e.equals("25") || e.equals("26") || e.equals("27")||e.equals("29")){
                currentState = 999;
            }
        }
        else if(currentState==3){
            if (e.equals("24") || e.equals("25") || e.equals("26") || e.equals("27")||e.equals("28")){
                currentState = 999;
            }
        }


        long endtime = System.nanoTime();
        timeElapsed+=endtime-startTime;

    }

    @Override
    public boolean getVal() {
        return currentState==2 || currentState ==3;
    }



}
