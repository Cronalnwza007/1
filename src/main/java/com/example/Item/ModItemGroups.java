package com.example.Item;

import com.example.Block.ModBlocks;
import com.example.TemplateMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.example.Item.ModItems.PINK_GARNET;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TemplateMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.template-mod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(PINK_GARNET);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        TemplateMod.LOGGER.info("Registering Item Groups for " + TemplateMod.MOD_ID);
    }
}
