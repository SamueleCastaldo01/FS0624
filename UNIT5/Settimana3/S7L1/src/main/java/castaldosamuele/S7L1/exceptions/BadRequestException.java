package castaldosamuele.S7L1.exceptions;

public class BadRequestException extends RuntimeException {
	public BadRequestException(String msg) {
		super(msg);
	}
}
