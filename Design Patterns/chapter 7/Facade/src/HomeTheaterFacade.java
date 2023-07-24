public class HomeTheaterFacade {
	Amplifier amplifier;
	CDPlayer cdPlayer;
	PopcornPopper popper;
	Projector projector;
	Screan screen;
	StreamingPlayer streamingPlayer;
	TheaterLights lights;
	Tuner tuner;
	
	public HomeTheaterFacade(
			Amplifier amplifier,
			CDPlayer cdPlayer,
			PopcornPopper popper,
			Projector projector,
			Screan screen,
			StreamingPlayer streamingPlayer,
			TheaterLights lights,
			Tuner tuner
			) {
		this.amplifier = amplifier;
		this.cdPlayer = cdPlayer;
		this.popper = popper;
		this.projector = projector;
		this.screen = screen;
		this.streamingPlayer = streamingPlayer;
		this.lights = lights;
		this.tuner = tuner;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		amplifier.on();
		amplifier.setStreamingPlayer(streamingPlayer);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		cdPlayer.on();
		cdPlayer.play(movie);
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amplifier.off();
		cdPlayer.stop();
		streamingPlayer.off();
	}
	
	public void listenToRadio(double frequency) {
		System.out.println("Tuning in the airwaves...");
		tuner.on();
		tuner.setFrequency(frequency);
		amplifier.on();
		amplifier.setVolume(5);
		amplifier.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("Shutting down the tuner...");
		tuner.off();
		amplifier.off();
	}	
}