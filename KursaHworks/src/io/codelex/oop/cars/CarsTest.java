package io.codelex.oop.cars;

import java.util.List;

public class CarsTest {
    public static void main(String[] args) {
        Manufacturer bMW = new Manufacturer("Bayern Motor Works AG",
                1916, "Germany");
        Manufacturer volksWagen = new Manufacturer("Volkswagen AG",
                1937, "Germany");
        Manufacturer audi = new Manufacturer("Audi AG",
                1909, "Germany");
        Manufacturer toyota = new Manufacturer("Toyota Motor Corporation",
                1937, "Japan");
        Manufacturer mitsubishi = new Manufacturer("Mitsubishi Motors Corporation",
                1970, "Japan");
        Manufacturer ford = new Manufacturer("Ford Motor Company",
                1903, "USA");
        Manufacturer citroen = new Manufacturer("Citroën",
                1919, "France");
        Manufacturer renault = new Manufacturer("Renault",
                1899, "France");
        Manufacturer alfaRomeo = new Manufacturer("Alfa Romeo Automobiles",
                1910, "Italy");
        Manufacturer fiat = new Manufacturer("Fiat Automobiles",
                1899, "Italy");
        Manufacturer volvo = new Manufacturer("Volvo cars",
                1927, "Sweden");
        Manufacturer skoda = new Manufacturer("Škoda Auto",
                1927, "Czech Republic");
        Manufacturer eurocar = new Manufacturer("Eurocar PrJSC",
                2000, "Ukraine");

        List<Manufacturer> bmwE34List = List.of(new Manufacturer[]{bMW, ford});
        Car bmwE34 = new Car("BMW", "E34", 5213,
                1991, Engine.V8, bmwE34List);
        CarService.addCarToList(bmwE34);
        System.out.println(bmwE34);

        List<Manufacturer> fordTaurusList = List.of(new Manufacturer[]{ford, skoda, volksWagen});
        Car fordTaurus = new Car("Ford", "Taurus", 3323,
                2002, Engine.V6, fordTaurusList);
        CarService.addCarToList(fordTaurus);
        System.out.println(fordTaurus);

        List<Manufacturer> fordExplorerist = List.of(new Manufacturer[]{ford, fiat, bMW});
        Car fordExplorerTrac = new Car("Ford", "Explorer Sport Trac", 9263,
                2009, Engine.V8, fordExplorerist);
        CarService.addCarToList(fordExplorerTrac);
        System.out.println(fordExplorerTrac);

        List<Manufacturer> skodaFabiaList = List.of(new Manufacturer[]{skoda, eurocar});
        Car skodaFabia = new Car("Skoda Fabia ", "1.2 MPI 6V", 4102,
                2002, Engine.V6, skodaFabiaList);
        CarService.addCarToList(skodaFabia);
        System.out.println(skodaFabia);

        List<Manufacturer> audiS4List = List.of(new Manufacturer[]{audi, volksWagen});
        Car audiS4 = new Car("Audi", "S4 (B6) Avant", 8843,
                2004, Engine.S4, audiS4List);
        CarService.addCarToList(audiS4);
        System.out.println(audiS4);

        List<Manufacturer> toyotaCamryList = List.of(new Manufacturer[]{toyota, mitsubishi});
        Car toyotaCamry = new Car("Toyota", "Camry", 17842,
                2018, Engine.S3, toyotaCamryList);
        CarService.addCarToList(toyotaCamry);
        System.out.println(toyotaCamry);

        CarService.removeCarFromList(fordTaurus);
        CarService.removeCarFromList(skodaFabia);

        CarService.printList();

        CarService.addCarToList(fordTaurus);
        CarService.addCarToList(skodaFabia);

        System.out.println("Cars that use V8:");
        System.out.println(CarService.getListOfCarsByEngine(Engine.V8));

        System.out.println("Cars that were produced before 1999:");
        System.out.println(CarService.getCarsProducedBefore(1999));

        System.out.println("Most expensive car:");
        System.out.println(CarService.getMostExpensive());

        System.out.println("Cheapest car:");
        System.out.println(CarService.getCheapest());

        System.out.println("Cars with at least 3 manufacturers:");
        System.out.println(CarService.carsWithNumManufact(3));

        System.out.println("Ascending Cars:");
        System.out.println(CarService.sorted(Comparator.ASCENDING));

        System.out.println("Descending Cars:");
        System.out.println(CarService.sorted(Comparator.DESCENDING));

        System.out.println("Specific car:");
        System.out.println(CarService.isPresentInList(bmwE34));

        System.out.println("Cars by Ford");
        System.out.println(CarService.carsProducedBy(ford));

        System.out.println("By manufacture year");
        System.out.println(CarService.manufactByYOE(Comparator.LESS_OR_EAQUAL_TO, 1920));

    }
}
