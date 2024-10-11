package Parte1;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        // try (BufferedWriter escritor = new BufferedWriter(new FileWriter("test.txt",
        // true))) {
        // escritor.write("\n ***Nueva linea***");

        // } catch (Exception e) {
        // System.out.println("Error" + e);
        // }

        try (BufferedReader Lector = new BufferedReader(new FileReader("test.txt"))) {
            String linea;
            StringBuilder sb=new StringBuilder();
            while ((linea=Lector.readLine())!=null){
                sb.append(linea).append("\n");

            }
            System.out.println(sb.toString());

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
