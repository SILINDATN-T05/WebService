package webservice.api.models;

import java.util.List;

public class IPS{
	private List<String> ips;
	public IPS() {}
	public IPS(List<String> ips) {
		this.ips = ips;
	}

	/**
	 * @return the ips
	 */
	public List<String> getIps() {
		return ips;
	}

	/**
	 * @param ips the ips to set
	 */
	public void setIps(List<String> ips) {
		this.ips = ips;
	}
}