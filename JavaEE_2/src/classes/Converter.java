package classes;

import javax.faces.bean.ManagedBean;
import java.util.Date;

@ManagedBean
public class Converter {

    private float count;
    private Date date;
    private String euro;

    public void print() {
        System.out.println("count " + count);
        System.out.println("date " + date);
        System.out.println("euro " + euro);
    }

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEuro() {
        return euro;
    }

    public void setEuro(String euro) {
        this.euro = euro;
    }
}
