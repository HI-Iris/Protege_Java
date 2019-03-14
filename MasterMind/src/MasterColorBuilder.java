class MasterColorBuilder implements ColorBuilder{
    private static int getRandomColorIndex() {
        return (int) (Math.random() * ConstString.NUM_OF_COLOR_IN_TOTAL);
    }

    @Override
    public Color[] buildColor() {
        Color[] masterColor = new Color[4];
        for (int i = 0; i < ConstString.NUM_OF_COLOR_IN_GAME; i++) {
            masterColor[i] = Color.values()[getRandomColorIndex()];
        }
        return masterColor;
    }
}
