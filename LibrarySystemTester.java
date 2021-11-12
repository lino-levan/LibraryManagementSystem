/* 
 * AP CS A
 * PROJ 02: OOP ~ L.M.S.
 * SFHS ~ Mrs. Vollucci
 * 
 * Chen, Clarissa
 * Le Van, Lino
 * 
 * Period 7
 */

import java.util.*;

// Tester file: Do not edit the code
// Compile code then run this file from inside your project folder

class LibrarySystemTester {
  public static void main(String[] args) {
    char part = 'A';
    int scoreIndex = 0;
    int problemNum = 0;
    int[] scores = {0,0,0,0,0,0,0,0,0};
    ArrayList<Book> allBooks = new ArrayList<Book>();
    ArrayList<Member> allMembers = new ArrayList<Member>();
    ArrayList<Library> allLibraries = new ArrayList<Library>();
    ArrayList<Catalogue> allCatalogues = new ArrayList<Catalogue>();
    
    // PART A: BOOKS
    part = 'A';
    scoreIndex = 0;
    problemNum = 0;
    try {
      //Constructors
      allBooks.add(new Book("The Hobbit", "Tolkien", "Fantasy fiction", "978-0547928227")); //index 0
      allBooks.add(new Book("Hobbit", "Tolkien", "Fantasy", "978-0547928227")); //index 1
      allBooks.add(new Book("The Fellowship of Ring", "Tolkien", "Fantasy fiction", "978-0345339706")); //index 2
      allBooks.add(new Book("The Two Towers", "Tolkien", "Fantasy fiction", "978-0547928203")); //index 3
      allBooks.add(new Book("The Return of the King", "Tolkien", "Fantasy fiction", "978-0547928197")); //index 4
      allBooks.add(new Book("Harry Potter and the Sorceror's Stone", "Rowling", "Young Adult Fiction", "978-0439708180")); //index 5
      allBooks.add(new Book("The Bad Beginning", "Snicket", "Gothic fiction", "978-0060518288")); //index 6
      allBooks.add(new Book("Harry Potter and the Chamber of Secrets", "Rowling", "Young Adult Fiction", "978-0439064873")); //index 7
      allBooks.add(new Book("The Reptile Room", "Snicket", "Gothic fiction", "978-0061146312")); //index 8
      allBooks.add(new Book("The Wide Window", "Snicket", "Gothic fiction", "978-0061146336")); //index 9
      allBooks.add(new Book("The Bad Beginning", "Snicket", "Gothic fiction", "978-0000000000")); //index 10

      //Tests
      scores[scoreIndex] += checkValue(allBooks.get(2).getISBN(), "978-0345339706", part, 0, 1);
      scores[scoreIndex] += checkValue(allBooks.get(2).getTitle(), "The Fellowship of Ring", part, 1, 1);
      scores[scoreIndex] += checkValue(allBooks.get(2).getGenre(), "Fantasy fiction", part, 2, 1);
      scores[scoreIndex] += checkValue(allBooks.get(2).getAuthor(), "Tolkien", part, 3, 1);
      scores[scoreIndex] += checkValue(allBooks.get(0).equals(allBooks.get(1)), true , part, 4, 1);
      scores[scoreIndex] += checkValue(allBooks.get(7).equals(allBooks.get(10)), false , part, 5, 1);
    } catch (Exception e) {
      System.out.println("Encountered an error on Part: "+part);
      System.out.println(e.toString());
    }
    System.out.println("Tests Passed for Part "+part+": "+scores[scoreIndex]+"/6");
    
    

    
    // PART B: CATALOGUE: STORING, ADDING, & FINDING BOOKS
    part = 'B';
    scoreIndex = 1;
    problemNum = 0;
    try {
      //Constructors and setup
      Catalogue testOne = new Catalogue();
      allCatalogues.add(testOne);
      for (int i = 0; i < allBooks.size(); i++)
      {
        testOne.addBook(allBooks.get(i));
      }
      testOne.addBook(allBooks.get(5));
      testOne.addBook(allBooks.get(5));
      
      //Test Output Arrays
      ArrayList<Book> testListB1 = new ArrayList<Book>();
      testListB1.add(allBooks.get(0));
      testListB1.add(allBooks.get(2));
      testListB1.add(allBooks.get(3));
      testListB1.add(allBooks.get(4));
      ArrayList<Book> testListB2 = new ArrayList<Book>();
      testListB2.add(allBooks.get(6));
      testListB2.add(allBooks.get(8));
      testListB2.add(allBooks.get(9));
      testListB2.add(allBooks.get(10));
      ArrayList<Book> testListB3 = new ArrayList<Book>();
      testListB3.add(allBooks.get(6));
      testListB3.add(allBooks.get(10));
      ArrayList<Book> testListB4 = new ArrayList<Book>();
      testListB4.add(allBooks.get(0));
      testListB4.add(allBooks.get(2));
      testListB4.add(allBooks.get(3));
      testListB4.add(allBooks.get(4));
      ArrayList<Book> testListB5 = new ArrayList<Book>();
      testListB5.add(allBooks.get(6));
      //Tests
      scores[scoreIndex] += checkValue(testOne.findBook(3, "Fantasy fiction"), testListB1, part, 0, 1);
      scores[scoreIndex] += checkValue(testOne.findBook(3, "Gothic fiction"), testListB2, part, 1, 1);
      scores[scoreIndex] += checkValue(testOne.findBook(1, "The Bad Beginning"), testListB3, part, 2, 1);
      scores[scoreIndex] += checkValue(testOne.findBook(2, "Tolkien"), testListB4, part, 3, 1);
      scores[scoreIndex] += checkValue(testOne.findBook(4, "978-0060518288"), testListB5, part, 4, 1);
    } catch (Exception e) {
      System.out.println("Encountered an error on Part: "+part);
      System.out.println(e.toString());
    }
    System.out.println("Tests Passed for Part "+part+": "+scores[scoreIndex]+"/5");
    
    
    
    // PART C: MEMBERS
    part = 'C';
    scoreIndex = 2;
    problemNum = 0;
    try {
      //Constructors
      Member pf = new Member("Phineas Fletcher", "orangeInventor@doofle.com");
      Member ff = new Member("Ferb Fletcher", "greenInventor@doofle.com");
      Member fff = new Member("fakeFerb Fletcher", "greenInventor@doofle.com");
      Member hd = new Member("Heinz Doofenshmirtz", "triStateRuler@doofle.com");
      Member cf = new Member("Candace Fletcher", "queenOfMars@doofle.com");
      allMembers.add(pf);
      allMembers.add(ff);
      allMembers.add(fff);
      allMembers.add(hd);
      allMembers.add(cf);
      

      //Tests
      scores[scoreIndex] += checkValue(pf.getName(), "Fletcher, Phineas", part, 0, 1);
      scores[scoreIndex] += checkValue(ff.getLastName(), "Fletcher", part, 1, 1);
      scores[scoreIndex] += checkValue(ff.getEmail(), "greenInventor@doofle.com", part, 2, 1);
      scores[scoreIndex] += checkValue(ff.getLibrary()==null, true, part, 3, 1);
      
    } catch (Exception e) {
      System.out.println("Encountered an error on Part: "+part);
      System.out.println(e.toString());
    }
    System.out.println("Tests Passed for Part "+part+": "+scores[scoreIndex]+"/4");

    
    
    // PART D: LIBRARIES, ADDING MEMBERS, VISITING MEMBERS
    part = 'D';
    scoreIndex = 3;
    problemNum = 0;
    // try {
      //Constructors
      Library dv = new Library("Danville Library");
      Library sf = new Library("St. Francis Library");
      allLibraries.add(dv);
      allLibraries.add(sf);
      
      //Setup
      dv.addMember(allMembers.get(0));
      sf.addMember(allMembers.get(1));
      sf.addMember(allMembers.get(2));
      sf.addMember(allMembers.get(3));
      sf.addMember(allMembers.get(4));
      dv.addMember(allMembers.get(1));


      //Tests
      scores[scoreIndex] += checkValue(sf.getName(), "St. Francis Library", part, 0, 1);
      scores[scoreIndex] += checkValue(sf.getVisitorCount(), 0, part, 1, 1);
      scores[scoreIndex] += checkValue(dv.findMemberByEmail("orangeInventor@doofle.com"), allMembers.get(0), part, 2, 1);
      scores[scoreIndex] += checkValue(sf.findMemberByEmail("greenInventor@doofle.com"), allMembers.get(1), part, 3, 1);
      scores[scoreIndex] += checkValue(dv.findMemberByEmail("greenInventor@doofle.com")==null, true, part, 4, 1);
      scores[scoreIndex] += checkValue(allMembers.get(1).memberAtLibrary(), false, part, 5, 1);
      allMembers.get(1).goToLibrary();
      scores[scoreIndex] += checkValue(allMembers.get(1).memberAtLibrary(), true, part, 6, 1);
      allMembers.get(1).goToLibrary();
      allMembers.get(3).goToLibrary();
      scores[scoreIndex] += checkValue(sf.getVisitorCount(), 2, part, 7, 1);
      allMembers.get(1).leaveLibrary();
      scores[scoreIndex] += checkValue(sf.getVisitorCount(), 1, part, 8, 1);
      allMembers.get(1).leaveLibrary();
      scores[scoreIndex] += checkValue(sf.getVisitorCount(), 1, part, 9, 1);
      
    // } catch (Exception e) {
    //   System.out.println("Encountered an error on Part: "+part);
    //   System.out.println(e.toString());
    // }
    System.out.println("Tests Passed for Part "+part+": "+scores[scoreIndex]+"/10");

    
    
    // PART E: FIND MEMBERS BY LAST NAME AND FINDING/ADJUSTING FEES
    part = 'E';
    scoreIndex = 4;
    problemNum = 0;
    try {
      //Setup
      ArrayList<Member> testListE1 = new ArrayList<Member>();
      testListE1.add(allMembers.get(0));
      ArrayList<Member> testListE2 = new ArrayList<Member>();
      testListE2.add(allMembers.get(1));
      testListE2.add(allMembers.get(4));


      //Tests
      scores[scoreIndex] += checkValue(allLibraries.get(1).findFee("queenMars@doofle.com")==null, true, part, 0, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(1).findFee("queenOfMars@doofle.com"), 0.0, part, 1, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(1).adjustFee("queenOfMars@doofle.com", 3.5), 3.5, part, 2, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(1).adjustFee("queenMars@doofle.com", 3.5)==null, true, part, 3, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(1).findFee("queenOfMars@doofle.com"), 3.5, part, 4, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(0).findMembersByLastName("Fletcher").equals(testListE1), true, part, 5, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(1).findMembersByLastName("Fletcher").equals(testListE2), true, part, 6, 1);
      
    } catch (Exception e) {
      System.out.println("Encountered an error on Part: "+part);
      System.out.println(e.toString());
    }
    System.out.println("Tests Passed for Part "+part+": "+scores[scoreIndex]+"/7");

    
    
    // PART F: GETTING BOOK COUNTS AND CHECKING OUT BOOKS
    part = 'F';
    scoreIndex = 5;
    problemNum = 0;
    try {
      //Setup
      Catalogue sfCat = allLibraries.get(1).getCatalogue();
      for (int i = 0; i < allBooks.size(); i++)
      {
        sfCat.addBook(allBooks.get(i));
      }
      sfCat.addBook(allBooks.get(5));
      sfCat.addBook(allBooks.get(5));
      allBooks.add(new Book("The Color of Magic", "Terry Pratchett", "Fantasy fiction", "978-1473205321")); //index 10


      //Tests
      scores[scoreIndex] += checkValue(sfCat.getBookCount(allBooks.get(0)), 2, part, 0, 1);
      scores[scoreIndex] += checkValue(sfCat.getBookCount(allBooks.get(5)), 3, part, 1, 1);
      scores[scoreIndex] += checkValue(sfCat.getBookCount(allBooks.get(11)), -1, part, 2, 1);
      scores[scoreIndex] += checkValue(allMembers.get(1).checkOutBook(allBooks.get(0), 10, 17, 2019), false, part, 3, 1);
      scores[scoreIndex] += checkValue(sfCat.getBookCount(allBooks.get(0)), 2, part, 4, 1);
      scores[scoreIndex] += checkValue(allMembers.get(3).checkOutBook(allBooks.get(11), 10, 18, 2019), false, part, 5, 1);
      scores[scoreIndex] += checkValue(allMembers.get(3).checkOutBook(allBooks.get(5), 10, 18, 2019), true, part, 6, 1);
      scores[scoreIndex] += checkValue(sfCat.getBookCount(allBooks.get(5)), 2, part, 7, 1);
      scores[scoreIndex] += checkValue(allMembers.get(3).checkOutBook(allBooks.get(4), 10, 19, 2019), true, part, 8, 1);
      scores[scoreIndex] += checkValue(sfCat.getBookCount(allBooks.get(4)), 0, part, 9, 1);
      scores[scoreIndex] += checkValue(allMembers.get(3).checkOutBook(allBooks.get(4), 10, 19, 2019), false, part, 10, 1);
      scores[scoreIndex] += checkValue(sfCat.getBookCount(allBooks.get(4)), 0, part, 11, 1);
    } catch (Exception e) {
      System.out.println("Encountered an error on Part: "+part);
      System.out.println(e.toString());
    }
    System.out.println("Tests Passed for Part "+part+": "+scores[scoreIndex]+"/12");

    
    
    // PART G: RETURNING BOOKS
    part = 'G';
    scoreIndex = 6;
    problemNum = 0;
    try {
      
      //Setup
      Catalogue sfCat = allLibraries.get(1).getCatalogue();

      //Tests
      scores[scoreIndex] += checkValue(allBooks.get(3).getFee(), 0.5, part, 0, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(1).findFee("triStateRuler@doofle.com"), 0.0, part, 1, 1);      
      scores[scoreIndex] += checkValue(allMembers.get(3).returnBook(allBooks.get(2), 10, 24, 2019), -1.0, part, 2, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(1).findFee("triStateRuler@doofle.com"), 0.0, part, 3, 1);
      scores[scoreIndex] += checkValue(allMembers.get(3).returnBook(allBooks.get(4), 12, 2, 2019), 18.5, part, 4, 1);
      scores[scoreIndex] += checkValue(allMembers.get(3).returnBook(allBooks.get(4), 12, 2, 2019), -1.0, part, 5, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(1).findFee("triStateRuler@doofle.com"), 18.5, part, 6, 1);
      scores[scoreIndex] += checkValue(sfCat.getBookCount(allBooks.get(4)), 1, part, 7, 1);
      scores[scoreIndex] += checkValue(allMembers.get(3).returnBook(allBooks.get(5), 10, 20, 2019), 0.0, part, 8, 1);

    } catch (Exception e) {
      System.out.println("Encountered an error on Part: "+part);
      System.out.println(e.toString());
    }
    System.out.println("Tests Passed for Part "+part+": "+scores[scoreIndex]+"/9");

    
    
    // PART H:  TEXTBOOKS
    part = 'H';
    scoreIndex = 7;
    problemNum = 0;
    try {
      
      //Constructors
      
      Textbook oc = new Textbook("Oh California!", "Armento, Cordova, Alva", "California history", "978-0395930632");
      Textbook ce = new Textbook("California: On the Edge of American History", "Genini", "California history", "978-1540881274");
      
      //Setup
      Catalogue sfCat = allLibraries.get(1).getCatalogue();
  	  sfCat.addBook(oc);
      sfCat.addBook(ce);
      allBooks.add(oc);
      allBooks.add(ce);
      ArrayList<Book> testListH1 = new ArrayList<Book>();
      testListH1.add(oc);      
      

      

      //Tests
      scores[scoreIndex] += checkValue(sfCat.findBook(2, "Armento"), testListH1, part, 0, 1);
      scores[scoreIndex] += checkValue(sfCat.findBook(2, "Armentto").size(), 0, part, 1, 1);
      scores[scoreIndex] += checkValue(sfCat.getBookCount(oc), 1, part, 2, 1);
      scores[scoreIndex] += checkValue(allMembers.get(3).checkOutBook(oc, 10, 20, 2019), true, part, 3, 1);
      scores[scoreIndex] += checkValue(sfCat.getBookCount(oc), 0, part, 4, 1);
      scores[scoreIndex] += checkValue(allMembers.get(3).returnBook(oc, 12, 5, 2019), 19.5, part, 5, 1);
      scores[scoreIndex] += checkValue(allLibraries.get(1).findFee("triStateRuler@doofle.com"), 38.0, part, 6, 1);
      
    } catch (Exception e) {
      System.out.println("Encountered an error on Part: "+part);
      System.out.println(e.toString());
    }
    System.out.println("Tests Passed for Part "+part+": "+scores[scoreIndex]+"/7");

    
    
    
    // PART I:  Finding Books Based on Keyword.
    part = 'I';
    scoreIndex = 8;
    problemNum = 0;
    try {
      //Setup
      Catalogue sfCat = allLibraries.get(1).getCatalogue();
      ArrayList<Book> testListI1 = new ArrayList<Book>();
      testListI1.add(allBooks.get(0));
      testListI1.add(allBooks.get(2));
      testListI1.add(allBooks.get(3));
      testListI1.add(allBooks.get(4));
      testListI1.add(allBooks.get(6));
      testListI1.add(allBooks.get(8));
      testListI1.add(allBooks.get(9));
      testListI1.add(allBooks.get(10));
      ArrayList<Book> testListI2 = new ArrayList<Book>();
      testListI2.add(allBooks.get(7));
      ArrayList<Book> testListI3 = new ArrayList<Book>();
      testListI3.add(allBooks.get(4));
      testListI3.add(allBooks.get(5));
      testListI3.add(allBooks.get(7));
      testListI3.add(allBooks.get(13));

      //Tests
      
      scores[scoreIndex] += checkValue(sfCat.findKeywordBook("The"), testListI1, part, 0, 1);
      scores[scoreIndex] += checkValue(sfCat.findKeywordBook("Secrets"), testListI2, part, 1, 1);
      scores[scoreIndex] += checkValue(sfCat.findKeywordBook("the"), testListI3, part, 2, 1);
      scores[scoreIndex] += checkValue(sfCat.findKeywordBook("Hob").size(), 0, part, 3, 1);
    } catch (Exception e) {
      System.out.println("Encountered an error on Part: "+part);
      System.out.println(e.toString());
    }
    System.out.println("Tests Passed for Part "+part+": "+scores[scoreIndex]+"/4");

    
    
    
    

  }
  
