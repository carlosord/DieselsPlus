package ${package};

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JustLoadHibernate {

	public static void main(String[] args) {
		// Fuerza a que se cargen los parámetros de configuración y 
		// se analizen todos los mapeos y si procede se crea la BDD
		
		EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("");
		
		emf.close();
		
		System.out.println("--> Si no hay excepciones el mapeo es correcto");
	}

}