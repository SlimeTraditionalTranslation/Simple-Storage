package io.github.sefiraat.simplestorage.items.chests;

import io.github.sefiraat.simplestorage.items.Skulls;
import io.github.sefiraat.simplestorage.items.chests.network.NetworkElement;
import io.github.sefiraat.simplestorage.items.chests.network.NetworkElement.NetworkElementType;
import io.github.sefiraat.simplestorage.utils.Theme;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class GuiItems {

    private GuiItems() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItem menuBackground() {
        return new CustomItem(
                Material.GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "簡單!",
                ""
        );
    }

    public static CustomItem menuInfo() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.GUI_NO1),
                Theme.GUI_HEAD + "資訊",
                "",
                "頁數 : 1"
        );
    }

    public static CustomItem menuChestPageBack() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.GUI_BACK),
                Theme.GUI_HEAD + "返回",
                "",
                Theme.CLICK_INFO + "點擊以返回頁面."
        );
    }

    public static CustomItem menuChestPageForward() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.GUI_FORWARD),
                Theme.GUI_HEAD + "向前",
                "",
                Theme.CLICK_INFO + "點擊以向前頁面."
        );
    }

    public static CustomItem menuChestDummy() {
        return new CustomItem(
                Material.LIGHT_GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "沒有物品在這"
        );
    }

    public static CustomItem menuMasterDummy() {
        return new CustomItem(
                Material.LIGHT_GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "沒有物品欄在這"
        );
    }

    public static CustomItem menuClose() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.GUI_CLOSE),
                Theme.GUI_HEAD + "關閉"
        );
    }

    public static CustomItem menuRenameCell() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.GUI_RENAME_CELL),
                Theme.GUI_HEAD + "重新命名單元"
        );
    }

    public static CustomItem menuSetMaterial() {
        return new CustomItem(
                SkullItem.fromBase64(Skulls.GUI_SET_ICON),
                Theme.GUI_HEAD + "設置圖標",
                "",
                Theme.ITEM_TYPEDESC + "用鼠標上的一個物品點擊",
                Theme.ITEM_TYPEDESC + "它來設置這個物品欄的圖標"
        );
    }

    public static CustomItem menuCell(NetworkElement ne) {

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

    public static CustomItem menuCellNormal(ItemStack i, String name) {
        return new CustomItem(
                i,
                Theme.GUI_HEAD + name,
                "",
                Theme.ITEM_TYPEDESC + "物品欄類型: " + NetworkElement.networkElementTypeName(NetworkElement.NetworkElementType.INVENTORY_CELL),
                "",
                Theme.CLICK_INFO + "左鍵: " + ChatColor.WHITE + "打開物品欄",
                Theme.CLICK_INFO + "右鍵: " + ChatColor.WHITE + "高亮物品欄"
        );
    }

    public static CustomItem menuCellBarrel(ItemStack i, String name, NetworkElement networkElement) {
        String barrelAmount = Theme.ITEM_TYPEDESC + "內容: " + ChatColor.WHITE + networkElement.getBarrelAmount();
        return new CustomItem(
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

    public static CustomItem menuCellError() {
        return new CustomItem(
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
