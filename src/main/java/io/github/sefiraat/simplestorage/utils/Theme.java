package io.github.sefiraat.simplestorage.utils;

import net.md_5.bungee.api.ChatColor;

public final class Theme {

    private Theme() {
        throw new IllegalStateException("Utility class");
    }

    public static final String PREFIX = "" + ChatColor.GRAY + "[簡單儲存] ";
    public static final String SUFFIX = "" + ChatColor.GRAY + "";
    public static final ChatColor WARNING = ChatColor.YELLOW;
    public static final ChatColor ERROR = ChatColor.RED;
    public static final ChatColor NOTICE = ChatColor.WHITE;
    public static final ChatColor PASSIVE = ChatColor.GRAY;
    public static final ChatColor SUCCESS = ChatColor.GREEN;
    public static final ChatColor MAIN = ChatColor.of("#21588f");
    public static final ChatColor GUI_HEAD = ChatColor.of("#03fcdf");
    public static final ChatColor CLICK_INFO = ChatColor.of("#e4ed32");

    public static final ChatColor ITEM_TYPEDESC = ChatColor.of("#f0ea4f");

    public static final ChatColor ITEM_CRAFTING = ChatColor.of("#dbcea9");
    public static final ChatColor ITEM_MACHINE = ChatColor.of("#3295a8");
    public static final ChatColor ITEM_RARE_DROP = ChatColor.of("#bf307f");
    public static final ChatColor ITEM_BASE = ChatColor.of("#9e9e9e");
    public static final ChatColor ITEM_CHEST = ChatColor.of("#b89b1c");
    public static final ChatColor ITEM_AUGMENT = ChatColor.of("#873dff");

    public static final String LORE_TYPE_CRAFT = ITEM_TYPEDESC + "製作材料";
    public static final String LORE_TYPE_MACHINE = ITEM_TYPEDESC + "機器";
    public static final String LORE_TYPE_DROP = ITEM_TYPEDESC + "掉落";
    public static final String LORE_TYPE_BASE = ITEM_TYPEDESC + "基礎資源";
    public static final String LORE_TYPE_CHEST = ITEM_TYPEDESC + "儲物箱";
    public static final String LORE_TYPE_AUGMENT = ITEM_TYPEDESC + "增強";
}
