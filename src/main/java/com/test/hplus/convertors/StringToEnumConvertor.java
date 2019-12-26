package com.test.hplus.convertors;


import org.springframework.core.convert.converter.Converter;

import com.test.hplus.beans.Gender;

public class StringToEnumConvertor implements Converter<String, Gender>{

	@Override
	public Gender convert(String value) {
		if(value.toUpperCase().equals("MALE")) {
			return Gender.MALE;
		}
		else if(value.toUpperCase().equals("FEMALE")) {
			return Gender.FEMALE;
		}else {
			return Gender.OTHER;
		}
	}



	
	

	
}
