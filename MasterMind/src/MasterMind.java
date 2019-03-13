import java.util.Random;

class MasterMind {
    Color[] masterColor = new Color[ConstString.NUM_OF_COLOR];

    private int seedNum = (int) (Math.random() * 6);
    static int randomNum(){
        return (int) (Math.random() * 6);
    }
    private Random randomObj = new Random();
    private <T extends Enum<T>> T getRandomColor(Class<T> color) {
        return random(color.getEnumConstants());
    }
    private <T> T random(T[] values) {
        return values[randomObj.nextInt(values.length)];
    }

    MasterMind() {
        for (int i = 0; i < ConstString.NUM_OF_COLOR; i++) {
            this.masterColor[i] = getRandomColor(Color.class);
            
        }
    }

}