  public static int checkValue(String output, String expectedOut, char part, int problemNum, int value) {
    if (output.equals(expectedOut)){
      	System.out.println("Part "+part+": Problem "+problemNum+" was Successful");
		return value;
    }
    System.out.println("Part "+part+": Problem "+problemNum+" was Unsuccessful");
    System.out.println("Expected: "+expectedOut+". Instead got: "+output);
    return 0;
  }

  public static int checkValue(Integer output, Integer expectedOut, char part, int problemNum, int value) {
    if (output.equals(expectedOut)){
      	System.out.println("Part "+part+": Problem "+problemNum+" was Successful");
		return value;
    }
    System.out.println("Part "+part+": Problem "+problemNum+" was Unsuccessful");
    System.out.println("Expected: "+expectedOut+". Instead got: "+output);
    return 0;
  }
  
  public static int checkValue(Double output, Double expectedOut, char part, int problemNum, int value) {
    if (output.equals(expectedOut)){
      	System.out.println("Part "+part+": Problem "+problemNum+" was Successful");
		return value;
    }
    System.out.println("Part "+part+": Problem "+problemNum+" was Unsuccessful");
    System.out.println("Expected: "+expectedOut+". Instead got: "+output);
    return 0;
  }
  
  public static int checkValue(Member output, Member expectedOut, char part, int problemNum, int value) {
    if (output.equals(expectedOut)){
      	System.out.println("Part "+part+": Problem "+problemNum+" was Successful");
		return value;
    }
    System.out.println("Part "+part+": Problem "+problemNum+" was Unsuccessful");
    System.out.println("Expected: "+expectedOut+". Instead got: "+output);
    return 0;
  }


  public static int checkValue(ArrayList<Book> output, ArrayList<Book> expectedOut, char part, int problemNum, int value) {
    if (output.equals(expectedOut)){
      	System.out.println("Part "+part+": Problem "+problemNum+" was Successful");
		return value;
    }
    System.out.println("Part "+part+": Problem "+problemNum+" was Unsuccessful");
    System.out.println("Expected: "+expectedOut+". Instead got: "+output);
    return 0;
  }

  
  public static int checkValue(boolean output, boolean expectedOut, char part, int problemNum, int value) {
    if (output == expectedOut){
      	System.out.println("Part "+part+": Problem "+problemNum+" was Successful");
		return value;
    }
    System.out.println("Part "+part+": Problem "+problemNum+" was Unsuccessful");
    System.out.println("Expected: "+expectedOut+". Instead got: "+output);
    return 0;
  }

}
