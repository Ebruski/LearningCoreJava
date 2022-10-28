public class Test {

    public static void main(String[] args) {

        Passenger passenger = new Passenger();
        passenger.setFirstName("Ebruski");
        passenger.setLastName("Obigba");
        passenger.setId(123);

        Passenger passenger2 = new Passenger();
        passenger2.setFirstName("Ebruski");
        passenger2.setLastName("Obigba");
        passenger2.setId(123);

        System.out.println(passenger.equals(passenger2));


    }

}
