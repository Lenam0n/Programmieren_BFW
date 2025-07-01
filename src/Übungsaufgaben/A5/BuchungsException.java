package Übungsaufgaben.A5;

/**
 * Wird geworfen, wenn bei der Sitzbuchung etwas schiefgeht.
 */
public class BuchungsException extends Exception {
    public BuchungsException(String message) {
        super(message);
    }
}
