package io.github.sefiraat.simplestorage.items.blocks;

import io.github.mooy1.infinitylib.slimefun.AbstractTickingContainer;
import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.items.materials.ChestCoreBasic;
import io.github.sefiraat.simplestorage.items.materials.ChestCoreReinforced;
import io.github.sefiraat.simplestorage.statics.Messages;
import io.github.sefiraat.simplestorage.statics.Skulls;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class ChestGold extends AbstractTickingContainer {

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "BLOCK_CHEST_GOLD",
            Skulls.BLOCK_CHEST_GOLD,
            Messages.THEME_ITEM_CRAFTING + "Gold Chest",
            "",
            Messages.THEME_PASSIVE + "A chest with 144 item slots.",
            "",
            Messages.THEME_ITEM_TYPEDESC + "Chest"
    );

    public static final ItemStack[] RECIPE = new ItemStack[] {
            SlimefunItems.GOLD_24K_BLOCK, ChestIron.STACK,                  SlimefunItems.GOLD_24K_BLOCK,
            SlimefunItems.GOLD_24K_BLOCK, ChestCoreReinforced.STACK,        SlimefunItems.GOLD_24K_BLOCK,
            SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.BLISTERING_INGOT_3,   SlimefunItems.GOLD_24K_BLOCK
    };

    public ChestGold(SimpleStorage plugin, Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        register(plugin);
    }

    @Override
    protected void tick(@NotNull BlockMenu blockMenu, @NotNull Block block) {

    }

    @Override
    protected void setupMenu(@NotNull BlockMenuPreset blockMenuPreset) {

    }

    @Override
    protected int @NotNull [] getTransportSlots(@NotNull DirtyChestMenu dirtyChestMenu, @NotNull ItemTransportFlow itemTransportFlow, ItemStack itemStack) {
        return new int[0];
    }
}
