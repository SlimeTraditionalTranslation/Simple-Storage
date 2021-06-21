package io.github.sefiraat.simplestorage.categories;

import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.items.Skulls;
import io.github.sefiraat.simplestorage.utils.Theme;
import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.NamespacedKey;

public final class Categories {

    private Categories() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItem catSimpleStorageMain() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.CAT_CORE),
                Theme.MAIN + "簡單儲存"
        );
    }
    public static CustomItem catSimpleStorageMaterials() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.CAT_MATERIALS),
                Theme.MAIN + "簡單儲存材料"
        );
    }
    public static CustomItem catSimpleStorageItems() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.CAT_ITEMS),
                Theme.MAIN + "簡單儲存物品"
        );
    }
    public static CustomItem catSimpleStorageMachines() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.CAT_MACHINES),
                Theme.MAIN + "簡單儲存機器"
        );
    }
    public static CustomItem catSimpleStorageChests() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.CAT_CHESTS),
                Theme.MAIN + "簡單儲存儲物箱/單元"
        );
    }


    public static final MultiCategory CORE = new MultiCategory(new NamespacedKey(SimpleStorage.inst(), "simple-storage"), catSimpleStorageMain());
    public static final SubCategory MAT = new SubCategory(new NamespacedKey(SimpleStorage.inst(), "simple-storage-materials"), CORE, catSimpleStorageMaterials());
    public static final SubCategory ITM = new SubCategory(new NamespacedKey(SimpleStorage.inst(), "simple-storage-items"), CORE, catSimpleStorageItems());
    public static final SubCategory MCN = new SubCategory(new NamespacedKey(SimpleStorage.inst(), "simple-storage-machines"), CORE, catSimpleStorageMachines());
    public static final SubCategory CHT = new SubCategory(new NamespacedKey(SimpleStorage.inst(), "simple-storage-chests"), CORE, catSimpleStorageChests());

    public static void set(SimpleStorage p) {
        CORE.register(p);
        MAT.register(p);
        ITM.register(p);
        MCN.register(p);
        CHT.register(p);
    }

}
