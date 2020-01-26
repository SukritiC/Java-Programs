/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 * write a program for the following situation receive the marks for n number of
 * students by keeping the following rules in mind 1. marks are supposed to be
 * in 3 different categories a. CA b. MTE c. ETE Marks should be out of 100 in
 * all these 3 categories There are 2 different streams of students a. BCA - the
 * weightage of CA is 40%, MTE 30% ETE 30% b. MCA - the weightage for CA is 30%,
 * MTE 30%, ETE 40% Done by using interfaces and 2 classes Exception handling 40
 * below fail 60-70 First 70 + merit  *
 */
import java.util.*;

class InappropriateMarks extends Exception {

    String msg;

    InappropriateMarks(String m) {
        msg = m;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}

interface info {

    List Calc(double m1, double m2, double m3);

}

class BCA implements info {

    int id;
    String name;

    double total = 0;

    BCA(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public List Calc(double m1, double m2, double m3) {
        List al = new ArrayList();
        try {
            if (m1 > 100 || m2 > 100 || m3 > 100) {
                throw new InappropriateMarks("Individual Marks should be less than 100");
            } else {
                total = 0.4 * m1 + 0.3 * m2 + 0.3 * m3;
                al.add(id);
                al.add(name);
                al.add("BCA");
                al.add(m1);
                al.add(m2);
                al.add(m3);
                al.add(total);
            }

        } catch (InappropriateMarks e) {
            e.getMessage();
        } finally {
            return al;
        }
    }

}
class MCA implements info {

    int id;
    String name;

    double total = 0;

    MCA(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public List Calc(double m1, double m2, double m3) {
        List al = new ArrayList();
        try {
            if (m1 > 100 || m2 > 100 || m3 > 100) {
                throw new InappropriateMarks("Individual Marks should be less than 100");
            } else {
                total = 0.3 * m1 + 0.3 * m2 + 0.4 * m3;
                al.add(id);
                al.add(name);
                al.add("MCA");
                al.add(m1);
                al.add(m2);
                al.add(m3);
                al.add(total);
            }

        } catch (InappropriateMarks e) {
            e.getMessage();
        } finally {
            return al;
        }
    }

}


public class StudentMarks {

    public static void main(String[] args) {
        List<List> alist=new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Id of student");
            int id=sc.nextInt();
            System.out.println("Enter name of the student");
            String name =sc.next();
            System.out.println("Enter marks in 3 subjects out of 100 each");
            double m1=sc.nextDouble();
            double m2=sc.nextDouble();
            double m3=sc.nextDouble();
            System.out.println("Press 1 for BCA and 2 for MCA");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    BCA b=new BCA(id,name);
                    alist.add(b.Calc(m1, m2, m3));
                    break;
                case 2:
                    MCA b1=new MCA(id,name);
                    alist.add(b1.Calc(m1, m2, m3));
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
        System.out.println("ID   Name      Course      CA      MTE      ETE      Total");
        for(int x=0;x<alist.size();x++){
            for(int y=0;y<alist.get(x).size();y++){
                System.out.print(alist.get(x).get(y)+"     ");
            }
            System.out.println();
        }
    }

}
