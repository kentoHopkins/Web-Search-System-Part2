/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java
 */
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * WebSearchTest class.
 * @author Kento Hopkins
 * @version 2024.04.10
 */
public class WebSearchTest
{
    WebSearch ws;

    // ----------------------------------------------------------
    /**
     * Creat WebSearch class.
     */
    @Before
    public void setUp()
    {
        new WebCrawl();
        ws = new WebSearch();
        
    }
    
    // ----------------------------------------------------------
    /**
     * Check crawlWeb makes expected list.
     */
    @Test
    public void testCrawlWeb()
    {
        assertEquals(64, ws.getNumPages());
    }

    // ----------------------------------------------------------
    /**
     * Check getNumPages method that returns number of webPage on filtered list.
     */
    @Test
    public void testNetNumPages()
    {
        assertEquals(64, ws.getNumPages());
    }

    // ----------------------------------------------------------
    /**
     * Check getPage method that returns webPage based on index.
     */
    @Test
    public void testGetPage()
    {
        assertEquals("Appalachian State University", ws.getPage(0).getTitle());
        assertEquals("Barber-Scotia College", ws.getPage(1).getTitle());
        assertNull(ws.getPage(100));
        assertNull(ws.getPage(-1));
    }

    // ----------------------------------------------------------
    /**
     * Check filter method that returns expected to filter list.
     */
    @Test
    public void testFilter()
    {
        ArrayList<UnivWebPage> returnList = ws.filter((item) -> 
            item.getURL().toLowerCase().contains("q")||item.getTitle().toLowerCase().contains("q"));
        assertEquals(1, returnList.size());
        assertEquals("Queens University of Charlotte", returnList.get(0).getTitle());
    }

    // ----------------------------------------------------------
    /**
     * Check contains method that returns expected value which is list which is filterd.
     */
    @Test
    public void testContains()
    {
        assertEquals(1, ws.contains("q").size());
        assertEquals(0, ws.contains("x").size());
        assertEquals(40, ws.contains("university").size());
    }

    // ----------------------------------------------------------
    /**
     * Check foundedAfter method that returns expected value which is list which is filterd.
     */
    @Test
    public void testFoundedAfter()
    {
        assertEquals(25, ws.foundedAfter(1900).size());
    }

    // ----------------------------------------------------------
    /**
     * Check largerThan method that returns expected value which is list which is filterd.
     */
    @Test
    public void testLargerThan()
    {
        assertEquals(2, ws.largerThan(30000).size());
    }

    // ----------------------------------------------------------
    /**
     * Check univType method that returns expected value which is list which is filterd.
     */
    @Test
    public void testUnivType()
    {
        assertEquals(48, ws.univType("private").size());
    }

    // ----------------------------------------------------------
    /**
     * Check mixedSearch method that returns expected value which is list which is filterd.
     */
    @Test
    public void testMixedSearch()
    {
        assertEquals(8, ws.mixedSearch("private", 1900, 1000).size());
    }
}
