package TDD;

import java.util.HashMap;
import java.util.Map;

public class Dictionnary {

    private String name;
    private static Map<String, String> translations;

    public Dictionnary(String name){
        this.name = name;
        Dictionnary.translations = new HashMap<>();
    }
    
    public String getName(){
    return this.name;
}

    public boolean IsEmpty(){
        if (translations.size() ==0) 
        {
            return true;
        }
        return false;
    }

    public String getTranslation(String name){

        return translations.get(name);
    }

    public static void addTranslation(String fr, String angl){
        translations.put(fr,angl);
    }

    
}