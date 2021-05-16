package ma.achraf.tpSpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.achraf.tpSpring.repositories.PatientRepository;

@SpringBootApplication
public class BackEndSpringApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackEndSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		  patientRepository.save(new Patient(null, "Achraf", new Date(), 234, false));
//		  patientRepository.save(new Patient(null, "Amal", new Date(), 234, false));
//		  patientRepository.save(new Patient(null, "Najlae", new Date(), 234, false));
		 
		patientRepository.findAll().forEach(p->{
			System.out.println(p.getNom());
		});
	}

}
