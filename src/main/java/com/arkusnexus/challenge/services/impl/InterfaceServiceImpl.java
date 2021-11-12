package com.arkusnexus.challenge.services.impl;

import org.springframework.stereotype.Service;

import com.arkusnexus.challenge.services.InterfaceService;

@Service
public class InterfaceServiceImpl implements InterfaceService {
	
	public String exampleInterface(Long number) {
		return "Interface Example" + number;
	}
}
