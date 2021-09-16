
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionnaryTest{

    public Dictionnary dict;

@Before public void initialize(){
    dict = new Dictionnary("Example");
}

@Test public void testDictionnaryName(){
    assertThat(dict.getName(), equalTo("Example"));
}

@Test public void testDictionnaryIsEmpty(){
    assertThat(dict.IsEmpty(), equalTo(1));
}

@Test public void testOneTranslation() {
 Dictionnary.addTranslation("contre", "against");
 assertThat(dict.getTranslation("contre"), equalTo("against"));
 Dictionnary.addTranslation("voiture", "car");
 assertThat(dict.getTranslation("voiture"), equalTo("car"));

}