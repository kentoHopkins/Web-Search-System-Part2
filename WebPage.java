/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */

/**
 * WebPage class.
 * @author Kento Hopkins
 * @version 2024.03.20
 */
public class WebPage
{
    private String title;
    private String url;
    private String createDate;
    private String visitDate;

    /**
     * Constructor, with a parameters.
     * @param t title of web page
     * @param u URL of web page
     * @param cd createDate of web page
     * @param vd visitDate of web page
     */
    public WebPage(String t, String u, String cd, String vd)
    {
        title = t;
        url = u;
        createDate = cd;
        visitDate = vd;
    }
    
    /**
     * Get title of web page.
     * @return title of web page
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Get URL of web page.
     * @return URL of web page
     */
    public String getURL()
    {
        return url;
    }

    /**
     * Get create date of web page.
     * @return create date of web page
     */
    public String getCreateDate()
    {
        return createDate;
    }

    /**
     * Get visit date of web page.
     * @return visit date of web page
     */
    public String getVisitDate()
    {
        return visitDate;
    }

    /**
     * From URL, get the domain which is either after :// or www. part.
     * @return domain of web page
     */
    public String getDomain()
    {
        if(this.url != null){
            String[] urlStr = this.url.split("://");
            int strLength = (urlStr.length) - 1;
            String[] urlSubStr = urlStr[strLength].split("[.]", 0);
            if(urlSubStr.length >= 2){
                int returnIndex = urlSubStr.length - 2;
                return urlSubStr[returnIndex];
            }
        }
        return null;
    }

    /**
     * Combine title and URL and return it.
     * @return combination of title and URL.
     */
    @Override
    public String toString()
    {
        String returnStr = title + " <" + url + ">";
        return returnStr;
    }

    /**
     * Get title of web page.
     * @param o an object that will be compared with one we have in this class.
     * @return true or false
     */
    @Override
    public boolean equals(Object o)
    {
        String thisURL = (this.url).toLowerCase();
        if(o == null){
            return false;
        }
        else{
            if (o instanceof WebPage) {
                String otherURL = (((WebPage)o).getURL()).toLowerCase();
                if (thisURL.equals(otherURL)) {
                    return true;
                }
            }
            else if (o instanceof String) {
                String str = ((String)o).toLowerCase();
                if(thisURL.equals(str)){
                    return true;
                }
            }
        }
        return false;
    }
}