package capgemini.exam;

import java.util.*;


public class Wipro {

    public static int calculateDistance(String updatedPlanetDistance){

        char[] planets = updatedPlanetDistance.toCharArray();
        int distance = 0;

        for(int i=0; i<planets.length-1; i++){
            if(planets[i] == planets[i + 1]){
                distance += 2;

            }else{
                distance += 1;
            }
        }
        return distance;
    }

    public static void main(String args[] ) throws Exception {


        Scanner inputScan = new Scanner(System.in);

        int[] firstLine = new int[2];
        for (int i =0; i<=1 ; i++){
            firstLine[i] = inputScan.nextInt();
        }

        int numberOfPlanet = firstLine[0];
        int numberOfQueries = firstLine[1];

        String typeOfPlanet =  inputScan.next();
        char[] planets = typeOfPlanet.toCharArray();

        if(numberOfPlanet != planets.length)
            return;

        int[] xthPlanet = new int[numberOfQueries];

        for(int i=0; i<numberOfQueries; i++){
            xthPlanet[i] = inputScan.nextInt();
        }

        for(int i = 0; i< xthPlanet.length; i++){

            int updateLocation = xthPlanet[i];
            char planet = planets[updateLocation-1];
            char updatedPlanet =  planet == '0' ? '1' : '0';
            planets[updateLocation-1] = updatedPlanet;
            int distance = calculateDistance(String.valueOf(planets));
            System.out.println(distance);

        }
    }
}

