package Clases;

public class BigNumberException extends Exception {
    public BigNumberException() {
        super("Error to parse INT. El Numero es Superior a 1000");
    }
}