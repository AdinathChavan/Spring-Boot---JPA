package com.jpc.lambok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaLambokApplication {

    private final DeleteDatabaseOperation deleteDatabaseOperation;

    JpaLambokApplication(DeleteDatabaseOperation deleteDatabaseOperation) {
        this.deleteDatabaseOperation = deleteDatabaseOperation;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(JpaLambokApplication.class, args);
//		
		Office data = container.getBean(Office.class);
//		//insert operation in database
		data.addData();
		System.out.println("-------printing data from database-------");
		//printing/ select operation in database
		data.printData();
		
		UpdateData update = container.getBean(UpdateData.class);
		
		
//		
//		//getting primary data @Id
//		data.getSpecificData();
////		
//		DeleteDatabaseOperation operation = container.getBean(DeleteDatabaseOperation.class);
//		
//		operation.deleteById(13);
//		
//		DeleteOffice empdelete = container.getBean(DeleteOffice.class);
//		
//		int x = empdelete.deleteByVillage("kolhapur");
//		System.out.println(x);
//		
//		int y = empdelete.deleteByVillageAndGender("kolhapur", 'M');
//		System.out.println(y);
//		
//		int z = empdelete.deleteByCityOrGender("kolhapur", "java developer");
		
		
		
		
		
	}

}
