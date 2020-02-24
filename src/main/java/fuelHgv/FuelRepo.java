package fuelHgv;

import ksb2hwk9mongodb.Toy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.ZonedDateTime;

@Repository
public interface FuelRepo extends MongoRepository<FuelM, String> {

}

