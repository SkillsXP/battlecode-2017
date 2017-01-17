package sprintplayer;
import battlecode.common.*;

public strictfp class RobotPlayer {
	static RobotController rc;
	static Direction[] eightDir = new Direction[8];
	static Direction[] sixteenDir = new Direction[16];
	
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

	private static void initDirections() {
		///Generates cardinal & intermediate directions
		for (int k = 0; k < 16; k++){
			float rad = (float)(-Math.PI + (2*Math.PI)/16);
			sixteenDir[k] = new Direction(rad);
			if (k % 2 == 0){
				eightDir[k/2] = new Direction(rad);
			}
		}
	}

	private static void runLumberjack() {
		// TODO Auto-generated method stub
		
	}

	private static void runSoldier() {
		// TODO Auto-generated method stub
		
	}

	private static void runScout() {
		// TODO Auto-generated method stub
		
	}

	private static void runGardener() {
		// TODO Auto-generated method stub
		
	}

	private static void runArchon() {
		// TODO Auto-generated method stub
		
	}
}
