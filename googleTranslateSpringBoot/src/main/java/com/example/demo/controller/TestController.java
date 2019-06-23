package com.example.demo.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.darkprograms.speech.translator.GoogleTranslate;

@RestController
public class TestController {
	
	@GetMapping(value="/test")
	public @ResponseBody String testing(@RequestParam("text") String text,@RequestParam("lang") String lang) throws IOException {
		return GoogleTranslate.translate(lang, text);
		
	}

}
