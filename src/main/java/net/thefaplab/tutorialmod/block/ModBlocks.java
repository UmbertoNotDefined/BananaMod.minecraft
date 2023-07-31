package net.thefaplab.tutorialmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thefaplab.tutorialmod.TutorialMod;
import net.thefaplab.tutorialmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> BANANA_BLOCK = registerBlock("banana_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PUMPKIN).sound(SoundType.NETHER_WART)));

    public static final RegistryObject<Block> BANANA_LOG = registerBlock("banana_log",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PUMPKIN).sound(SoundType.NETHER_WART)));

    public static final RegistryObject<Block> BANANA_LEAF = registerBlock("banana_leaf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.CHERRY_LEAVES)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
