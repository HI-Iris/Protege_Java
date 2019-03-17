import java.util.List;

class MasterMind {
    private List<Color> masterColors;

    MasterMind (List<Color> masterColors){
        this.masterColors = masterColors;
    }

    List<Color> getMasterColors() {
        return masterColors;
    }
}
