package fr.myware.mware.item;

import fr.myware.mware.MyWare;
import fr.myware.mware.item.custom.IronShieldItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,MyWare.MOD_ID);
    
    public static final RegistryObject<Item> ICON =ITEMS.register("icon",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> IRON_SHIELD =ITEMS.register("iron_shield",
            () -> new IronShieldItem((new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB).durability(10000))));
  

    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
