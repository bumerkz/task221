package hiber.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model")
    private String model;

    @Column (name = "series")
    private int series;

    @OneToOne(mappedBy = "myCar")
    private User user;

    public Car() {
    }
    @Autowired
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
