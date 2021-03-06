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

import java.util.ArrayList;

class Library {
  // instance variables (given)
  private String name;
  private int numVisitors;
  private Catalogue myCatalogue = new Catalogue();
  private ArrayList<Member> myMembers = new ArrayList<Member>();
  private ArrayList<Double> memberFees = new ArrayList<Double>();
  
  // Fill in this constructor (Phase D)
  public Library(String name)
  {
    //catalogue is above  
    this.name = name;
  }

  // getters (given)
  public String getName()
  {
    return name;
  }
  
  public Catalogue getCatalogue()
  {
    return this.myCatalogue;
  }
  
  public ArrayList<Member> getMembers()
  {
    return myMembers;
  }

  public ArrayList<Double> getFees()
  {
    return memberFees;
  }

  public int getVisitorCount()
  {
    return numVisitors;
  }
  
  // Additional methods
  
  /* Fill in this method (Phase D)
   * Find a member by their email. 
   * Return null otherwise.
   */
  public Member findMemberByEmail(String email)
  {
    // Your code here
    for (Member current: getMembers()) {
      if(current.getEmail().equals(email)) {
        return current; 
      }
    }
    return null;
  }
  
  /* Fill in this method (Phase D)
   * Add new member to the list along with no fees (0 dollars & 0 cents).
   * This library is now that member's library.
   * Emails are unique identifiers so a user may not be added with the same email.
   * Returns true only if successful as members can only be a member of one library.
   */
  
  public boolean addMember(Member newMember)
  {
    // Your code here
    if (findMemberByEmail(newMember.getEmail()) != null) {
      return false;
    }

    if(!newMember.addMemberToLibrary(this)) {
      return false;
    }

    myMembers.add(newMember);
    memberFees.add(0.0);

    return true;
  }
    
  /* Fill in this method (Phase D)
   * Increase visitor count.
   */
  public void increaseVisitorCount()
  {
    // Your code here
    numVisitors++;
  }

  /* Fill in this method (Phase D)
   * Decrease visitor count.
   */
  public void decreaseVisitorCount()
  {
    // Your code here
    numVisitors--;
  }

  /* Fill in this method (Phase E)
   * Updates the fee associated with member a specified amount and 
   * returns the new amount. If there is no member, return null.
   */
  
  public Double adjustFee(String email, Double amount)
  {
    // find the member's index by email, if none return null
    Member member = this.findMemberByEmail(email);

    if (member == null) {
      return null;
    }

    int indexOfMember = this.getMembers().indexOf(member);

    this.getFees().set(indexOfMember, this.getFees().get(indexOfMember) + amount);
    return this.getFees().get(indexOfMember);
  }
  
  /* Fill in this method (Phase E)
   * Find the fee associated with member found via their email. 
   * If there is no member, return null.
  */
  public Double findFee(String email)
  {
    // find the member's index by email, if none return null
    Member member = this.findMemberByEmail(email);

    if(member == null) {
      return null;
    }

    int indexOfMember = this.getMembers().indexOf(member);
    
    // return the fee at the index we just found
    return this.getFees().get(indexOfMember);
  }
  
  
  /* Fill in this method (Phase E)
   * Find all members with a specified last name. 
   * If none, return an empty list.
   */
  public ArrayList<Member> findMembersByLastName(String lastName)
  {
    // make an output list
    ArrayList<Member> sameLastName = new ArrayList<Member>(); 
    
     for (Member current: getMembers()) {
      if(current.getLastName().equals(lastName)) {
        // add current to the output list
        sameLastName.add(current);
      }
    }

    return sameLastName;
  }
  
  // toString() method (given)
  public String toString()
  {
    return  name + "[Number of visitors: " + numVisitors + "]";
  }
  
}
