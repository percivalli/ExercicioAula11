package br.com.jair;

import java.util.ArrayList;
import java.util.List;

public class Jair {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();

        try {

            animal.add("Pato");
            animal.add("Cachorro");
            animal.add("Gato");


            System.out.println(animal.get(5));
        } catch (IndexOutOfBoundsException | NullPointerException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }


    }
}
