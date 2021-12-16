package StructuralPattern.bridge.example2;

public class Direct3DModeImpl implements VideoModeService{

    final String MODE_NAME="Direct3D Mode";

    @Override
    public String getScreen() {
        return MODE_NAME;
    }
}
