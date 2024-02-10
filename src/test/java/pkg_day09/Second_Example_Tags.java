package pkg_day09;

import org.testng.annotations.Test;

public class Second_Example_Tags {


    @Test(groups = {"smoke"})
    public void Tc_001()
    {
        System.out.println("smoke - This is Tc_001");
    }

    @Test(groups={"smoke"})
    public void Tc_002()
    {
        System.out.println("smoke - This is Tc_002");
    }

    @Test(groups= {"smoke"})
    public void Tc_003()
    {
        System.out.println("smoke - This is Tc_003");
    }

    @Test(groups= {"end_2_end"})
    public void Tc_004()
    {
        System.out.println("end_2_end - This is Tc_004");
    }

    @Test(groups= {"end_2_end"})
    public void Tc_005()
    {
        System.out.println("end_2_end - This is Tc_005");
    }

    @Test(groups= {"end_2_end"})
    public void Tc_006()
    {
        System.out.println("end_2_end - This is Tc_006");
    }

    @Test(groups= {"end_2_end"})
    public void Tc_007()
    {
        System.out.println("end_2_end - This is Tc_007");
    }

    @Test(groups= {"regression"})
    public void Tc_008()
    {
        System.out.println("regression - This is Tc_008");
    }

    @Test(groups= {"regression"})
    public void Tc_009()
    {
        System.out.println("regression - This is Tc_009");
    }

    @Test(groups= {"regression"})
    public void Tc_010()
    {
        System.out.println("regression - This is Tc_010");
    }
}
