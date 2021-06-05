package LTL;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pair {

    String symbol;

    String suffix;

    Pair(String suffix, String symbol){

        this.suffix = suffix;

        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){

            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) { return false; }

        Pair pair =  (Pair) obj;

        return this.suffix.equals(pair.suffix)&& this.symbol.equals(pair.symbol);}

    @Override
    public int hashCode(){

        int prime = 37;

        int result = 1;

        result = result*prime + suffix.hashCode();

        result = result*prime + symbol.hashCode();

        return result;

    }
    @Override
    public String toString(){

        String res = "The symbol is "+symbol;

        res+=" "+suffix;
        return res;

    }


}
