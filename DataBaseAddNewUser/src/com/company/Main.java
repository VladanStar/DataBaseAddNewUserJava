package com.company;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        Baza.addUser(new User("Slobodan", "Burovic", "Zlatiborska 12", "0643081165", 47));
    }
}
