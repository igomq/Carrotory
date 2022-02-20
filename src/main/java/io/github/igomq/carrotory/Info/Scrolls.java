package io.github.igomq.carrotory.Info;

import org.bukkit.ChatColor;

public class Scrolls {
    public static String[] itemNames = {
            ChatColor.BLUE + "Basic Enchantment Scroll",
            // 1~4 Level Enchantment :: 3 Paper, 1 Iron Ingot
            ChatColor.DARK_AQUA + "Advanced Enchantment Scroll",
            // 1~6 Level Enchantment :: 3 Paper, 1 Diamond
            ChatColor.DARK_GREEN + "Ancient Enchantment Scroll",
            // 3~7 Level Enchantment, Correct Enchantment for Equipment :: 3 paper, 1 Ancient Debris
            ChatColor.DARK_PURPLE + "Powerful Enchantment Scroll",
            // 4~8 Level Enchantment, Correct Enchantment for Equipment, Confirmed Mending&Unbreaking :: 1 Ancient Scroll, 3 Paper, 1 Netherite Ingot
            ChatColor.GREEN + "Basic Reinforce Scroll",
            // ~Iron(Golden Armor Included) Only Reinforce :: 3 Paper, 1 Lapis Lazuli
            ChatColor.AQUA + "Basic Multi Reinforce Scroll",
            // ~Diamond Only Reinforce, Rarely Increase One Enchantment by 1 :: 3 Paper, 1 Gold Block
            ChatColor.DARK_GRAY + "Advanced Multi Reinforce Scroll",
            // All Armor Compatible, Rarely Raise 2 Start at once, Randomly Increase Correct Enchantment by 1 :: 3 Paper, 1 Diamond Block
            ChatColor.LIGHT_PURPLE + "Strongest Multi Reinforce Scroll"
            // Sometimes Raise 2 Star at once / rarely raise 3 Star at once, Randomly Increase Correct Enchantment by 2 to 3 :: 3 Paper, 1 Nether Star
    };
    public static String[] Lores = {
            ChatColor.GRAY + "Basic scroll for enchantment.\nThis scroll looks normal.",
            ChatColor.GRAY + "Advanced scroll for enchantment.\nThis scroll looks little nice.",
            ChatColor.GRAY + "Ancient scroll for enchantment.\n" + ChatColor.RESET + ChatColor.BLUE +
                    "It looks old, but it feels like it contains something great.",
            ChatColor.GRAY + "Powerful scroll for enchantment.\n" + ChatColor.RESET + ChatColor.LIGHT_PURPLE +
                    "すごく素敵。すごい。 何だろうこれは… 不思議。",
            ChatColor.GRAY + "Basic scroll for reinforce.\nLooks very normal",
            ChatColor.GRAY + "Basic multi-scroll for reinforce.\nLooks nice but something strange.",
            ChatColor.GRAY + "Advanced multi-scroll for reinforce.\nLooks something that only experts can use and read.",
            ChatColor.GRAY + "Strongest [ MAX ] multi-scroll for reinforce." + ChatColor.RESET + ChatColor.DARK_RED +
                    "変な思い出が浮かぶ感じなの..."
    };
}
