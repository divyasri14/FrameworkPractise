package commonlibs.contracts;

public interface iAlerts {
	public void acceptAlert() throws Exception;

	public void rejectAlert() throws Exception;

	public String getMessageFromAlert() throws Exception;

}
