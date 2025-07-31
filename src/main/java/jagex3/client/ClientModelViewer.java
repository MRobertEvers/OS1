package jagex3.client;

public class ClientModelViewer {
    public static void main(String[] args) {
		Client.isModelViewer = true;
		Client app = new Client();

		app.initApplication(765, 503, 1);
	}
}
