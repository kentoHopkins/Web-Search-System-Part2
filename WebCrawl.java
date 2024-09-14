import java.util.ArrayList;

/**
 * WebSearch class, calls a crawler and then allows
 * you to search a list of univ web pages in an ArrayList.
 * @author Manuel A. Perez-Quinones <perez.quinones@uncc.edu>
 */
public class WebCrawl {

    /**
     * Creates a list of page objects and returns them in an
     * array list. This is a simulation of a webcrawler. The
     * dataset used is for a set of university UnivWebPages for
     * intitutions in NC. The URLs have randomly added a www.
     * in front (not sure if that makes them invalid). The
     * created and visit date are fake, created randomly for
     * this simulation.
     * @return list of webpages used for testing
     */
    public static ArrayList<UnivWebPage> crawlWeb()
    {
        UnivWebPage a;
        ArrayList<UnivWebPage> list = new ArrayList<UnivWebPage>();

        a = new UnivWebPage("Appalachian State University",
            "http://appstate.edu", "2001/09/17", "2024/03/05");
        a.setYearFounded(1899);
        a.setType("Public");
        a.setEnrollment(20436);
        list.add(a);
        a = new UnivWebPage("Barber-Scotia College",
            "http://b-sc.edu", "1999/03/15", "2024/03/09");
        a.setYearFounded(1867);
        a.setType("Private");
        a.setEnrollment(120);
        list.add(a);
        a = new UnivWebPage("Barton College",
            "http://barton.edu", "2002/03/22", "2024/03/05");
        a.setYearFounded(1902);
        a.setType("Private");
        a.setEnrollment(1265);
        list.add(a);
        a = new UnivWebPage("Belmont Abbey College",
            "http://belmontabbeycollege.edu", "1996/07/15", "2024/02/02");
        a.setYearFounded(1876);
        a.setType("Private");
        a.setEnrollment(1501);
        list.add(a);
        a = new UnivWebPage("Bennett College",
            "http://www.bennett.edu", "2004/01/19", "2024/02/09");
        a.setYearFounded(1873);
        a.setType("Private");
        a.setEnrollment(168);
        list.add(a);
        a = new UnivWebPage("Brevard College",
            "http://brevard.edu", "2000/06/27", "2024/02/02");
        a.setYearFounded(1853);
        a.setType("Private");
        a.setEnrollment(759);
        list.add(a);
        a = new UnivWebPage("Cabarrus College of Health Sciences",
            "http://www.cabarruscollege.edu", "2000/09/24", "2024/02/05");
        a.setYearFounded(1942);
        a.setType("Private");
        a.setEnrollment(528);
        list.add(a);
        a = new UnivWebPage("Campbell University",
            "http://www.campbell.edu", "1992/04/24", "2024/02/07");
        a.setYearFounded(1887);
        a.setType("Private");
        a.setEnrollment(5272);
        list.add(a);
        a = new UnivWebPage("Carolina Christian College",
            "http://carolina.edu", "1993/08/22", "2024/03/01");
        a.setYearFounded(1945);
        a.setType("Private");
        a.setEnrollment(70);
        list.add(a);
        a = new UnivWebPage("Carolina College of Biblical Studies",
            "http://ccbs.edu", "1992/08/12", "2024/03/02");
        a.setYearFounded(1973);
        a.setType("Private");
        a.setEnrollment(152);
        list.add(a);
        a = new UnivWebPage("Carolina University",
            "http://carolinau.edu", "2002/04/24", "2024/02/08");
        a.setYearFounded(1945);
        a.setType("Private");
        a.setEnrollment(826);
        list.add(a);
        a = new UnivWebPage("Catawba College",
            "http://www.catawba.edu", "1999/04/26", "2024/02/01");
        a.setYearFounded(1851);
        a.setType("Private");
        a.setEnrollment(1172);
        list.add(a);
        a = new UnivWebPage("Charlotte Christian College and Theological Seminary",
            "http://www.charlottechristian.edu", "1994/07/13", "2024/03/01");
        a.setYearFounded(1996);
        a.setType("Private");
        a.setEnrollment(136);
        list.add(a);
        a = new UnivWebPage("Chowan University",
            "http://chowan.edu", "1991/02/15", "2024/03/03");
        a.setYearFounded(1848);
        a.setType("Private");
        a.setEnrollment(886);
        list.add(a);
        a = new UnivWebPage("Davidson College",
            "http://www.davidson.edu", "2001/07/24", "2024/02/01");
        a.setYearFounded(1837);
        a.setType("Private");
        a.setEnrollment(1927);
        list.add(a);
        a = new UnivWebPage("Duke University",
            "http://duke.edu", "1990/01/17", "2024/03/06");
        a.setYearFounded(1838);
        a.setType("Private");
        a.setEnrollment(18023);
        list.add(a);
        a = new UnivWebPage("East Carolina University",
            "http://www.ecu.edu", "1991/07/13", "2024/02/08");
        a.setYearFounded(1907);
        a.setType("Public");
        a.setEnrollment(27151);
        list.add(a);
        a = new UnivWebPage("Elizabeth City State University",
            "http://ecsu.edu", "1996/08/17", "2024/02/09");
        a.setYearFounded(1891);
        a.setType("Public");
        a.setEnrollment(2149);
        list.add(a);
        a = new UnivWebPage("Elon University",
            "http://www.elon.edu", "1998/03/12", "2024/02/05");
        a.setYearFounded(1889);
        a.setType("Private");
        a.setEnrollment(7123);
        list.add(a);
        a = new UnivWebPage("Fayetteville State University",
            "http://uncfsu.edu", "2003/04/14", "2024/02/07");
        a.setYearFounded(1867);
        a.setType("Public");
        a.setEnrollment(6787);
        list.add(a);
        a = new UnivWebPage("Gardner-Webb University",
            "http://www.gardner-webb.edu", "2003/07/16", "2024/03/02");
        a.setYearFounded(1905);
        a.setType("Private");
        a.setEnrollment(3144);
        list.add(a);
        a = new UnivWebPage("Greensboro College",
            "http://greensboro.edu", "1994/06/13", "2024/03/06");
        a.setYearFounded(1838);
        a.setType("Private");
        a.setEnrollment(826);
        list.add(a);
        a = new UnivWebPage("Guilford College",
            "http://www.guilford.edu", "2002/09/13", "2024/02/03");
        a.setYearFounded(1837);
        a.setType("Private");
        a.setEnrollment(1167);
        list.add(a);
        a = new UnivWebPage("Heritage Bible College",
            "http://heritagebiblecollege.edu", "1994/07/18", "2024/03/05");
        a.setYearFounded(1971);
        a.setType("Private");
        a.setEnrollment(26);
        list.add(a);
        a = new UnivWebPage("High Point University",
            "http://www.highpoint.edu", "1996/03/15", "2024/02/02");
        a.setYearFounded(1924);
        a.setType("Private");
        a.setEnrollment(5981);
        list.add(a);
        a = new UnivWebPage("Hood Theological Seminary",
            "http://hoodseminary.edu", "1999/07/21", "2024/02/02");
        a.setYearFounded(1879);
        a.setType("Private");
        a.setEnrollment(146);
        list.add(a);
        a = new UnivWebPage("Johnson & Wales University - Charlotte",
            "http://www.jwu.edu", "1998/07/20", "2024/02/09");
        a.setYearFounded(1914);
        a.setType("Private");
        a.setEnrollment(1140);
        list.add(a);
        a = new UnivWebPage("Johnson C. Smith University",
            "http://www.jcsu.edu", "1995/03/19", "2024/03/08");
        a.setYearFounded(1867);
        a.setType("Private");
        a.setEnrollment(1093);
        list.add(a);
        a = new UnivWebPage("Lees-McRae College",
            "http://www.lmc.edu", "1998/07/12", "2024/02/03");
        a.setYearFounded(1900);
        a.setType("Private");
        a.setEnrollment(855);
        list.add(a);
        a = new UnivWebPage("Lenoir–Rhyne University",
            "http://lr.edu", "1994/04/15", "2024/02/09");
        a.setYearFounded(1891);
        a.setType("Private");
        a.setEnrollment(2354);
        list.add(a);
        a = new UnivWebPage("Livingstone College",
            "http://www.livingstone.edu", "2001/06/19", "2024/03/03");
        a.setYearFounded(1879);
        a.setType("Private");
        a.setEnrollment(839);
        list.add(a);
        a = new UnivWebPage("Manna University",
            "http://www.manna.edu", "1992/05/19", "2024/02/08");
        a.setYearFounded(1978);
        a.setType("Private");
        a.setEnrollment(256);
        list.add(a);
        a = new UnivWebPage("Mars Hill University",
            "http://www.mhu.edu", "1996/07/21", "2024/03/02");
        a.setYearFounded(1856);
        a.setType("Private");
        a.setEnrollment(1032);
        list.add(a);
        a = new UnivWebPage("Meredith College",
            "http://www.meredith.edu", "2003/07/17", "2024/03/06");
        a.setYearFounded(1891);
        a.setType("Private");
        a.setEnrollment(1587);
        list.add(a);
        a = new UnivWebPage("Methodist University",
            "http://www.methodist.edu", "2002/04/13", "2024/02/08");
        a.setYearFounded(1956);
        a.setType("Private");
        a.setEnrollment(1811);
        list.add(a);
        a = new UnivWebPage("Mid-Atlantic Christian University",
            "http://macuniversity.edu", "2003/05/19", "2024/02/04");
        a.setYearFounded(1948);
        a.setType("Private");
        a.setEnrollment(133);
        list.add(a);
        a = new UnivWebPage("Montreat College",
            "http://www.montreat.edu", "2000/02/25", "2024/03/09");
        a.setYearFounded(1916);
        a.setType("Private");
        a.setEnrollment(972);
        list.add(a);
        a = new UnivWebPage("North Carolina A&T State University",
            "http://ncat.edu", "2000/05/23", "2024/03/05");
        a.setYearFounded(1891);
        a.setType("Public");
        a.setEnrollment(13487);
        list.add(a);
        a = new UnivWebPage("North Carolina Central University",
            "http://nccu.edu", "1999/09/21", "2024/03/02");
        a.setYearFounded(1909);
        a.setType("Public");
        a.setEnrollment(7553);
        list.add(a);
        a = new UnivWebPage("North Carolina State University",
            "http://www.ncsu.edu", "1990/02/12", "2024/03/03");
        a.setYearFounded(1887);
        a.setType("Public");
        a.setEnrollment(36700);
        list.add(a);
        a = new UnivWebPage("North Carolina Wesleyan University",
            "http://ncwu.edu", "1997/09/23", "2024/03/02");
        a.setYearFounded(1956);
        a.setType("Private");
        a.setEnrollment(1337);
        list.add(a);
        a = new UnivWebPage("Pfeiffer University",
            "http://pfeiffer.edu", "1995/07/12", "2024/03/01");
        a.setYearFounded(1885);
        a.setType("Private");
        a.setEnrollment(1076);
        list.add(a);
        a = new UnivWebPage("Queens University of Charlotte",
            "http://queens.edu", "1998/08/15", "2024/02/09");
        a.setYearFounded(1857);
        a.setType("Private");
        a.setEnrollment(1873);
        list.add(a);
        a = new UnivWebPage("Saint Augustine's University",
            "http://www.st-aug.edu", "1995/06/16", "2024/03/06");
        a.setYearFounded(1867);
        a.setType("Private");
        a.setEnrollment(1108);
        list.add(a);
        a = new UnivWebPage("Salem College",
            "http://salem.edu", "2003/01/15", "2024/02/05");
        a.setYearFounded(1772);
        a.setType("Private");
        a.setEnrollment(469);
        list.add(a);
        a = new UnivWebPage("Shaw University",
            "http://www.shawu.edu", "1991/02/18", "2024/03/06");
        a.setYearFounded(1865);
        a.setType("Private");
        a.setEnrollment(1067);
        list.add(a);
        a = new UnivWebPage("Shepherds Theological Seminary",
            "http://www.shepherds.edu", "1993/05/19", "2024/02/01");
        a.setYearFounded(2003);
        a.setType("Private");
        a.setEnrollment(161);
        list.add(a);
        a = new UnivWebPage("Southeastern Baptist Theological Seminary",
            "http://sebts.edu", "2002/01/15", "2024/02/02");
        a.setYearFounded(1950);
        a.setType("Private");
        a.setEnrollment(2764);
        list.add(a);
        a = new UnivWebPage("Southeastern Free Will Baptist College",
            "http://www.sfwbc.edu", "1997/09/13", "2024/02/09");
        a.setYearFounded(1983);
        a.setType("Private");
        a.setEnrollment(74);
        list.add(a);
        a = new UnivWebPage("St. Andrews University",
            "http://sa.edu", "1998/03/17", "2024/02/03");
        a.setYearFounded(1896);
        a.setType("Private");
        a.setEnrollment(809);
        list.add(a);
        a = new UnivWebPage("University of Mount Olive",
            "http://umo.edu", "2000/05/16", "2024/03/01");
        a.setYearFounded(1951);
        a.setType("Private");
        a.setEnrollment(2239);
        list.add(a);
        a = new UnivWebPage("University of North Carolina at Asheville",
            "http://www.unca.edu", "2004/05/19", "2024/03/08");
        a.setYearFounded(1927);
        a.setType("Public");
        a.setEnrollment(2914);
        list.add(a);
        a = new UnivWebPage("University of North Carolina at Chapel Hill",
            "http://unc.edu", "1995/07/27", "2024/02/01");
        a.setYearFounded(1789);
        a.setType("Public");
        a.setEnrollment(31705);
        list.add(a);
        a = new UnivWebPage("University of North Carolina at Charlotte",
            "http://www.uncc.edu", "2002/07/12", "2024/02/09");
        a.setYearFounded(1946);
        a.setType("Public");
        a.setEnrollment(29551);
        list.add(a);
        a = new UnivWebPage("University of North Carolina at Greensboro",
            "http://uncg.edu", "1991/01/13", "2024/02/03");
        a.setYearFounded(1891);
        a.setType("Public");
        a.setEnrollment(17978);
        list.add(a);
        a = new UnivWebPage("University of North Carolina at Pembroke",
            "http://www.uncp.edu", "1991/06/12", "2024/02/01");
        a.setYearFounded(1887);
        a.setType("Public");
        a.setEnrollment(7666);
        list.add(a);
        a = new UnivWebPage("University of North Carolina at Wilmington",
            "http://www.uncw.edu", "2003/02/15", "2024/03/03");
        a.setYearFounded(1947);
        a.setType("Public");
        a.setEnrollment(17843);
        list.add(a);
        a = new UnivWebPage("University of North Carolina School of the Arts",
            "http://www.uncsa.edu", "1997/04/26", "2024/03/04");
        a.setYearFounded(1963);
        a.setType("Public");
        a.setEnrollment(1104);
        list.add(a);
        a = new UnivWebPage("Wake Forest University",
            "http://www.wfu.edu", "1991/04/23", "2024/03/05");
        a.setYearFounded(1834);
        a.setType("Private");
        a.setEnrollment(8963);
        list.add(a);
        a = new UnivWebPage("Warren Wilson College",
            "http://warren-wilson.edu", "2001/02/15", "2024/02/06");
        a.setYearFounded(1894);
        a.setType("Private");
        a.setEnrollment(793);
        list.add(a);
        a = new UnivWebPage("Western Carolina University",
            "http://www.wcu.edu", "1991/02/12", "2024/02/05");
        a.setYearFounded(1889);
        a.setType("Public");
        a.setEnrollment(11635);
        list.add(a);
        a = new UnivWebPage("William Peace University",
            "http://www.peace.edu", "2001/03/12", "2024/03/04");
        a.setYearFounded(1857);
        a.setType("Private");
        a.setEnrollment(713);
        list.add(a);
        a = new UnivWebPage("Wingate University",
            "http://www.wingate.edu", "1998/05/22", "2024/03/02");
        a.setYearFounded(1896);
        a.setType("Private");
        a.setEnrollment(3396);
        list.add(a);
        a = new UnivWebPage("Winston-Salem State University",
            "http://wssu.edu", "1993/02/13", "2024/03/07");
        a.setYearFounded(1892);
        a.setType("Public");
        a.setEnrollment(5004);
        list.add(a);

        return list;
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