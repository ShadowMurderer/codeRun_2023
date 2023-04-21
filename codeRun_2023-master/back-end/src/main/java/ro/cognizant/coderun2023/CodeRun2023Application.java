package ro.cognizant.coderun2023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.cognizant.coderun2023.repo.BookAuthRepo;

import java.io.File;
import java.io.FileInputStream;

@SpringBootApplication
public class CodeRun2023Application {

	public static void main(String[] args) {
		SpringApplication.run(CodeRun2023Application.class, args);
	}


	/*@Override
	public void run(String... args) throws Exception {
		// read the Excel file using Apache POI
		FileInputStream file = new FileInputStream(new File("booksandPublishers.xlsx"));
		WorkBook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);*/

}
