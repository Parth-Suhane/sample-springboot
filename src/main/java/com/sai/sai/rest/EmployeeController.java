package com.sai.sai.rest;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.sai.sai.model.Employee;
import com.sai.sai.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;
	@Autowired
	private RestTemplate resttemplate;

	@PostMapping("/postoffice")
	public Employee createOffice(@RequestBody Employee emp) {
		return repository.save(emp);
	}

	@GetMapping("/getemployee")
	public List<Employee> getemployees() {
		return repository.findAll();
	}

	@GetMapping("/getoffice")
	public String getoffice() {		 
		String url = "http://localhost:8087/listOffice";
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return resttemplate.exchange(url, HttpMethod.GET, entity,String.class).getBody();
	}
}
