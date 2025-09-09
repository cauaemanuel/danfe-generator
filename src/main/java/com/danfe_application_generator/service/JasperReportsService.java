package com.danfe_application_generator.service;

import com.danfe_application_generator.DTO.DanfeDTO;
import com.danfe_application_generator.client.QRCodeClient;
import org.springframework.stereotype.Service;

@Service
public class JasperReportsService {

    private QRCodeClient qrCodeClient;

    public JasperReportsService(QRCodeClient qrCodeClient) {
        this.qrCodeClient = qrCodeClient;
    }

    public Object gerarDanfe(DanfeDTO danfeDTO) {
        return null;
    }

}
