import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Dictionnary {

    private String name;
    private Map<String, String> translations;

    public Dictionnary(String name){
        this.name = name;
        this.translations = new HashMap<>();
    }
    
    public String getName(){
    return this.name;
}

    public boolean IsEmpty(String name){
        if (translations.size() ==0) 
        {
            return 1;
        }
    }

    public String getTranslation(String name){

        return translations.get(name);
    }

    public void addTranslation(String fr, String angl){
        translations.put(fr,angl);
    }

    
}