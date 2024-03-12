package com.transportation.app.webapplication;  

import org.springframework.boot.SpringApplication;
// import org.bson.Document;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// import com.mongodb.client.FindIterable;
// import com.mongodb.client.MongoClient;
// import com.mongodb.client.MongoClients;
// import com.mongodb.client.MongoCollection;
// import com.mongodb.client.MongoCursor;
// import com.mongodb.client.MongoDatabase;
// import com.transportation.app.webapplication.models.Driver;

// import java.util.List;
// import java.util.ArrayList;

// import org.bson.Document;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WebapplicationApplication {
	public static void main(String[] args) {
        
        // String Str = "N";
        // String connectionString = "mongodb+srv://admin:admin@cluster0.incjwkj.mongodb.net/?retryWrites=true&w=majority";
        // MongoClient client = MongoClients.create(connectionString);
        // MongoDatabase db = client.getDatabase("Transportition");
        // MongoCollection<Document> col = db.getCollection("Driver");
        // FindIterable<Document> documents = col.find();
        // List<Driver> drivers = new ArrayList<>();
        // // In ra dữ liệu từ từng document
        // for (Document doc : documents) {
        //     Driver driver = new Driver(doc.getString("name"),doc.getString("personal_ID"),doc.getString("sex"));
        //     drivers.add(driver);
        // }
        // List<Driver> ds = new ArrayList<>();

        // for(Driver driver : drivers){
        //     String n = driver.getName();
        //     // System.out.println(n);
        //     if(n.contains(Str)){
        //         Driver d = new Driver(driver.getName(), driver.getPersonal_ID(), driver.getSex());
        //         ds.add(d);
        //     }
        // }

        // for(Driver d : ds){
        //     System.out.println(d.getName());
        // }
        // // System.out.println(col.getClass());
        
		SpringApplication.run(WebapplicationApplication.class, args);  
  }
  }
