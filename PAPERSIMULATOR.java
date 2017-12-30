
/**
 * Write a description of class PAPERSIMULATOR here.
 * 
 * @author (MOHIT) 
 * @version (Feb-28-2014)
 */
import java.io.*;
public class PAPERSIMULATOR
{
  public static void main(String args[]) throws IOException
    {
     double a,b,sulphur = 12.69f,water = 57450.331f, lime = 43.874, dye= 2.483, starch = 13.521, fs, fw, fl, fd, fstarch , kg_paper =0.0, ream=0.0,paper, trees= 0.0,bamboo = 2200.0,csoda = 150.0,cl =  120.0,tpowder = 200.0,alum = 50.0,rosin = 10.0,dyeb = (50.0/1000),foil=40.0,waterb = 0.25,fbamboo,fcsoda ,fcl,ftpowder ,falum ,frosin ,fdyeb, ffoil, fwaterb,bkg_paper; 
     System.out.println("                Manufacturing of paper                 ");
     InputStreamReader read = new InputStreamReader(System.in);
     BufferedReader stdin= new BufferedReader(read);
     int y = 1;
     while(y!=0) 
     {
      System.out.println("Enter 1 for wood in cubic metre,Enter 2 for bamboo");
     System.out.println("Enter your choice");
      y = Integer.parseInt(stdin.readLine());
     
     if(y==1)
     {
     System.out.println("Basic Raw materials needed for the manufacturing of paper from wood are :- wood,water,sulphur,lime,dye and starch.");   
     System.out.println("Enter wood in Cubic metre.");
     a = Float.parseFloat(stdin.readLine());
     fs = a * sulphur;
     fw = a * water;
     fl = a * lime;
     fd = a * dye;
     fstarch = a * starch;
     kg_paper = a * 177.316;
     ream = kg_paper / 2.5;
     paper = ream * 500;  
     trees = a * 4.255; 
     System.out.println("Amount of sulphur used " + "  " + " = " + fs);
     System.out.println("Amount of water used in mcube " + " " + " = " + fw);
     System.out.println("Amount of lime used " + " " + " = "  + fl);
     System.out.println("Amount of dye used " +  "    " + " = " + fd);
     System.out.println("Amount of starch used " + "  "  + " = " + fstarch);
     System.out.println("Amount of paper manufactured in kilograms " + "  " + " = " +  kg_paper);
     System.out.println("Paper manufactured in reams" + "  " + " = " + ream);
     System.out.println("Number of sheets manufactured" + " " + " = " + paper);
     System.out.println("You have cut this many trees " + "   " + " = " + trees);
     
     
    }
    else
    if(y==2)
    {
    System.out.println("Basic Raw materials needed for the manufacturing of paper from bamboo are :- Bamboo,Caustic soda,Chlorine,Talcum Powder,Alum,Rosin,Dyes,Furnace Oil and water.");     
    System.out.println("Enter Bamboo in Cubic metre.");
    b = Float.parseFloat(stdin.readLine());
    fbamboo = b * bamboo;
    fcsoda =  b * csoda;
    fcl = b * cl;
    ftpowder = b * tpowder;
    falum = b * alum;
    frosin = b*rosin;
    fdyeb = b * dyeb;
    ffoil = b * foil;
    fwaterb = b * waterb;   
    bkg_paper = b * 1100;
    System.out.println("Amount of bamboo used " + " "  + fbamboo);
    System.out.println("Amount of caustic soda used = " + " " + fcsoda);
    System.out.println("Amount of chlorine used = " + " "  + fcl);
    System.out.println("Amount of talcum powder used =" + " " + ftpowder);
    System.out.println("Amount of rosin used = " + " " + frosin);
    System.out.println("Amount of dye used = " + " " + fdyeb);
    System.out.println("Amount of furnace oil used  = " + " " + ffoil);
    System.out.println("Amount of water used = " + " " + fwaterb);
    System.out.println("Amount of paper manufactured in kilograms" + " = " + " " + bkg_paper);
    System.out.println("Amount of paper manufactured in reams = " + " " + (bkg_paper/2.5));
    System.out.println("Number of sheets mannufactured = " +  "  "  + ((bkg_paper/2.5)*500));
}
else
if((y!=1) || (y!=2))
System.out.println("Thank you for using the program.");
}
}
}

