package net.karto4ka.Item;

import net.karto4ka.Item.custom.ChiselItem;
import net.karto4ka.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));
    public static final  Item MODFOOD_TEST = registerItem("modfood_test", new Item(new Item.Settings().food(ModFoodComponents.MODFOOD_TEST)));
    public static final Item MODFUEL_TEST = registerItem("modfuel_test", new Item(new Item.Settings()));
    public static final Item MODITEM_TEST = registerItem("moditem_test", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        TutorialMod.LOGGER.info("registering items for " + TutorialMod.MOD_ID);
    }
}
