package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.BillGenerator;

@SpringBootApplication
public class BootProj5ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj5ValueAnnotationApplication.class, args);
        BillGenerator gen=ctx.getBean("bill",BillGenerator.class);
        System.out.println(gen);
	}

}
