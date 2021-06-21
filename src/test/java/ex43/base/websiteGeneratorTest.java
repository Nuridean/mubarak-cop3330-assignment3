package ex43.base;

import junit.framework.TestCase;

public class websiteGeneratorTest extends TestCase {

    public void testJavaScriptFolder() {
        websiteGenerator test = new websiteGenerator();
        test.filePath ="output/";
        test.authorofSite = "Darth Vader";
        test.nameofSite = "roblox.com";

        String result = "output/roblox.com/js";
        String expected = test.javaScriptFolder();

        assertEquals(result,expected);
    }

    public void testHTMLFolder() {
        websiteGenerator htmlTest = new websiteGenerator();
        htmlTest.filePath ="output/";
        htmlTest.authorofSite = "Justyn Ludo";
        htmlTest.nameofSite = "OSS.com";

        String result = "Failure";
        String expected = htmlTest.HTMLFolder();

        assertEquals(result,expected);
    }

    public void testCSSFolder() {
        websiteGenerator test = new websiteGenerator();
        test.filePath ="output/";
        test.authorofSite = "Darth Vader";
        test.nameofSite = "roblox.com";

        String result = "output/roblox.com/css";
        String expected = test.CSSFolder();

        assertEquals(result,expected);
    }

    public void testWebsiteGenerator() {
        websiteGenerator test = new websiteGenerator();
        test.filePath ="output/";
        test.authorofSite = "Old man";
        test.nameofSite = "balls.com";

        String result = "output/balls.com";
        String expected = test.websiteGenerator();

        assertEquals(result,expected);
    }
}