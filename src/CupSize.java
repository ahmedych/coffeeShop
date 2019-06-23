public enum CupSize {
    SHORT,
    TALL,
    GRANDE,
    VENTI,
    TRENTA_COLD,
    LONG;
    public static CupSize byOrdinal(int ordinal) {
        for (CupSize cupSize : CupSize.values()) {
            if (cupSize.ordinal() == ordinal)
                return cupSize;
        }
        return null;
    }
}
