public class Property6 extends Property {
    public void check(String e) {
        if (currentState == -1 && (e.equals("15") || e.equals("16") || e.equals("17") || e.equals("18") || e.equals("19"))) {
            currentState = 0;
        }
        long startTime = System.nanoTime();

        if (currentState == 0) {
            if (e.equals("15") || e.equals("16") || e.equals("17") || e.equals("19")) {
                currentState = 0;
            } else if (e.equals("18")) {
                currentState = 1;
            }

        } else if (currentState == 1) {
            if (e.equals("15") || e.equals("16") || e.equals("17") || e.equals("19")) {
                currentState = 999;
            } else if (e.equals("18")) {
                currentState = 1;
            }

        }

        long endtime = System.nanoTime();
        timeElapsed += endtime - startTime;

    }

    @Override
    public boolean getVal() {
        return currentState == 0 || currentState == 1;
    }



}
