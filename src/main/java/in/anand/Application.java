package in.anand;

import java.util.Collection;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import in.anand.Entity.ContactsEntity;
import in.anand.Repository.ContactsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactsRepo contactsRepo = context.getBean(ContactsRepo.class);
		ContactsEntity contact=new ContactsEntity();
		contact.setContactName("ajay");
		contact.setContactLoc("MTM");
		
		// contactsRepo.save(contact);
		List<ContactsEntity> findAll = contactsRepo.findAll();
		findAll.forEach(con->{
			System.out.println(con);
		});
		
		Example<ContactsEntity> example = Example.of(contact);
		List<ContactsEntity> findAll2 = contactsRepo.findAll(example);
		findAll2.forEach(res->{
			System.out.println(res);
		});
	}

}
