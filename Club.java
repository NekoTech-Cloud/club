import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    // Question one, declaring an Arraylist that holds Membership objects
    ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Question one, initializing members
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     * Call new Membership("member name", int month, int year)
     */
    public void join(Membership member)
    {
        // Question three, adding a new index for a new member
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        // Question two, returns size of collection members
        return members.size();
    }
    
    /**
    * Determine the number of members who joined in the
    * given month.
    * @param month The month we are interested in.
    * @return The number of members who joined in that month.
    */
    public int joinedInMonth(int month)
    // Question 4
    {
        if (month < 1 || month > 12) {
            System.out.println("Month cannot be outside of range 1-12");
            return 0;
        }
        else {
            int count = 0;
            for (Membership m : members) {
                if (m.getMonth() == month) {
                    count ++;
                }
            }
            return count;
        }
    }
    
    /**
    * Remove from the club's collection all members who
    * joined in the given month, and return them stored
    * in a separate collection object.
    * @param month The month of the membership.
    * @param year The year of the membership.
    * @return The members who joined in the given month and year.
    */
    public ArrayList<Membership> purge(int month, int year)
    {
        //Question 5, iterator method
        Iterator<Membership>it = members.iterator();        
        ArrayList<Membership> purgeList = new ArrayList<>();
        if (month < 1 || month > 12)
        {
            System.out.println("Month cannot be outside of range 1-12");
        }
        else 
        {
            while(it.hasNext())
            {
                Membership m = it.next();
                if (m.getMonth() == month && m.getYear() == year) 
                {
                    purgeList.add(m);
                    it.remove();
                }
            }
        }
        return purgeList;
    }
}
