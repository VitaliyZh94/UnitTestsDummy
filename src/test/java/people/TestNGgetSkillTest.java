package people;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGgetSkillTest {

    final int AGE = 25;

    @DataProvider(name = "t")
    public Object[][] createData() {
        return new Object[][]{
                {0},
                {7}
        };
    }

    @Test(dataProvider = "t")
    public void skillTestAQA(int inputExp) {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, inputExp);
        assertEquals(ae.getSkill(), inputExp * ae.getCoeff(), "Skill is not relevant");
    }

    @Test(dataProvider = "t")
    public void skillTestQA(int inputExp) {
        ManualEngineer me = new ManualEngineer(AGE, inputExp);
        assertEquals(me.getSkill(), inputExp * me.getCoeff(), "Skill is not relevant");
    }
}
