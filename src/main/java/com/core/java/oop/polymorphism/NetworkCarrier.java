package com.core.java.oop.polymorphism;

public class NetworkCarrier {
    String type;
    String subscriber;

    public void connectToNetwork() {
        System.out.println("Connected to network type "+type+" for "+subscriber);
    }

    public void connectToNetwork(int frequency) {
        if(frequency > 3000 && frequency < 4999) {
            type = "4G";
            System.out.println("Connected to network type "+type+" for "+subscriber);
        }else if(frequency > 5000) {
            type = "5G";
            System.out.println("Connected to network type "+type+" for "+subscriber);
        }
    }

    public static void main(String[] args) {
        NetworkCarrier carrier = new NetworkCarrier();
        carrier.subscriber = "Airtel";
        carrier.type = "3G";
        carrier.connectToNetwork(5600);
    }
}
