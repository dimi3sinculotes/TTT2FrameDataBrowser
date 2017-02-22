package FrameData;

import java.sql.*;
import java.util.ArrayList;

public class DeBdAArrayList{
  
    public static ArrayList<String> sacarDeBd(String codigoPer, String campos, String from, String where, String archivo, String move, boolean sfull){
      
    ArrayList<String> devolver = new ArrayList<String>();
    Connection c = null;
    Statement stmt = null;
    
    
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:" + archivo);
      c.setAutoCommit(false);
      //System.out.println("Opened database successfully");

      stmt = c.createStatement();
      // ResultSet rs = stmt.executeQuery( "SELECT INPUT, SPEED, BLOCK, HIT FROM MOVES WHERE CHAR_ID = 01;" );
      ResultSet rs = stmt.executeQuery( "SELECT " + campos + " FROM " + from + " WHERE( " + where + " = " + codigoPer + ") AND (" + move + ");" );
      
      while ( rs.next() ) {

        String  input  = rs.getString("input");
        String  speed  = rs.getString("speed");
        String  block  = rs.getString("block");
        String  hit    = rs.getString("hit");
         
        String level = rs.getString("level");
        String damage = rs.getString("damage");
        String chit = rs.getString("chit");
             
        devolver.add(input);
        if(sfull){devolver.add(level);}
        if(sfull){devolver.add(damage);}
        devolver.add(speed);
        devolver.add(block);
        devolver.add(hit);
        if(sfull){devolver.add(chit);}
        
          
      }
      rs.close();
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      //System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    //System.out.println("Operation done successfully");
    
    
    // Va a devolver el ArrayList devolver
    return devolver;
  }
}