package com.danfe_application_generator;

import com.danfe_application_generator.client.QRCodeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DanfeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DanfeApplication.class, args);
	}

	@Autowired
	private QRCodeClient qrCodeClient;

	@Override
	public void run(String... args) throws Exception {
		var byteqr = qrCodeClient.gerarQRCode("123456789");
		System.out.println("QRCode gerado com sucesso! " + byteqr);
	}
}
