package ejercicio4;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ejercicio4.dao.ContratoDAO;
import ejercicio4.entity.Contrato;

public class Main {
	private static final Logger logger = LogManager.getLogger(ContratoDAO.class);
	
	public static void main(String[] args) {
		Main ejer1 = new Main();
		ContratoDAO userDao = new ContratoDAO();
		
		//Insertar usuario
		userDao.insertarUsuario(
				new Contrato( 1,"a", "A", "1A", new Date())
		);
		userDao.insertarUsuario(
				new Contrato( 2,"b", "A", "1A", new Date())
		);
		userDao.insertarUsuario(
				new Contrato( "c", "A", "1A", new Date())
		);
		
		
//		ejer1.parte1(userDao);
//		ejer1.parte2(userDao);
//		ejer1.parte3(userDao);
//		ejer1.parte4(userDao);
//		ejer1.parte5(userDao);
		
	}

	public void parte1 (UserDao userDao) {
		List<UserEntity> usuarios = userDao.getUsers();
		logger.info("Empieza");
		for (UserEntity userEntity : usuarios) {
			logger.info(userEntity);
		}
		logger.info("Termina");
	}

	public void parte2 (UserDao userDao) {
		List<UserEntity> usuariosName= userDao.getUsersByName("NOMBRE");
		logger.info("Empieza");
		for (UserEntity userEntity : usuariosName) {
			logger.info(userEntity);
		}
		logger.info("Termina");
	}
	
	public void parte3 (UserDao userDao) {
		Date fecha = UtilsFecha.generaFechaMenosDias(10);
		
		List<UserEntity> usuariosDate= userDao.getUsersByDate(fecha);
		logger.info("Empieza date");
		for (UserEntity userEntity : usuariosDate) {
			logger.info(userEntity);
		}
		logger.info("Termina");
	}
	
	
	public void parte4 (UserDao userDao) {
		String nombre = Utilidades.pideDatoTexto("Escribe nombre: ");
		userDao.borrarUsuarioPorNombre(nombre);
		logger.info("Termina borrar usuarios");
	}

	public void parte5 (UserDao userDao) {
		String dni = Utilidades.pideDatoTexto("Escribe dni: ");

		userDao.modificarUsuarioPorDni(dni, 
				new UserEntity( "N", "A", "1A", new Date()));
		logger.info("Termina modificar usuario");
	}
	
	
	
	
}
