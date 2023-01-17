package ru.alfabank.ufr.rsm;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.alfabank.ufr.rsm.parser.ImportJsonService;
import ru.alfabank.ufr.rsm.util.ImportUtils;

import java.io.File;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class Application implements CommandLineRunner {

    private final ImportJsonService importJsonService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB database = mongoClient.getDB("myMongoDb");
//        mongoClient.getDatabaseNames().forEach(System.out::println);
//        database.createCollection("customers", null);
//        database.getCollectionNames().forEach(System.out::println);

        DBCollection collection = database.getCollection("customers");
//        BasicDBObject document = new BasicDBObject();
//        document.put("name", "Shubham");
//        document.put("company", "Baeldung");
//        collection.insert(document);

//        BasicDBObject query = new BasicDBObject();
//        query.put("name", "Shubham");
//        BasicDBObject newDocument = new BasicDBObject();
//        newDocument.put("name", "John");
//        BasicDBObject updateObject = new BasicDBObject();
//        updateObject.put("$set", newDocument);
//        collection.update(query, updateObject);

//        BasicDBObject searchQuery = new BasicDBObject();
//        searchQuery.put("name", "John");
//        DBCursor cursor = collection.find(searchQuery);
//        while (cursor.hasNext()) {
//            System.out.println(cursor.next());
//        }

//        BasicDBObject searchQuery = new BasicDBObject();
//        searchQuery.put("name", "John");
//        collection.remove(searchQuery);
        File file = new File(
                Application.class.getClassLoader().getResource("docs/Administration.json").getFile()
        );
        List<String> lines = ImportUtils.lines(file);
        lines.forEach(System.out::println);

        importJsonService.importTo("customers", lines);
    }
}
