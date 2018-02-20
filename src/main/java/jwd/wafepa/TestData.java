package jwd.wafepa;

import javax.annotation.PostConstruct;

import jwd.wafepa.model.Activity;
import jwd.wafepa.model.Address;
import jwd.wafepa.model.Author;
import jwd.wafepa.model.Automobil;
import jwd.wafepa.model.Book;
import jwd.wafepa.model.Marka;
import jwd.wafepa.model.Model;
import jwd.wafepa.model.User;
import jwd.wafepa.service.ActivityService;
import jwd.wafepa.service.AddressService;
import jwd.wafepa.service.AuthorService;
import jwd.wafepa.service.AutomobilService;
import jwd.wafepa.service.BookService;
import jwd.wafepa.service.MarkaService;
import jwd.wafepa.service.ModelService;
import jwd.wafepa.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestData {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AddressService addressService;

	@Autowired
	private ActivityService activityService;

	@Autowired
	private AuthorService authorService;
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private ModelService modelService;
	
	@Autowired
	private AutomobilService automobilService;
	
	
	@Autowired
	private MarkaService markaService;
	
	@PostConstruct
	public void init(){
//		Author francKafka = new Author("Franc", "Kafka");
//		authorService.save(francKafka);
//		Book proces = new Book("proces", 880, 2015, francKafka);
//		bookService.save(proces);
//		Book preobrazaj = new Book("preobrazaj", 750, 2013, francKafka);
//		bookService.save(preobrazaj);
//		Book zamak = new Book("zamak", 1200, 2012, francKafka);
//		bookService.save(zamak);
//		
//		Author alberKami = new Author("Alber", "Kami");
//		authorService.save(alberKami);
//		Book stranac = new Book("stranac", 780, 2010, alberKami);
//		bookService.save(stranac);
		
		
	    /*   for (int i = 1; i <= 10; i++) {
	            User user = new User();
	            user.setFirstName("First name " + i);
	            user.setLastName("Last name " + i);
	            user.setEmail("email" + i + "@example.com");
	            user.setPassword("123");
	            userService.save(user);

	            for (int j = 1; j <= 3; j++) {
	                Address address = new Address();
	                address.setNumber(j + "c/7");
	                address.setStreat("Narodnog fronta");

	                address.setUser(user);
	                user.addAddress(address);
	                addressService.save(address);
	            }
	            Activity a = new Activity("Activity_"+i);
	            activityService.save(a);
	       }*/
		  Marka marka1 = new Marka("Ferari");
	       markaService.save(marka1);
	       Marka marka2 = new Marka("Ferari");
	       markaService.save(marka2);
		
		  Model model1 = new Model("X",marka1);
	       modelService.save(model1);
	       Model model2 = new Model("Zero",marka2);
	       modelService.save(model2);
	       Model model3 = new Model("Fast",marka2);
	       modelService.save(model3);
	       

		      
	     
	       for (int i = 1; i <= 30; i++) {
	            Automobil automobil = new Automobil();
	            automobil.setGodiste(1983);
	            automobil.setKilometraza(53);
	            automobil.setCena(2000);
	         
	            automobil.setModel(model1);
	            automobilService.save(automobil);
	           
	       }
	       for (int i = 1; i <= 30; i++) {
	    	   Automobil automobil = new Automobil();
	            automobil.setGodiste(2000);
	            automobil.setKilometraza(33);
	            automobil.setCena(2200);
	         
	            automobil.setModel(model2);
	            automobilService.save(automobil);
	           
	       }
	       for (int i = 1; i <= 50; i++) {
	    	   Automobil automobil = new Automobil();
	            automobil.setGodiste(2005);
	            automobil.setKilometraza(37);
	            automobil.setCena(3200);
	         
	            automobil.setModel(model3);
	            automobilService.save(automobil);
	       }
	}
}
