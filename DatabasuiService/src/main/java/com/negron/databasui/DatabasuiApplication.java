package com.negron.databasui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.negron.databasui.bean.Datamap;
import com.negron.databasui.repository.DatamapRepository;

//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;

@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class DatabasuiApplication implements CommandLineRunner {

	@Autowired
	private DatamapRepository datamapRepository;

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SpringApplication.run(DatabasuiApplication.class, args);

//		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
//		
//		DB database = mongoClient.getDB("Home");
//		
//		DBCollection collection = database.getCollection("Datamap");

	}

	@Override
	public void run(String... args) throws Exception {
		datamapRepository.deleteAll();

		// save a couple of data records
		datamapRepository.save(new Datamap("1", "Data 1", 1));
		datamapRepository.save(new Datamap("2", "Data 2", 1));

		// fetch all data records
		System.out.println("Data records found with findAll():");
		System.out.println("-------------------------------");
		for (Datamap dataRecord : datamapRepository.findAll()) {
			System.out.println(dataRecord);
		}
		System.out.println();

		// fetch an individual data record
		System.out.println("Data record found with findByDataCategoryId('1'):");
		System.out.println("--------------------------------");
		System.out.println(datamapRepository.findByDataCategoryId("1"));

		System.out.println("Data records found with findByDataSize(1):");
		System.out.println("--------------------------------");
		for (Datamap dataRecord : datamapRepository.findByDataSize(1)) {
			System.out.println(dataRecord);
		}

	}

}
