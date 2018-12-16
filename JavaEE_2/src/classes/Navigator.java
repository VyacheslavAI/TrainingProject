package classes;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Navigator {

    public String nextPage() {
        return "NextPage.xhtml";
    }
}
