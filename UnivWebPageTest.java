/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * UnivWebPageTest class.
 * @author Kento Hopkins
 * @version 2024.04.09
 */
public class UnivWebPageTest
{
    private UnivWebPage wp1;
    private UnivWebPage wp2;
    private UnivWebPage wp3;
    
    // ----------------------------------------------------------
    /**
     * Create UnivWebPage.
     */
    @Before
    public void setUp()
    {
        wp1 = new UnivWebPage("Wake Forest University", "http://www.wfu.edu", 
        "1991/04/23", "2024/03/05");
        wp1.setYearFounded(1834);
        wp1.setType("Private");
        wp1.setEnrollment(8963);
        wp2 = new UnivWebPage("University of North Carolina at Chapel Hill", "http://unc.edu", 
        "1995/07/27", "2024/02/01");
        wp2.setYearFounded(1789);
        wp2.setType("Public");
        wp2.setEnrollment(31705);
        wp3 = new UnivWebPage(null,null, null, null);
    }
    
    // ----------------------------------------------------------
    /**
     * Check getType returns expected value which is string.
     */
    @Test
    public void testGetType()
    {
        assertEquals("Private", wp1.getType());
        assertEquals("Public", wp2.getType());
        assertNull(wp3.getType());
    }
    
    // ----------------------------------------------------------
    /**
     * Check getType returns expected value which is string.
     */
    @Test
    public void testGetEnrollment()
    {
        assertEquals(8963, wp1.getEnrollment());
        assertEquals(31705, wp2.getEnrollment());
        assertEquals(0, wp3.getEnrollment());
    }
    
    // ----------------------------------------------------------
    /**
     * Check getType returns expected value which is string.
     */
    @Test
    public void testGetYearFounded()
    {
        assertEquals(1834, wp1.getYearFounded());
        assertEquals(1789, wp2.getYearFounded());
        assertEquals(0000, wp3.getYearFounded());
    }
    
    // ----------------------------------------------------------
    /**
     * Check setType returns expected value which is string.
     */
    @Test
    public void testSetType()
    {
        wp1.setType("Public");
        assertEquals("Public", wp1.getType());
        wp1.setType(null);
        assertNull(wp1.getType());
    }
    
    // ----------------------------------------------------------
    /**
     * Check setEnrollment returns expected value which is string.
     */
    @Test
    public void testSetEnrollment()
    {
        wp1.setEnrollment(1000);
        assertEquals(1000, wp1.getEnrollment());
    }
    
    // ----------------------------------------------------------
    /**
     * Check setYearFounded returns expected value which is string.
     */
    @Test
    public void testSetYearFounded()
    {
        wp1.setYearFounded(1000);
        assertEquals(1000, wp1.getYearFounded());
    }
}
