package fuelHgv;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document
public class FuelM {
@Id
    private String id;
    private LocalDate time;
    private double diesel;
    private int km;
    private Fueled fueled;

    public FuelM() {
    }

    public FuelM(LocalDate time, double diesel, int km, Fueled fueled) {
        this.time = time;
        this.diesel = diesel;
        this.km = km;
        this.fueled = fueled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public double getDiesel() {
        return diesel;
    }

    public void setDiesel(double diesel) {
        this.diesel = diesel;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Fueled getFueled() {
        return fueled;
    }

    public void setFueled(Fueled fueled) {
        this.fueled = fueled;
    }

    @Override
    public String toString() {
        return "FuelM{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", diesel=" + diesel +
                ", km=" + km +
                ", fueled=" + fueled +
                '}';
    }
}
