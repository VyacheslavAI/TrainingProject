package ee;

import javax.ejb.Singleton;

@Singleton
public class TempEjb {

    public String getName() {
        return "Max";
    }
}
