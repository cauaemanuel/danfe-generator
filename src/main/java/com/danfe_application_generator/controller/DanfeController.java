package com.danfe_application_generator.controller;

import com.danfe_application_generator.DTO.DanfeDTO;
import com.danfe_application_generator.service.JasperReportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/danfe")
public class DanfeController {

    @Autowired
    private JasperReportsService jasperReportService;

    @PostMapping("/generate")
    public ResponseEntity generateDanfe(@RequestBody DanfeDTO danfeDTO) {
        var danfe = jasperReportService.gerarDanfe(danfeDTO);
        return ResponseEntity.ok(danfe);
    }

}
