import java.util.*;
import java.util.ArrayList;
import java.util.List;

//                            T  A   S   K  2

//                        LIBRARY MANAGEMENT SYSTEM

public class Task2 {
  public static void main(String args[]) {
    char r;
    do {
      System.out.println("--------------- Library Management System ----------------");
      System.out.println("Welcome to the Menu Section :-");
      System.out.println("Press 1 to Add Book");
      System.out.println("Press 2 to Issue a Book");
      System.out.println("Press 3 to Return a book");
      System.out.println("Press 4 to Print Complete issue details");
      System.out.println("Press 5 to Exit");
      Scanner obj1 = new Scanner(System.in);
      System.out.println("Enter your Choice :-");
      int a = obj1.nextInt();
      switch (a) {
        case 1:
          Librarry mk = new Librarry();
          mk.add();
          break;
        case 2:
          Librarry mk2 = new Librarry();
          mk2.issue();
          break;
        case 3:
          Librarry mk3 = new Librarry();
          mk3.returns();
          break;
        case 4:
          Librarry mk4 = new Librarry();
          mk4.details();
          break;
        case 5:
          Librarry mk5 = new Librarry();
          System.out.println("Thankyou for choosing Library Management System");
          mk5.exit();
          break;
        default:
          System.out.println("Enter correct Choice");
      }
      System.out.println("Do you want to select next option Y/N");
      r = obj1.next().charAt(0);
    } while (r == 'y' || r == 'Y');
    if (r == 'n' || r == 'N') {
      Librarry z = new Librarry();
      z.exit();
    }
  }
}

class Librarry {
  static String str, b, date;
  static int a, c;

  void add() {
    System.out.println("Enter Book Name:");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Enter Price of Book:");
    float price = sc.nextInt();
    System.out.println("Enter Book No:");
    int bookno = sc.nextInt();
    System.out.println("Book added successfully:");
    System.out.println("Your details are :- " + "Book Name is" + str + " " + " " + "Price is" + price + " " + " "
        + "Book no is" + bookno);
    System.out.println();
  }

  void issue() {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter Book Name :");
    str = obj.nextLine();
    System.out.println("Enter Book Number :");
    a = obj.nextInt();
    obj.nextLine();
    System.out.println("Issue date :");
    b = obj.nextLine();
    System.out.println("Total number of Book Issued :");
    c = obj.nextInt();
    obj.nextLine();
    System.out.println("Return Book Date :");
    date = obj.nextLine();
    System.out.println();
  }

  int getid() {
    return a;
  }

  void returns() {
    System.out.println("Enter Student Name and Book_id");
    Scanner c = new Scanner(System.in);
    String name = c.nextLine();
    int bookid = c.nextInt();
    if (a == bookid) {
      System.out.println("Return Details");
      System.out.println("Book Name: " + Librarry.str);
      System.out.println("Book No: " + Librarry.a);
      System.out.println("Issue Date: " + Librarry.b);
      System.out.println("Total number of Book Issued: " + Librarry.c);
      System.out.println("Book Return date :" + Librarry.date);
      System.out.println();
    } else {
      System.out.println("Wrong id Please Enter Correct id");
    }
  }

  void details() {
    System.out.println("Book Name: " + Librarry.str);
    System.out.println("Book Number: " + Librarry.a);
    System.out.println("Issue date: " + Librarry.b);
    System.out.println("Total number of book Issued: " + Librarry.c);
    System.out.println("Book Return Date: " + Librarry.date);
    System.out.println();
  }

  void exit() {
    System.exit(0);
  }

}