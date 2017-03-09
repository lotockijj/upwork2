import junit.framework.Assert;


/**
 * Created by Роман Лотоцький on 09.03.2017.
 */
public class SelfNumbersTest {

    @org.junit.Test
    public void findSelfNumbers() throws Exception {
        SelfNumbers selfNumbers = new SelfNumbers();
        int number = selfNumbers.findSelfNumbers(75);
        Assert.assertEquals(87, number);
        selfNumbers.generateConclusiveListSelfNumbers();
        System.out.println("Sum= " + selfNumbers.sum);
    }



}