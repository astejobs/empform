package com.stie.empform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stie.empform.dao.AppUserDao;
import com.stie.empform.model.AppUser;
import com.stie.empform.model.JwtRequest;
import com.stie.empform.model.JwtResponse;
import com.stie.empform.model.Role;
import com.stie.empform.security.JwtTokenUtil;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;
	@Autowired
	AppUserDao appUserDao;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest)
			throws Exception {
		System.err.println(authenticationRequest.getPassword());
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		}

		final UserDetails userDetails = jwtInMemoryUserDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());
	
		
		
		final String token = jwtTokenUtil.generateToken(userDetails);
		String role = appUserDao.findByUsername(authenticationRequest.getUsername()).getRole().getName();
		return ResponseEntity.ok(new JwtResponse(token,role));
	}

	
	
	@PostMapping("/register")
	private ResponseEntity<?> register(@RequestBody JwtRequest register) {
		
		AppUser appUser = appUserDao.findByUsername(register.getUsername());
		if(appUser!= null){
			String password = new BCryptPasswordEncoder().encode(register.getPassword());
			appUser.setPassword(password);
			appUserDao.save(appUser);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/data")
	private String loadData(){
		AppUser appUser = new AppUser();
		appUser.setFirstName("Mr Admin");
		appUser.setLastName("admin");
		appUser.setUsername("admin");
		String password = new BCryptPasswordEncoder().encode("adm1n");
		appUser.setPassword(password);
		Role role = new Role();
		role.setName("Admin");
		appUser.setRole(role);
		appUserDao.save(appUser);
		return "success";
	}
	
	@ExceptionHandler
	public void Exception(Exception e){
		e.printStackTrace();
	}
}
