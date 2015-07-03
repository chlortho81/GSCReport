/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gscreport;


/*  b
  This is the hard-coded template for Dad's report. It is to be an applet with fields
  where he can enter the quantity of Demos, Worksheets, Solds (First and BB), and total
  Ups (FirstUps and BBUps). The raw daily 

  BY: Aaron Whittle, Programmer Extraordinair
*/

/*
  This class will contain the variables (desired outputs) of each Garlyn Shelton dealership.
  For convenience, the code is arranged in pattern with Ed Whittle's infamous, "Report."
  *NOTE* As of right now, the variables for "EOM <the previous year>", "As of current date of
  previous year", and "Percent Plus or minus <MTD previous year>" do not exist; we do not
  have the historical sales performance data for the Garlyn Shelton Companies.
*/

import java.util.Scanner;

// 
class Dealerec {
    String location;
    double firstsold;
    double delivered;
    double booked;
    double firstups;
    double bbups;
    double bbsold;
    double totalups;
    double totalsold;

    // RE: Field J1 - What is this, sales for the next day??

    /*
        This method will calculate the dealer's booked-to-sold ratio. It must return a percentage. 
    */
    double calc_booked_sold_percent() {  
        double x = ((booked / totalsold * 100) + .5);
        System.out.printf("The booked to sold ratio is %.0f %%", x);
        System.out.println();
        return x;
    }
    /*
        This method will calculate the dealer's booked-to-sold ratio. It must return a percentage. 
    */    
    double calc_first_close_percent() {  // This needs to return a percentage
        double y = ((firstsold / firstups * 100) + .5);
        System.out.printf("The first time close percentage is %.0f %%", y);
        System.out.println();
        return y;
    }

    double calc_bb_close_percent() { // This needs to return a percentage
        double z = ((bbsold / bbups * 100) + .5);
        System.out.printf("The BeBack close percentage is %.0f %%", z);
        System.out.println();
        return z;
    }

    double calc_total_close_percent() { // This needs to return a percentage
        double w = ((totalsold / totalups * 100) + .5);
        System.out.printf("The total closing percentage is %.0f %%", w);
        System.out.println();
        return w;
    }    
}

class theReport {

