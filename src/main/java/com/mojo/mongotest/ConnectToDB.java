package com.mojo.mongotest;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

public class ConnectToDB {
    public static void main( String args[] ) {

// Creating a Mongo client
        MongoClient mongo = new MongoClient( "localhost" , 27017 );

// Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("root", "SampleDB",
                "root".toCharArray());
        System.out.println("Connected to the database successfully");
// Accessing the database
        MongoDatabase database = mongo.getDatabase("SocDB");
// Retrieving a collection
        MongoCollection collection = database.getCollection("CaseList");
        System.out.println("Collection sampleCollection selected successfully");

        AggregateIterable<Document> output = collection.aggregate(Arrays.asList(
                new Document("$unwind", "$views"),
                new Document("$match", new Document("views.isActive", true))
        ));

// Print for demo
        for (Document dbObject : output)
        {
            System.out.println(dbObject);
        }


    }
}