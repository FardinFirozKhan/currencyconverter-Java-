
package currencyconverter;


import java.text.DecimalFormat;

public class Convert {
    DecimalFormat df = new DecimalFormat("#.###");
    public String BD(String x){
        double a = Double.parseDouble(x);
        String b = df.format(a/83.541)+" $";
        return b;
    }
    public String IN(String x){
        double a = Double.parseDouble(x);
        String b = df.format(a/72.893)+" $";
        return b;
    }
    public String PK(String x){
        double a = Double.parseDouble(x);
        String b = df.format(a/165.952)+" $";
        return b;
    }
    public String SL(String x){
        double a = Double.parseDouble(x);
        String b = df.format(a/198.419)+" $";
        return b;
    }
    public String BT(String x){
        double a = Double.parseDouble(x);
        String b = df.format(a/72.893)+" $";
        return b;
    }
    public String MV(String x){
        double a = Double.parseDouble(x);
        String b = df.format(a/15.297)+" $";
        return b;
    }
    public String AF(String x){
        double a = Double.parseDouble(x);
        String b = df.format(a/82.982)+" $";
        return b;
    }
    public String NP(String x){
        double a = Double.parseDouble(x);
        String b = df.format(a/115.721)+" $";
        return b;
    }
}
