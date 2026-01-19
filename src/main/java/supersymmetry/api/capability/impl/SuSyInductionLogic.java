package supersymmetry.api.capability.impl;

import gregtech.api.capability.impl.AbstractRecipeLogic;

import supersymmetry.api.recipes.SuSyRecipeMaps;
import supersymmetry.common.metatileentities.multi.electric.MetaTileEntityInductionFurnace;

public class SuSyInductionLogic extends AbstractRecipeLogic {

    public SuSyInductionLogic(MetaTileEntityInductionFurnace tileEntity) {
        super(tileEntity, SuSyRecipeMaps.INDUCTION_FURNACE);
    }

    @Override
    protected long getEnergyInputPerSecond() {
        return 0;
    }

    @Override
    protected long getEnergyStored() {
        return 0;
    }

    @Override
    protected long getEnergyCapacity() {
        return 0;
    }

    @Override
    protected boolean drawEnergy(int recipeEUt, boolean simulate) {
        return false;
    }

    @Override
    public long getMaxVoltage() {
        return 0;
    }
}
