class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

class Voter {
    String name;
    int age;

    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class VoterValidator {
    public void validate(Voter voter) throws InvalidVoterAgeException {
        if (voter.age < 18 || voter.age > 135) {
            throw new InvalidVoterAgeException("Invalid voter age: " + voter.age);
        } else {
            System.out.println(voter.name + " is a valid voter.");
        }
    }
}

public class Election {
    public static void main(String[] args) {
        Voter voter1 = new Voter("John Doe", 25);
        Voter voter2 = new Voter("Jane Doe", 150);

        VoterValidator validator = new VoterValidator();

        try {
            validator.validate(voter1);
            validator.validate(voter2);
        } catch (InvalidVoterAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
