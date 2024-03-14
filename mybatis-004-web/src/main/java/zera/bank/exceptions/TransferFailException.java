package zera.bank.exceptions;

public class TransferFailException extends Exception{
    public TransferFailException() {
        super();
    }

    public TransferFailException(String message) {
        super(message);
    }
}
