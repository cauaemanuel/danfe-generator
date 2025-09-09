package com.danfe_application_generator.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class QRCodeClient {

    private RestTemplate restTemplate;

    private String QRCODE_API_URL = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=";

    public QRCodeClient() {
        this.restTemplate = new RestTemplate();
    }

    public byte[] gerarQRCode(String number) {
        String qrCodeServiceUrl = QRCODE_API_URL + number;
        return restTemplate.getForObject(qrCodeServiceUrl, byte[].class);
    }
}
