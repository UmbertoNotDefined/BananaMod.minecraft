package net.thefaplab.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thefaplab.tutorialmod.TutorialMod;
import net.thefaplab.tutorialmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODS_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODS_TAB.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BANANA.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.BANANA.get());
                        pOutput.accept(ModItems.BANANA_FRAGMENT.get());
                        pOutput.accept(ModItems.BANANA_POTION.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODS_TAB.register(eventBus);
    }
}
