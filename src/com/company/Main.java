package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\PENTAGON\\IdeaProjects\\Praksa\\dan2praksa8zad\\primer9.txt"));
                BufferedReader reader = new BufferedReader(fileReader);
                Map<String, String> map = new HashMap<>();
                String kredencijali;
                while((kredencijali = fileReader.readLine()) != null) {
                    String[] kredencijaliArray = kredencijali.split("\\|");
                    map.put(kredencijaliArray[0], kredencijaliArray[1]);
                }
                while(true){
                    System.out.println("Unesite korisnicko ime za proveru:");
                    String korisnickoIme = reader.readLine();
                    System.out.println("Unesite lozinku za proveru:");
                    String lozinka = reader.readLine();
                    for(String ime : map.keySet()){
                        if(ime.equals(korisnickoIme) && map.get(ime).equals(lozinka)){
                            System.out.println("Uspesno ste se prijavili.");
                            reader.close();
                            fileReader.close();
                            return;
                        }
                    }
                    System.out.println("Pogresno ime/lozinka!");
                }
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
    }
