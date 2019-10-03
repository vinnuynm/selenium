package com.icici.loans.carloans;

public class StudentClassWithMultipleMethods {
	public static void main(String arg[])
    {
        Student srini = new Student();
        srini.name = "Srinivas";
        srini.english = 87;
        srini.telugu = 84;
        srini.hindi = 76;
        srini.maths = 100;
        srini.science = 92;
        srini.social = 88;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Detailed Marks");
        System.out.println("-------------------------------------------------");
        srini.printMarksDetails();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Summary Marks");
        System.out.println("-------------------------------------------------");
        srini.printMarksSummary();
        System.out.println("-------------------------------------------------");    
    }
}

class Student
{
    String name;
    // Marks in various subjects
    int english;
    int telugu;
    int hindi;
    int maths;
    int science;
    int social;

    int getLanguagesTotal()
    {
        return english + telugu + hindi;
    }

    int getNonLanguagesTotal()
    {
        return maths + science + social;
    }

    int getAllSubjectsTotal()
    {
        return getLanguagesTotal() + getNonLanguagesTotal();
    }

    double getPCMPercentage()
    {
        return 100.0 * (maths + science) / 200.0;
    }
    
    void printMarksDetails()
    {
        System.out.println("English : " + english);
        System.out.println("Telugu : " + telugu);
        System.out.println("Hindi : " + hindi);
        System.out.println("Maths : " + maths);
        System.out.println("Science : " + science);
        System.out.println("Social : " + social);
    }

    void printMarksSummary()
    {
        System.out.println("Languages: " + getLanguagesTotal());
        System.out.println("Non languages: " + getNonLanguagesTotal());
        System.out.println("PCM Percentage: " + getPCMPercentage());
        System.out.println("Total: " + getAllSubjectsTotal());
    }

    
}

