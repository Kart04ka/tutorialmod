package net.karto4ka.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.karto4ka.Block.ModBlocks;
import net.karto4ka.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MODGROUP_TEST = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "modgroup_test"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.MODBLOCK_TEST))
                    .displayName(Text.translatable("itemgroup.tutorialmod.modgroup_test"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.MODITEM_TEST);
                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.MODFOOD_TEST);
                        entries.add(ModItems.MODFUEL_TEST);
                        entries.add(ModBlocks.MODBLOCK_TEST);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                    }))
                    .build());
    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("registering groups for " + TutorialMod.MOD_ID);
    }
}
