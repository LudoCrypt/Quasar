package net.ludocrypt.quasar;

import net.ludocrypt.quasar.world.OreGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("quasar")
@Mod.EventBusSubscriber(modid = Quasar.MOD_ID, bus = Bus.MOD)
public class Quasar
{

//    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "quasar";
    public static Quasar instance;
    public Quasar() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        instance = this;
    }
    private void setup(final FMLCommonSetupEvent event)
    {

    }
    private void doClientStuff(final FMLClientSetupEvent event) 
    {

    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {

    }
    @SubscribeEvent
    public static void LoadCompleteEvent(FMLLoadCompleteEvent event)
    {
    	OreGen.generateOre();
    }
    
}

