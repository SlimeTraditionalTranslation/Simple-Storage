package io.github.sefiraat.simplestorage.items.materials;

import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class GemAngelite extends AbstractGem {

    private final NamespacedKey key;

    public GemAngelite(SimpleStorage plugin, ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super("天使水晶", category, item, recipeType, recipe, 5);
        this.key = new NamespacedKey(SimpleStorage.inst(), "angelite_crystal");
        register();
        register(plugin);
    }

    @Override
    public int getDefaultSupply(@Nonnull World.Environment environment, @Nonnull Biome biome) {
        switch (environment) {
            case NORMAL:
                switch (biome) {
                    case SNOWY_BEACH:
                    case SNOWY_MOUNTAINS:
                    case SNOWY_TAIGA:
                    case SNOWY_TAIGA_HILLS:
                    case SNOWY_TAIGA_MOUNTAINS:
                    case SNOWY_TUNDRA:
                    case COLD_OCEAN:
                    case DEEP_COLD_OCEAN:
                        return 25;
                    case ICE_SPIKES:
                    case FROZEN_OCEAN:
                    case FROZEN_RIVER:
                    case DEEP_FROZEN_OCEAN:
                        return 40;
                    default:
                        return 5;
                }
            case NETHER:
                return 0;
            default:
                return 15;
        }
    }

    @Nonnull
    @Override
    public NamespacedKey getKey() {
        return key;
    }

}
