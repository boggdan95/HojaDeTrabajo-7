/**
 *
 * @author Boggdan Barrientos, Bryan Chan, Christopher
 */

public class Asociacion {
	String key;
	String value;
	
	
	/**
	 * @param key
	 * @param value
	 */
	public Asociacion(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
