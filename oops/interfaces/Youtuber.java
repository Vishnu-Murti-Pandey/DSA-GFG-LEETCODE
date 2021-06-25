package oops.interfaces;

public abstract interface Youtuber extends VideoEditor {

	abstract void makeVideo();
	
	default void uploadVideo() {
		System.out.println("Upload the video");
	}
}
