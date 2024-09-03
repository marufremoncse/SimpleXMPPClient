
public class XmppTest {
	public static void main(String[] args) throws Exception {

		String username = "test1";
		String password = "1234";

		XmppManager xmppManager = new XmppManager("tb", 5222);

		xmppManager.init();
		xmppManager.performLogin(username, password);
		xmppManager.setStatus(true, "Hello everyone");

		String buddyJID = "maruf";
		String buddyName = "maruf";
		xmppManager.createEntry(buddyJID, buddyName);

		xmppManager.sendMessage("Hello mate", "test1@tb");

		boolean isRunning = true;

		while (isRunning) {
			Thread.sleep(50);
		}

		xmppManager.destroy();

	}
}
