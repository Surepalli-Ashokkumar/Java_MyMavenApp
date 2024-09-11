package com.cisco.demo.MyMavenApp;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  //System.out.println( "Hello World!" );
    	
    	Connection conn=DBConfig.getConnections();
    	
    	if(conn!=null) {
    		System.out.println("Connections Established");
    	}else {
    		System.out.println("Error While Connecting");
    	}
    }
}
