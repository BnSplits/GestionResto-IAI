package org.bnsplits;

import com.formdev.flatlaf.FlatDarkLaf;
import org.bnsplits.util.DatabaseConnection;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        // Appliquer le thème sombre de FlatLaf
        FlatDarkLaf.setup();
        System.out.println("Hello World");

        JFrame frame = new JFrame("Gestion Restoration");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setVisible(true);
    }
}