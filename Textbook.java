/* 
 * AP CS A
 * PROJ 02: OOP ~ L.M.S.
 * SFHS ~ Mrs. Vollucci
 * 
 * Lino Le Van
 * Clarissa Chen
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
    super(null, null, null, null); // Edit this line
    // Add additional code here
  }
  
  // Fill in this setter (Phase H)
  public void setFee(double fee)
  {
    // Your code here
  }
  
  // Fill in getter for author(s) (Phase H)
  public String[] getAuthors()
  {
    return null; // replace this line
  }
  
  /* Fill in the toString() method (Phase H)
   * The String representation is the same as a Book
   * with the exception of the "Author" field:
   * Textbooks have an array of Author(s) listed.
   */
  public String toString()
  {
    return null; // replace this line
  }
}

