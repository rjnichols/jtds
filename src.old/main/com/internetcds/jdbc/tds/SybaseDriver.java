package com.internetcds.jdbc.tds;


import java.sql.*;
import java.util.*;
import com.internetcds.jdbc.tds.TdsException;



/**
 * @deprecated This class is no longer needed.  Use
 * com.internetcds.jdbc.tds.Driver for either Sybase or SQLServer
 * connections.
 */
public class SybaseDriver extends Driver
{
   public static final String cvsVersion = "$Id: SybaseDriver.java,v 1.1.1.1 2001-08-10 01:53:25 skizz Exp $";
   
   
   //
   // Register ourselves with the DriverManager
   //
   static
   {
      try {
         java.sql.DriverManager.registerDriver(new com.internetcds.jdbc.tds.Driver());
      }
      catch (SQLException E) {
         E.printStackTrace();
      }
   }

   /**
    * @deprecated This class is no longer needed.  Use
    * com.internetcds.jdbc.tds.Driver for either Sybase or SQLServer
    * connections.
    */
   public SybaseDriver()
      throws java.sql.SQLException
   {
      super();
   }
}
