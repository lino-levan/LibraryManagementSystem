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

import java.util.Arrays;

class Textbook extends Book {
  // instance variables (given)
  private String[] authors; 
  private double fee;
  
  /* Fill in this constructor (Phase H)
   * Use contains() to check if multiple authors have been given.
   * Handle the case where only 1 author is given
   */
  public Textbook(String title, String author, String genre, String ISBN)
  {
    super(title, author, genre, ISBN); // Edit this line
    // Add additional code here
    this.authors = author.split(",");
  }
  
  // Fill in this setter (Phase H)
  public void setFee(double fee)
  {
    this.fee = fee;
  }
  
  // Fill in getter for author(s) (Phase H)
  public String[] getAuthors()
  {
    return this.authors;
  }
  
  /* Fill in the toString() method (Phase H)
   * The String representation is the same as a Book
   * with the exception of the "Author" field:
   * Textbooks have an array of Author(s) listed.
   */
  public String toString()
  {
    String out = "";

    out += "{Title: "+this.getTitle()+"}\n";
    out += "Author(s): "+Arrays.toString(this.getAuthors())+"\n";
    out += "Genre: "+this.getGenre()+"\n";
    out += "ISBN #: "+this.getISBN();

    return out;
  }
}

