import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * WebCrawlTest test WebCrawl.
 * @author Manuel A. Perez-Quinones <perez.quinones@uncc.edu>
 */
public class WebCrawlTest {

    private ArrayList<UnivWebPage> list;

    /**
     * Set things up.
     */
    @Before
    public void setUp()
    {
        list = WebCrawl.crawlWeb();
    }

    /**
     * Test crawl.
     */
    @Test
    public void testCrawl()
    {
        assertEquals("Number of pages returned is wrong",
            64, list.size());
    }

    /**
     * Test a few specific pages from the crawl.
     */
    @Test
    public void testGetPage()
    {
        assertEquals("WebPage at position [0]",
            "http://appstate.edu", list.get(0).getURL());
        assertEquals("WebPage at position [1]",
            "http://b-sc.edu", list.get(1).getURL());
        assertEquals("WebPage at position [62]",
            "http://www.wingate.edu", list.get(62).getURL());
        assertEquals("WebPage at position [63]",
            "http://wssu.edu", list.get(63).getURL());
    }
}

/*
 * Copyright: This programming assignment specification and the 
 * provided sample code are protected by copyright. The professor 
 * is the exclusive owner of copyright of this material. You are 
 * encouraged to take notes and make copies of the specification 
 * and the source code for your own educational use. However, you 
 * may not, nor may you knowingly allow others to reproduce or 
 * distribute the materials publicly without the express written 
 * consent of the professor. This includes providing materials to 
 * commercial course material suppliers such as CourseHero and 
 * other similar services. Students who publicly distribute or 
 * display or help others publicly distribute or display copies or 
 * modified copies of this material may be in violation of 
 * University Policy 406, The Code of Student Responsibility
 * https://legal.uncc.edu/policies/up-406.
 */