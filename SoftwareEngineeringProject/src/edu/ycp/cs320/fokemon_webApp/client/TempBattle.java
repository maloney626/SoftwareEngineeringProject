package edu.ycp.cs320.fokemon_webApp.client;

import edu.ycp.cs320.fokemon_webApp.shared.Battle.Battle;
import edu.ycp.cs320.fokemon_webApp.shared.MoveClasses.Move;
import edu.ycp.cs320.fokemon_webApp.shared.MoveClasses.MoveDataBase;
import edu.ycp.cs320.fokemon_webApp.shared.MoveClasses.MoveName;
import edu.ycp.cs320.fokemon_webApp.shared.Player.Location;
import edu.ycp.cs320.fokemon_webApp.shared.Player.Player;
import edu.ycp.cs320.fokemon_webApp.shared.PokemonClasses.Pokemon;

public class TempBattle {
  
	private Pokemon Attacker;
	private Pokemon Defender;
	private Move AttackerMove;
	private Move DefenderMove;
	private Player user;
	private Player opp;
	private Location loc;
	private Battle battle;
	
  public TempBattle() {
		loc=new Location(0, 0, 0);
		AttackerMove=MoveDataBase.generateMove(MoveName.Blizzard);
		DefenderMove=MoveDataBase.generateMove(MoveName.Bite);
		Attacker=new Pokemon(50, 50);
		Attacker.getInfo().setNickname("Charizard");
		Attacker.getStats().setMaxHp(200);
		Attacker.getStats().setCurHp(200);
		Defender=new Pokemon(35, 35);
		Defender.getInfo().setNickname("Pikachu");
		Defender.getStats().setMaxHp(200);
		Defender.getStats().setCurHp(200);
		Attacker.getMoves().add(AttackerMove);
		Attacker.getMoves().add(DefenderMove);
		Attacker.getMoves().add(MoveDataBase.generateMove(MoveName.Thunder_Wave));
		Attacker.getMoves().add(MoveDataBase.generateMove(MoveName.Acid));
		Defender.getMoves().add(DefenderMove);
		Pokemon Attacker2=new Pokemon(40,40);
		Attacker2=Attacker;
		Pokemon Attacker3=new Pokemon(40,40);
		Attacker3=Attacker;
		
		Pokemon Defender2=new Pokemon(35,35);
		Defender2=Defender;
		Pokemon Defender3=new Pokemon(35,35);
		Defender3=Defender;
		user=new Player(200, "Cody F.", true, loc);
		user.getTeam().add(Attacker);
		user.getTeam().add(Attacker2);
		user.getTeam().add(Attacker3);
		opp=new Player(100,"Roberto", true, loc);
		opp.getTeam().add(Defender);
		opp.getTeam().add(Defender2);
		
		opp.getTeam().add(Defender3);
		setBattle(new Battle(user, opp));
  }
  
  public Player getUser() {
	return user;
}

public void setUser(Player user) {
	this.user = user;
}

public Player getOpp() {
	return opp;
}

public void setOpp(Player opp) {
	this.opp = opp;
}

public void update() {
    
  }

public Battle getBattle() {
	return battle;
}

public void setBattle(Battle battle) {
	this.battle = battle;
}
}
