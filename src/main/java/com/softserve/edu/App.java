package com.softserve.edu;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start...");
        //
        Connection con = null;
        String username = "postgres";
        String password = "root";
        String URL = "jdbc:postgresql://localhost:5432/";
        //String URL = "jdbc:postgresql://localhost:5432/test4";
        //
        con = DriverManager.getConnection(URL, username, password);
        if (con != null) {
            System.out.println("Connection Successful! \n");
        } else {
            System.out.println("Connection ERROR \n");
            System.exit(1);
        }
        Statement st = con.createStatement();
        //
        // Create Database
		//st.execute("CREATE DATABASE test4;");
        //
        // Drop
        String query = "Drop DATABASE test4;";
        //
        // PostGreSQL
        /*
        String query = "CREATE TABLE public.temp"
                + "( id integer NOT NULL,"
                + "name character varying(255),"
                + "login character varying(255),"
                + "password character varying(255),"
                + "age integer,"
                + "CONSTRAINT id_key PRIMARY KEY (id),"
                + "CONSTRAINT uniq UNIQUE (id));";
        */
        // Insert data
        //String query = "INSERT INTO temp (id,name,login,password,age) VALUES (1,'Petro','pet','123456',22);";
        //String query = "INSERT INTO temp (id,name,login,password,age) VALUES (2,'Ivan','iva','qwerty',21);";
        //
        // Update
        //String query = "UPDATE temp SET name='Ira' WHERE id=1;";
        //
        // Delete rows
        //String query ="DELETE FROM temp WHERE name='Ira';";
        //
        st.execute(query);
        //
        /*
        String query = "select * from temp;";
        ResultSet rs = st.executeQuery(query);
        //
        int columnCount = rs.getMetaData().getColumnCount();
        // Resultset.getMetaData() get the information
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rs.getMetaData().getColumnName(i) + "\t");
            //System.out.print(rs.getMetaData().getColumnLabel(i) + "\t");
        }
        System.out.println();
        //
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        System.out.println("before close");
        if (rs != null) {
            rs.close();
        }
        */
        //
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }
        System.out.println("DONE");
    }
}
