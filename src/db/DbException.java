package db;

//substitui SQLException diminuindo quantidade de try-catch no código
public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg);
	}
}
