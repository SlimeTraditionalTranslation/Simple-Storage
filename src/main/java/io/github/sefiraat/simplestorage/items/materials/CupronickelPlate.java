package io.github.sefiraat.simplestorage.items.materials;

import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.statics.Messages;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class CupronickelPlate extends SlimefunItem implements NotPlaceable {

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "MATERIAL_CUPRONICKEL_PLATE",
            Material.ORANGE_CARPET,
            Messages.THEME_ITEM_CRAFTING + "Reinforced Cupronickel Alloy Plate",
            "",
            Messages.THEME_PASSIVE + "A plate made out of Cupronickel used as",
            Messages.THEME_PASSIVE + "a shell for intermediate storage components.",
            "",
            Messages.THEME_ITEM_TYPEDESC + "Crafting Material"
    );

    public static final ItemStack[] RECIPE = new ItemStack[] {
                DieReinforced.STACK, new SlimefunItemStack(CupronickelReinforced.STACK, 4), null,
                null,                null,                                                          null,
                null,                null,                                                          null
    };

    public CupronickelPlate(SimpleStorage plugin, Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        register(plugin);
    }

}
