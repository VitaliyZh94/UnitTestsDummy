package people;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RelevantAgeTest { //check set to constructor and setter + getter

    final int EXP = 0;
    final int AGE = 25;
    int inputAge;
    int expectedAge;

    public RelevantAgeTest(int inputAge, int expectedAge) {
        this.inputAge = inputAge;
        this.expectedAge = expectedAge;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][]{
                {18, 18},
                {65, 65},
                {30, 30}
        });
    }

    @Test
    public void setToConstructorRelevantAgeAQA() {
        AutomatedEngineer at = new AutomatedEngineer(inputAge, EXP);
        assertEquals("Age is not relevant", expectedAge, at.getAge());
    }

    @Test
    public void setToConstructorRelevantAgeQA() {
        ManualEngineer me = new ManualEngineer(inputAge, EXP);
        assertEquals("Age is not relevant", expectedAge, me.getAge());
    }

    @Test
    public void setToSetterRelevantAgeAQA() {
        AutomatedEngineer at = new AutomatedEngineer(AGE, EXP);
        at.setAge(inputAge);
        assertEquals("Age is not relevant", expectedAge, at.getAge());
    }

    @Test
    public void setToSetterRelevantAgeQA() {
        ManualEngineer me = new ManualEngineer(AGE, EXP);
        me.setAge(inputAge);
        assertEquals("Age is not relevant", expectedAge, me.getAge());
    }

}
