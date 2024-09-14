/**
 * WebSearch class, calls a crawler and then allows
 * you to search a list of univ web pages in an ArrayList.
 * @author Manuel A. Perez-Quinones <perez.quinones@uncc.edu>
 */

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * WebSearch class.
 * @param <E> generic parameter for this class.
 */
public abstract class WebSearchADT<E> {

    /**
     * List of WebPage objects.
     */
    protected ArrayList<E> list = null;

    /**
     * Constructor for this class. Sole purpose is
     * to call the crawler and collect the web pages
     * and store them locally.
     */
    public WebSearchADT()
    {
        crawlWeb();
    }

    /**
     * Returns the number of pages in the internal
     * list.
     * @return number of pages
     */
    public int getNumPages()
    {
        return list.size();
    }

    /**
     * Index-based access to the pages stored in
     * the internal list.
     * @param index into the internal list
     * @return E stored at location index
     */
    public E getPage(int index)
    {
        if(index >= 0 && index < list.size()){return list.get(index);}
        else{return null;}
    }

    /**
     * Creates a list of page objects and returns them in an
     * array list. This is a simulation of a webcrawler. The
     * dataset used is for a set of university UnivWebPages for
     * intitutions in NC. The URLs have randomly added a www.
     * in front (not sure if that makes them invalid). The
     * created and visit date are fake, created randomly for
     * this simulation.
     */
    public abstract void crawlWeb();

    /**
     * Creates a new ArrayList and includes in it only
     * those elements from the list that return true when 
     * called as arguments to the predicate.
     * @param pred Predicate used for filtering the list.
     * @return ArrayList with results of filtering.
     */
    public abstract ArrayList<UnivWebPage> filter(
        Predicate<UnivWebPage> pred);

    /**
     * Filters the collection returning a list of universities that
     * contain s in the URL or the page title. Given
     * already up above, this is a freebie.
     * @param s string to be check in filtering
     * @return ArrayList with results of filtering.
     */
    public abstract ArrayList<UnivWebPage> contains(String s);

    /**
     * Filters the collection returning a list of universities that
     * were founded after year.
     * @param year filter list for univ founded after 'year'
     * @return ArrayList with results of filtering.
     */
    public abstract ArrayList<UnivWebPage> foundedAfter(int year);

    /**
     * Filters the collection returning a list of universities
     * with more than size in enrollment.
     * @param size filter list for univ with more than 'size' enrollment
     * @return ArrayList with results of filtering.
     */
    public abstract ArrayList<UnivWebPage> largerThan(int size);

    /**
     * Filters the collection returning a list of universities
     * with that include in their type the string
     * specified in t. Note that type can have
     * upper and lower case, so make sure you compare using
     * case insensitive operations.
     * @param t filter list for universities of type 't'
     * @return ArrayList with results of filtering.
     */
    public abstract ArrayList<UnivWebPage> univType(String t);

    /**
     * Filters the collection returning a list of universities
     * with that include in their control the string
     * in c and include in their type 
     * the string specified in t and were founded
     * after year y. Note that type and control 
     * can have upper and lower case, so make sure you compare 
     * using case insensitive operations.
     * 
     * @param t filter universities of type 't'
     * @param y filter universities founded after 'y'
     * @param e filter universities with more than 'e' students
     * @return ArrayList with results of filtering.
     */
    public abstract ArrayList<UnivWebPage> mixedSearch(String t, int y, int e);

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