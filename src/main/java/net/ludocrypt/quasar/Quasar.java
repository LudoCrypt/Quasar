package net.ludocrypt.quasar;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("quasar")
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
}
