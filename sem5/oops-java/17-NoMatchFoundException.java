class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CityCheck {
    public static void main(String[] args) {
        String[] cities = {"Kolkata", "Chennai", "Mumbai", "Delhi", "Bangalore", "Ahmedabad"};
        boolean found = false;

        for (String city : cities) {
            if (city.equalsIgnoreCase("Kolkata")) {
                found = true;
                break;
            }
        }

        try {
            if (!found) {
                throw new NoMatchFoundException("Kolkata not found in the list.");
            } else {
                System.out.println("Kolkata is in the list.");
            }
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
