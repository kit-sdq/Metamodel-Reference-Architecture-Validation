package metamodelcomprehensionextentassessor;

public enum Mode {
    MOD_SERIES, EXT_SERIES, MODEL_SERIES, METAMODEL_COMPARISON, METAMODEL, METAMODELS;

    public boolean isSeries() {
        return this == MOD_SERIES || this == EXT_SERIES || this == MODEL_SERIES;
    }

    public boolean isComparison() {
        return this == MOD_SERIES || this == EXT_SERIES || this == MODEL_SERIES || this == METAMODEL_COMPARISON;
    }

    public boolean needsTargetMetamodel1() {
        return true;
    }

    public boolean needsTargetMetamodel2() {
        return isComparison();
    }

    public ExplorerSelection expectedExplorerSelection() {
        if (isSeries()) {
            return ExplorerSelection.PROJECT;
        } else if (this == Mode.METAMODEL_COMPARISON) {
            return ExplorerSelection.NONE;
        } else if (this == Mode.METAMODEL || this == Mode.METAMODELS) {
            return ExplorerSelection.ANY;
        } else {
            throw new RuntimeException("Unknown mode");
        }
    }

    public static enum ExplorerSelection {
        NONE, PROJECT, ANY;
    }
}
