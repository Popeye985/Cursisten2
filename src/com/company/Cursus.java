package com.company;

class Cursus{
    private int maxCursisten;
    private int aantalCursisten;
    private String[] cursisten;

    public Cursus(int maxCursisten) {
        this.maxCursisten = maxCursisten;
        cursisten = new String[maxCursisten];
    }
    public void addCursist(String naam){
        if (aantalCursisten == maxCursisten) throw new IllegalArgumentException("Maximum aantal cursisten bereikt");
        cursisten[aantalCursisten] = naam;
        aantalCursisten++;
    }
    public String getCursist(int index) {
        if (index >= aantalCursisten) throw new IllegalArgumentException("ongeldige index");
        return cursisten[index];
    }
    public int getAantalCursisten() {
        return aantalCursisten;
    }
    public void verwijderCursist(String naam){
        int index = indexOf(naam);
        if(index == -1) throw new IllegalArgumentException("Cursist niet gevonden");
        for(int i=index; i<cursisten.length-1;i++){
            cursisten[i] = cursisten[i+1];
        }
        aantalCursisten--;
    }
    private int indexOf(String naam){
        int index = -1;
        for(int i = 0; i< cursisten.length;i++){
            if (cursisten[i].equals(naam)){
                index = i;
                break;
            }
        }
        return index;
    }
}