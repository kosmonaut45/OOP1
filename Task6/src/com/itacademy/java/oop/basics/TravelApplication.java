package com.itacademy.java.oop.basics;

public class TravelApplication {

    public static void main(String[] args) {

        Person jonas = new Person("Jonas", "Jonauskas", "vyras", 35);
        Person janina = new Person("Janina", "Jonauskienė", "moteris", 34);
        Person rimas = new Person("Rimas", "Jonauskas", "vyras", 12);
        Person tomas = new Person("Tomas", "Radzevičius", "vyras", 45);
        Person birute = new Person("Birutė", "Radzevičienė", "moteris", 50);
        Vehicle audiA6 = new Vehicle("A6", "Audi", 50, 8);
        Vehicle audiA5 = new Vehicle("A5", "Audi", 35, 10);
        TravelDestination vilnius = new TravelDestination("Senamiestis", "Vilnius", 80);
        TravelDestination panevezys = new TravelDestination("Akropolis", "Panevėžys", 150);
        TravelDestination ryga = new TravelDestination("Nacionaliins teatras", "Ryga", 370);
        Family jonauskai = new Family(new Person[]{jonas, janina, rimas}, audiA6, vilnius);
        Family radzeviciai = new Family(new Person[]{tomas, birute}, audiA5, ryga);

        TravelManager.travel(jonauskai);
        TravelManager.travel(radzeviciai);
        TravelManager.changeDestination(radzeviciai, panevezys);
        TravelManager.travel(radzeviciai);
        TravelManager.printFamilyMembers(jonauskai);
        TravelManager.printFamilyMembers(radzeviciai);
        
    }

    public static class TravelManager {

        private static void changeDestination(Family family, TravelDestination destination) {
            if (!(family.getTravelDestination() == destination)) {
                family.setTravelDestination(destination);
            }

        }

        private static void travel(Family family) {
            if (isTravelPossible(family.getVehicle(), family.getTravelDestination())) {
                System.out.println("Šeima sėkmingai nukeliavo į kelionės tikslą: " + family.getTravelDestination().getCity());
            } else {
                System.out.println("Norėdama sėkmingai įveikti kelionę šeima turi užsipilti dar " +
                        fuelNeeded(family.getVehicle(), family.getTravelDestination()) + " litrus kuro");
            }

        }

        private static void printFamilyMembers(Family family) {
            System.out.println("Šeimą sudaro: ");
            for (Person member : family.getPeople()) {
                System.out.println(member.getName() + " " + member.getSurname());
            }
        }

        private static boolean isTravelPossible(Vehicle vehicle, TravelDestination travelDestination) {

            double ratio = (double) travelDestination.getDistance() / 100;
            return !(ratio * vehicle.getConsumption() >= vehicle.getFuel());
        }

        private static double fuelNeeded(Vehicle vehicle, TravelDestination travelDestination) {
            double ratio = (double) travelDestination.getDistance() / 100;
            return Math.abs(vehicle.getFuel() - ratio * vehicle.getConsumption());
        }

    }
}


