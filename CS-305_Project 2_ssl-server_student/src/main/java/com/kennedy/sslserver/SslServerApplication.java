package com.kennedy.sslserver;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SslServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class SslServerApplicationController {
	public static String calculateHash(String name) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256"); // initialize object using SHA-256 and
		byte[] hash = md.digest(name.getBytes(StandardCharsets.UTF_8)); // compute messageDigest
		BigInteger number = new BigInteger(1, hash); // create hash value
		StringBuilder hexString = new StringBuilder(number.toString(16));
		while (hexString.length() < 32) {
			hexString.insert(0, '0');
		}
		return hexString.toString(); // return hexadecimal string/hashed data
	}
	@RequestMapping("/hash")
	public String myHash() throws NoSuchAlgorithmException {
		String data = "Kennedy Uzoho"; // declare messageDigest object (data to be encrypted)
		String hash = calculateHash(data); // instruction to calculate-hash data
		return "<p>Welcome to a safe browsing environment, " + data + " : SHA-256 " + " : " + hash; // return data, SHA-256, and Hashed value
	}
}
