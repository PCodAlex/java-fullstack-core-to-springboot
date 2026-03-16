package org.akash.app.config;

import java.security.PrivateKey;

import org.springframework.beans.factory.annotation.Autowired;

//import java.rmi.registry.Registry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private UserDetailsService userDetailsService;
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider(userDetailsService);
//		provider.setUserDetailsService(userDetailsService);
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		return provider;
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(customizer -> customizer.disable());
		http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
		http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());
//		http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		
//		Customizer<CsrfConfigurer<HttpSecurity>> custCsrf=new Customizer<CsrfConfigurer<HttpSecurity>>() {
//			
//			@Override
//			public void customize(CsrfConfigurer<HttpSecurity> configure) {
//				configure.disable();			}
//		};
//		http.csrf(custCsrf);
//		Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> custHttp=new Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry>() {
//			
//			@Override
//			public void customize(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry registry) {
//				registry.anyRequest().authenticated();	
//			}
//		}; 
//		http.authorizeHttpRequests(custHttp);
		return http.build();
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() { 
//		UserDetails admin= User.withDefaultPasswordEncoder()
//							  .username("akash")
//							  .password("123@456")
//							  .roles("ADMIN")
//							  .build();
//		UserDetails user= User.withDefaultPasswordEncoder()
//				  .username("navin")
//				  .password("@123456")
//				  .roles("USER")
//				  .build();
//		return new InMemoryUserDetailsManager(user,admin);
//	}
	
}
