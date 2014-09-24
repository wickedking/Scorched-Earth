package items;

/**
 * The abstract usage of all weapons to be used in the game.
 * @author Cody
 *
 */
public abstract class AbstractWeapon {
	
	WeaponsType my_type;
	int my_damage;
	int my_speed;//might not actually be used
	int my_impact_size;
	boolean my_impact_special;
	
	public AbstractWeapon(WeaponsType the_type, int the_damage,
			int the_speed, int the_impact_size, boolean the_impact_special){
		my_type = the_type;	
		my_damage = the_damage;
		my_speed = the_speed;
		my_impact_size = the_impact_size;
		my_impact_special = the_impact_special;
	}


}
