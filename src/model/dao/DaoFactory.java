package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

//padrão factory: forma de fazer injeção de independência sem explicitar implementação: retorna interface, mas instancia implementação.
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}