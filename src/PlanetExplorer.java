
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 127
// Finish time:

public class PlanetExplorer {
	char direction = 'N';
	int directionvar = 1;
	public char getDirection(){

		return direction;
	}
	
	public PlanetExplorer(int x, int y, String obstacles){
	

		
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	}
	//Object [ ] [ ] planet = new Object [ x ] [ y ] ;
	
	public String executeCommand(String command){
		command.toLowerCase();
		/*to implement: rover needs to look at string char by char in a loop*/
		for(int i =0; i<command.length(); i++){
			char x = command.charAt(i);
		
		if (x == 'l'){
			turnLeft();
		}
		if (command == "r"){
			turnRight();
		}
		
		if (command =="f"){
			moveForward();
		}
		
		if (command == "b"){
			moveBack();
		}
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		}
		
		return null;
	}

	public void turnRight(){
		directionvar = directionvar + 1; //turns clockwise
		InterpretDirection();
		
	}
	public void turnLeft(){
		directionvar = directionvar -1;//turns counter-clockwise
		InterpretDirection();
		
		
	}
	public void moveForward(){
		
	}
	public void moveBack(){
		
	}


	public void InterpretDirection(){
		if (directionvar==1){
			direction = 'N';
		}
		else if (directionvar==2||directionvar==-2){
			direction = 'E';
		}
		else if (directionvar==3||directionvar==-1){
			direction = 'S';
		}
		else if (directionvar==4||directionvar==0){
			direction = 'W';
		}
		/*else if (directionvar == 5){
			directionvar =1; //reset to North
			InterpretDirection();
		}
		else if (directionvar == 0){
			directionvar =4; //reset to West
			}
			InterpretDirection();*/
		
		/*^this won't work: it can't turn counterclockwise -_-*/
		
	}

}