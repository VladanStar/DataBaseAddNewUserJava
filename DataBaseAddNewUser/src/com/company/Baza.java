package com.company;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Baza {

    private static java.sql.Connection con = null;
    private static String url = "jdbc:mysql://localhost/korisnici";
    private static String username = "root";
    private static String password = "";

    public static void addUser(User user) {
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement st = (Statement) con.createStatement();
            st.execute("INSERT INTO users (ime,prezime,adresa,telefon,godina) "
                    + "" + "VALUES ('" + user.getIme() + "','" + user.getPrezime() +
                    "','" + user.getAdresa() + "','" + user.getTelefon() +
                    "'," + user.getGodine() + ")");
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}