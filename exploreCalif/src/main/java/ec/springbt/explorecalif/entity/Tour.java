package ec.springbt.explorecalif.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tour {

	/*
	 * id, title, description, blurp, price, duration, bullets, keywords, tourpackage, difficulty, region
	 */
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private String blurp;
	@Column
	private double price;
	@Column
	private String duration;
	@Column
	private String bullets;
	@Column
	private String keywords;
	
	private TourPackage tourpackage;
	@Column
	@Enumerated
	private Difficulty difficulty;
	@Column
	@Enumerated
	private Region region;
	
	public Tour(String title, String description, String blurp, double price, String duration, String bullets,
			String keywords, TourPackage tourpackage, Difficulty difficulty, Region region) {
		super();
		this.title = title;
		this.description = description;
		this.blurp = blurp;
		this.price = price;
		this.duration = duration;
		this.bullets = bullets;
		this.keywords = keywords;
		this.tourpackage = tourpackage;
		this.difficulty = difficulty;
		this.region = region;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBlurp() {
		return blurp;
	}

	public void setBlurp(String blurp) {
		this.blurp = blurp;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getBullets() {
		return bullets;
	}

	public void setBullets(String bullets) {
		this.bullets = bullets;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public TourPackage getTourpackage() {
		return tourpackage;
	}

	public void setTourpackage(TourPackage tourpackage) {
		this.tourpackage = tourpackage;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blurp == null) ? 0 : blurp.hashCode());
		result = prime * result + ((bullets == null) ? 0 : bullets.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((difficulty == null) ? 0 : difficulty.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((keywords == null) ? 0 : keywords.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((tourpackage == null) ? 0 : tourpackage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		if (blurp == null) {
			if (other.blurp != null)
				return false;
		} else if (!blurp.equals(other.blurp))
			return false;
		if (bullets == null) {
			if (other.bullets != null)
				return false;
		} else if (!bullets.equals(other.bullets))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (difficulty != other.difficulty)
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (keywords == null) {
			if (other.keywords != null)
				return false;
		} else if (!keywords.equals(other.keywords))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (region != other.region)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (tourpackage == null) {
			if (other.tourpackage != null)
				return false;
		} else if (!tourpackage.equals(other.tourpackage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", title=" + title + ", description=" + description + ", blurp=" + blurp + ", price="
				+ price + ", duration=" + duration + ", bullets=" + bullets + ", keywords=" + keywords
				+ ", tourpackage=" + tourpackage + ", difficulty=" + difficulty + ", region=" + region + "]";
	}
	
	
}
