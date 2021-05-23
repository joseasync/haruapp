package com.josepontocruz.haru.controller;

import com.josepontocruz.haru.exceptions.BusinessException;
import com.josepontocruz.haru.request.LeadSearchRequest;
import com.josepontocruz.haru.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/leads")
@Slf4j
public class LeadController {

    @GetMapping
    public ResponseEntity<BaseResponse> searchLead(@Valid LeadSearchRequest request) throws BusinessException {
        log.info("Lead Search Request {}", request);
        return new ResponseEntity<BaseResponse>(new BaseResponse(), HttpStatus.OK);
    }

}
