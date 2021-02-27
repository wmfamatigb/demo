package fr.ayoub.demo.demo.Util;

import java.util.Random;

public class RandomUtils {

    private static Random randGenerator = new Random();


    // TODO: generated values should not overlap
    public static Long getRandomLong(){
        return Math.abs( randGenerator.nextLong());
    }

}
