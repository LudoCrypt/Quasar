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

	//Stones
	public static final Block gneiss = null;
	
	//Block
	public static final Block talc_block = null;
	public static final Block gneiss_block = null;
	//Brick
	public static final Block talc_brick = null;
	public static final Block gneiss_brick = null;
	//Odd Brick
	public static final Block talc_odd_brick = null;
	public static final Block gneiss_odd_brick = null;
	//Odd Path
	public static final Block talc_odd_path = null;
	public static final Block gneiss_odd_path = null;
	//Path
	public static final Block talc_path = null;
	public static final Block gneiss_path = null;
	//Tile
	public static final Block talc_tile = null;
	public static final Block gneiss_tile = null;
	//Uneven Brick
	public static final Block talc_uneven_brick = null;
	public static final Block gneiss_uneven_brick = null;
	//Walkway
	public static final Block talc_walkway = null;
	public static final Block gneiss_walkway = null;
	//Wide Tile
	public static final Block talc_wide_tile = null;
	public static final Block gneiss_wide_tile = null;
	//Two Brick
	public static final Block talc_two_brick = null;
	public static final Block gneiss_two_brick = null;
	
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) 
	{
		
		
		
		//Ores
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.1F, 0.1F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0)).setRegistryName("talc_ore"));

		//Stones
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0)).setRegistryName("gneiss"));
		
		//Block
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_block"));
		//Brick
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_brick"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_brick"));
		//Odd Brick
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_odd_brick"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_odd_brick"));
		//Odd Path
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_odd_path"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_odd_path"));
		//Path
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_path"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_path"));
		//Tile
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_tile"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_tile"));
		//Uneven Brick
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_uneven_brick"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_uneven_brick"));
		//Walkway
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_walkway"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_walkway"));
		//Wide Tile
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_wide_tile"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_wide_tile"));
		//Two Brick
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 1.2F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("talc_two_brick"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("gneiss_two_brick"));
	}
	
	
	
	
	@SubscribeEvent
	public static void registerBlockitems(final RegistryEvent.Register<Item> event)
	{
		
		
		
		//Ores
		event.getRegistry().register(new BlockItem(talc_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_ore"));

		//Stones
		event.getRegistry().register(new BlockItem(gneiss, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss"));
		
		//Block
		event.getRegistry().register(new BlockItem(talc_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_block"));
		event.getRegistry().register(new BlockItem(gneiss_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_block"));
		//Brick
		event.getRegistry().register(new BlockItem(talc_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_brick"));
		event.getRegistry().register(new BlockItem(gneiss_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_brick"));
		//Odd Brick
		event.getRegistry().register(new BlockItem(talc_odd_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_odd_brick"));
		event.getRegistry().register(new BlockItem(gneiss_odd_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_odd_brick"));
		//Odd Path
		event.getRegistry().register(new BlockItem(talc_odd_path, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_odd_path"));
		event.getRegistry().register(new BlockItem(gneiss_odd_path, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_odd_path"));
		//Path
		event.getRegistry().register(new BlockItem(talc_path, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_path"));
		event.getRegistry().register(new BlockItem(gneiss_path, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_path"));
		//Tile
		event.getRegistry().register(new BlockItem(talc_tile, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_tile"));
		event.getRegistry().register(new BlockItem(gneiss_tile, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_tile"));
		//Uneven Brick
		event.getRegistry().register(new BlockItem(talc_uneven_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_uneven_brick"));
		event.getRegistry().register(new BlockItem(gneiss_uneven_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_uneven_brick"));
		//Walkway
		event.getRegistry().register(new BlockItem(talc_walkway, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_walkway"));
		event.getRegistry().register(new BlockItem(gneiss_walkway, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_walkway"));
		//Wide Tile
		event.getRegistry().register(new BlockItem(talc_wide_tile, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_wide_tile"));
		event.getRegistry().register(new BlockItem(gneiss_wide_tile, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_wide_tile"));
		//Two Brick
		event.getRegistry().register(new BlockItem(talc_two_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("talc_two_brick"));
		event.getRegistry().register(new BlockItem(gneiss_two_brick, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gneiss_two_brick"));
	}
}
