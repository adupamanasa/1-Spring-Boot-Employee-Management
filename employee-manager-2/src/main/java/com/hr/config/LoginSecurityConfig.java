package com.hr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {

@Autowired
public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
	authenticationMgr.inMemoryAuthentication()
		.withUser("user")
		.password("user")
		.authorities("ROLE_USER");
	authenticationMgr.inMemoryAuthentication()
	     .withUser("admin")
	     .password("admin")
	     .authorities("ROLE_ADMIN");
}

@Override
public void configure(WebSecurity webSecurity) throws Exception
{
    webSecurity
        .ignoring()
        .antMatchers("/resources/**")
        .antMatchers("/images/**")
        .antMatchers("/js/**")
        .antMatchers("/css/**")
        .antMatchers("/fonts/**");// ... whatever is here is ignored by All of Spring Security
}

@Override
protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
//		.antMatchers("/welcome/**").access("hasRole('ROLE_USER')")
		.antMatchers("/welcome/employees/edit/**").access("hasRole('ROLE_ADMIN')")
		.anyRequest().fullyAuthenticated()
		.and()
			.formLogin().loginPage("/login")
			.permitAll()
			.defaultSuccessUrl("/welcome")
			.failureUrl("/login?error")
			.usernameParameter("username").passwordParameter("password")
		    .and()
			.logout().logoutSuccessUrl("/login?logout");
}
}
	