package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import collections.Role;
import collections.Worker;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<Worker> workerList = new ArrayList<>();
		List<Role> atiqRole = new ArrayList<>();
		List<Role> anikaRole = new ArrayList<>();
		List<Role> suzonRole = new ArrayList<>();
		
		Role atiqFrontEndRole = new Role("Atiq_Front-end Developer", "R-001");
		Role atiqBackEndRole = new Role("Atiq_Back-End Developer", "R-002");
		Role atiqJasperReportRole = new Role("Atiq_Jasper Report", "R-003");
		Role atiqSeleniumRole = new Role("Atiq_Selenium", "R-004");
		atiqRole.add(atiqFrontEndRole);
		atiqRole.add(atiqBackEndRole);
		atiqRole.add(atiqJasperReportRole);
		atiqRole.add(atiqSeleniumRole);
		
		Role anikaBusinessAnalystRole = new Role("Anika_Business-Analyst", "R-004");
		Role anikaDocumentationRole = new Role("Anika_Documentation", "R-005");
		Role anikaProjectRole = new Role("Anika_Project-Management", "R-006");
		
		anikaRole.add(anikaBusinessAnalystRole);
		anikaRole.add(anikaDocumentationRole);
		anikaRole.add(anikaProjectRole);
		
		
		Role suzonUIRole = new Role("Suzon_UI", "R-007");
		Role suzonUXRole = new Role("Suzon_UX", "R-008");
		Role suzonFigmaRole = new Role("Suzon_Figma", "R-009");
		Role suzonAngularRole = new Role("Suzon_Angular", "R-010");
		Role suzonCSSRole = new Role("Suzon_CSS", "R-011");
		
		suzonRole.add(suzonUIRole);
		suzonRole.add(suzonUXRole);
		suzonRole.add(suzonFigmaRole);
		suzonRole.add(suzonAngularRole);
		suzonRole.add(suzonCSSRole);
		
		
		Worker atiq = new Worker("Atiqur Rahman", 24, atiqRole);
		Worker anika = new Worker("Anika Anjum", 25, anikaRole);
		Worker suzan = new Worker("Abdur Rahman Suzan", 32, suzonRole);
		
		workerList.add(atiq);
		workerList.add(anika);
		workerList.add(suzan);
	
	int size = workerList
		.stream()
		.flatMap(e -> e.getRoles().stream())
		.collect(Collectors.toList()).size();

	System.out.println("size: "+size);
	}

}
