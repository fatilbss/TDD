
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionnaryTest{

@Test public void testDictionnaryName(){
    assertThat(Dictionnary.getName(), equalTo("Example");)
}

@Test public void testDictionnaryIsEmpty(){
    assertThat(Dictionnary.IsEmpty(), equalTo(1);)
}
}