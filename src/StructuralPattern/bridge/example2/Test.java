package StructuralPattern.bridge.example2;

public class Test {
    public static void main(String[] args) {

        VideoAbstraction videoAbstraction = new VideoRefinedAbstraction(new OpenGlModeImpl());
        videoAbstraction.showScreen();
    }
}
