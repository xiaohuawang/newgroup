package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the HCUSERS database table.
 * 
 */
@Entity
@Table(name="HCUSERS")
@NamedQuery(name="Hcuser.findAll", query="SELECT h FROM Hcuser h")
public class Hcuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long userid;

	private int deptid;

	private String entrydate;

	private int majorid;

	private String name;

	private int officenum;

	private String password;

	@Column(name="\"TYPE\"")
	private int type;

	//bi-directional many-to-one association to Hcclass
	@OneToMany(mappedBy="hcuser")
	private List<Hcclass> hcclasses;

	public Hcuser() {
	}

	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public int getDeptid() {
		return this.deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getEntrydate() {
		return this.entrydate;
	}

	public void setEntrydate(String entrydate) {
		this.entrydate = entrydate;
	}

	public int getMajorid() {
		return this.majorid;
	}

	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOfficenum() {
		return this.officenum;
	}

	public void setOfficenum(int officenum) {
		this.officenum = officenum;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<Hcclass> getHcclasses() {
		return this.hcclasses;
	}

	public void setHcclasses(List<Hcclass> hcclasses) {
		this.hcclasses = hcclasses;
	}

	public Hcclass addHcclass(Hcclass hcclass) {
		getHcclasses().add(hcclass);
		hcclass.setHcuser(this);

		return hcclass;
	}

	public Hcclass removeHcclass(Hcclass hcclass) {
		getHcclasses().remove(hcclass);
		hcclass.setHcuser(null);

		return hcclass;
	}

}