package com.stie.empform.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.stie.empform.dao.AppUserDao;
import com.stie.empform.model.AppUser;


@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	AppUserDao appuserDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		AppUser appUser = appuserDao.findByUsername(username);
		
		if (appUser != null) {
			Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
				grantedAuthorities.add(new SimpleGrantedAuthority(appUser.getRole().getName()));			
			return new User(appUser.getUsername(),appUser.getPassword(),grantedAuthorities);
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}