package net.tribush.overlord.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.tribush.overlord.Overlord;

public class ModItems {
    // weapons //
    public static final Item STAFF_OF_AINZ_OOAL_GOWN = registerItem("staff_of_ainz_ooal_gown", new Item(new Item.Settings()));
    // food //
    public static final Item THAI_CHILIS = registerItem("thai_chilis", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.3F).build())));
    public static final Item GREEN_PEPPER = registerItem("green_pepper", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.3F).build())));
    public static final Item CAYENNE_PEPPER = registerItem("cayenne_pepper", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.3F).build())));
    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(8).saturationModifier(0.6F).build())));
    public static final Item BAKED_APPLE = registerItem("baked_apple", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.6F).build())));
    public static final Item BANANACREME_PIE = registerItem("bananacreme_pie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item BANANAS = registerItem("bananas", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item BERRY_PIE = registerItem("berry_pie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(8).saturationModifier(0.6F).build())));
    public static final Item BUTTER = registerItem("butter", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build())));
    public static final Item CHEESE = registerItem("cheese", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.5F).build())));
    public static final Item CHEESE_SLICE = registerItem("cheese_slice", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).build())));
    public static final Item CHERRIES = registerItem("cherries", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item CHOCOCOOKIE_DOUGH = registerItem("chococookie_dough", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item COOKIE_DOUGH = registerItem("cookie_dough", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item DOUGH = registerItem("dough", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).build())));
    public static final Item FLOUR = registerItem("flour", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build())));
    public static final Item FRIED_EGG = registerItem("fried_egg", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build())));
    public static final Item FROSTED_COOKIE = registerItem("frosted_cookie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_BLUE = registerItem("frosted_cookie_blue", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_CYAN = registerItem("frosted_cookie_cyan", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_LIGHTBLUE = registerItem("frosted_cookie_lightblue", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_LIME = registerItem("frosted_cookie_lime", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_MAGENTA = registerItem("frosted_cookie_magenta", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_ORANGE = registerItem("frosted_cookie_orange", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_PINK = registerItem("frosted_cookie_pink", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_PURPLE = registerItem("frosted_cookie_purple", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_RED = registerItem("frosted_cookie_red", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_WHITE = registerItem("frosted_cookie_white", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item FROSTED_COOKIE_YELLOW = registerItem("frosted_cookie_yellow", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item OLIVE = registerItem("olive", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item OLIVE_OIL = registerItem("olive_oil", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).build())));
    public static final Item ORANGE = registerItem("orange", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build())));
    public static final Item PEAR = registerItem("pear", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item PEPPERONI = registerItem("pepperoni", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item PIE_CRUST = registerItem("pie_crust", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).build())));
    public static final Item PIZZA_CHEESE = registerItem("pizza_cheese", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.3F).build())));
    public static final Item PIZZA_COMBO = registerItem("pizza_combo", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(8).saturationModifier(0.8F).build())));
    public static final Item PIZZA_DOUGH = registerItem("pizza_dough", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).build())));
    public static final Item PIZZA_PEPPERONI = registerItem("pizza_pepperoni", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(8).saturationModifier(0.8F).build())));
    public static final Item RAW_APPLE_PIE = registerItem("raw_apple_pie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.4F).build())));
    public static final Item RAW_BANANACREME_PIE = registerItem("raw_bananacreme_pie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build())));
    public static final Item RAW_BERRY_PIE = registerItem("raw_berry_pie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.4F).build())));
    public static final Item RAW_PIZZA_CHEESE = registerItem("raw_pizza_cheese", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item RAW_PIZZA_COMBO = registerItem("raw_pizza_combo", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.6F).build())));
    public static final Item RAW_PIZZA_PEPPERONI = registerItem("raw_pizza_pepperoni", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.6F).build())));
    public static final Item SALT = registerItem("salt", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build())));
    public static final Item SUGAR_COOKIE = registerItem("sugar_cookie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.5F).build())));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item BANANA_BREAD = registerItem("banana_bread", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.7F).build())));
    public static final Item BANANA_BUNCH = registerItem("banana_bunch", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build())));
    public static final Item BANANA_CHOCOLATE = registerItem("banana_chocolate", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build())));
    public static final Item BANANA_COOKIE = registerItem("banana_cookie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item BANANA_DONUT = registerItem("banana_donut", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build())));
    public static final Item BANANA_FRIED = registerItem("banana_fried", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build())));
    public static final Item BANANA_OILED = registerItem("banana_oiled", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item BANANA_PUDDING = registerItem("banana_pudding", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.5F).build())));
    public static final Item BANANA_SMOOTHIE = registerItem("banana_smoothie", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build())));
    public static final Item VANILLA_BEAN = registerItem("vanilla_bean", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).build())));
    public static final Item BEEF_PATTY = registerItem("beef_patty", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6F).build())));
    public static final Item BIG_MAC = registerItem("big_mac", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(8).saturationModifier(1.2F).build())));
    public static final Item CHEESEBURGER = registerItem("cheeseburger", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(1.0F).build())));
    public static final Item CHICKEN_MC_NUGGETS = registerItem("chicken_mcnuggets", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.7F).build())));
    public static final Item CHICKENBURGER = registerItem("chickenburger", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(1.0F).build())));
    public static final Item COOKED_BACON = registerItem("cooked_bacon", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.5F).build())));
    public static final Item COOKED_BEEF_PATTY = registerItem("cooked_beef_patty", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6F).build())));
    public static final Item FILET_O_FISH = registerItem("filet_o_fish", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(1.0F).build())));
    public static final Item FRIES = registerItem("fries", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.6F).build())));
    public static final Item HAMBURGER = registerItem("hamburger", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(1.0F).build())));
    public static final Item LETTUCE = registerItem("lettuce", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.2F).build())));
    public static final Item MCWRAP = registerItem("mcwrap", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(7).saturationModifier(1.1F).build())));
    public static final Item RAW_BACON = registerItem("raw_bacon", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build())));
    public static final Item MC_BACON = registerItem("mcbacon", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(1.0F).build())));
    public static final Item MC_CHICKEN = registerItem("mcchicken", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(1.0F).build())));
    public static final Item TORTILLA = registerItem("tortilla", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6F).build())));
    public static final Item KETCHUP = registerItem("ketchup", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build())));
    public static final Item COOKED_AXOLOTL = registerItem("cooked_axolotl", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(10).saturationModifier(0.8F).build())));
    public static final Item CALAMARI_ROLL = registerItem("calamari_roll", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.8F).build())));
    public static final Item CALAMARI_SASHIMI = registerItem("calamari_sashimi", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build())));
    public static final Item CLOWNFISH_ROLL = registerItem("clownfish_roll", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.7F).build())));
    public static final Item CLOWNFISH_SASHIMI = registerItem("clownfish_sashimi", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item COOKED_CALAMARI = registerItem("cooked_calamari", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.6F).build())));
    public static final Item CUCUMBER = registerItem("cucumber", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item CUCUMBER_ROLL = registerItem("cucumber_roll", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build())));
    public static final Item FISH_ROLL = registerItem("fish_roll", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.7F).build())));
    public static final Item MUSHROOM_ROLL = registerItem("mushroom_roll", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build())));
    public static final Item RAW_CALAMARI = registerItem("raw_calamari", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.2F).build())));
    public static final Item RICE = registerItem("rice", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build())));
    public static final Item RICE_BALL = registerItem("rice_ball", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build())));
    public static final Item SALMON_ROLL = registerItem("salmon_roll", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.8F).build())));
    public static final Item SALMON_SASHIMI = registerItem("salmon_sashimi", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build())));
    public static final Item SASHIMI = registerItem("sashimi", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build())));
    // alchemy_and_potions //

    //Seeds //
    public static final Item TOMATO_SEED = new SeedItems(new Item.Settings().food(ItemGroups.INGREDIENTS));

    // add items to groups //
    private static void addItemsToIngredientItemGroup (FabricItemGroupEntries entries) {
        entries.add(TOMATO_SEED);
    }

    private static void addItemsToFoodItemGroup (FabricItemGroupEntries entries) {
        entries.add(THAI_CHILIS);
        entries.add(GREEN_PEPPER);
        entries.add(CAYENNE_PEPPER);
        entries.add(APPLE_PIE);
        entries.add(BAKED_APPLE);
        entries.add(BANANACREME_PIE);
        entries.add(BANANAS);
        entries.add(BERRY_PIE);
        entries.add(BUTTER);
        entries.add(CHEESE);
        entries.add(CHEESE_SLICE);
        entries.add(CHERRIES);
        entries.add(CHOCOCOOKIE_DOUGH);
        entries.add(COOKIE_DOUGH);
        entries.add(DOUGH);
        entries.add(FLOUR);
        entries.add(FRIED_EGG);
        entries.add(FROSTED_COOKIE);
        entries.add(FROSTED_COOKIE_BLUE);
        entries.add(FROSTED_COOKIE_CYAN);
        entries.add(FROSTED_COOKIE_LIGHTBLUE);
        entries.add(FROSTED_COOKIE_LIME);
        entries.add(FROSTED_COOKIE_MAGENTA);
        entries.add(FROSTED_COOKIE_ORANGE);
        entries.add(FROSTED_COOKIE_PINK);
        entries.add(FROSTED_COOKIE_PURPLE);
        entries.add(FROSTED_COOKIE_RED);
        entries.add(FROSTED_COOKIE_WHITE);
        entries.add(FROSTED_COOKIE_YELLOW);
        entries.add(OLIVE);
        entries.add(OLIVE_OIL);
        entries.add(ORANGE);
        entries.add(PEAR);
        entries.add(PEPPERONI);
        entries.add(PIE_CRUST);
        entries.add(PIZZA_CHEESE);
        entries.add(PIZZA_COMBO);
        entries.add(PIZZA_DOUGH);
        entries.add(PIZZA_PEPPERONI);
        entries.add(RAW_APPLE_PIE);
        entries.add(RAW_BANANACREME_PIE);
        entries.add(RAW_BERRY_PIE);
        entries.add(RAW_PIZZA_CHEESE);
        entries.add(RAW_PIZZA_COMBO);
        entries.add(RAW_PIZZA_PEPPERONI);
        entries.add(SALT);
        entries.add(SUGAR_COOKIE);
        entries.add(TOMATO);
        entries.add(BANANA_BREAD);
        entries.add(BANANA_BUNCH);
        entries.add(BANANA_CHOCOLATE);
        entries.add(BANANA_COOKIE);
        entries.add(BANANA_DONUT);
        entries.add(BANANA_FRIED);
        entries.add(BANANA_OILED);
        entries.add(BANANA_PUDDING);
        entries.add(BANANA_SMOOTHIE);
        entries.add(VANILLA_BEAN);
        entries.add(BEEF_PATTY);
        entries.add(BIG_MAC);
        entries.add(CHEESEBURGER);
        entries.add(CHICKEN_MC_NUGGETS);
        entries.add(CHICKENBURGER);
        entries.add(COOKED_BACON);
        entries.add(COOKED_BEEF_PATTY);
        entries.add(FILET_O_FISH);
        entries.add(FRIES);
        entries.add(HAMBURGER);
        entries.add(LETTUCE);
        entries.add(MCWRAP);
        entries.add(RAW_BACON);
        entries.add(MC_BACON);
        entries.add(MC_CHICKEN);
        entries.add(TORTILLA);
        entries.add(KETCHUP);
        entries.add(COOKED_AXOLOTL);
        entries.add(CALAMARI_ROLL);
        entries.add(CALAMARI_SASHIMI);
        entries.add(CLOWNFISH_ROLL);
        entries.add(CLOWNFISH_SASHIMI);
        entries.add(COOKED_CALAMARI);
        entries.add(CUCUMBER);
        entries.add(CUCUMBER_ROLL);
        entries.add(FISH_ROLL);
        entries.add(MUSHROOM_ROLL);
        entries.add(RAW_CALAMARI);
        entries.add(RICE);
        entries.add(RICE_BALL);
        entries.add(SALMON_ROLL);
        entries.add(SALMON_SASHIMI);
        entries.add(SASHIMI);

    }

    private static void addItemsToCombatItemGroup (FabricItemGroupEntries entries) {
        entries.add(STAFF_OF_AINZ_OOAL_GOWN);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Overlord.MOD_ID, name), item);
    }

// register groups you'll use here //
    public static void registerModItems() {
        Overlord.LOGGER.info("Registering Mod Items for " + Overlord.MOD_ID);
        // need below for each group //
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }

}
