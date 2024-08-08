package controller;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import dao.ImageDao;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		
		ImageDao.insert();

	}

}
