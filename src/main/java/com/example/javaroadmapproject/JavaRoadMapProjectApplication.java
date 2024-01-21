package com.example.javaroadmapproject;

import com.example.javaroadmapproject.datatypes.NonPrimitiveDataTypes;
import com.example.javaroadmapproject.datatypes.PrimitiveDataTypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaRoadMapProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaRoadMapProjectApplication.class, args);
		System.out.println("Hello Gilbert!");

		PrimitiveDataTypes dataTypes = new PrimitiveDataTypes();

		dataTypes.isByte();
		dataTypes.isInt();
		dataTypes.isBoolean();
		dataTypes.isChar();
		dataTypes.isFloat();
		dataTypes.isShort();
		dataTypes.isLong();
		dataTypes.isDouble();


		NonPrimitiveDataTypes nonPrimitiveDataTypes = new NonPrimitiveDataTypes();
		nonPrimitiveDataTypes.account();

	}
}
