package webservice.api.models;



public class CountryModel{
    private String IsoCode;
    private String Name;
    private String Names;
    private Integer Confidence;
	public CountryModel() {}
	/**
	 * @return the isoCode
	 */
	public String getIsoCode() {
		return IsoCode;
	}
	/**
	 * @param isoCode the isoCode to set
	 */
	public void setIsoCode(String isoCode) {
		IsoCode = isoCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the names
	 */
	public String getNames() {
		return Names;
	}
	/**
	 * @param names the names to set
	 */
	public void setNames(String names) {
		Names = names;
	}
	/**
	 * @return the confidence
	 */
	public Integer getConfidence() {
		return Confidence;
	}
	/**
	 * @param integer the confidence to set
	 */
	public void setConfidence(Integer integer) {
		Confidence = integer;
	}
	
}