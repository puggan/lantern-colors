package com.drewhannay.lanterncolors.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;


public class ColoredLanternBlock extends LanternBlock {

    private final DyeColor color;

    public ColoredLanternBlock(DyeColor color) {
        super(
            Block.Properties.create(Material.IRON)
                            .hardnessAndResistance(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightValue(15)
                            .notSolid()
        );
        this.color = color;
    }

    public String registryName() {
        return color.getName() + "_coloredlantern";
    }

    public DyeColor getDyeColor() {
        return color;
    }
}
