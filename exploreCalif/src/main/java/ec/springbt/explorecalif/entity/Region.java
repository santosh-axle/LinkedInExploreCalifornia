package ec.springbt.explorecalif.entity;

public enum Region {

	California_Central("Central California"),
	California_South("Southern California"),
	Central_Coast("Central Coast"),
	Varies("Varies");
	
	private String label;
	
	private Region(String label) {
		this.label = label;
	}
	public static Region findByLabel(String theLabel) {
		for(Region r : Region.values()) {
			if(r.label.equalsIgnoreCase(theLabel)) return r;
		}
		return null;
	}
}
