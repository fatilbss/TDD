import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Dictionnary {

    private String name;

    public Dictionnary(String name){
        this.name = name;
    }
    
    public String getName(){
    return this.name;
}

    public int IsEmpty(String name){
        return 1;
    }

    public String getTranslation(){

        return "against";
    }
    public int addTranslation(){
        return 1;
    }

    
}