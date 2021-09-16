package TDD;

import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DictionnaryTest{

    public Dictionnary dict;

@Before public void initialize(){
    dict = new Dictionnary("Example");
}

@Test public void testDictionnaryName(){
    assertThat(dict.getName(),equals("Example"));
}

@Test public void testDictionnaryIsEmpty(){
    assertThat(dict.IsEmpty(), equals(true));
}

@Test public void testOneTranslation() {
 Dictionnary.addTranslation("contre", "against");
 assertThat(dict.getTranslation("contre"), equals("against"));
 Dictionnary.addTranslation("voiture", "car");
 assertThat(dict.getTranslation("voiture"), equals("car"));

}

@After
public void cleanUp() {
    dict = null;
}
}

