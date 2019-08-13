package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.*;
import com.revature.service.*;

@CrossOrigin
@RestController
public class ReimbursementController {

private ReimbursementService reimbursementService;
	
	@Autowired
	public void setReimbursementService(ReimbursementService reimbursementService) {
		this.reimbursementService = reimbursementService;
	}
	
	@GetMapping(value="/all", consumes = {"application/json"})
   
	public List<Reimbursement> getAllReimbursements() {
        return reimbursementService.getAllReimbursements();
    }
	
}
