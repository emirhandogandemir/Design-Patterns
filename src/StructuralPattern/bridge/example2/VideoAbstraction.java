package StructuralPattern.bridge.example2;

public abstract class VideoAbstraction {
    protected VideoModeService videoModeService;

    public VideoAbstraction(VideoModeService videoModeService) {
        this.videoModeService = videoModeService;
    }
    public abstract void showScreen();
}
