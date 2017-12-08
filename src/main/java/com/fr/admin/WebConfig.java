package com.fr.admin;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	 @Override
	    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	        final ObjectMapper objectMapper = new ObjectMapper()
	                .enable(SerializationFeature.INDENT_OUTPUT);

	        converters.add(new MappingJackson2HttpMessageConverter(objectMapper));

	        converters.add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
	    }
}
