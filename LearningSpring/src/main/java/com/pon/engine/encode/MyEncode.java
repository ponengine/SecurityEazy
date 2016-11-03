package com.pon.engine.encode;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyEncode {

	public static void main(String[] args) {
		BCryptPasswordEncoder encode = new BCryptPasswordEncoder(12);
		System.out.println(encode.encode("admin"));

	}

}
