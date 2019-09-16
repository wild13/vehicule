package com.vehicule;

public class Hangar {

    public static void main( String[] args ) {
        Car astra = new Car( "Opel", 100 );
        Boat flybridge = new Boat( "Prestige", 1000 );

        System.out.println( astra.doStuff() );
        System.out.println( flybridge.doStuff() );
    }

}
