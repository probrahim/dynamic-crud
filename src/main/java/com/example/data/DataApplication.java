package com.example.data;

import com.example.data.enitys.Userinfo;
import com.example.data.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DataApplication implements CommandLineRunner {
	@Autowired
	private UserinfoService userinfoService;
	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		try {
			// Récupérer et afficher tous les utilisateurs
			List<Userinfo> users = userinfoService.getAllUsers();
			users.forEach(user -> {
				System.out.println("ID : " + user.getId());
				System.out.println("Email : " + user.getEmail());
				System.out.println("Name : " + user.getName());
				System.out.println("Phone : " + user.getPhone());
				System.out.println(); // Ajoutez une ligne vide pour séparation
			});
		} catch (Exception e) {
			System.err.println("Une erreur inattendue s'est produite : " + e.getMessage());
		}
	}

}

