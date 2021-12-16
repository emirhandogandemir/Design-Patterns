package StructuralPattern.bridge.example2;

public class VideoRefinedAbstraction extends VideoAbstraction{


    public VideoRefinedAbstraction(VideoModeService videoModeService) {
        super(videoModeService);
    }

    @Override
    public void showScreen() {
        System.out.println(videoModeService.getScreen());
    }
}
