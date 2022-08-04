package com.test.bhut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class BhutApplication {

	public static void main(String[] args) {
				MongoClient cliente = new MongoClient();
				MongoDatabase bancoDeDados = cliente.getDatabase("test");
				MongoCollection<Document> alunos = bancoDeDados.getCollection("cars");
				Document car = cars.find().first();
			}
}
