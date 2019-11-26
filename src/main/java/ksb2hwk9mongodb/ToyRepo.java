package ksb2hwk9mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyRepo extends MongoRepository <Toy, String> {

}
