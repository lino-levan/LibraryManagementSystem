/* 
 * AP CS A
 * PROJ 02: OOP ~ L.M.S.
 * SFHS ~ Mrs. Vollucci
 * 
 * Lino Le Van
 * Clarissa Chen
 * Period 7
 */

import java.util.ArrayList;

class Catalogue {
  
  // Instance variables (given)
  private ArrayList<Book> books = new ArrayList<Book>();
  private ArrayList<Integer> bookCounts = new ArrayList<Integer>();
  
  // Write the constructor - no inputs needed (Phase B)
  public Catalogue() {
    
  }
  // Write getters for both ArrayLists (Phase B)
  
  // Create getBooks() here
  public ArrayList<Book> getBooks() {
    return this.books;
  }
  // Create getBookCounts() here
  public ArrayList<Integer> getBookCounts() {
    return this.bookCounts;
  }

  /* Fill in this method (Phase B)
   * Adjust the quantity available of a Book by a specified amount.
   * Return true if the action was successful and false if not.
   */
  
  public boolean adjustQuantity(Book book, int amount)
  {
   	// If the book already exists, increase the quantity
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).equals(book)) {
        bookCounts.set(i, bookCounts.get(i) + amount);
        return true;
      }
    } 
    return false;
  }
  
  /* Fill in this method (Phase B)
   * Add a Book to the list.
   */
  
  public void addBook(Book book)
  {
    if(!adjustQuantity(book, 1)) {
      books.add(book);
      bookCounts.add(0);
    }
  }
  
  /* Fill in this method (Phase B)
   * Find Books from the list based on the ff. categories:
   * (1) title, (2) author, (3) genre, (4) ISBN 
   * in addition to the user's query.
   *
   * Edit this method (Phase H)
   * Handle case for Textbooks with multiple authors.
   */

  public ArrayList<Book> findBook(int category, String query)
  {
    ArrayList<Book> out = new ArrayList<Book>();

    for(Book book: books) {
      String[] categories = {
        book.getTitle(),
        book.getAuthor(),
        book.getGenre(),
        book.getISBN()
      };

      if(categories[category-1].equals(query)) {
        out.add(book);
      }
    }

    return out;
  }
  
  /* Fill in this method (Phase F)
   * Pull out the available quantity of books via a specified book.
   * If the book is not found, return -1.
   */
  public int getBookCount(Book book)
  {
    return 0; // replace this line
  }
  
  /* Write this function (Phase I)
   * Return a list of all Books mentioning a specified word in the title.
   * You may assume that keyword is separated by a space from other words.
   */
  public ArrayList<Book> findKeywordBook(String keyword)
  {
    return null; // replace this line
  }
  
  // Fill in the toString() method (Phase B)
  public String toString()
  {
    String out = "* BOOK CATALOGUE: *\n";

    for(int i = 0; i < books.size(); i++) {
      out += (i+1)+". " + books.get(i) + "\n";
      out += "Quantity: " + bookCounts.get(i);
      out += ",";
    }
    // Return catalogue with book quantity included for each entry
    // Your code here
    return out; // replace this line
  }
}
