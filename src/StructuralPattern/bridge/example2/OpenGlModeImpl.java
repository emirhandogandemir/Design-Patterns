package StructuralPattern.bridge.example2;

public class OpenGlModeImpl implements VideoModeService{

    final String MODE_NAME="OpenGl Mode";

    @Override
    public String getScreen() {
        return MODE_NAME;
    }
}
