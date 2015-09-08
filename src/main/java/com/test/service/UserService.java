package com.test.service;
import org.springframework.stereotype.Service;
import com.test.domain.User;
@Service
public class UserService {
	public void save(User user){
		System.out.println(user+"已保存!");
	}
}
