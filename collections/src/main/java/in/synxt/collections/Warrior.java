package in.synxt.collections;

import java.util.Objects;

public class Warrior implements Comparable<Warrior>{
	private Integer id;
	private String name;
	private Double wealth;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getWealth() {
		return wealth;
	}
	public void setWealth(Double wealth) {
		this.wealth = wealth;
	}
	public Warrior(Integer id, String name, Double wealth) {
		super();
		this.id = id;
		this.name = name;
		this.wealth = wealth;
	}
	public Warrior() {
		super();
	}
	@Override
	public String toString() {
		return "Warrior [id=" + id + ", name=" + name + ", wealth=" + wealth + "]";
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Warrior other = (Warrior) obj;
		return Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Warrior that) {
		return this.wealth.compareTo(that.wealth);
	}		
}
