package Nov.ex_07112024_OOPs_Inheritance.SingleInheritance.Real;

public class TestCase1 extends Common_BaseTest{
    public TestCase1(){
        System.out.println("DC - Child");
    }

    public void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
