package net.tribush.overlord.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tribush.overlord.Overlord;

import java.util.ArrayList;
import java.util.List;

public class ModItemGroups {
    public static final ItemGroup ALCHEMY_AND_POTIONS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Overlord.MOD_ID, "alchemy_and_potions"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.alchemy_and_potions"))
                    .icon(() -> new ItemStack(ModItems.STAFF_OF_AINZ_OOAL_GOWN))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STAFF_OF_AINZ_OOAL_GOWN);
                    }).build());


    public static void registerItemGroups() {
        Overlord.LOGGER.info("Registering Item Groups for " + Overlord.MOD_ID);
    }
}
