package com.suse.springboot.jpasample;


import com.suse.springboot.jpasample.entity.Address;
import com.suse.springboot.jpasample.entity.User;
import com.suse.springboot.jpasample.entity.UserProfile;
import com.suse.springboot.jpasample.repository.AddressRepository;
import com.suse.springboot.jpasample.repository.UserProfileRepsitory;
import com.suse.springboot.jpasample.repository.UserRepository;
import com.suse.springboot.jpasample.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


@SpringBootTest
class JpasampleApplicationTests {

	@Autowired()
	private UserService userService;

	@Autowired()
	private AddressRepository addressRepository;

	@Autowired()
	private UserRepository userRepository;

	@Autowired()
	private UserProfileRepsitory userProfileRepsitory;

	@Test
	void contextLoads() {
	}

	@Test()
	public void testCreateRepository(){

		User user = new User();
		user.setName("Test2");
		user.setEmail("test@testmail.com");
		User createdUser = userService.createUser(user);

		Address address = new Address();
		address.setAddress("123 Spring Dr, Test City, TN");
		address.setZipCode("38138");
		address.setType("Home");
		address.setUser(createdUser);

		addressRepository.save(address);

		Address address1 = new Address();
		address1.setAddress("123 Spring Dr, Test City, TN");
		address1.setZipCode("38138");
		address1.setType("Home");
		address1.setUser(createdUser);
		addressRepository.save(address1);


		System.out.println(userService.getUsers());
	}


	@Test()
	public void testAddress(){

		System.out.println(addressRepository.findByUserId(3));
	}

	@Test()
	public void testLimitAndOffset() {
		User user1 = new User();
		user1.setName("Test2");
		user1.setEmail("test@testmail.com");
		User createdUser1 = userService.createUser(user1);

		User user2 = new User();
		user2.setName("Test2");
		user2.setEmail("test@testmail.com");
		User createdUser = userService.createUser(user2);

		User user3 = new User();
		user3.setName("Test2");
		user3.setEmail("test@testmail.com");
		User createdUser3 = userService.createUser(user3);

		User user4 = new User();
		user4.setName("Test2");
		user4.setEmail("test@testmail.com");
		User createdUser4 = userService.createUser(user4);

		Pageable pageable = PageRequest.of(0, 4, Sort.by(Sort.Direction.DESC, "id"));

		System.out.println(userRepository.findAll(pageable).getContent());
	}


	@Test()
	public void testTopUsers(){
		System.out.println(userRepository.findTop3ByOrderById());
	}

	/*@Test()
	public void testOneToOne(){

		User user10 = new User();
		user10.setName("Test2");
		user10.setEmail("test@testmail.com");
		User createdUser = userRepository.save(user10);

		UserProfile userProfile = new UserProfile();
		userProfile.setPassword("test123#");
		userProfile.setUserName("testUser");
		userProfile.setUser(createdUser);
		userProfileRepsitory.save(userProfile);


	}*/

}
