package io.github.sefiraat.simplestorage.categories;

import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.items.Skulls;
import io.github.sefiraat.simplestorage.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.NamespacedKey;

public final class Categories {

    private Categories() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItemStack catSimpleStorageMain() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.CAT_CORE)),
                Theme.MAIN + "簡單儲存"
        );
    }
    public static CustomItemStack catSimpleStorageMaterials() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.CAT_MATERIALS)),
                Theme.MAIN + "簡單儲存材料"
        );
    }
    public static CustomItemStack catSimpleStorageItems() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.CAT_ITEMS)),
                Theme.MAIN + "簡單儲存物品"
        );
    }
    public static CustomItemStack catSimpleStorageMachines() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.CAT_MACHINES)),
                Theme.MAIN + "簡單儲存機器"
        );
    }
    public static CustomItemStack catSimpleStorageChests() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.CAT_CHESTS)),
                Theme.MAIN + "簡單儲存儲物箱/單元"
        );
    }


    public static final NestedItemGroup CORE = new NestedItemGroup(new NamespacedKey(SimpleStorage.inst(), "simple-storage"), catSimpleStorageMain());
    public static final SubItemGroup MAT = new SubItemGroup(new NamespacedKey(SimpleStorage.inst(), "simple-storage-materials"), CORE, catSimpleStorageMaterials());
    public static final SubItemGroup ITM = new SubItemGroup(new NamespacedKey(SimpleStorage.inst(), "simple-storage-items"), CORE, catSimpleStorageItems());
    public static final SubItemGroup MCN = new SubItemGroup(new NamespacedKey(SimpleStorage.inst(), "simple-storage-machines"), CORE, catSimpleStorageMachines());
    public static final SubItemGroup CHT = new SubItemGroup(new NamespacedKey(SimpleStorage.inst(), "simple-storage-chests"), CORE, catSimpleStorageChests());

    public static void set(SimpleStorage p) {
        CORE.register(p);
        MAT.register(p);
        ITM.register(p);
        MCN.register(p);
        CHT.register(p);
    }

}
