package items;

public class WeaponFactory {
	public static AbstractWeapon createWeapon(WeaponsType the_weapon) {
		AbstractWeapon  weapon = null;
		
		switch(the_weapon){
		
		case MISSLE:
			weapon = new Missle();
			break;
		case NUKE:
			weapon = new Nuke();
			break;
			
		case ROLLER:
			weapon = new Roller();
			break;
			
		case NAPALM:
			weapon = new Napalm();
			break;
		default:
			break;
		}
		
		return weapon;
	}

}
