package io.github.igomq.carrotory.Info;

import org.bukkit.Material;

public class Info {
    public static final Material[][] equipmentList = {
            { // Wooden, Leather Equipment
                    Material.WOODEN_AXE,
                    Material.WOODEN_PICKAXE,
                    Material.WOODEN_SWORD,
                    Material.LEATHER_HELMET,
                    Material.LEATHER_CHESTPLATE,
                    Material.LEATHER_LEGGINGS,
                    Material.LEATHER_BOOTS
            },
            { // Stone, Chain Equipment
                    Material.STONE_AXE,
                    Material.STONE_PICKAXE,
                    Material.STONE_SWORD,
                    Material.CHAINMAIL_HELMET,
                    Material.CHAINMAIL_CHESTPLATE,
                    Material.CHAINMAIL_LEGGINGS,
                    Material.CHAINMAIL_BOOTS
            },
            { // Golden equipment
                    Material.GOLDEN_AXE,
                    Material.GOLDEN_PICKAXE,
                    Material.GOLDEN_SWORD,
                    Material.GOLDEN_HELMET,
                    Material.GOLDEN_CHESTPLATE,
                    Material.GOLDEN_LEGGINGS,
                    Material.GOLDEN_BOOTS
            },
            { // Iron equipment
                    Material.IRON_AXE,
                    Material.IRON_PICKAXE,
                    Material.IRON_SWORD,
                    Material.IRON_HELMET,
                    Material.IRON_CHESTPLATE,
                    Material.IRON_LEGGINGS,
                    Material.IRON_BOOTS
            },
            { // Diamond Equipment
                    Material.DIAMOND_AXE,
                    Material.DIAMOND_PICKAXE,
                    Material.DIAMOND_SWORD,
                    Material.DIAMOND_HELMET,
                    Material.DIAMOND_CHESTPLATE,
                    Material.DIAMOND_LEGGINGS,
                    Material.DIAMOND_BOOTS
            },
            { // Netherite Equipment
                    Material.NETHERITE_AXE,
                    Material.NETHERITE_PICKAXE,
                    Material.NETHERITE_SWORD,
                    Material.NETHERITE_HELMET,
                    Material.NETHERITE_CHESTPLATE,
                    Material.NETHERITE_LEGGINGS,
                    Material.NETHERITE_BOOTS
            }
    };
    public static final int[][][] percentage = {
            /**  How to read
                * percentage[] means case of percentage[][]
                * percentage[][] means type of equipment
                * percentage[][][] means level of equipment

                * percentage[index][][]:
                    Index 0 means wooden, leather equipment
                    Index 1 means stone, chain equipment
                    Index 2 means iron equipment
                    Index 3 means golden equipment
                    Index 4 means diamond equipment
                    Index 5 means netherite equipment

                * percentage[][index][]:
                    Index {index} means level {index}

                * percentage[][][index]:
                    Index 0 means probability of success
                    Index 1 means probability of fail
                    Index 2 means probability of crash
                    * for percentage[2~ (except 3)][][index]:
                        Index 2 means probability of downgrade
                        Index 3 means probability of crash
                        Others are same as percentage[][][index]
             */
            {
                    { // Lv 0
                        95, 5, 0
                    },
                    { // Lv 1
                        90, 10, 0
                    },
                    { // Lv 2
                        85, 15, 0
                    }
            },
            {
                    { // Lv 0
                            95, 5, 0
                    },
                    { // Lv 1
                            90, 10, 0
                    },
                    { // Lv 2
                            85, 15, 0
                    },
                    { // Lv 3
                            80, 20, 0
                    },
                    { // Lv 4
                            75, 25, 0
                    },
            },
            {
                    { // Lv 0
                            95, 5, 0, 0
                    },
                    { // Lv 1
                            90, 10, 0, 0
                    },
                    { // Lv 2
                            85, 15, 0, 0
                    },
                    { // Lv 3
                            80, 20, 0, 0
                    },
                    { // Lv 4
                            75, 25, 0, 0
                    },
                    { // Lv 5
                            70, 30, 0, 0
                    },
                    { // Lv 6
                            65, 20, 5, 0
                    },
                    { // Lv 7
                            60, 35, 5, 0
                    },
                    { // Lv 8
                            60, 30, 5, 5
                    },
                    { // Lv 9
                            55, 30, 5, 10
                    },
            },
            {
                    { // Lv 0
                            95, 5, 0
                    },
                    { // Lv 1
                            90, 10, 0
                    },
                    { // Lv 2
                            85, 15, 0
                    },
                    { // Lv 3
                            80, 20, 0
                    },
                    { // Lv 4
                            75, 25, 0
                    }
            },
            {
                    { // Lv 0
                            95, 5, 0, 0
                    },
                    { // Lv 1
                            90, 10, 0, 0
                    },
                    { // Lv 2
                            85, 15, 0, 0
                    },
                    { // Lv 3
                            80, 20, 0, 0
                    },
                    { // Lv 4
                            75, 25, 0, 0
                    },
                    { // Lv 5
                            70, 20, 5, 5
                    },
                    { // Lv 6
                            65, 20, 10, 5
                    },
                    { // Lv 7
                            60, 20, 10, 10
                    },
                    { // Lv 8
                            60, 15, 5, 20
                    },
                    { // Lv 9
                            55, 10, 15, 20
                    }
            },
            {
                    { // Lv 0
                            95, 5, 0, 0
                    },
                    { // Lv 1
                            90, 10, 0, 0
                    },
                    { // Lv 2
                            85, 15, 0, 0
                    },
                    { // Lv 3
                            80, 20, 0, 0
                    },
                    { // Lv 4
                            75, 25, 0, 0
                    },
                    { // Lv 5
                            70, 20, 5, 5
                    },
                    { // Lv 6
                            65, 20, 10, 5
                    },
                    { // Lv 7
                            60, 20, 10, 10
                    },
                    { // Lv 8
                            60, 15, 5, 20
                    },
                    { // Lv 9
                            55, 10, 15, 20
                    },
                    { // Lv 10
                            35, 30, 15, 30
                    },
                    { // Lv 11
                            50, 10, 10, 30
                    },
                    { // Lv 12
                            45, 10, 10, 35
                    },
                    { // Lv 13
                            40, 5, 25, 30
                    },
                    { // Lv 14
                            5, 5, 80, 10
                    },
            }
    };
}
