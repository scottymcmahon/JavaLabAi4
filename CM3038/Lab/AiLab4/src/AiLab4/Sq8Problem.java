package cm3038.lab04.sq8;

import cm3038.search.*;				//use some classes in the uninformed search library
import cm3038.search.informed.*;	//use the informed search library
import cm3038.lab03.sq8solution.*;	//this lab uses states and actions defined in lab#3

/**
 * This is a informed search problem specialised for the 8-Puzzle problem.
 * @author kit
 *
 */
public class Sq8Problem extends BestFirstSearchProblem
{
/**
 * Construct a Sq8Problem object from the initial and goal state.
 * @param initialState	The initial state.
 * @param goalState		The goal state.
 */
	public Sq8Problem(State initialState, State goalState)
	{
	super(initialState,goalState);
	} //end method

	/**
	 * The evaluation function required by an informed search.
	 * @param node	The node to be evaluated.
	 * @return The score of the node. The lower the score, the more promising the node.
	 */
	public double evaluation(Node node)
	{
		//
		//*** Update this evaluation function.
		//*** Currently it is doing Greedy best-first by using the heuristic alone.
		//*** i.e. estimate how far the given "node" is from a goal.
		//*** It does not take into consideration the cost from the root to "node" so far.
		//***
		return heuristic(node.state);
	} //end method
	
/**
 * This heuristic function estimate how far this state is from a goal.
 * @return The remaining distance/cost of the current state to a goal.
 */
public double heuristic(State currentState)
{
double result=0.0;

//
//*** Explore different ways to estimate the distance of the current state to the goal state.
//*** Note:	You can always access the goal state by "this.goalState" as it is stored as an attribute.
//***
//
int tiles[][]=((Sq8State)currentState).tiles;
int goalTiles[][]=((Sq8State)this.goalState).tiles;

//
//***The current implementation is "counting the number of misplaced tiles".
//
for (int row=0;row<3;row++)
	for (int col=0;col<3;col++)
		if (tiles[row][col]!=goalTiles[row][col])	//if there is a misplaced tile
			result++;				//increment count by 1

return result;
} //end method


/**
 * This isGoal testing method defines that the a state must be
 * equal to the goal state (as an attribute in the problem object)
 * to be a goal.
 */
@Override
public boolean isGoal(State state) {
	return state.equals(this.goalState);
} //end method
} //end class
