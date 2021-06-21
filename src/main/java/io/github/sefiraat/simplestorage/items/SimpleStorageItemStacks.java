package io.github.sefiraat.simplestorage.items;

import io.github.mooy1.infinitylib.presets.LorePreset;
import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.sefiraat.simplestorage.items.machines.DiePress;
import io.github.sefiraat.simplestorage.items.machines.Enderator;
import io.github.sefiraat.simplestorage.items.machines.MetalPressBasic;
import io.github.sefiraat.simplestorage.utils.Theme;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class SimpleStorageItemStacks {

    private SimpleStorageItemStacks() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack ANGELITE = new SlimefunItemStack(
            "MATERIAL_ANGELITE",
            Skulls.ITEM_ANGELITE,
            Theme.ITEM_CRAFTING + "天使水晶",
            "",
            Theme.PASSIVE + "天使水晶是一種稀有資源",
            Theme.PASSIVE + "用於簡單的資料傳輸.",
            Theme.PASSIVE + "在較冷的氣候更為豐富.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack PROUSTITE = new SlimefunItemStack(
            "MATERIAL_PROUSTITE",
            Skulls.ITEM_PROUSTITE,
            Theme.ITEM_CRAFTING + "普魯斯特水晶",
            "",
            Theme.PASSIVE + "普魯斯特水晶是一種稀有資源",
            Theme.PASSIVE + "用於更高級的資料傳輸.",
            Theme.PASSIVE + "只能在最熱的地方找到.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack SHORTITE = new SlimefunItemStack(
            "MATERIAL_SHORTITE",
            Skulls.ITEM_SHORTITE,
            Theme.ITEM_CRAFTING + "碳鈣鈉石水晶",
            "",
            Theme.PASSIVE + "碳鈣鈉石水晶是一種稀有資源",
            Theme.PASSIVE + "用於最先進的資料傳輸.",
            Theme.PASSIVE + "未知地點.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CLEARQUARTZ = new SlimefunItemStack(
            "MATERIAL_QUARTZGEM",
            Skulls.ITEM_CLEAR_QUARTZ,
            Theme.ITEM_CRAFTING + "透徹石英水晶",
            "",
            Theme.PASSIVE + "這種形式的石英是非常罕見",
            Theme.PASSIVE + "並用於製作顯示器.",
            Theme.PASSIVE + "未知地點.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHUNK_CHROMITE = new SlimefunItemStack(
            "CHUNK_CHROMITE",
            Skulls.ITEM_CHROMITE_CHUNK,
            Theme.ITEM_CRAFTING + "鉻鐵礦塊",
            "",
            Theme.PASSIVE + "一種非常稀有的礦石. 可以加工",
            Theme.PASSIVE + "成鉻鐵礦.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHUNK_BASTNAESITE = new SlimefunItemStack(
            "MATERIAL_BASTNAESITE_CHUNK",
            Skulls.ITEM_BASTNAESITE_CHUNK,
            Theme.ITEM_CRAFTING + "氟碳鈰鑭礦塊",
            "",
            Theme.PASSIVE + "一種非常稀有的礦石. 可以加工",
            Theme.PASSIVE + "成鈰.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHUNK_ANTIMONY = new SlimefunItemStack(
            "MATERIAL_ANTIMONY_CHUNK",
            Skulls.ITEM_ANTIMONY_CHUNK,
            Theme.ITEM_CRAFTING + "銻碎片",
            "",
            Theme.PASSIVE + "一種非常稀有的金屬. 可加工",
            Theme.PASSIVE + "成銻.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack RHENIUM_CHUNK = new SlimefunItemStack(
            "MATERIAL_RHENIUM_CHUNK",
            Skulls.ITEM_RHENIUM_CHUNK,
            Theme.ITEM_CRAFTING + "錸碎片",
            "",
            Theme.PASSIVE + "一種非常稀有的金屬. 可加工",
            Theme.PASSIVE + "成錸.",
            "",
            Theme.LORE_TYPE_BASE
    );

    public static final SlimefunItemStack CHROMIUM_DUST = new SlimefunItemStack(
            "MATERIAL_CHROMIUM_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "鉻粉",
            "",
            Theme.PASSIVE + "一種非常稀有的金屬. 需要加工",
            Theme.PASSIVE + "成錠.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack BASTNAESITE_DUST = new SlimefunItemStack(
            "MATERIAL_BASTNAESITE_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "氟碳鈰鑭礦粉",
            "",
            Theme.PASSIVE + "一種非常稀有的礦石. 需要加工",
            Theme.PASSIVE + "成錠.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ANTIMONY_DUST = new SlimefunItemStack(
            "MATERIAL_ANTIMONY_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "銻粉",
            "",
            Theme.PASSIVE + "一種非常稀有的金屬. 需要加工",
            Theme.PASSIVE + "成錠.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack RHENIUM_DUST = new SlimefunItemStack(
            "MATERIAL_RHENIUM_DUST",
            Material.GUNPOWDER,
            Theme.ITEM_CRAFTING + "錸粉",
            "",
            Theme.PASSIVE + "一種非常稀有的金屬. 需要加工",
            Theme.PASSIVE + "成錠.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHROMIUM_INGOT = new SlimefunItemStack(
            "MATERIAL_CHROMIUM_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "鉻錠",
            "",
            Theme.PASSIVE + "一種非常稀有的金屬. 用於製作",
            Theme.PASSIVE + "合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack BASTNAESITE_INGOT = new SlimefunItemStack(
            "MATERIAL_BASTNAESITE_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "氟碳鈰鑭礦錠",
            "",
            Theme.PASSIVE + "一種非常稀有的金屬. 用於製作",
            Theme.PASSIVE + "強化合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ANTIMONY_INGOT = new SlimefunItemStack(
            "MATERIAL_ANTIMONY_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "銻錠",
            "",
            Theme.PASSIVE + "一種非常稀有的金屬. 用於製作",
            Theme.PASSIVE + "高級合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack RHENIUM_INGOT = new SlimefunItemStack(
            "MATERIAL_RHENIUM_INGOT",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "錸錠",
            "",
            Theme.PASSIVE + "一種難以置信的稀有金屬. 用於製作",
            Theme.PASSIVE + "非常先進的合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ELECTRUM_INGOT = new SlimefunItemStack(
            "MATERIAL_ELECTRUM",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "銀金合金錠",
            "",
            Theme.PASSIVE + "基本上沒什麼用的",
            Theme.PASSIVE + "一種金和銀的合金, 但我們或許會發現",
            Theme.PASSIVE + "它能用於甚麼?",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CUPRONICKEL_INGOT = new SlimefunItemStack(
            "MATERIAL_CUPRONICKEL",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "白銅合金錠",
            "",
            Theme.PASSIVE + "一種銅和鎳的合金, 因其",
            Theme.PASSIVE + "強度和高承受壓力",
            Theme.PASSIVE + "的能力而使用.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack PEWTER_INGOT = new SlimefunItemStack(
            "MATERIAL_PEWTER",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "錫鉛合金錠",
            "",
            Theme.PASSIVE + "一種錫和銀的合金, 用於",
            Theme.PASSIVE + "它的耐用性.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NICKEL_SUPER_INGOT = new SlimefunItemStack(
            "MATERIAL_SUPER_INGOT",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "鎳超級合金錠",
            "",
            Theme.PASSIVE + "一種鎳和錸的合金, 因其",
            Theme.PASSIVE + "耐極端溫度",
            Theme.PASSIVE + "而使用.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ZAMAK_1 = new SlimefunItemStack(
            "MATERIAL_ZAMAK1",
            Material.NETHERITE_INGOT,
            Theme.ITEM_CRAFTING + "薩馬克合金-1",
            "",
            Theme.PASSIVE + "一種鋅, 鋁和銅的合金. 雖然",
            Theme.PASSIVE + "這個合金並不是最強的,",
            Theme.PASSIVE + "但它對機器模具",
            Theme.PASSIVE + "很有用.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ZAMAK_2 = new SlimefunItemStack(
            "MATERIAL_ZAMAK2",
            Material.NETHERITE_INGOT,
            Theme.ITEM_CRAFTING + "薩馬克合金-2",
            "",
            Theme.PASSIVE + "一種鋅, 鋁和銅的合金.",
            Theme.PASSIVE + "薩馬克合金-2 用額外的銅",
            Theme.PASSIVE + "來增強強度, 使其能夠",
            Theme.PASSIVE + "用於更多的",
            Theme.PASSIVE + "金屬模具",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ZAMAK_3 = new SlimefunItemStack(
            "MATERIAL_ZAMAK3",
            Material.NETHERITE_INGOT,
            Theme.ITEM_CRAFTING + "薩馬克合金-3",
            "",
            Theme.PASSIVE + "一種鋅, 鋁和銅的合金.",
            Theme.PASSIVE + "薩馬克合金-3中注入了",
            Theme.PASSIVE + "鎂以保持穩定性",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NISIL = new SlimefunItemStack(
            "MATERIAL_NISIL",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "鎳矽合金錠",
            "",
            Theme.PASSIVE + "一種鎳和矽的合金.",
            Theme.PASSIVE + "構成熱電偶的一部份.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NICROSIL = new SlimefunItemStack(
            "MATERIAL_NICROSIL",
            Material.IRON_INGOT,
            Theme.ITEM_CRAFTING + "鎳矽合金錠",
            "",
            Theme.PASSIVE + "一種鎳, 矽和鉻的合金.",
            Theme.PASSIVE + "構成熱電偶的一部份.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CUPRONICKEL_REINFORCED = new SlimefunItemStack(
            "MATERIAL_REINFORCED_CUPRONICKEL",
            Material.GOLD_INGOT,
            Theme.ITEM_CRAFTING + "強化白銅合金錠",
            "",
            Theme.PASSIVE + "一種銅和鎳的合金. 因其強度和",
            Theme.PASSIVE + "高承受壓力的能力",
            Theme.PASSIVE + "而被使用. 這個變體",
            Theme.PASSIVE + "已使用鉻鐵礦進行了加強.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack PEWTER_REINFORCED = new SlimefunItemStack(
            "MATERIAL_REINFORCED_PEWTER",
            Material.IRON_INGOT ,
            Theme.ITEM_CRAFTING + "硬化錫鉛合金錠",
            "",
            Theme.PASSIVE + "一種錫和銀的合金. 因為它的耐用性.",
            Theme.PASSIVE + "這個變體已使用",
            Theme.PASSIVE + "銻進行了硬化.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack ELECTRUM_PLATE = new SlimefunItemStack(
            "MATERIAL_ELECTRUM_PLATE",
            Material.YELLOW_CARPET,
            Theme.ITEM_CRAFTING + "銀金合金板",
            "",
            Theme.PASSIVE + "由銀金合金製成的板,",
            Theme.PASSIVE + "用作基礎儲存組件的外殼.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CUPRONICKEL_PLATE = new SlimefunItemStack(
            "MATERIAL_CUPRONICKEL_PLATE",
            Material.ORANGE_CARPET,
            Theme.ITEM_CRAFTING + "強化白銅合金板",
            "",
            Theme.PASSIVE + "由白銅合金製成的板,",
            Theme.PASSIVE + "用作中間體儲存組件的外殼.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack PEWTER_PLATE = new SlimefunItemStack(
            "MATERIAL_PEWTER_PLATE",
            Material.LIGHT_GRAY_CARPET,
            Theme.ITEM_CRAFTING + "硬化錫鉛合金板",
            "",
            Theme.PASSIVE + "由錫鉛合金製成的板,",
            Theme.PASSIVE + "用作高級儲存組件的外殼.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack NICKEL_SUPERALLOY_PLATE = new SlimefunItemStack(
            "MATERIAL_SUPER_PLATE",
            Material.BROWN_CARPET,
            Theme.ITEM_CRAFTING + "鎳超級合金板",
            "",
            Theme.PASSIVE + "由鎳和錸製成的板,",
            Theme.PASSIVE + "用於先進儲存組件的外殼.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack COMBINED_PLATE = new SlimefunItemStack(
            "MATERIAL_COMBINED_PLATE",
            Material.PINK_CARPET,
            Theme.ITEM_CRAFTING + "組合式板",
            "",
            Theme.PASSIVE + "由鎳和錸製成的板,",
            Theme.PASSIVE + "上面覆蓋著錫器合金.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_BASIC = new SlimefunItemStack(
            "MATERIAL_DIE_BASIC",
            Material.LIGHT_GRAY_CARPET,
            Theme.ITEM_CRAFTING + "基礎模具",
            "",
            Theme.PASSIVE + "由薩馬克合金-1製成的脆弱模具.",
            Theme.PASSIVE + "可用於製作基礎的",
            Theme.PASSIVE + "注入外殼.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_REINFORCED = new SlimefunItemStack(
            "MATERIAL_DIE_REINFORCED",
            Material.GRAY_CARPET,
            Theme.ITEM_CRAFTING + "強化模具",
            "",
            Theme.PASSIVE + "由薩馬克合金-2製成的強化模具.",
            Theme.PASSIVE + "可用於製作中間體",
            Theme.PASSIVE + "注入外殼.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_ADVANCED = new SlimefunItemStack(
            "MATERIAL_DIE_ADVANCED",
            Material.BLACK_CARPET,
            Theme.ITEM_CRAFTING + "先進模具",
            "",
            Theme.PASSIVE + "由薩馬克合金-3製成的先進模具.",
            Theme.PASSIVE + "可用於製作頂級",
            Theme.PASSIVE + "注入外殼.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack THERMOCOUPLE = new SlimefunItemStack(
            "MATERIAL_THERMOCOUPLE",
            Material.REPEATER,
            Theme.ITEM_CRAFTING + "熱電偶",
            "",
            Theme.PASSIVE + "用於測試熱傳導",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHEST_CORE_BASIC = new SlimefunItemStack(
            "MATERIAL_CHEST_CORE_BASIC",
            Material.HEART_OF_THE_SEA,
            Theme.ITEM_CRAFTING + "基礎箱核心",
            "",
            Theme.PASSIVE + "用作鐵箱的核心.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHEST_CORE_REINFORCED = new SlimefunItemStack(
            "MATERIAL_CHEST_CORE_REINFORCED",
            Material.HEART_OF_THE_SEA,
            Theme.ITEM_CRAFTING + "強化箱核心",
            "",
            Theme.PASSIVE + "用作金箱的核心.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack CHEST_CORE_ADVANCED = new SlimefunItemStack(
            "MATERIAL_CHEST_CORE_ADVANCED",
            Material.HEART_OF_THE_SEA,
            Theme.ITEM_CRAFTING + "高級箱核心",
            "",
            Theme.PASSIVE + "用作鑽石箱的核心.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack COMMUNICATION_BLOCK = new SlimefunItemStack(
            "BLOCK_COMMUNICATION",
            Material.BLACK_GLAZED_TERRACOTTA,
            Theme.ITEM_MACHINE + "通訊方塊",
            "",
            Theme.PASSIVE + "允許將各種儲物空間連線",
            Theme.PASSIVE + "至網路的主控制.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DISPLAY_PANEL = new SlimefunItemStack(
            "MATERIAL_DISPLAY",
            Material.GRAY_STAINED_GLASS_PANE,
            Theme.ITEM_CRAFTING + "顯示面板",
            "",
            Theme.PASSIVE + "一個顯示面板. 用於製作",
            Theme.PASSIVE + "儲物箱主控.",
            "",
            Theme.LORE_TYPE_CRAFT
    );

    public static final SlimefunItemStack DIE_PRESS = new SlimefunItemStack(
            "MACHINE_DIE_PRESS",
            Material.PISTON,
            Theme.ITEM_MACHINE + "壓模機",
            "",
            Theme.PASSIVE + "一種機械壓模機, 可以用",
            Theme.PASSIVE + "特定金屬製造模具.",
            Theme.PASSIVE + "模具用於形成其他材料.",
            "",
            LorePreset.energyPerSecond(DiePress.CONSUMPTION),
            "",
            Theme.LORE_TYPE_MACHINE
    );
    public static final SlimefunItemStack METAL_PRESS_BASIC = new SlimefunItemStack(
            "MACHINE_METAL_PRESS_BASIC",
            Material.STICKY_PISTON,
            Theme.ITEM_MACHINE + "基礎金屬壓機",
            "",
            Theme.PASSIVE + "一種機械金屬壓機,",
            Theme.PASSIVE + "可以從基礎模具和軟合金",
            Theme.PASSIVE + "製造成形的金屬板.",
            "",
            LorePreset.energyPerSecond(MetalPressBasic.CONSUMPTION),
            "",
            Theme.LORE_TYPE_MACHINE
    );
    public static final SlimefunItemStack ENDERATOR = new SlimefunItemStack(
            "MACHINE_ENDERATOR",
            Material.RESPAWN_ANCHOR,
            Theme.ITEM_MACHINE + "終界扭曲機",
            "",
            Theme.PASSIVE + "利用終界水晶和大量的",
            Theme.PASSIVE + "引導能量將物品的結構",
            Theme.PASSIVE + "扭曲成不同的物品...",
            //Theme.PASSIVE + "different...",
            "",
            LorePreset.energyPerSecond(Enderator.CONSUMPTION),
            "",
            Theme.LORE_TYPE_MACHINE
    );
    public static final SlimefunItemStack CHEST_IRON = new SlimefunItemStack(
            "BLOCK_CHEST_IRON",
            Skulls.BLOCK_CHEST_IRON,
            Theme.ITEM_MACHINE + "鐵箱",
            "",
            Theme.PASSIVE + "一個有90個物品欄位的儲物箱.",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack CHEST_GOLD = new SlimefunItemStack(
            "BLOCK_CHEST_GOLD",
            Skulls.BLOCK_CHEST_GOLD,
            Theme.ITEM_MACHINE + "金箱",
            "",
            Theme.PASSIVE + "一個有180個物品欄位的儲物箱.",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack CHEST_DIAMOND = new SlimefunItemStack(
            "BLOCK_CHEST_DIAMOND",
            Skulls.BLOCK_CHEST_DIAMOND,
            Theme.ITEM_MACHINE + "鑽石箱",
            "",
            Theme.PASSIVE + "一個有270個物品欄位的儲物箱.",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack INVENTORY_CELL = new SlimefunItemStack(
            "BLOCK_CELL_BASIC",
            Skulls.BLOCK_CELL_BASIC,
            Theme.ITEM_MACHINE + "儲存單元",
            "",
            Theme.PASSIVE + "一個有270個物品欄位的儲存單元.",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack CHEST_NETWORK = new SlimefunItemStack(
            "BLOCK_CHEST_NETWORK",
            Skulls.BLOCK_CHEST_MASTER,
            Theme.ITEM_MACHINE + "網路儲物箱",
            "",
            Theme.PASSIVE + "這個儲物箱可訪問所有物品欄",
            Theme.PASSIVE + "單元在範圍內.",
            "",
            Theme.PASSIVE + "單元必須在 " + Theme.ITEM_TYPEDESC + SimpleStorage.inst().getManagerConfiguration().getVals().getNetworkRange() + Theme.PASSIVE + " 格內.",
            Theme.PASSIVE + "任何方向的網路儲物箱",
            "",
            Theme.LORE_TYPE_CHEST
    );
    public static final SlimefunItemStack UPGRADE_BARREL = new SlimefunItemStack(
            "UPGRADE_BARREL",
            Skulls.ITEM_UPGRADE_BARREL,
            Theme.ITEM_AUGMENT + "增強: 木桶",
            "",
            Theme.PASSIVE + "增強你的網路儲物箱,",
            Theme.PASSIVE + "使其能夠掃描附近的兼容,",
            Theme.PASSIVE + "木桶.",
            "",
            Theme.LORE_TYPE_AUGMENT
    );
}
