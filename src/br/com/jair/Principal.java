package br.com.jair;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Principal {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();

        animal.add("Pato");
        animal.add("Cachorro");
        animal.add("Gato");

        try {
            System.out.println(animal.get(2));
        }catch (Exception ex){
            System.out.println();
        }


    }
}
