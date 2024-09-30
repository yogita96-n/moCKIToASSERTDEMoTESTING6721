package com.example.test_mockito_demo;

import com.example.test_mockito_demo.entity.Emp;
import com.example.test_mockito_demo.repo.EmpRepository;
import com.example.test_mockito_demo.service.EmpService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@SpringBootTest
class TestMockitoDemoApplicationTests {
	@Autowired
	private EmpService  empService;//those class where test performed
	@MockBean
	private EmpRepository repo;//create bean of repo
	//	@InjectMocks//inject di without @SpringBootTest
	//	private EmpService  empService;//those class where test performed
	//	@Mock
	//	private EmpRepository repo;//mock the repo
//	@BeforeAll
//	public void setUp(){(initalized mock
//		MockitoAnnotations.initMocks(this);
//	}

	@Test
	public void getIdDeatilsTest() {
		long id=1L;
		when(repo.findById(id)).
				thenReturn(Optional.of(new Emp("yogita", "nagar@gmail.com", 5435)));
		Emp byIdDeatils = empService.getByIdDeatils(id);
		Assertions.assertNotNull(byIdDeatils);
	}
	@Test
	public void getIDeatilsTest() {
		when(repo.findAll()).
				thenReturn(Stream.of(new Emp("yogita", "nagar@gmail.com", 5435),
						new Emp("monika","monika@gmail.com",4355)).
						collect(Collectors.toList()));
		List<Emp> deatils = empService.getDeatils();
		Assertions.assertNotNull(deatils);//assertion in JUnit are used to verify that expected outcomes match actual outcomes in unit tests


	}}
