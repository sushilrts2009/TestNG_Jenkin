package pkg_day09;

import org.testng.annotations.Test;

public class TestNg_priority_Learning {

    @Test(priority = 0)
    public void Pr_001()
    {
        System.out.println("This is priority 0");
    }

    @Test(priority = 2)
    public void Pr_002()
    {
        System.out.println("This is priority 1");
    }

    @Test(priority = 3)
    public void Pr_003()
    {
        System.out.println("This is priority 2");
    }
}
