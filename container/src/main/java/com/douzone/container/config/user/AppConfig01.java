package com.douzone.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.user.Friend;
import com.douzone.container.user.User;

@Configuration
public class AppConfig01 {
	@Bean
	public Friend friend() {
		return new Friend("김정자");
	}
	
	@Bean
	public User user() {
		User user = new User();
		user.setNo(6L);
		user.setName("철수");
		user.setFriend(friend());
		return user;
	}
}
