/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */

/**
 * UnivWebPage class.
 * @author Kento Hopkins
 * @version 2024.04.09
 */
public class UnivWebPage extends WebPage {
    private String type;
    private int enrollment;
    private int yearFounded;
    
    /**
     * Constructor, with a parameters and super constructor.
     * @param t title of web page
     * @param u URL of web page
     * @param cd createDate of web page
     * @param vd visitDate of web page
     */
    public UnivWebPage(String t, String u, String cd, String vd){
        super(t,u,cd,vd);
        this.type = null;
        this.enrollment = 0;
        this.yearFounded = 0000;
    }
   
    /**
     * Get type of university.
     * @return type of university either public or private.
     */
    public String getType(){
        return type;
    }
   
    /**
     * Get number of enrollment.
     * @return number of enrollment of university.
     */
    public int getEnrollment(){
        return enrollment;
    }
   
    /**
     * Get founded year of university.
     * @return founded year of university.
     */
    public int getYearFounded(){
        return yearFounded;
    }

    /**
     * Set type of university.
     * @param t type of university which is either public or private.
     */
    public void setType(String t){
        this.type = t;
    }
    
    /**
     * Set number of enrollment of university.
     * @param e number of enrollment of university.
     */
    public void setEnrollment(int e){
        this.enrollment = e;
    }
    
    /**
     * Set founded year of university.
     * @param y founded year of university.
     */
    public void setYearFounded(int y){
        this.yearFounded = y;
    }
}
