package com.core.java.oop.encapsulation;

public class DatabaseConnector {
    int portNumber;
    String serverAddress;
    String protocol;

    // CONSTRUCTOR - Name is always same as class name
    // IS CALLED WHEN AN OBJECT IS CREATED USING new KEYWORD
    public DatabaseConnector(int port,String server,String p){
        this.portNumber = port;
        this.serverAddress = server;
        this.protocol = p;
        System.out.println("Connecting to database with parameters : ");
        System.out.println("PORT : "+port);
        System.out.println("SERVER : "+server);
        System.out.println("PROCOTOL : "+p);
    }

    // this.serverAddress uses the property value assigned from constructor
    public void fireQuery(String sqlQuery) {
        System.out.println("Executing Query "+sqlQuery+" On "+this.serverAddress);
    }

    public static void main(String[] args) {
        DatabaseConnector connector = new DatabaseConnector(3600, "mysqlhosting.com/abcd", "mysql:://");
        connector.fireQuery("SELECT * FROM Users");
    }

}
