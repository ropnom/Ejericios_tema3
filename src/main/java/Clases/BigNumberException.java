package Clases;

public  class BigNumberException extends Exception {
    public BigNumberException(int num) {
        super("Error to parse INT. El Numero "+num+"es Superior a 1000");
    }
}