package com.mappleaf.mp.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class SolidBlock extends Block
{
    private Item dropItem = null;
    private int quantity = 1;
    public SolidBlock(String name, Material blockMaterialIn, CreativeTabs tab, float resistance, float hardness, int lightOpacity, float lightLevel, SoundType soundType, Item dropItem, int quantity)
    {
        super(blockMaterialIn);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setLightLevel(lightLevel);
        this.setLightOpacity(lightOpacity);
        this.setSoundType(soundType);
        this.setResistance(resistance);
        this.dropItem = dropItem;
        this.quantity = quantity;
    }

    public SolidBlock(String name)
    {
        this(name, Material.ROCK, CreativeTabs.BUILDING_BLOCKS, 1.0F, 1.0F, 1, 0.0F, SoundType.STONE, null, 1);
    }

    public SolidBlock(String name, Material blockMaterialIn)
    {
        this(name, blockMaterialIn, CreativeTabs.BUILDING_BLOCKS, 1.0F, 1.0F, 1, 0.0F, SoundType.STONE, null, 1);
    }

    public SolidBlock(String name, CreativeTabs tab)
    {
        this(name, Material.ROCK, tab, 1.0F, 1.0F, 1, 0.0F, SoundType.STONE, null, 1);
    }

    public SolidBlock(String name, Material blockMaterialIn, CreativeTabs tab)
    {
        this(name, blockMaterialIn, tab, 1.0F, 1.0F, 1, 0.0F, SoundType.STONE, null, 1);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if(this.dropItem==null)
            return super.getItemDropped(state, rand, fortune);
        else
            return dropItem;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return quantity;
    }
}
