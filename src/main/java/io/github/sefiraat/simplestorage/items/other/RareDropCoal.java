package io.github.sefiraat.simplestorage.items.other;

import io.github.mooy1.infinitylib.recipes.RecipeMap;
import io.github.mooy1.infinitylib.recipes.ShapedRecipe;
import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.utils.Theme;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public final class RareDropCoal {

    private RareDropCoal() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "MECHANIC_DROP_COAL",
            Material.COAL_ORE,
            Theme.ITEM_RARE_DROP + "稀有掉落: 煤炭",
            "",
            Theme.PASSIVE + "此物品是稀有掉落自",
            Theme.PASSIVE + "煤礦. 方塊必須實際上的打破",
            Theme.PASSIVE + "不能有絲綢之觸.",
            "",
            Theme.LORE_TYPE_DROP
    );

    private static final RecipeMap<ItemStack> RECIPES = new RecipeMap<>(ShapedRecipe::new);
    public static final RecipeType TYPE = new RecipeType(new NamespacedKey(SimpleStorage.inst(), "drop-coal"), STACK, RECIPES::put);

}
