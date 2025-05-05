import java.util.Scanner;

public class FrogSimulation
{
private int goalDistance;
private int maxHops;

public FrogSimulation(int dist, int numHops)
{
    goalDistance = dist;
    maxHops = numHops;
}

/** Returns an integer representing the distance, in inches, to be moved when the frog hops.
*/
private int hopDistance()
{ 
    Scanner s = new Scanner(System.in);
    System.out.println("Jump Distance: ");
    return s.nextInt();
}

/** Simulates a frog attempting to reach the goal as described in part (a).
* Returns true if the frog successfully reached or passed the goal during the simulation;
* false otherwise.
*/
public boolean simulate()
{ 
    int pos = 0;
    for(int i = 0; i < maxHops; i++)
    {
        pos += hopDistance();
        if(pos >= goalDistance) return true;
        if(pos < 0) return false;
    }
    return false;

}

/** Runs num simulations and returns the proportion of simulations in which the frog
* successfully reached or passed the goal.
* Precondition: num > 0
*/
public double runSimulations(int num)
{ 
    double success = 0;
    for(int i = 0; i < num; i ++)
    {
        if(this.simulate()) success++;
        System.out.println("next sim: ");
    }
    return success / num;
 }
}