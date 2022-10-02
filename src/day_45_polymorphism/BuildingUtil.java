package day_45_polymorphism;

import day41_exceptions.hiding.Run;

public class BuildingUtil {
    public static void main(String[] args) {

        House house1 = new House("Paris", 100_000_000, 10);

        Building house2 = new House("New York", 2_000_000, 4);

        HasBackyard house3 = new House("Seattle", 3_000_000, 5);

//        house3.pay(); invalid because the HasBackyard reference does not have visibility to this method

        house3.mowLawn();

        System.out.println(rent(house1));
        System.out.println(rent(new OfficeBuilding("Texas", 1230000, 4)));
        System.out.println(rent(new Apartment("Nevada", 1230002, 4)));

        System.out.println(search("FairFax"));
        System.out.println(search("McLean"));

    } // main method ends here

    /*
        create a class BuildingUtil

    create a static method Rent(Building obj)
        return: double
        parameters: Building type

        implementation:
            if the Building is House type return 1500
            if the Building is Apartment type return 800
            if the Building is OfficeBuilding type return 2000
    */

    public static double rent(Building building){

        if(building instanceof House){
            return 1500;
        } else if(building instanceof Apartment){
            return 800;
        } else if(building instanceof OfficeBuilding){
            return 2000;
        } else {
            return -1;
        }
    }


    /*
    create a static method search(String location)
        return: Building
        parameters: String location

        implementation
            if the location is Great Falls return a House object with:
                location: Great Falls
                price: 500_000
                number of residents: 4

            if the location is FairFax return a Apartment object with:
                location: FairFax
                price: 250_000
                month for lease: 6

            if the location is McLean return a OfficeBuilding object with:
                location: McLean
                price: 2_000_000
                number of floors: 6

    Run the methods in a main method to test them out
     */

    public static Building search(String location){
        if(location.equals("Great Falls")){
            return new House("Great Falls", 500_000, 4);
        } else if(location.equals("FairFax")){
            return new Apartment("FairFax", 250_000, 6);
        } else if(location.equals("McLean")){
            return new OfficeBuilding("McLean", 2_000_000, 6);
        }

        return null;
    }

}
