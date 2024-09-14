/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * WebPageTest class.
 * @author Kento Hopkins
 * @version 2024.03.20
 */
public class WebPageTest
{
    private WebPage wp1;
    private WebPage wp2;
    private WebPage wp3;
    private WebPage wp4;
    private WebPage wp5;
    private int comp;
    private String str1;
    private String str2;

    // ----------------------------------------------------------
    /**
     * Create WebPage.
     */
    @Before
    public void setUp()
    {
        wp1 = new WebPage("Wake Forest University", "http://www.wfu.edu", 
        "1991/04/23", "2024/03/05");
        wp2 = new WebPage("University of North Carolina at Chapel Hill", "http://unc.edu", 
        "1995/07/27", "2024/02/01");
        wp3 = new WebPage(null,null, null, null);
        wp4 = new WebPage("University of North Carolina at Chapel Hill", "http://unc.edu", 
        "1995/07/27", "2024/02/01");
        wp5 = new WebPage("University of North Carolina at Chapel Hill", "http://", 
        "1995/07/27", "2024/02/01");
        comp = 200;
        str1 = "http://www.wfu.edu";
        str2 = "http://unc.edu";
    }

    // ----------------------------------------------------------
    /**
     * Check getTitle returns expected value which is string.
     */
    @Test
    public void testGetTitle()
    {
        assertEquals("Wake Forest University", wp1.getTitle());
        assertEquals("University of North Carolina at Chapel Hill", wp2.getTitle());
        assertNull(wp3.getTitle());
    }

    // ----------------------------------------------------------
    /**
     * Check getURL returns expected value which is string.
     */
    @Test
    public void testGetURL()
    {
        assertEquals("http://www.wfu.edu", wp1.getURL());
        assertEquals("http://unc.edu", wp2.getURL());
        assertNull(wp3.getURL());
    }

    // ----------------------------------------------------------
    /**
     * Check getCreateDate returns expected value which is string.
     */
    @Test
    public void testGetCreateDate()
    {
        assertEquals("1991/04/23", wp1.getCreateDate());
        assertEquals("1995/07/27", wp2.getCreateDate());
        assertNull(wp3.getCreateDate());
    }

    // ----------------------------------------------------------
    /**
     * Check getVisitDate returns expected value which is string.
     */
    @Test
    public void testGetVisitDate()
    {
        assertEquals("2024/03/05", wp1.getVisitDate());
        assertEquals("2024/02/01", wp2.getVisitDate());
        assertNull(wp3.getVisitDate());
    }

    // ----------------------------------------------------------
    /**
     * Check geDomain returns expected value which is string.
     */
    @Test
    public void testGetDomain()
    {
        assertEquals("wfu", wp1.getDomain());
        assertEquals("unc", wp2.getDomain());
        assertEquals(null, wp3.getDomain());
        assertEquals(null, wp5.getDomain());
    }

    // ----------------------------------------------------------
    /**
     * Check toString returns expected value which is string.
     */
    @Test
    public void testToString()
    {
        String expect1 = "Wake Forest University <http://www.wfu.edu>";
        String expect2 = "University of North Carolina at Chapel Hill <http://unc.edu>";
        assertEquals(expect1,wp1.toString());
        assertEquals(expect2,wp2.toString());
    }

    // ----------------------------------------------------------
    /**
     * Check equals returns expected value which is either true or false.
     */
    @Test
    public void testEquals()
    {
        assertFalse(wp1.equals(wp4));
        assertTrue(wp1.equals(str1));
        assertFalse(wp1.equals(str2));
        assertTrue(wp2.equals(wp4));
        assertTrue(wp2.equals(wp2));
        assertFalse(wp4.equals(comp));
        assertFalse(wp1.equals(null));
    }
}