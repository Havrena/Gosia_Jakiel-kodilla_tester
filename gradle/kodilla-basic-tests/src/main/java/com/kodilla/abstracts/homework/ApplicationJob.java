package com.kodilla.abstracts.homework;

public class ApplicationJob {
    public static void main(String[] args) {
        Job vet = new Vet(10000);
        Job fireman = new Fireman(8000);

        Person marchewka = new Person("Marchewska",37,vet);
        Person iskra = new Person("Iskra",22,fireman);

        marchewka.getResponsibilities();
        iskra.getResponsibilities();
    }
}
