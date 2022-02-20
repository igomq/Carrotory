package io.github.igomq.carrotory.Info;

import org.bukkit.enchantments.Enchantment;

public class CorrectEnchantments {
    public static Enchantment[][] correctEnchantments = {
            { // Sword
                    Enchantment.DAMAGE_ALL,
                    Enchantment.DAMAGE_ARTHROPODS,
                    Enchantment.DAMAGE_UNDEAD,
                    Enchantment.FIRE_ASPECT,
                    Enchantment.SWEEPING_EDGE,
                    Enchantment.LOOT_BONUS_MOBS
            },
            { // Pickaxe
                    Enchantment.DIG_SPEED,
                    Enchantment.LOOT_BONUS_BLOCKS
            },
            { // Axe
                    Enchantment.DAMAGE_ALL,
                    Enchantment.DAMAGE_ARTHROPODS,
                    Enchantment.DAMAGE_UNDEAD,
                    Enchantment.DIG_SPEED,
                    Enchantment.LOOT_BONUS_BLOCKS
            },
            { // Hoe
                    Enchantment.DIG_SPEED,
                    Enchantment.LOOT_BONUS_BLOCKS
            },
            { // Shovel
                    Enchantment.DIG_SPEED,
                    Enchantment.LOOT_BONUS_BLOCKS
            },
            { // Bow
                    Enchantment.ARROW_INFINITE,
                    Enchantment.ARROW_DAMAGE,
                    Enchantment.ARROW_FIRE
            },
            { // Crossbow
                    Enchantment.MULTISHOT,
                    Enchantment.PIERCING,
                    Enchantment.QUICK_CHARGE
            },
            { // Trident
                    Enchantment.CHANNELING,
                    Enchantment.IMPALING,
                    Enchantment.LOYALTY,
                    Enchantment.RIPTIDE
            },
            { // Helmet
                    Enchantment.PROTECTION_ENVIRONMENTAL,
                    Enchantment.PROTECTION_EXPLOSIONS,
                    Enchantment.PROTECTION_FIRE,
                    Enchantment.PROTECTION_PROJECTILE,
                    Enchantment.THORNS,
                    Enchantment.WATER_WORKER,
                    Enchantment.OXYGEN

            },
            { // Armor, Leggings
                    Enchantment.PROTECTION_ENVIRONMENTAL,
                    Enchantment.PROTECTION_EXPLOSIONS,
                    Enchantment.PROTECTION_FIRE,
                    Enchantment.PROTECTION_PROJECTILE,
                    Enchantment.THORNS
            },
            { // Boots
                    Enchantment.PROTECTION_ENVIRONMENTAL,
                    Enchantment.PROTECTION_EXPLOSIONS,
                    Enchantment.PROTECTION_FIRE,
                    Enchantment.PROTECTION_PROJECTILE,
                    Enchantment.THORNS,
                    Enchantment.DEPTH_STRIDER,
                    Enchantment.PROTECTION_FALL,
                    Enchantment.SOUL_SPEED
            },
            { // All
                    Enchantment.MENDING,
                    Enchantment.DURABILITY
            }
    };
}
