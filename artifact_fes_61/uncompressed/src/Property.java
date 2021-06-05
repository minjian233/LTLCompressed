import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Property {


    long timeElapsed;

    int currentState;

    public Property() {

        timeElapsed = 0;
        //initially currentState is set to -1 since we require that the projected trace is non-empty.
        currentState = -1;

    }

    /**
     * running automaton against one event
     * @param e
     */
    abstract public void check(String e);

    /**
     * checking if the automaton is currently in a accepting state
     * @return
     */
    abstract public boolean getVal();




}
