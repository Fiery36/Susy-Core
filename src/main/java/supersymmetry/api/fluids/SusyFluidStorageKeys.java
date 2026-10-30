package supersymmetry.api.fluids;

import static supersymmetry.api.util.SuSyUtility.susyId;

import gregtech.api.fluids.FluidState;
import gregtech.api.fluids.store.FluidStorageKey;
import gregtech.api.unification.material.info.MaterialIconType;
import supersymmetry.api.unification.material.info.SuSyMaterialIconType;

public final class SusyFluidStorageKeys {

    public static final FluidStorageKey SLURRY = new FluidStorageKey(susyId("slurry"), SuSyMaterialIconType.slurry,
            s -> s + "_slurry", m -> "susy.fluid.slurry", FluidState.LIQUID, -1);

    public static final FluidStorageKey IMPURE_SLURRY = new FluidStorageKey(susyId("impure_slurry"),
            SuSyMaterialIconType.slurry, s -> "impure_" + s + "_slurry", m -> "susy.fluid.impure_slurry",
            FluidState.LIQUID, -1);

    public static final FluidStorageKey SUPERCRITICAL = new FluidStorageKey(susyId("supercritical"),
            SuSyMaterialIconType.supercritical, s -> "supercritical_" + s, m -> "susy.fluid.supercritical",
            FluidState.GAS, -1);

    public static final FluidStorageKey AQUEOUS = new FluidStorageKey(susyId("aqueous_solution"),
            MaterialIconType.liquid, s -> s + "_solution", m -> "susy.fluid.aqueous_solution",
            FluidState.LIQUID, -1);

    private SusyFluidStorageKeys() {}
}
