package com.example.javaroadmapproject;

import com.example.javaroadmapproject.controlstructures.IfThenElse;
import com.example.javaroadmapproject.controlstructures.Loops;
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

		//Control Structures
		IfThenElse ifThenElse = new IfThenElse();
		ifThenElse.OddOrEven(5);
		ifThenElse.NestedIfElse(20,false);
		ifThenElse.TernaryOperator(7);
		ifThenElse.TernaryOperator(-7);

		Loops loops = new Loops();
		loops.forLoop();
		loops.doWhileLoop();
		loops.whileLoop();
		loops.loopControlStatement();
		loops.forEach();
		loops.stream();
		loops.switchStatement();

	}
}
