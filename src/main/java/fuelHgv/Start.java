package fuelHgv;

import ksb2hwk9mongodb.Toy;
import ksb2hwk9mongodb.ToyRepo;
import ksb2hwk9mongodb.ToyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZonedDateTime;

@Component
public class Start {

    private FuelRepo fuelRepo;
@Autowired
    public Start(FuelRepo fuelRepo) {
        this.fuelRepo = fuelRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        FuelM fuel1 = new FuelM(LocalDate.of(2017,8,25),345,104333,Fueled.FULL);
        FuelM fuel2 = new FuelM(LocalDate.of(2017,02,9),440,105733,Fueled.PART);

        // Fuel fuel2 = new Fuel("Lala", ToyType.DOLL);
//        toyRepo.save(toyTaddy);
//        toyRepo.save(toyDoll);
           fuelRepo.save(fuel1);
        fuelRepo.save(fuel2);

//
//        System.out.println(toyRepo.findById("5dc3d23fb1cf434563f2de90").get());
//        toyRepo.findAll().forEach(System.out::println);

//        Toy toy = toyRepo.findById("5dc3d23fb1cf434563f2de90").get();
//        toyRepo.findAll().forEach(System.out::println);
//todo modyfication CRUD
//        Toy toy = toyRepo.findById("5dc3d23fb1cf434563f2de90").get();
//        toy.setToyType(ToyType.DOLL);
//        toyRepo.save(toy);
//        toyRepo.findAll().forEach(System.out::println);
//todo delete CRUD
        //toyRepo.deleteById("5dc3d23fb1cf434563f2de90"); //delete by id
//toyRepo.delete(toy); //the same without using id
        //toyRepo.deleteById(toy.getId());//the same by deferent method

    }
}
