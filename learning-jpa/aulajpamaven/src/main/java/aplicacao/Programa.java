package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.*;

public class Programa {

	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");// instanciando o banco
		EntityManager em = emf.createEntityManager();
//		
//		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
//		Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquim@gmail.com");
//		Pessoa p3 = new Pessoa(3, "Ana Maria", "ana@gmail.com");
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		
//		em.getTransaction().begin(); // iniciando transacao com bd
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit(); // confirmar alterações no bd
				
		Pessoa p = em.find(Pessoa.class, 2); //monitorada
		em.getTransaction().begin(); // iniciando transacao com bd
		em.remove(p);
		em.getTransaction().commit(); // confirmar alterações no bd
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
