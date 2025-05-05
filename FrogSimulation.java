public class FrogSimulation
{
private int goalDistance;
private int maxHops;
private int[] presetHops;

public FrogSimulation(int dist, int numHops)
{
    goalDistance = dist;
    maxHops = numHops;
}
/** Returns an integer representing the distance, in inches, to be moved when the frog hops.
*/
private int hopDistance()
{ 
    
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
        if(position >= goalDistance) return true;
        if(position < 0) return false;
    }
    return false;

}

/** Runs num simulations and returns the proportion of simulations in which the frog
* successfully reached or passed the goal.
* Precondition: num > 0
*/
public double runSimulations(int num)
{ /* to be implemented in part (b) */ }
}