package com.company;

public class Main {

    public static void main(String[] args) {
        final int MAXCURSISTEN = 3;
        String[] namen = {"Karen", "Kristel", "Kathleen", "Josje"};
        Cursus c = new Cursus(MAXCURSISTEN);
        try{
            for(String naam: namen){
                c.addCursist(naam);
            }
        }catch(IllegalArgumentException ex){
            System.out.println("Foutmelding: " + ex.getMessage());
        }
        System.out.println("De cursisten:");
        for(int i=0;i<c.getAantalCursisten();i++){
            System.out.println(c.getCursist(i));
        }
        System.out.println("test op ongeldige index voor opvragen");
        try{
            System.out.printf(c.getCursist(MAXCURSISTEN));
        }catch(IllegalArgumentException ex){
            System.out.println("Foutmelding: " + ex.getMessage());
        }
        System.out.println("Test op verwijderen cursist");
        c.verwijderCursist(namen[1]);
        for(int i=0;i<c.getAantalCursisten();i++){
            System.out.println(c.getCursist(i));
        }
        System.out.println("Test op verwijderen onbestaande cursist");
        try {
            c.verwijderCursist(namen[1]);
        }catch(IllegalArgumentException ex){
            System.out.println("Foutmelding: " + ex.getMessage());
        }
    }

    // write your code here
    }