    public static void main(String args[]) {

        Dealerec bmwvolvomazda = new Dealerec();
        Dealerec cadillac = new Dealerec();
        Dealerec nissan = new Dealerec();
        Dealerec vwtemple = new Dealerec();
        Dealerec mercedes = new Dealerec();
        Dealerec bryan = new Dealerec();
          
        double booked_sold_percent, first_close_percent, bb_close_percent, total_close_percent = 0;
                
        Scanner in = new Scanner(System.in);

        // Assign values to each dealerships' variables

        // BMW/VOL/MAZ

        bmwvolvomazda.location = "BMW/VOL/MAZ";

        System.out.println("Enter the numbers for: " + bmwvolvomazda.location);
        System.out.println();

        System.out.println("The Total Sold for the month is: ");
        bmwvolvomazda.totalsold = in.nextDouble();

        System.out.println("The number of cars delivered for the month is: ");
        bmwvolvomazda.delivered = in.nextDouble();

        System.out.println("The number of cars booked for the month is: ");
        bmwvolvomazda.booked = in.nextDouble();

        System.out.println("The total ups for the month is: ");
        bmwvolvomazda.totalups = in.nextDouble();

        System.out.println("The total of first ups for the month is: ");
        bmwvolvomazda.firstups = in.nextDouble();

        System.out.println("The first sold for the month is: ");
        bmwvolvomazda.firstsold = in.nextDouble();

        System.out.println("The number of beback ups is: ");
        bmwvolvomazda.bbups = in.nextDouble();

        System.out.println("The number beback sold is: ");
        bmwvolvomazda.bbsold = in.nextDouble();

        // Cadillac

        cadillac.location = "Cadillac";

        System.out.println("Enter the numbers for: " + cadillac.location);
        System.out.println();

        System.out.println("The Total Sold for the month is: ");
        cadillac.totalsold = in.nextDouble();

        System.out.println("The number of cars delivered for the month is: ");
        cadillac.delivered = in.nextDouble();

        System.out.println("The number of cars booked for the month is: ");
        cadillac.booked = in.nextDouble();

        System.out.println("The total ups for the month is: ");
        cadillac.totalups = in.nextDouble();

        System.out.println("The total of first ups for the month is: ");
        cadillac.firstups = in.nextDouble();

        System.out.println("The first sold for the month is: ");
        cadillac.firstsold = in.nextDouble();

        System.out.println("The number of beback ups is: ");
        cadillac.bbups = in.nextDouble();

        System.out.println("The number beback sold is: ");
        cadillac.bbsold = in.nextDouble();

        // Nissan

        nissan.location = "Nissan";

        System.out.println("Enter the numbers for: " + nissan.location);
        System.out.println();

        System.out.println("The Total Sold for the month is: ");
        nissan.totalsold = in.nextDouble();

        System.out.println("The number of cars delivered for the month is: ");
        nissan.delivered = in.nextDouble();

        System.out.println("The number of cars booked for the month is: ");
        nissan.booked = in.nextDouble();

        System.out.println("The total ups for the month is: ");
        nissan.totalups = in.nextDouble();

        System.out.println("The total of first ups for the month is: ");
        nissan.firstups = in.nextDouble();

        System.out.println("The first sold for the month is: ");
        nissan.firstsold = in.nextDouble();

        System.out.println("The number of beback ups is: ");
        nissan.bbups = in.nextDouble();

        System.out.println("The number beback sold is: ");
        nissan.bbsold = in.nextDouble();

        // VWTemple

        vwtemple.location = "Nissan";

        System.out.println("Enter the numbers for: " + vwtemple.location);
        System.out.println();

        System.out.println("The Total Sold for the month is: ");
        vwtemple.totalsold = in.nextDouble();

        System.out.println("The number of cars delivered for the month is: ");
        vwtemple.delivered = in.nextDouble();

        System.out.println("The number of cars booked for the month is: ");
        vwtemple.booked = in.nextDouble();

        System.out.println("The total ups for the month is: ");
        vwtemple.totalups = in.nextDouble();

        System.out.println("The total of first ups for the month is: ");
        vwtemple.firstups = in.nextDouble();

        System.out.println("The first sold for the month is: ");
        vwtemple.firstsold = in.nextDouble();

        System.out.println("The number of beback ups is: ");
        vwtemple.bbups = in.nextDouble();

        System.out.println("The number beback sold is: ");
        vwtemple.bbsold = in.nextDouble();

        // Mercedes

        mercedes.location = "Mercedes Benz of Georgetown";

        System.out.println("Enter the numbers for: " + mercedes.location);
        System.out.println();

        System.out.println("The Total Sold for the month is: ");
        mercedes.totalsold = in.nextDouble();

        System.out.println("The number of cars delivered for the month is: ");
        mercedes.delivered = in.nextDouble();

        System.out.println("The number of cars booked for the month is: ");
        mercedes.booked = in.nextDouble();

        System.out.println("The total ups for the month is: ");
        mercedes.totalups = in.nextDouble();

        System.out.println("The total of first ups for the month is: ");
        mercedes.firstups = in.nextDouble();

        System.out.println("The first sold for the month is: ");
        mercedes.firstsold = in.nextDouble();

        System.out.println("The number of beback ups is: ");
        mercedes.bbups = in.nextDouble();

        System.out.println("The number beback sold is: ");
        mercedes.bbsold = in.nextDouble();

        // Bryan Imports

        bryan.location = "Bryan Imports";

        System.out.println("Enter the numbers for: " + bryan.location);
        System.out.println();

        System.out.println("The Total Sold for the month is: ");
        bryan.totalsold = in.nextDouble();

        System.out.println("The number of cars delivered for the month is: ");
        bryan.delivered = in.nextDouble();

        System.out.println("The number of cars booked for the month is: ");
        bryan.booked = in.nextDouble();

        System.out.println("The total ups for the month is: ");
        bryan.totalups = in.nextDouble();

        System.out.println("The total of first ups for the month is: ");
        bryan.firstups = in.nextDouble();

        System.out.println("The first sold for the month is: ");
        bryan.firstsold = in.nextDouble();

        System.out.println("The number of beback ups is: ");
        bryan.bbups = in.nextDouble();

        System.out.println("The number beback sold is: ");
        bryan.bbsold = in.nextDouble();
        // Let's output the percentages

        System.out.println("Here are your percentages: ");
        System.out.println();

        // Let's create the inner class of type = CompanyWide

        class CompanyWide {
            String location;
            double company_totalsold;
            double company_delivered;
            double company_booked;
            double company_totalups;
            double company_firstups;
            double company_firstsold;
            double company_bbups;
            double company_bbsold;

            double calc_company_booked_sold_percent(){
                double a = (((bmwvolvomazda.booked + cadillac.booked + nissan.booked + vwtemple.booked + mercedes.booked + bryan.booked) / (bmwvolvomazda.totalsold + cadillac.totalsold + nissan.totalsold + vwtemple.totalsold + mercedes.totalsold + bryan.totalsold) * 100) + .5);
                System.out.printf("The booked-to-sold ratio for the company is %.0f %%", a);
                System.out.println();
                return a;
            }
            double calc_company_first_close_percent(){
                double b = (((bmwvolvomazda.firstsold + cadillac.firstsold + nissan.firstsold + vwtemple.firstsold + mercedes.firstsold + bryan.firstsold) / (bmwvolvomazda.firstups + cadillac.firstups + nissan.firstups + vwtemple.firstups + mercedes.firstups + bryan.firstups) * 100) + .5);
                System.out.printf("The first time close percentage for the company is %.0f %%", b);
                System.out.println();
                return b;
            }
            double calc_company_bb_close_percent(){
                double c = (((bmwvolvomazda.bbsold + cadillac.bbsold + nissan.bbsold + vwtemple.bbsold + mercedes.bbsold + bryan.bbsold) / (bmwvolvomazda.bbups + cadillac.bbups + nissan.bbups + vwtemple.bbups + mercedes.bbups + bryan.bbups) * 100) + .5);
                System.out.printf("The beback close percentage for the company is %.0f %%", c);
                System.out.println();
                return c;
            }
            double calc_company_total_close_percent(){
                double d = (((bmwvolvomazda.totalsold + cadillac.totalsold + nissan.totalsold + vwtemple.totalsold + mercedes.totalsold + bryan.totalsold) / (bmwvolvomazda.totalups + cadillac.totalups + nissan.totalups + vwtemple.totalups + mercedes.totalups + bryan.totalups) * 100) + .5);
                System.out.printf("The total closing percentage for the company is %.0f %%", d);
                System.out.println();
                return d;
            }
        }

        CompanyWide gsCompanies = new CompanyWide();
        double company_booked_sold_percent, company_first_close_percent, company_bb_close_percent, company_total_close_percent = 0;
        
        // Let's instantiate our methods from class Dealerec

        System.out.println("BMW/VOL/MAZ");
        booked_sold_percent = bmwvolvomazda.calc_booked_sold_percent();
        first_close_percent = bmwvolvomazda.calc_first_close_percent();
        bb_close_percent = bmwvolvomazda.calc_bb_close_percent();
        total_close_percent = bmwvolvomazda.calc_total_close_percent();

        System.out.println("Cadillac");
        booked_sold_percent = cadillac.calc_booked_sold_percent();
        first_close_percent = cadillac.calc_first_close_percent();
        bb_close_percent = cadillac.calc_bb_close_percent();
        total_close_percent = cadillac.calc_total_close_percent();

        System.out.println("Nissan");
        booked_sold_percent = nissan.calc_booked_sold_percent();
        first_close_percent = nissan.calc_first_close_percent();
        bb_close_percent = nissan.calc_bb_close_percent();
        total_close_percent = nissan.calc_total_close_percent();

        System.out.println("VW Temple");
        booked_sold_percent = vwtemple.calc_booked_sold_percent();
        first_close_percent = vwtemple.calc_first_close_percent();
        bb_close_percent = vwtemple.calc_bb_close_percent();
        total_close_percent = vwtemple.calc_total_close_percent();

        System.out.println("Mercedes Benz of Georgetown");
        booked_sold_percent = mercedes.calc_booked_sold_percent();
        first_close_percent = mercedes.calc_first_close_percent();
        bb_close_percent = mercedes.calc_bb_close_percent();
        total_close_percent = mercedes.calc_total_close_percent();

        System.out.println("Bryan Imports");
        booked_sold_percent = bryan.calc_booked_sold_percent();
        first_close_percent = bryan.calc_first_close_percent();
        bb_close_percent = bryan.calc_bb_close_percent();
        total_close_percent = bryan.calc_total_close_percent();

        System.out.println("Garlyn Shelton Companies");
        company_booked_sold_percent = gsCompanies.calc_company_booked_sold_percent();
        company_first_close_percent = gsCompanies.calc_company_first_close_percent();
        company_bb_close_percent = gsCompanies.calc_company_bb_close_percent();
        company_total_close_percent = gsCompanies.calc_company_total_close_percent();

    }
}
