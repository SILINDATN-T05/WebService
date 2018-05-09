package webservice.api.models;

import java.util.Map;

public class CityModel{
	private String IsoCode;
	private String Name;
	private Map<String, String> Names;
	private Number Confidence;
	private String SubdivisionName;
	private String SubdivisionIsoCode;
	private Number SubdivisionConfidence;
	private String CityName;
	private Number CityConfidence;
	private String PostalCode;
	private Number PostalConfidence;
	private Double Latitude;
	private Double Longitude;
	private Number AccuracyRadius;
	public CityModel() {}
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
	public Map<String, String> getNames() {
		return Names;
	}
	/**
	 * @param map the names to set
	 */
	public void setNames(Map<String, String> map) {
		Names = map;
	}
	/**
	 * @return the confidence
	 */
	public Number getConfidence() {
		return Confidence;
	}
	/**
	 * @param integer the confidence to set
	 */
	public void setConfidence(Number integer) {
		Confidence = integer;
	}
	/**
	 * @return the subdivisionName
	 */
	public String getSubdivisionName() {
		return SubdivisionName;
	}
	/**
	 * @param subdivisionName the subdivisionName to set
	 */
	public void setSubdivisionName(String subdivisionName) {
		SubdivisionName = subdivisionName;
	}
	/**
	 * @return the subdivisionIsoCode
	 */
	public String getSubdivisionIsoCode() {
		return SubdivisionIsoCode;
	}
	/**
	 * @param subdivisionIsoCode the subdivisionIsoCode to set
	 */
	public void setSubdivisionIsoCode(String subdivisionIsoCode) {
		SubdivisionIsoCode = subdivisionIsoCode;
	}
	/**
	 * @return the subdivisionConfidence
	 */
	public Number getSubdivisionConfidence() {
		return SubdivisionConfidence;
	}
	/**
	 * @param integer the subdivisionConfidence to set
	 */
	public void setSubdivisionConfidence(Number integer) {
		SubdivisionConfidence = integer;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return CityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	/**
	 * @return the cityConfidence
	 */
	public Number getCityConfidence() {
		return CityConfidence;
	}
	/**
	 * @param cityConfidence the cityConfidence to set
	 */
	public void setCityConfidence(Number cityConfidence) {
		CityConfidence = cityConfidence;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return PostalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	/**
	 * @return the postalConfidence
	 */
	public Number getPostalConfidence() {
		return PostalConfidence;
	}
	/**
	 * @param postalConfidence the postalConfidence to set
	 */
	public void setPostalConfidence(Number postalConfidence) {
		PostalConfidence = postalConfidence;
	}
	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return Latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return Longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}
	/**
	 * @return the accuracyRadius
	 */
	public Number getAccuracyRadius() {
		return AccuracyRadius;
	}
	/**
	 * @param accuracyRadius the accuracyRadius to set
	 */
	public void setAccuracyRadius(Number accuracyRadius) {
		AccuracyRadius = accuracyRadius;
	}
}