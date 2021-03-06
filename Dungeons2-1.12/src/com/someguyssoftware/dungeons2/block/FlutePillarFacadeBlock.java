/**
 * 
 */
package com.someguyssoftware.dungeons2.block;

import com.someguyssoftware.gottschcore.block.CardinalDirectionFacadeBlock;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;

/**
 * @author Mark Gottschling on Aug 31, 2016
 *
 */
public class FlutePillarFacadeBlock extends CardinalDirectionFacadeBlock {

	/**
	 * 
	 * @param modID
	 * @param name
	 * @param material
	 */
	public FlutePillarFacadeBlock(String modID, String name, Material material) {
		super(modID, name, material);
		setSoundType(SoundType.STONE);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);		
		setBoundingBox(
				new AxisAlignedBB(0F, 0F, 0.5F, 1F, 1F, 1F),
				new AxisAlignedBB(0F, 0F, 0F, 0.5F, 1F, 1F), 
				new AxisAlignedBB(0F, 0F, 0F, 1F, 1F, 0.5F), 
				new AxisAlignedBB(0.5F, 0F, 0F, 1F, 1F, 1F)
				);
	}

}
