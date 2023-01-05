package db;

//para tratar integridade referencial (quando delete apaga um valor utilizado em outra tabela)
public class DbIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String msg) {
		super(msg);
	}
}