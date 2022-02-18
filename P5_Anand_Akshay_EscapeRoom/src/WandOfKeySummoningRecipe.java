
public class WandOfKeySummoningRecipe extends Recipe{

	public WandOfKeySummoningRecipe(boolean orderMatters, String[] ingredients) {
		super(orderMatters, ingredients);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void combineInRoom(Room r) {
		System.out.println("You created a wand_of_key_summoning!");
		r.add(new WandOfKeySummoning("wand_of_key_summoning", "a magical wand that can summon a key."));
		removeIngredientsFromRoom(r);
	}

}
