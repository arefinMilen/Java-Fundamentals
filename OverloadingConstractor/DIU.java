
package OverloadingConstractor;


public class DIU {
    String dept;
    int batch;
    int season;
    DIU()
    {
        System.out.println("no information");
    }
    DIU(String dept,int batch)
    {
        this.dept =dept;
        this.batch =batch;
    }
    DIU(String dept,int batch,int season)
    {
        this.dept = dept;
        this.batch = batch;
        this.season = season;
    }
    void info()
    {
        System.out.println("department is :"+dept);
        System.out.println("batch is :"+batch);
        System.out.println("season is :"+season);
        System.out.println("");
    }
}
