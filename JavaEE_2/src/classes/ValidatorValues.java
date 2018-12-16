package classes;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ValidatorValues {

    private String title;
    private String value;
    private double price;

    public void print() {
        System.out.println(value);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
