package co.fitcom.fancywebrtc;

import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoTrack;

/**
 * Created by triniwiz on 1/16/19
 */
public class FancyVideoTrack extends FancyRTCMediaStreamTrack {
    VideoTrack videoTrack;

    public FancyVideoTrack(VideoTrack track) {
        super(track);
        this.videoTrack = track;
    }

    public void setEnabled(boolean enabled) {
        videoTrack.setEnabled(enabled);
    }

    public VideoTrack getVideoTrack() {
        return videoTrack;
    }
}
