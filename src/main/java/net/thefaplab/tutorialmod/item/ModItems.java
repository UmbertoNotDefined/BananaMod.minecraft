package net.thefaplab.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thefaplab.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COOKED_BANANA = ITEMS.register("cooked_banana",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BANANA_FRAGMENT = ITEMS.register("banana_fragment",
            () -> new Item( new Item.Properties()));

    public static final RegistryObject<Item> BANANA_POTION = ITEMS.register("banana_potion",
            () -> new Item( new Item.Properties()));

    public static final RegistryObject<Item> BANANA_CRYSTAL = ITEMS.register("banana_crystal",
            () -> new Item( new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
