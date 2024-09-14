/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * WebSearch class.
 * @author Kento Hopkins
 * @version 2024.04.09
 */
public class WebSearch extends WebSearchADT<UnivWebPage>
{
    /**
     * Constructor for WebSearch.
     */
    public WebSearch(){
        super();
    }
    
    /**
     * crawlWeb method to set ArrayList.
     */
    public void crawlWeb(){
        this.list = WebCrawl.crawlWeb();
    }
    
    /**
     * filter method that filter list by Predicate.
     * @param pred ArrayList of Predicate
     * @return filtered list
     */
    @Override
    public ArrayList<UnivWebPage> filter(Predicate<UnivWebPage> pred){
        ArrayList<UnivWebPage> results = new ArrayList<UnivWebPage>();
        for(UnivWebPage uw : list){
            if(pred.test(uw)){results.add(uw);}
        }
        return results;
    }
    
    /**
     * filter method that filter list by specific string.
     * @param s String that you expect URL and title of elements to contain
     * @return filtered list
     */
    @Override
    public ArrayList<UnivWebPage> contains(String s){
        String sl = s.toLowerCase();
        return this.filter((item) -> item.getURL().toLowerCase().contains(sl)||
        item.getTitle().toLowerCase().contains(sl));
    }
    
    /**
     * filter method that filter list by year.
     * @param year founded year of college
     * @return filtered list
     */
    @Override
    public ArrayList<UnivWebPage> foundedAfter(int year){
        return this.filter((item) -> item.getYearFounded()>year);
    }
    
    /**
     * filter method that filter list by size.
     * @param size number of enrollment
     * @return filtered list
     */
    @Override
    public  ArrayList<UnivWebPage> largerThan(int size){
        return this.filter((item) -> item.getEnrollment()>size);
    }
    
    /**
     * filter method that filter list by type of college.
     * @param t Type of university.
     * @return filtered list.
     */
    @Override
    public ArrayList<UnivWebPage> univType(String t){
        String tl = t.toLowerCase();
        return this.filter((item) -> item.getType().toLowerCase().equals(tl));
    }
    
    /**
     * filter method that filter list by specific string.
     * @param t Type of university.
     * @param y founded year of college.
     * @param e number of enrollment.
     * @return filtered list.
     */
    @Override
    public ArrayList<UnivWebPage> mixedSearch(String t, int y, int e){
        String tl = t.toLowerCase();
        return this.filter((item) -> item.getYearFounded()>y && 
        item.getEnrollment()>e && item.getType().toLowerCase().contains(tl));
    }
}
