
package com.transportation.app.webapplication.services;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Service;

import com.transportation.app.webapplication.models.Driver;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

@Service
public class DriverService {

    private List<Driver> drivers = new ArrayList<>();

    public void getDatabase(){
        this.drivers.removeAll(this.drivers);
        
        // Đường dẫn database
        String connectionString = "mongodb+srv://admin:admin@cluster0.incjwkj.mongodb.net/?retryWrites=true&w=majority";
        // Kết nối với database
        MongoClient client = MongoClients.create(connectionString);
        // Tìm đến database có tên là Transportition
        MongoDatabase db = client.getDatabase("Transportition");
        // Tìm đến Table có tên là Driver
        MongoCollection<Document> col = db.getCollection("Driver");
        // Lấy tất cả các dữ liệu trong Driver
        FindIterable<Document> documents = col.find();

        try(MongoCursor<Document> cursor = documents.iterator()){
            while(cursor.hasNext()){
                Document doc = cursor.next();
                String n = doc.getString("name") == null? "" : doc.getString("name");
                String p = doc.getString("personal_ID") == null? "" : doc.getString("personal_ID");
                String s = doc.getString("sex") == null? "" : doc.getString("sex");
                Driver driver = new Driver(n, p, s);
                this.drivers.add(driver);
            }
        }
    }
    
    private void deleteOneandUpdate(Driver driver){
        String connectionString = "mongodb+srv://admin:admin@cluster0.incjwkj.mongodb.net/?retryWrites=true&w=majority";
        MongoClient client = MongoClients.create(connectionString);
        MongoDatabase db = client.getDatabase("Transportition");
        MongoCollection<Document> col = db.getCollection("Driver");
        FindIterable<Document> documents = col.find();
    }

    public List<Driver> getallDriver(){
        this.getDatabase();
        return drivers;
    }

    public void addnewDriver(String name, String personal_ID,String sex){
       // Đường dẫn database
       String connectionString = "mongodb+srv://admin:admin@cluster0.incjwkj.mongodb.net/?retryWrites=true&w=majority";
       // Kết nối với database
       MongoClient client = MongoClients.create(connectionString);
       // Tìm đến database có tên là Transportition
       MongoDatabase db = client.getDatabase("Transportition");
       // Tìm đến Table có tên là Driver
       MongoCollection<Document> col = db.getCollection("Driver");
        //Tạo 1 dữ liệu mới và thêm vào database
        Document newDriver = new Document("name",name).append("personal_ID", personal_ID).append("sex", sex);
        col.insertOne(newDriver);
    }

    public List<Driver> findbyString(String Str){
        List<Driver> finddriver = new ArrayList<>();

        if(Str == null || Str.isEmpty()){
            return this.drivers;
        }
        for(Driver driver : drivers){
            String n = driver.getName();
            String p = driver.getPersonal_ID();
            if(n.contains(Str) || p.contains(Str)){
                Driver d = new Driver(n, p, driver.getSex());
                finddriver.add(d);
            }
        }
       
        return finddriver;
    }

    public void deleteDriver(Driver driver){
        // Đường dẫn database
       String connectionString = "mongodb+srv://admin:admin@cluster0.incjwkj.mongodb.net/?retryWrites=true&w=majority";
       // Kết nối với database
       MongoClient client = MongoClients.create(connectionString);
       // Tìm đến database có tên là Transportition
       MongoDatabase db = client.getDatabase("Transportition");
       // Tìm đến Table có tên là Driver
       MongoCollection<Document> col = db.getCollection("Driver");
    }
}