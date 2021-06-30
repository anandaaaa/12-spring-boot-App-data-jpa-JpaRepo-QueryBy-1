package in.anand.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anand.Entity.ContactsEntity;

public interface ContactsRepo extends JpaRepository<ContactsEntity,Serializable>{
	
	

}
