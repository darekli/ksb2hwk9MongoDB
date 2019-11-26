package ksb2hwk9mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private ToyRepo toyRepo;
@Autowired
    public Start(ToyRepo toyRepo) {
        this.toyRepo = toyRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        Toy toyTaddy = new Toy("Miś uszatek", ToyType.TEDY_BEAR);
        Toy toyDoll = new Toy("Lala", ToyType.DOLL);
//        toyRepo.save(toyTaddy);
//        toyRepo.save(toyDoll);


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
