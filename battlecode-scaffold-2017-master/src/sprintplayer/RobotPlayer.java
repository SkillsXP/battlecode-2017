package sprintplayer;
import battlecode.common.*;

public strictfp class RobotPlayer {
	static RobotController rc;
	static Direction[] fourDir = new Direction [4];
	static Direction[] eightDir = new Direction[8];
	static Direction[] sixteenDir = new Direction[16];
	static int round = 0;
	
	@SuppressWarnings("unused")
    public static void run(RobotController roco) throws GameActionException {
        RobotPlayer.rc = roco;
        initDirections();
        switch (rc.getType()) {
            case ARCHON:
                runArchon();
                break;
            case GARDENER:
                runGardener();
                break;
            case SCOUT:
            	runScout();
            	break;
            case SOLDIER:
                runSoldier();
                break;
            case LUMBERJACK:
                runLumberjack();
                break;
        }
	}

	private static void runArchon() {
		// TODO Auto-generated method stub
		round++;
		if(round == 1){
			try{
				
			} catch(Exception e){
				System.out.println("Archon Exception");
				 e.printStackTrace();
			}
		}
		while(true){
			try{
				
			} catch(Exception e){
				System.out.println("Archon Exception");
				 e.printStackTrace();
			}
		}
	}
	
	private static void runGardener() {
		// TODO Auto-generated method stub
		round++;
		while(true){
			try{
				
			} catch(Exception e){
				System.out.println("Gardener Exception");
				 e.printStackTrace();
			}
		}
	}
	
	private static void runScout() {
		// TODO Auto-generated method stub
		round++;
		while(true){
			try{
				
			} catch(Exception e){
				System.out.println("Scout Exception");
				 e.printStackTrace();
			}			
		}
	}
	
	private static void runLumberjack() {
		// TODO Auto-generated method stub
		round++;
		while(true){
			try{
				
			} catch(Exception e){
				System.out.println("Lumberjack Exception");
				 e.printStackTrace();
			}			
		}
	}

	private static void runSoldier() {
		// TODO Auto-generated method stub
		round++;
		while(true){
			try{
				
			} catch(Exception e){
				System.out.println("Soldier Exception");
				 e.printStackTrace();
			}			
		}
	}
	
/****************************************************************/
	//Support Methods
	
	private static void initDirections() {
		///Generates direction lists
		for (int k = 0; k < 16; k++){
			float rad = (float)(-Math.PI + (2*Math.PI)/16);
			sixteenDir[k] = new Direction(rad);
			if (k % 2 == 0){
				eightDir[k/2] = new Direction(rad);
				if (k % 4 == 0){
					fourDir[k/4] = new Direction(rad);
				}
			}
		}
	}
	
	public static boolean warnav(MapLocation destiny){
		//navigates to a target while avoiding obstacles
		//fights enemies instead of fleeing
		return false;
	}
	
	public static boolean peacenav(MapLocation destiny){
		//navigates to a target while avoiding obstacles
		//avoids enemies instead of engaging
		return false;
	}
	
	public static boolean dodge(){
		//Attempts to dodge nearby bullets
		return false;
	}
	
	public static boolean engagemelee(RobotInfo enemy){
		//Engages an enemy robot in melee combat
		return false;
	}
	
	public static boolean engagerange (RobotInfo enemy){
		//Engages an enemy robot in range combat
		return false;
	}
	
	public static boolean hunt (RobotInfo enemy){
		//Hunts target until target is dead
		return false;
	}
	
	public static void hide(){
		//Hides behind nearest tree to protect from other bots
	}
	
	public static boolean search(RobotType needle){
		//Searches for a specific type of robot, presumably an archon
		return false;
	}
}