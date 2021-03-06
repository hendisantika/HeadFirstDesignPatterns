package com.anirudh.practice.commandPattern;


/**
 * 
 * @author anirudh
 *
 */
public class GarageDoorCloseCommand implements Command {
	
	private GarageDoor door;
	
	public GarageDoorCloseCommand(GarageDoor door){
		this.door=door;
	}
	@Override
	public void execute() {
		door.close();
	}

}
