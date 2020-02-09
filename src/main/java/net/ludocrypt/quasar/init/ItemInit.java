package net.ludocrypt.quasar.init;

import net.ludocrypt.quasar.Quasar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Quasar.MOD_ID, bus = Bus.MOD)
@ObjectHolder(Quasar.MOD_ID)
public class ItemInit 
{
	
	//Ore Ingot
	public static Item talc_ingot = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) 
	{
		
		
		
		//Ore Ingot
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("talc_ingot"));
	
	
	
	
	}
}
