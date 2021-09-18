package com.LojadeGames.LojadeGames.Segurança;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class BasicSecutiry extends WebSecurityConfigurerAdapter 
{
	private @Autowired UserDetailsServiceImplements service;

	@Bean
	public PasswordEncoder senhaEncoder()
	{
		return new BCryptPasswordEncoder();
	} 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests().antMatchers(HttpMethod.POST, "/Usuarios/Salvar").permitAll()
		.antMatchers(HttpMethod.PUT, "/Usuarios/Credenciais").permitAll()
		.anyRequest().authenticated()
		.and().httpBasic()
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and().cors()
		.and().csrf().disable();
	}

	@Override
	protected void configure (AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(service);
	}
}

