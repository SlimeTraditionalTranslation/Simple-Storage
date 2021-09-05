package io.github.sefiraat.simplestorage.items.chests;

import io.github.sefiraat.simplestorage.items.Skulls;
import io.github.sefiraat.simplestorage.items.chests.network.NetworkElement;
import io.github.sefiraat.simplestorage.items.chests.network.NetworkElement.NetworkElementType;
import io.github.sefiraat.simplestorage.utils.Theme;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class GuiItems {

    private GuiItems() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItemStack menuBackground() {
        return new CustomItemStack(
                Material.GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "簡單!",
                ""
        );
    }

    public static CustomItemStack menuInfo() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_NO1)),
                Theme.GUI_HEAD + "資訊",
                "",
                "頁數 : 1"
        );
    }

    public static CustomItemStack menuChestPageBack() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_BACK)),
                Theme.GUI_HEAD + "返回",
                "",
                Theme.CLICK_INFO + "點擊以返回頁面."
        );
    }

    public static CustomItemStack menuChestPageForward() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_FORWARD)),
                Theme.GUI_HEAD + "向前",
                "",
                Theme.CLICK_INFO + "點擊以向前頁面."
        );
    }

    public static CustomItemStack menuChestDummy() {
        return new CustomItemStack(
                Material.LIGHT_GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "沒有物品在這"
        );
    }

    public static CustomItemStack menuMasterDummy() {
        return new CustomItemStack(
                Material.LIGHT_GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "沒有物品欄在這"
        );
    }

    public static CustomItemStack menuClose() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_CLOSE)),
                Theme.GUI_HEAD + "關閉"
        );
    }

    public static CustomItemStack menuRenameCell() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_RENAME_CELL)),
                Theme.GUI_HEAD + "重新命名單元"
        );
    }

    public static CustomItemStack menuSetMaterial() {
        return new CustomItemStack(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_SET_ICON)),
                Theme.GUI_HEAD + "設置圖標",
                "",
                Theme.ITEM_TYPEDESC + "用鼠標上的一個物品點擊",
                Theme.ITEM_TYPEDESC + "它來設置這個物品欄的圖標"
        );
    }

    public static CustomItemStack menuCell(NetworkElement ne) {

        ItemStack i = NetworkElement.getItemStack(ne);
        String name;
        String storedName = ne.getDisplayName();
        if (storedName == null) {
            name = ChatColor.WHITE + "掃描物品欄";
        } else {
            name = storedName;
        }

        if (ne.getType() == NetworkElement.NetworkElementType.INVENTORY_CELL) {
            return menuCellNormal(i, name);
        } else if (
                ne.getType() == NetworkElementType.INFINITY_BARREL ||
                ne.getType() == NetworkElementType.FLUFFY_BARREL
        ) {
            return menuCellBarrel(i, name, ne);
        } else {
            return menuCellError();
        }
    }

    public static CustomItemStack menuCellNormal(ItemStack i, String name) {
        return new CustomItemStack(
                i,
                Theme.GUI_HEAD + name,
                "",
                Theme.ITEM_TYPEDESC + "物品欄類型: " + NetworkElement.networkElementTypeName(NetworkElement.NetworkElementType.INVENTORY_CELL),
                "",
                Theme.CLICK_INFO + "左鍵: " + ChatColor.WHITE + "打開物品欄",
                Theme.CLICK_INFO + "右鍵: " + ChatColor.WHITE + "高亮物品欄"
        );
    }

    public static CustomItemStack menuCellBarrel(ItemStack i, String name, NetworkElement networkElement) {
        String barrelAmount = Theme.ITEM_TYPEDESC + "內容: " + ChatColor.WHITE + networkElement.getBarrelAmount();
        return new CustomItemStack(
                i,
                Theme.GUI_HEAD + name,
                "",
                Theme.ITEM_TYPEDESC + "物品欄類型: " + NetworkElement.networkElementTypeName(networkElement.getType()),
                "",
                barrelAmount,
                "",
                Theme.CLICK_INFO + "左鍵: " + ChatColor.WHITE + "打開物品欄",
                Theme.CLICK_INFO + "右鍵: " + ChatColor.WHITE + "高亮物品欄"
        );
    }

    public static CustomItemStack menuCellError() {
        return new CustomItemStack(
                Material.BARRIER,
                Theme.GUI_HEAD + "掃描物品欄 (錯誤)",
                "",
                Theme.ITEM_TYPEDESC + "物品欄類型: 未知/錯誤",
                "",
                Theme.CLICK_INFO + "左鍵: " + ChatColor.WHITE + "打開物品欄",
                Theme.CLICK_INFO + "右鍵: " + ChatColor.WHITE + "高亮物品欄"
        );
    }


}
