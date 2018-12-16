package classes;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PrintHello {

    String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void printHello() {
        System.out.println(input);
    }
}
