package net.ludocrypt.quasar.init;

import net.ludocrypt.quasar.Quasar;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Quasar.MOD_ID)
@Mod.EventBusSubscriber(modid = Quasar.MOD_ID, bus = Bus.MOD)
public class BlockInit
{
	
	
	
	//Ores
	public static final Block talc_ore = null;

	
	
	//Talc
	//Block
	public static final Block talc_block = null;
	//Brick
	public static final Block talc_brick = null;
	//Odd Brick
	public static final Block talc_odd_brick = null;
	//Odd Path
	public static final Block talc_odd_path = null;
	//Path
	public static final Block talc_path = null;
	//Tile
	public static final Block talc_tile = null;
	//Uneven Brick
	public static final Block talc_uneven_brick = null;
	//Walkway
	public static final Block talc_walkway = null;
	//Wide Tile
	public static final Block talc_wide_tile = null;
	
	
	
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) 
	{
		
		
		
		//Ores
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.1F, 0.1F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0)).setRegistryName("talc_ore"));

		

		//Talc
		//Block
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_block"));
		//Brick
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_brick"));
		//Odd Brick
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_odd_brick"));
		//Odd Path
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_odd_path"));
		//Path
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_path"));
		//Tile
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_tile"));
		//Uneven Brick
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_uneven_brick"));
		//Walkway
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_walkway"));
		//Wide Tile
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_wide_tile"));
			
	}
	
	
	
	
	@SubscribeEvent
	public static void registerBlockitems(final RegistryEvent.Register<Item> event)
	{
		
		
		
		//Ores
		event.getRegistry().register(new BlockItem(talc_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_ore"));

		
		
		//Talc
		//Block
		event.getRegistry().register(new BlockItem(talc_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_block"));
		//Brick
		event.getRegistry().register(new BlockItem(talc_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_brick"));
		//Odd Brick
		event.getRegistry().register(new BlockItem(talc_odd_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_odd_brick"));
		//Odd Path
		event.getRegistry().register(new BlockItem(talc_odd_path, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_odd_path"));
		//Path
		event.getRegistry().register(new BlockItem(talc_path, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_path"));
		//Tile
		event.getRegistry().register(new BlockItem(talc_tile, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_tile"));
		//Uneven Brick
		event.getRegistry().register(new BlockItem(talc_uneven_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_uneven_brick"));
		//Walkway
		event.getRegistry().register(new BlockItem(talc_walkway, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_walkway"));
		//Wide Tile
		event.getRegistry().register(new BlockItem(talc_wide_tile, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_wide_tile"));
		
	}
}
